/**
класс реализует калькулятор
*/

public class Calculator{
	/*результат вычисления*/
	private int result;
	
	/*
	суммируем аргументы
	*/
	
	public void add(int ... params){
		for(Integer param : params){
			this.result += param;
		}
	}
	/*получить результат*/
	public int getResult(){
		return this.result;
	}
	
	/*очистить результат вычисления*/
	public void cleanResult(){
		this.result = 0;
	}
	
}