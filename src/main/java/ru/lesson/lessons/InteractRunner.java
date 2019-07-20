package ru.lesson.lessons;

import java.util.Scanner;

/**
 * Класс, принимающий значения параметров и операций для калькулятора
 * @author Ivan Kachkin
 * @version 1.1
 */
public class InteractRunner {
	static String first;
	static String operation;
	static String second;

	public static void main (String[] arg) {
		new InteractRunner().go();
	}
	/**
	 * Создает входной поток и обьект класса Calculator
	 */
	public void go() {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "нет";
			/**
			 * Принимает значения, пока в exit не будет "да"
			 */
			while (!exit.equals("да")) {

				readFirst(calc, reader);
				readOperation(reader);
				readSecond(reader);

				doOperation(calc, first, second, operation);
				System.out.println("Результат: " + calc.getResult());
				System.out.println("Выйти: Да/Нет ");
				exit = reader.next().toLowerCase();
			}
		} finally {
			reader.close();
		}
	}
	/**
	 * Заносит в first либо значение result из обьекта calc, либо входного потока reader
	 * @param calc
	 * @param reader
	 */
	public void readFirst(Calculator calc, Scanner reader) {
		System.out.println("Использовать предыдущий результат в качестве первого аргумента? Да/Нет");
		if (reader.next().toLowerCase().equals("да"))
			first = String.valueOf(calc.getResult());
		else {
			calc.cleanResult();
			System.out.println("Введите первый аргумент: ");
			first = reader.next();
		}
	}
	/**
	 * Заносит в second значение входного потока reader
	 * @param reader
	 */
	public void readSecond(Scanner reader) {
		System.out.println("Введите второй аргумент: ");
		second = reader.next();
	}
	/**
	 * Заносит в operation значение входного потока reader
	 * @param reader
	 */
	public void readOperation(Scanner reader) {
		System.out.println("Введите операцию [+],[-],[*],[/],[^]: ");
		operation = reader.next();
	}

	/**
	 * Вызывает методы обьекта calc в зависимости от operation, либо
	 * выводит выводит ошибку в консоль.
	 * @param calc
	 * @param firstNumber
	 * @param secondNumber
	 * @param operation
	 */
	public void doOperation(Calculator calc, String firstNumber, String secondNumber, String operation) {
		try {
			if (operation.equals("+")) {
				calc.add(Integer.valueOf(firstNumber), Integer.valueOf(secondNumber));
			} else if (operation.equals("-")) {
				calc.subtract(Integer.valueOf(firstNumber), Integer.valueOf(secondNumber));
			} else if (operation.equals("*")) {
				calc.multiplicate(Integer.valueOf(firstNumber), Integer.valueOf(secondNumber));
			} else if (operation.equals("/")) {
				calc.divide(Integer.valueOf(firstNumber), Integer.valueOf(secondNumber));
			} else if (operation.equals("^")) {
				calc.exponent(Integer.valueOf(firstNumber), Integer.valueOf(secondNumber));
			} else
				System.out.println("Недопустимая операция!");
		} catch (NumberFormatException ex) {
			System.out.println("Неправильно введен аргумент(ы)");
		}

	}
}