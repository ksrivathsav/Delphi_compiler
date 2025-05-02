declare i32 @printf(i8*, ...)
@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00"
define i32 @main() {
%x = alloca i32
store i32 3, i32* %x
br label %while_cond_0
while_cond_0:
%0 = load i32, i32* %x
%1 = icmp sgt i32 %0, 0
br i1 %1, label %while_body_1, label %while_end_2
while_body_1:
%2 = load i32, i32* %x
%3 = icmp eq i32 %2, 2
br i1 %3, label %then_3, label %else_4
then_3:
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i32 100)
br label %endif_5
else_4:
%4 = load i32, i32* %x
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i32 %4)
br label %endif_5
endif_5:
%5 = load i32, i32* %x
%6 = sub i32 %5, 1
store i32 %6, i32* %x
br label %while_cond_0
while_end_2:
ret i32 0
}
