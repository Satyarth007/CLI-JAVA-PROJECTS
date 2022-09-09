// CODE BY - SATYARTH 
// I MADE THIS CUI PROJECT TO CREATE STACK USING ARRAY DYNAMICALLY.
import java.util.Scanner;
public class StackMenuDrivenProgram {
	static int stackArray[];
	static int stackCapacity;
	static int top;
	
	public  StackMenuDrivenProgram(int cap) {               //constructor to pass the size of array .i.e. size of stack we want
		this.stackCapacity=cap;
		top=-1;						// initially the top pointer will be at -1 
		stackArray=new int[stackCapacity];
		
	}
// ======================== PUSH METHOD ===============================================
	public static void push() {
		Scanner sc=new Scanner(System.in);
		if(isFull()) {
			// isFull() method will print the overflow statement
			return;
		}
		else {
			System.out.print("ENTER THE DATA : -");
			top++;
			int item=sc.nextInt();
			stackArray[top]=item;
			
		}
	}
//========================= POP METHOD ==================================================	
	public static void pop() {
		if(isEmpty()) {
			// isEmpty() method will print the underflow statement
			return;	
		}
		int del=stackArray[top];
		System.out.println("ITEM DELETED :- "+del);
		top--;
		
	}
//========================= IS FULL METHOD ==============================================
	public static boolean isFull() {						// condition for overflow => (top == size-1)
		if(top== stackArray.length-1) {
			System.out.println("YOUR STACK IS FULL BRO !");
			return true;
		}else {
			System.out.println("YOUR STACK IS NOT FULL BRO !");
			return false;
		}
	}
//========================= IS EMPTY METHOD ==============================================	
	public static boolean isEmpty() {
		if(top==-1) {								// condition for underflow => (top == -1)
			System.out.println("YOUR STACK IS EMPTY BRO !");
			return true;
		}else {
			System.out.println("YOUR STACK IS NOT EMPTY BRO !");
			return false;
		}
	}
//========================= DISPLAY METHOD ==============================================	
	public static void display() {							// DISPLAYING STACK FROM TOP TO BOTTOM
		if(isEmpty()) {
			
			return;
		}
		for(int i=top;i>=0;i--) {
			System.out.print(stackArray[i]+" :: ");
		}
		System.out.println();
	}
//========================= MAIN METHOD ==================================================	
	public static void main(String[] args) {
		//main method to create stack object 
		 Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE CAPACITY OF STACK U WANT TO CREATE :- ");
		int cap=sc.nextInt();
		StackMenuDrivenProgram st=new StackMenuDrivenProgram(cap);
		
	// MENU DRIVEN INTERFACE:-	
		while(true) {
			System.out.println("================ MENU ================");
			System.out.println("\t    0 : EXIT ");
			System.out.println("\t    1 : PUSH ");
			System.out.println("\t    2 : POP ");
			System.out.println("\t    3 : IS FULL  ");
			System.out.println("\t    4 : IS EMPTY ");
			System.out.println("\t    5 : DISPLAY ");
			System.out.println("======================================");
			
			int choice =sc.nextInt();
			
			switch(choice) {
			case 0: System.exit(0);
			
			case 1: st.push();
					break;
			case 2: st.pop();
					break;
			case 3: st.isFull();
					break;
			
			case 4: st.isEmpty();
					break;
			case 5: st.display();
					break;
			default:System.out.println("INVALID CHOICE");		
					
			}
		}

		// THANKYOU FOR READING MY ENTIRE CODE :)     LOVE FROM SATYARTH [INDIA]
		
		
		
		

	}

}
