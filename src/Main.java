import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.err.println("Usage: java Main <input.pas> <output.ll>");
            return;
        }

        CharStream input = CharStreams.fromFileName(args[0]);
        DelphiLexer lexer = new DelphiLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DelphiParser parser = new DelphiParser(tokens);
        ParseTree tree = parser.program();

        LLVMGenerator generator = new LLVMGenerator();
        generator.visit(tree);

        try (FileWriter writer = new FileWriter(args[1])) {
            writer.write(generator.getIR());
        }
    }
}
