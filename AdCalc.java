import java.util.Scanner;
public class AdCalc {
  public static void main(String[] args) { 

    String first, second, operand;
    double firstNum, secondNum;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first number");
    first = scan.nextLine();
    System.out.println("Enter the second number");
    second = scan.nextLine();
    System.out.println("Enter the operand (+ - * /)");
    operand = scan.nextLine();
    scan.close();

    firstNum = Double.parseDouble(first);

    try {
      secondNum = Double.parseDouble(second);
    }
    catch (Exception e) {
      System.out.println("Try again with correct data");
    }
    //need to further review with catch statement
 
  }

  static boolean isValidOperand(String operand) {
    return (operand.equals("+") || operand.equals("-") || operand.equals("/") || operand.equals("*"));
  }
}