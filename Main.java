import java.util.Scanner;

public class Main{

	public void greet(){
		Scanner sc = new Scanner(System.in);
		String  myname = sc.nextLine();
		System.out.println("Hello, "+myname);
	}

	public void display(){
    Scanner sc1 = new Scanner(System.in);
  	int numb = sc1.nextInt();
  	System.out.println("Nmber is "+numb);
  }

  public void box(){
    System.out.drawBox

  }
	public static void main(String args[]){

	Main m = new Main();
	m.greet();
	m.display();

		//String str1 = "Yash Desai";
		//int age = 26;

		//System.out.println("My name is "+str1+", and I am "+age+" years old.");

	//Widening Casting
	//byte -> short -> char -> int -> long -> float -> double
		
		//Narrowing Casting
		// double dSalary = 10000;
		// int salary = (int)dSalary;


	

	
	}
}



/*

Main Hello MyDemoClass


myAge  myNewSalary()

displayMyName()


*/
