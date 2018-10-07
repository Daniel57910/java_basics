import java.util.Scanner;

public class Calculator {
  
  static int[] nums = {1, 2, 3, 4, 5, 6, 7};
  //static class variable, stored constantly in memory and all instantiations reference 
  public static void main(String[] args) {
    String firstNum, secondNum;
    float first, second;
    int numz [] = {1, 3, 4, 5, 6, 7};
    //instance variable

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the first number");
    firstNum = scan.nextLine();
    System.out.println("Enter the second number");
    secondNum = scan.nextLine();
    scan.close();

    first = Float.parseFloat(firstNum);  
    second = Float.parseFloat(secondNum);
    System.out.println(first + second);
    printNum();
    printArgs(numz);
    printMessage();
    printMessage(first);
    printNumbers(1, 2, 3, 4, 5);
    printNumbers(1, 0, 0, -10, 100, 20010);

  }

  //static method belongs to class, not instance of class
  static void printNum() {
    for (int num : nums) {
      System.out.println(num * num);
    }
  }

  static void printMessage() {
    System.out.println("Method overload 1");
  }

  static void printMessage(float f) {
    System.out.println("Method overload 1");
  }

  static void printArgs(int [] numbers) {
    for (int num: numbers) {
      System.out.println("number is " + num * num);
    }
  }

  static void printNumbers (int ... nums) {
    for (int num: nums ) {
      System.out.println("method overload num = " + num*num);
    }
  }


}