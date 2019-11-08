package edu.wvu.seng560;

import java.util.Scanner;

import main.ArithmeticFunctions;

public class SimpleCalc {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter arithmetic expression separated by spaces (q to quit)");

		while (true) {

			String input = myObj.nextLine();

			if (input.contentEquals("q")) {
				System.out.println("Quitting");
				break;
			}

			String[] splitInput = input.split("\\s");

			String input1 = splitInput[0];
			String operator = splitInput[1];
			String input2 = splitInput[2];

			float input1f = Float.parseFloat(input1);
			float input2f = Float.parseFloat(input2);

			ArithmeticFunctions af = new ArithmeticFunctions();

			switch (operator) {
			case "+":
				System.out.println(af.addition(input1f, input2f));
				break;
			case "-":
				System.out.println(af.subtraction(input1f, input2f));
				break;
			case "*":
				System.out.println(af.multiplication(input1f, input2f));
				break;
			case "/":
				System.out.println(af.division(input1f, input2f));
				break;
			default:
				System.out.println("invalid operator");
			}

		}

		myObj.close();

	}

}
