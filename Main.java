//All classes start upper case

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
public class Main {
  //declaring of constants
  public static final String NAME = "ROB";

  public static void main(String[] args) {
    //variables and methods camelcase
    System.out.println("Hello World");
    System.out.println(NAME);
    int myVar = 5;
    String john = "John";
    int mySec = 3;
    byte b = 126;
    System.out.println(myVar + mySec + " " + john);

    //max value of byte data type.
    if (b < Byte.MAX_VALUE) {
        System.out.println(b);
        b++;
        System.out.println(b);
    }

    long longVar = myVar;
    //widening the type, long variables require more memory
    System.out.println(longVar);

    short shortVar = (short) longVar;
    //narrowing the type. need to force cast the variable first. conversion will only work if data compatible with narrowing.
    System.out.println(shortVar);

    double testDouble = 1.23456;
    int castDouble = (int) testDouble;
    System.out.println(castDouble);

    //usage of the java math class. call them directly from class definition.
    //math class included in standard java.
    double rounded = Math.round(testDouble);
    System.out.println(rounded);

    //example of boolean language. default value of boolean is false.
    boolean b1 = (5 > 6);
    System.out.println(b1);
    System.out.println(!(b1));

    char c1 = 'c';
    String c2 = "c";

    //chars in single chars, strings in double quotes
    //character and string libraries included in standard java
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(Character.toUpperCase(c1));

    int first = 10;
    //post fix, executes code then completes math op
    System.out.println(first++);
    System.out.println(first);
    //pre fix, completes math op then executes the code
    System.out.println(++first);

    String dog = "dog";
    String cat = "cat";
    //for comparing strings use string class method
    System.out.println(dog.equals(cat));
    System.out.println(dog + " " + cat + ": " + 10);
    //can concat strings using +, ints converted to string at compilation

    //can loop through string by converting string to array of characters
    for (char c: dog.toCharArray()) {
      System.out.println(c);
    }
    
    int toString = 2356;
    //for string concatenation
    String fromInt = Integer.toString(toString) + " is now a string";
    System.out.println(fromInt);

    Scanner input = new Scanner(System.in);
    String userEnter = input.nextLine();
    input.close();
    System.out.println(userEnter);

    String compare1 = "match";
    String compare2 = "Match";

    /*== inappropriate for objects, need to use object methods for equality */
    System.out.println(compare1.equals(compare2));
    System.out.println(compare1.equalsIgnoreCase(compare2));

    /* java has standard date time library */
    LocalDate date = LocalDate.now();
    System.out.println(date);

  }
 
}