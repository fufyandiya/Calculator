package ru.lesson.lessons;

/**
 * Класс, реализующий функции калькулятора
 * @author Ivan Kachkin
 * @version 1.1
 */
public class Calculator {
	/**
	 * Переменная, хранящая результат работы калькулятора
	 */
	private int result;

	/**
	 * Складывает две переменные
	 * @param arg1
	 * @param arg2
	 * @result this.result
	 */
	public void add(final int arg1, final int arg2) {

		this.result = arg1 + arg2;
	}
	/**
	 * Вычитает две переменные
	 * @param arg1
	 * @param arg2
	 * @result this.result
	 */
	public void subtract(final int arg1, final int arg2) {

		this.result = arg1 - arg2;
	}
	/**
	 * Умножает две переменные
	 * @param arg1
	 * @param arg2
	 * @result this.result
	 */
	public void multiplicate(final int arg1, final int arg2) {

		this.result = arg1 * arg2;
	}
	/**
	 * Делит две переменные друг на друга
	 * @param arg1
	 * @param arg2
	 * @result this.result
	 */
	public void divide(final int arg1, final int arg2) {
		try {
			this.result = arg1 / arg2;
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("Нельзя делить на ноль!");
		}
	}
	/**
	 * Возводит arg1 в степень arg2
	 * @param arg1
	 * @param arg2
	 * @result this.result
	 */
	public void exponent(final int arg1, final int arg2) {
		int x = 1;
		for (int i = 0; i < arg2; i++) {
			x *= arg1;
		}
		this.result = x;
	}
	/**
	 * Возвращает результат работы калькулятора
	 * @return this.result
	 */
	public int getResult() {
		return this.result;
	}
	/**
	 * Сбрасывает результат работы калькулятора
	 * @return this.result
	 */
	public void cleanResult() {
		this.result = 0;
	}
}