import java.util.Scanner;
public class Calculator {
	
	public float addition(float a, float b) {
		float sum=a+b;
		return sum;
		
	}
	
	public float substraction(float a, float b) {
		float subs=a-b;
		return subs;
		
	}
	
	public float multiplication(float a, float b) {
		float mul=a*b;
		return mul;
		
	}
	
	public float division(float a, float b) {
		float div=a/b;
		return div;
		
	}

	public static void main(String[] args) {
		
		
		float num1;
		float num2;
		Calculator cl = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		num1 = sc.nextFloat();
		
		String ch;
		System.out.println("Choose operator \'(+,-,*,/)\'");
		ch = sc.next();
		switch(ch) {
	
		case "+":{
			System.out.println("Enter Second number: ");
			num2 = sc.nextFloat();
			System.out.println(num1+" + "+num2+" = "+cl.addition(num1, num2));
			break;
		}
		
		case "-":{
			System.out.println("Enter Second number: ");
			num2 = sc.nextFloat();
			System.out.println(num1+" - "+num2+" = "+cl.substraction(num1, num2));
			break;
		}
		
		case "*":{
			System.out.println("Enter Second number: ");
			num2 = sc.nextFloat();
			System.out.println(num1+" * "+num2+" = "+cl.multiplication(num1, num2));
			break;
		}
		
		case "/":{
			System.out.println("Enter Second number: ");
			num2 = sc.nextFloat();
			System.out.println(num1+" / "+num2+" = "+cl.division(num1, num2));
			break;
			
		}
		default:{
			System.out.println("Sorry,You have entered Wrong operator..");
		}
		
		}
		
		
		
		

	}

}
