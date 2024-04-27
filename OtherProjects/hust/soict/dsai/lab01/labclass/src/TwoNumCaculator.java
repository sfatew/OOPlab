package LabClass.src;

import java.util.Scanner;
public class TwoNumCaculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("numbers: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("operator: ");
        String operator = scanner.nextLine();


        if(operator.equals("sum")){
            System.out.println(num1 + num2);
        }
        if(operator.equals("difference")){
            System.out.println(Math.abs(num1 - num2));
        }
        if(operator.equals("product")){
            System.out.println(num1 * num2);
        }
        if(operator.equals("quotient")){
            if (num2 == 0){
                System.out.println("Error: the divisor is 0");
            }
            else{
                System.out.println(num1 / num2);
            }
        }
        scanner.close();
        System.exit(0);
    }
}
