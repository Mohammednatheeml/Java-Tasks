package Data_type_and_internal_workflow;

public class Explanations {
	
	/*  1. Primitive and Non-Primitive Data Types
			Java data types are divided into two categories: Primitive and Non-Primitive.

			Primitive Data Types: These are the 8 built-in data types in Java that store simple values directly. They are byte, short, int, long, float, double, char, and boolean. Examples: int age = 21; and char grade = 'A';.
			Non-Primitive Data Types: These are reference data types that refer to objects or arrays. Examples include String, arrays, classes, and interfaces. For example, String name = "Natheem"; and int[] numbers = {10, 20, 30};.
			Difference: Primitive types store simple values, whereas non-primitive types store references to objects or arrays and can have methods. 
			
		2.Internal Workflow of a Java Program
		
			The Java execution workflow explains how Java code is converted into output. 
			First, the programmer writes source code in a .java file. 
			The Java compiler (javac) compiles the source code into bytecode and generates a .class file. 
			The JVM loads the class file using the Class Loader and verifies the bytecode. Then, the Execution Engine executes the bytecode using the Interpreter and JIT Compiler. Finally, the program produces the output.
			
			Workflow: Source Code (.java) → Compiler (javac) → Bytecode (.class) → JVM → Execution Engine → Output

		3.What is JDK, JRE, and JVM?
		
			JDK (Java Development Kit): JDK is a software development kit that provides tools to develop, compile, debug, and run Java applications. It includes the Java compiler and runtime components.
			JRE (Java Runtime Environment): JRE provides the environment required to run Java applications. It conceptually includes the JVM and Java class libraries.
			JVM (Java Virtual Machine): JVM is a virtual machine responsible for loading, verifying, and executing Java bytecode. It also manages memory and garbage collection.


		4.What is JIT Compiler?
		
			JIT stands for Just-In-Time Compiler. It is a component of the JVM Execution Engine that converts frequently executed bytecode into native machine code at runtime. It improves Java performance by reducing repeated interpretation and allowing frequently executed code to run faster.
			
			
		5.Relationship Between JDK, JRE, JVM, and JIT
		
			JDK provides the development tools required to write and compile Java programs. The compiler converts .java source code into .class bytecode. 
			JRE provides the runtime environment.
			JVM loads and executes the bytecode. Inside the JVM, the Interpreter executes bytecode.
		 	while the JIT Compiler converts frequently executed code into native machine code to improve performance. Finally, the program produces the output.
	*/
	
	
	
}
