package ru.lesson.lessons;
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
	public void sub(int ... params){
		this.result = params[0]-params[1];
	}
	public void div(int ... params){
		this.result = params[0]/params[1];
	}
	public void mult(int ... params){
		this.result = params[0]*params[1];
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