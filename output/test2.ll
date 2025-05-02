declare i32 @printf(i8*, ...)
@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00"
define i32 @main() {
%a = alloca i32
%b = alloca i32
%c = alloca i32
store i32 2, i32* %a
store i32 3, i32* %b
%0 = load i32, i32* %a
%1 = load i32, i32* %b
%2 = mul i32 %0, %1
%3 = add i32 %2, 10
store i32 %3, i32* %c
%4 = load i32, i32* %c
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i32 %4)
ret i32 0
}
