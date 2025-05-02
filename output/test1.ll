declare i32 @printf(i8*, ...)
@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00"
define i32 @main() {
%x = alloca i32
%y = alloca i32
store i32 5, i32* %x
%0 = load i32, i32* %x
%1 = add i32 %0, 10
store i32 %1, i32* %y
%2 = load i32, i32* %y
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i32 %2)
ret i32 0
}
