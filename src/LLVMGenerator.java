import java.util.*;
import org.antlr.v4.runtime.tree.*;

public class LLVMGenerator extends DelphiBaseVisitor<String> {
    private StringBuilder ir = new StringBuilder();
    private int tempVarCounter = 0;
    private int labelCounter = 0;
    private Map<String, String> variables = new LinkedHashMap<>();

    public String getIR() {
        return ir.toString();
    }

    private String newTemp() {
        return "%" + (tempVarCounter++);
    }

    private String newLabel(String base) {
        return base + "_" + (labelCounter++);
    }

    @Override
    public String visitProgram(DelphiParser.ProgramContext ctx) {
        ir.append("declare i32 @printf(i8*, ...)\n");
        ir.append("@.str = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\"\n");
        ir.append("define i32 @main() {\n");
        visitChildren(ctx);
        ir.append("ret i32 0\n}\n");
        return null;
    }

    @Override
    public String visitVariableDeclaration(DelphiParser.VariableDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().get(0).getText();  // ✅
        String reg = "%" + name;
        ir.append(reg).append(" = alloca i32\n");
        variables.put(name, reg);
        return null;
    }

    @Override
    public String visitAssignment(DelphiParser.AssignmentContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        String expr = visit(ctx.expression());
        ir.append("store i32 ").append(expr).append(", i32* ").append(variables.get(id)).append("\n");
        return null;
    }

    @Override
    public String visitIntegerOutput(DelphiParser.IntegerOutputContext ctx) {
        String expr = visit(ctx.expression());
        ir.append("call i32 (i8*, ...) @printf(i8* getelementptr inbounds "
                + "([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i32 ").append(expr).append(")\n");
        return null;
    }

    @Override
    public String visitIfStatement(DelphiParser.IfStatementContext ctx) {
        String cond = visit(ctx.expression());
        String thenLabel = newLabel("then");
        String elseLabel = newLabel("else");
        String endLabel = newLabel("endif");

        ir.append("br i1 ").append(cond).append(", label %").append(thenLabel).append(", label %").append(elseLabel).append("\n");

        ir.append(thenLabel).append(":\n");
        visit(ctx.statement(0)); // then branch
        ir.append("br label %").append(endLabel).append("\n");

        ir.append(elseLabel).append(":\n");
        if (ctx.statement().size() == 2)
            visit(ctx.statement(1)); // else branch
        ir.append("br label %").append(endLabel).append("\n");

        ir.append(endLabel).append(":\n");
        return null;
    }

    @Override
    public String visitWhileStatement(DelphiParser.WhileStatementContext ctx) {
        String condLabel = newLabel("while_cond");
        String bodyLabel = newLabel("while_body");
        String endLabel = newLabel("while_end");

        ir.append("br label %").append(condLabel).append("\n");

        ir.append(condLabel).append(":\n");
        String cond = visit(ctx.expression());
        ir.append("br i1 ").append(cond).append(", label %").append(bodyLabel).append(", label %").append(endLabel).append("\n");

        ir.append(bodyLabel).append(":\n");
        visit(ctx.statement());
        ir.append("br label %").append(condLabel).append("\n");

        ir.append(endLabel).append(":\n");
        return null;
    }

    // Handle integer literals
    @Override
    public String visitIntLiteral(DelphiParser.IntLiteralContext ctx) {
        return ctx.getText();
    }

    // Handle variables
    @Override
    public String visitVariable(DelphiParser.VariableContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        if (variables.containsKey(id)) {
            String temp = newTemp();
            ir.append(temp).append(" = load i32, i32* ").append(variables.get(id)).append("\n");
            return temp;
        }
        return "0";
    }

    @Override
    public String visitAddSub(DelphiParser.AddSubContext ctx) {
        String left = visit(ctx.expression(0));
        String right = visit(ctx.expression(1));
        String op = ctx.getChild(1).getText();
        String temp = newTemp();
        if (op.equals("+")) {
            ir.append(temp).append(" = add i32 ").append(left).append(", ").append(right).append("\n");
        } else {
            ir.append(temp).append(" = sub i32 ").append(left).append(", ").append(right).append("\n");
        }
        return temp;
    }

    @Override
    public String visitMultDiv(DelphiParser.MultDivContext ctx) {
        String left = visit(ctx.expression(0));
        String right = visit(ctx.expression(1));
        String op = ctx.getChild(1).getText();
        String temp = newTemp();
        if (op.equals("*")) {
            ir.append(temp).append(" = mul i32 ").append(left).append(", ").append(right).append("\n");
        } else {
            ir.append(temp).append(" = sdiv i32 ").append(left).append(", ").append(right).append("\n");
        }
        return temp;
    }

    @Override
    public String visitComparison(DelphiParser.ComparisonContext ctx) {
        String left = visit(ctx.expression(0));
        String right = visit(ctx.expression(1));
        String op = ctx.getChild(1).getText();
        String temp = newTemp();
        switch (op) {
            case "=":
                ir.append(temp).append(" = icmp eq i32 ").append(left).append(", ").append(right).append("\n");
                break;
            case "<":
                ir.append(temp).append(" = icmp slt i32 ").append(left).append(", ").append(right).append("\n");
                break;
            case ">":
                ir.append(temp).append(" = icmp sgt i32 ").append(left).append(", ").append(right).append("\n");
                break;
            case "<=":
                ir.append(temp).append(" = icmp sle i32 ").append(left).append(", ").append(right).append("\n");
                break;
            case ">=":
                ir.append(temp).append(" = icmp sge i32 ").append(left).append(", ").append(right).append("\n");
                break;
            case "<>":
                ir.append(temp).append(" = icmp ne i32 ").append(left).append(", ").append(right).append("\n");
                break;
        }
        return temp;
    }

    @Override
    public String visitParentheses(DelphiParser.ParenthesesContext ctx) {
        return visit(ctx.expression());
    }
}
