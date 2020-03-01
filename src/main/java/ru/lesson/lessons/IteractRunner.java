package ru.lesson.lessons;
import java.util.Scanner;

/*класс для запуска калькулятора*/

public class IteractRunner{
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			System.out.println("Выберите операцию +/-/*//");
			String operator = reader.next();
			while(!exit.equals("yes")){
				System.out.println("Enter first arg:");
				String first = reader.next();
				System.out.println("Enter second arg:");
				String second = reader.next();
				
				
				if(operator.equals("+")){
					calc.add(Integer.valueOf(first), Integer.valueOf(second));
				}
				else if(operator.equals("-")){
					calc.sub(Integer.valueOf(first), Integer.valueOf(second));
				}
				else if (operator.equals("/")){
					calc.div(Integer.valueOf(first), Integer.valueOf(second));
				}
				else if (operator.equals("*")){
					calc.mult(Integer.valueOf(first), Integer.valueOf(second));
				}
				
				System.out.println("Result :"+calc.getResult());
				calc.cleanResult();
				System.out.println("Exit: yes/no");
				exit = reader.next();
			}
		}finally{
			reader.close();
		}
	}
	
}