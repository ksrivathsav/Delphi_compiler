# Pascal-to-LLVM Compiler Project

Team 74: Sreenadh Singamaneni (UFID: 19481205), Srivathsav Kommineni (UFID: 23640441)

--------------------

## Introduction:
This Pascal-to-LLVM Compiler Project translates a Pascal-like language subset into **LLVM Intermediate Representation (IR)** instead of interpreting it directly.  
The compiler uses ANTLR 4 to generate the lexer and parser from a grammar definition, and implements code generation logic in Java to produce valid LLVM IR code.

The project supports:

- Variable declarations and assignments
- Integer arithmetic operations
- If-then-else conditional branching
- While-do looping constructs
- Console output with `print(...)`

It includes:
- `Delphi.g4` – ANTLR Grammar for Pascal/Delphi subset
- `Main.java` – Compiler driver
- `LLVMGenerator.java` – LLVM IR Code Generator
- Test cases – `.pas` files validating each supported feature

---------------------

## Project Structure (File Name - info)

| File | Info |
|:-----|:-----|
| `Delphi.g4` | ANTLR Grammar for Pascal subset |
| `Main.java` | Compiler driver |
| `LLVMGenerator.java` | LLVM IR code generator |
| `test1.pas` | Tests variable assignments and arithmetic |
| `test2.pas` | Tests multiple assignments and expressions |
| `test3.pas` | Tests control structures (while, if-else) |
| `output/` | Folder containing generated LLVM IR files |
| `README.md` | Project documentation |

-----------------------

1️⃣ Setup

### Install ANTLR 4 (First-Time Setup)

#### For Linux/Mac:

```bash
curl -O https://www.antlr.org/download/antlr-4.9.2-complete.jar
export CLASSPATH=".:antlr-4.9.2-complete.jar:$CLASSPATH"
alias antlr4='java -jar antlr-4.9.2-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'
```

#### For Windows (PowerShell):

```bash
Invoke-WebRequest -Uri "https://www.antlr.org/download/antlr-4.9.2-complete.jar" -OutFile "antlr-4.9.2-complete.jar"
$env:CLASSPATH = ".;antlr-4.9.2-complete.jar;$env:CLASSPATH"
```

---

2️⃣ Generate the Lexer & Parser (First-Time Only)

```bash
java -jar antlr-4.9.2-complete.jar -Dlanguage=Java -visitor -no-listener -o . src/Delphi.g4
```

---

3️⃣ Compile the Java Source Files

```bash
javac -cp ".:antlr-4.9.2-complete.jar" src/*.java
```

✅ This compiles all source and generated Java classes.

---

4️⃣ Running the Compiler

To compile a Pascal `.pas` file to LLVM IR:

```bash
java -cp ".:src:antlr-4.9.2-complete.jar" Main test/test3.pas output/test3.ll
```

📌 Replace `test3.pas` with the desired test file.

---

5️⃣ Viewing the LLVM IR Output

```bash
cat output/test3.ll
```

✅ Shows the generated LLVM IR instructions.

