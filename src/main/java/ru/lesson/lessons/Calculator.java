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
	
	public void add(int ... params) throws UserException {
		if (params.length>0){
			for(Integer param : params){
				this.result += param;
			}
		}else {
			throw new UserException("you should modif params");
		}
	}


	public void sub(int ... params) throws UserException{
		if (params.length>0){
			this.result = params[0]-params[1];
		}else {
			throw new UserException("you should modif params");
		}

	}

	/**
	 * вычимсляем делление
	 * @param params вхлдящие параметры
	 * @throws UserException если аргументов нет выкидываем исключение
	 */
	public void div(int ... params) throws UserException{
		if (params.length>0){
			this.result = params[0];
			for(int param: params){
				if (param==0){
					throw new IllegalArgumentException("To try to div 0. please chage arf");
				}
				this.result /= param;
			}
		}else {
			throw new UserException("you should modif params");
		}
		this.result = params[0]/params[1];
	}

	public void mult (int ... params) throws UserException{
		if (params.length>0){
			this.result = params[0]*params[1];
		}else{
			throw new UserException("you should modif params");
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