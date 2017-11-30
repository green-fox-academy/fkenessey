import java.util.*;

public class Exercise13 {
    public static void main(String[] args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations:
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, this is the calculator class!");
        System.out.println("The format of the expressions must be: {operation} {operand} {operand} - e.g.: + 3 3");
        System.out.println("Supported operations: +, -, *, /, %");
        System.out.println("The operand shall be integer");
        System.out.println("Please type in the expression:");

        String p = scanner.nextLine();
        System.out.println(p);

        //Determining operation and returning result
        int endresult = 0;
        //As ArrayList does not work as planned:
        char a = p.charAt(2);
        int an = Integer.parseInt(String.valueOf(a));
        char b = p.charAt(4);
        int bn = Integer.parseInt(String.valueOf(b));
        //char op = p.charAt(0);
        //System.out.println("a:" + a + "b:" + b + "op:" + op);
        //System.out.println("a:" + an + "b:" + bn);


        if (p.contains("+")) {
            endresult = addition(an, bn);
        } else if (p.contains("-")) {
            endresult = subtraction(an, bn);
        } else if (p.contains("*")) {
            endresult = multiply(an,bn);
        } else if (p.contains("/")){
            endresult = divide(an, bn);
        } else if (p.contains("%")){
            endresult = remainder(an, bn);
        } else {
            System.out.println("Ooops");
        }

        //Print results
        System.out.println("The result is: " + endresult);

        //if (op == "+") {
        //    op = "+";
        //  a = Integer.valueOf(question.get(2));
        //  b = Integer.valueOf(question.get(4));
        //  endresult = addition(op, a, b);
        //} else if (question.contains("-")) {
        //  op = "-";
        //  a = Integer.valueOf(question.get(2));
        //  b = Integer.valueOf(question.get(4));
        //  endresult = subtraction(op, a, b);
        //} else if (question.contains("*")){
        //  op = "*";
        //  a = Integer.valueOf(question.get(2));
        //  b = Integer.valueOf(question.get(4));
        //  endresult = multiply(op, a, b);
        //} else if (question.contains("/")){
        //  op = "/";
        //  a = Integer.valueOf(question.get(2));
        //  b = Integer.valueOf(question.get(4));
        //  endresult = divide(op, a, b);
        //} else if (question.contains("%")){
        //  op = "%";
        //  a = Integer.valueOf(question.get(2));
        //  b = Integer.valueOf(question.get(4));
        //  endresult = remainder(op, a, b);
        //} else{
        //   System.out.println("Ooops");
        //}
    }
    //Calculus functions

    public static int multiply(int operand1, int operand2) {
        int result = operand1 * operand2;
        return result;
    }
    public static int divide(int operand1, int operand2) {
        int result = operand1 / operand2;
        return result;
    }
    public static int addition(int operand1, int operand2) {
        int result = operand1 + operand2;
        return result;
    }
    public static int subtraction(int operand1, int operand2) {
        int result = operand1 - operand2;
        return result;
    }
    public static int remainder(int operand1, int operand2) {
        int result = operand1 % operand2;
        return result;
    }
}
//import java.util.*;
//
//public class Exercise13 {
//    public static void main(String[] args) {
//      // Create a simple calculator application which reads the parameters from the prompt
//      // and prints the result to the prompt.
//      // It should support the following operations:
//      // +, -, *, /, % and it should support two operands.
//      // The format of the expressions must be: {operation} {operand} {operand}.
//      // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)
//
//      // You can use the Scanner class
//      // It should work like this:
//
//      // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
//      Scanner scanner = new Scanner(System.in);
//      System.out.println("Hello, this is the calculator class!");
//      System.out.println("The format of the expressions must be: {operation} {operand} {operand} - e.g.: + 3 3");
//      System.out.println("Supported operations: +, -, *, /, %");
//      System.out.println("The operand shall be integer");
//      System.out.println("Please type in the expression:");
//
//      //Declaring input array and retrieving input values
//      ArrayList<String> question = new ArrayList<>();
//
//      //String response = scanner.nextLine();
//      //System.out.println(response);
//
//      question.add(scanner.nextLine());
//      System.out.println(question);
//
//      //Determining operation and returning result
//      char op = ' ';
//      int a = 0;
//      int b = 0;
//      int endresult = 0;
//      //As ArrayList does not work as planned:
//      String p = question.get(0);
//      a = p.charAt(2);
//      b = p.charAt(4);
//      op = p.charAt(0);
//
//      if (op == '+') {
//          endresult = addition(op, a, b);
//      } else if (op == '-') {
//          endresult = subtraction(op, a, b);
//      } else if (op == '*') {
//          endresult = multiply(op,a,b);
//      } else {
//          System.out.println("Ooops");
//      }
//
//      //if (op == "+") {
//      //    op = "+";
        //  a = Integer.valueOf(question.get(2));
        //  b = Integer.valueOf(question.get(4));
        //  endresult = addition(op, a, b);
        //} else if (question.contains("-")) {
        //  op = "-";
        //  a = Integer.valueOf(question.get(2));
        //  b = Integer.valueOf(question.get(4));
        //  endresult = subtraction(op, a, b);
        //} else if (question.contains("*")){
        //  op = "*";
        //  a = Integer.valueOf(question.get(2));
        //  b = Integer.valueOf(question.get(4));
        //  endresult = multiply(op, a, b);
        //} else if (question.contains("/")){
        //  op = "/";
        //  a = Integer.valueOf(question.get(2));
        //  b = Integer.valueOf(question.get(4));
        //  endresult = divide(op, a, b);
        //} else if (question.contains("%")){
        //  op = "%";
        //  a = Integer.valueOf(question.get(2));
        //  b = Integer.valueOf(question.get(4));
        //  endresult = remainder(op, a, b);
        //} else{
        //   System.out.println("Ooops");
        //}
//   }
//    //Calculus functions
//
//    public static int multiply(char operation, int operand1, int operand2) {
//        int result = operand1 * operand2;
//        return result;
//   }
//    public static int divide(char operation, int operand1, int operand2) {
//        int result = operand1 / operand2;
//        return result;
//   }
//    public static int addition(char operation, int operand1, int operand2) {
//        int result = operand1 + operand2;
//        return result;
//    }
//    public static int subtraction(char operation, int operand1, int operand2) {
//        int result = operand1 - operand2;
            //       return result;
//   }
//   public static int remainder(char operation, int operand1, int operand2) {
//        int result = operand1 % operand2;
//        return result;
//    }
//}
