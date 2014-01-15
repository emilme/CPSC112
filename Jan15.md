# Java Program Structures

## Admin
Programming Assignment #1 to be posted

## Programming: algorithmic thinking to design computer programs
* describe each step in a computer language: algorithms represent imperative knowledge vs. declarative knowledge
* why the computer did not follow your instructions 

## Java Programming Language
### Bill Joy
* Sun Microsystems/BSD Unix (Parent of Mac OS)
* Focus on the "network is the computer"

### James Gosling
* Gosling Emacs
* NeWS window system - killed by open X-windows
* Keeping this proprietary = kiss of death

### Joined forces to form FirstPerson, Inc. 1992
* PDA based
* PDAs died with Apple Newtown
* Interactive TV (ITV) - Oak 
* projects died

## Java Features

Modern, elegant, object-oriented programming language
* simpler than other object-oriented languages (C++)
Highly Portable
* write once run everywhere (multiple platforms - mobile and desktop)
Rich libraries
* good support/IDEs
Still evolving 
* senior project idea: open source code? how to guide development? Java Community Process (group decision making) 

### Programming Levels & High Level Structure 
Machine language (understood by CPUs)
Only basic functions
* arithmetic, compare values, start to execute instruction
* Instruction set of a CPU forms the *machine language* of the CPU
* Different machines understand different machine languages 

High-level programming language
* major advance in CS
* enables a programmer to specify, in a high level, what data a computer will act upon, how data will be stored, what actions to take given operatives
* syntax/grammar independent of CPU

Translating between programming/computer
* Compiler: program which translates source code into a specific target platform
* source code > compiler code > machine code

### Java Virtual Machine
* To be *platform independent*, java designers introduce JVM 
* virtual machine language: bytecode 
* Java = 2 languages

Java Execution
* interpreter: to execute a java program, translates between bytecode and actual machine
* platform specific

Structure (on slides)
* Source code > compiler > bytecode > bytecode interpreter for linux, macs, windows, etc 

Traditional (C++) vs. Java Software
* each C program has one platform/compiled per platform
* Java program -- developer compiles to bytecode, and distributes bytecode version
* each program has only ONE compiled version
* vendors are responsible for interpreters 
* developer friendly

### Java Programming Steps - the Hard Way 
1. Create source code `.java` files
2. Compile to bytecode `.class` files 

Rules
* use text editor
* use java syntax 

#### Example
> public class HelloWorld {
   public static void main (string[ ] args) {
system.out.println("Hello World!");
system.out.println("This is an important message from CPSC112");
}
}

To compile:  `$ javac HelloWorld.java`
Compiler: terminal 

Locate using `*`
* `$ ls HelloWorld.*`
Run Java Program
* `$ java HelloWorld`

 ### Easy: Integrated Development Environment (IDE)
* Eclipse, DrJava

 ## Syntax and Semantics 
* Syntax: define how we can put characters together to make a valid program
* Semantics: define what a program does
* Resolve syntax issues, then resolve semantics (let a program to do what you want)

 ### Syntax and Semantics 
* Class: file with same name: `public class <class name> `
* Methods: contained by the class `public static void main <class name> {`
* Print line of output:  `system.out.println(<string>);`

What is a string?
* A sequence of characters that start and ends with a quotation mark
* `"This is a sting. It is very long!"` 

What to do with illegal Strings? ex. quotations inside of quotation marks?
* Escape sequences
* examples: 
     `\t` tab character 
     `\n`  new line character 
     `\"` quotation character 
     `\\` backslash character 
* take a look at slides for code examples 

