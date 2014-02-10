//Counting Down: Code Puzzle

//		System.out.println("T-minus ")
//		for (int i = 1; i <= N; i++) {
//			System.out.println(N+1-i + ", ");	
//		}
//		System.out.println("Blast Off!");
//
//		System.out.println( "Final N = " +  N);
//		System.out.println( "FInal i = " + i)
//	}
// }
//Variable Scope: the part of a program where a variable exists
	//Basic rule: from its declaration to the end of the {} braces
//Variable declared in a for loop exists only in that loop
//Variable declared in a specific method exists only in that method
//A variable declared not inside any method 


// Encapsulation: different methods can use the same variable name w/o need for coordation
	// Example: Folders allow same file name so long in different folders 

public class SimpleLoop2 {
	public static void main(String[] args) {
		for (int set=1; set <= 5; set++) {
			for (int rps = 1; rps <= set; rps++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}

// Loop inside another loop: nested loop

//Design Decomposition


1. Bound
2. Top Half (V)
3. Bottom Half (Top half upside down)
4. Bound

==  ==
 \  /
  \/

Bound 
  * ==, (Size - 2)*2 spaces, ==

Top Half (V) - Nested Loops!
  * outer loop (loops SIZE - 1)

  for (int line = 1; line <= SIZE-1; line++) {
  }

  //Pattern of each line: white space \ white space /
  //Determining white space? 
  //Line 1: one space leading, "int 2(SIZE - 2)-2*line"
  //Line 2: two spaces leading

  for (int line ; ; ) {
  	
  }

// Implementation problem: defining methods of white space 
  // Resuable function, but need to draw different numbers of spaces
  // Rule: AVOID REDUNDANCY
// Method Parameterization
  //specify a parameter to control the behavior of a method
  //redundancy removal/abstraction -- GENERALIZATION (the more general a building block, the more helpful it is)

//Parameter: 
//	public static void <method_name> ( <type> <param_name>) {
//		<statement>(s); 
// }

public static void main(String[] args) {
	chant(3);
	chant(3+4);
}

public static void chant()

//Common errors -- illegal to call without passing any value for that parameter
//Value passed must be correct type

Draw X Method

public class DrawXMethods{
	public static void main(String[] args) {
		test();
	}
	//end of main
	public static void bound(int size) {
		System.out.print("==");
		spaces(2 * (size - 2));
		System.out.print("==");
	}
	public static void test(){
		//spaces(4);
		spaces(3);
	}

public static void spaces(int n) {
	for (int i = 1; i <=n; i++) {
		System.out.println(" ");
	}
}


//Using Color
//Color.CONSTANT_NAME

//StdDraw.setPenColor(Color.BLACK)
