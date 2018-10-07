import java.util.Scanner;
public class AdCalc {
  public static void main(String[] args) { 

    String first, second, operand;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first number");
    first = scan.nextLine();
    System.out.println("Enter the second number");
    second = scan.nextLine();
    System.out.println("Enter the operand (+ - * /)");
    operand = scan.nextLine();
    scan.close();
    System.out.println(isValidOperand(operand));
    
  }

  static boolean isValidOperand(String operand) {
    return (operand.equals("+") || operand.equals("-") || operand.equals("/") || operand.equals("*"));
  }
}