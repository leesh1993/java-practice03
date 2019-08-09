package prob06;

import java.util.Scanner;

class Add{
    int a;
    int b;
   
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	   
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a+b;	   
	}
	   

}

class Sub{
    int a;
    int b;
   
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	   
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a-b;	   
	}
}
class Mul{
    int a;
    int b;
   
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	   
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a*b;	   
	}
}
class Div {
    int a;
    int b;
   
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	   
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a/b;	   
	}
}

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {

			System.out.print( ">> " );
			String expression = scanner.nextLine();
				
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			
			if( tokens.length != 3 ) {
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			
			int lvalue = Integer.parseInt(tokens[0]);
			int rvalue = Integer.parseInt(tokens[2]);
			
			switch (tokens[1]) {
				case "+": {
					Add add = new Add();
					add.setValue(lvalue,rvalue);
					int result = add.calculate();
					System.out.println(">>" + result);
					break;
				}
				case "-": {
					Sub sub = new Sub();
					sub.setValue(lvalue,rvalue);
					int result = sub.calculate();
					System.out.println(">>" + result);
					break;
				}
				case "*": {
					Mul mul = new Mul();
					mul.setValue(lvalue,rvalue);
					int result = mul.calculate();
					System.out.println(">>" + result);
					break;
				}
				case "/": {
					Div  div = new Div ();
					div.setValue(lvalue,rvalue);
					int result = div.calculate();
					System.out.println(">>" + result);
					break;
				}
				default:
					break;
			}
			
			/*  코드를 완성 합니다 */
			
			
			
			
		}
		
		scanner.close();

	}

}
