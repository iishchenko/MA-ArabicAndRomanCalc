package org.ira.calculator;

import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Input first number: ");
    String numInput1 = in.next();

    System.out.print("Input second number: ");
    String numInput2 = in.next();
    int num1 = getNumber(numInput1);
    int num2 = getNumber(numInput2);

    calculate(num1, num2);
  }

  private static int getNumber(String inputNumber){
    // receives the input text, and tries to convert it in an arabic number
    int num;
    try {
      //     try to convert the input Strings to integers, if there are not arabic numbers, it will fail
      num = Integer.valueOf(inputNumber);

    } catch( NumberFormatException exception ) {
      //     if an exception is captured, that means that they were roman numbers
      RomanNumeral num1tr = new RomanNumeral(inputNumber);
      num = num1tr.toInt();
    }
    return num;
  }

  private static void calculate(int num1, int num2) {
    //   do the basic calculator operations

    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
  }

}