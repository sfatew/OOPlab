package LabClass.src;
import java.util.Scanner;
public class EquationSolver {
    public static void main(String[] args) {
        EquationSolver e = new EquationSolver();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Equation degree: ");
        int degree = scanner.nextInt();
        scanner.nextLine();
        System.out.println("System? Y/N");
        String sys = scanner.nextLine();

        int var = 2;
        if (sys.equals("Y")){
            System.out.println("number of variables: ");
            var = scanner.nextInt();
            scanner.nextLine();
        }

        if ((sys.equals("Y") && var>2) || (degree > 2)){
            System.out.println(" under development :)");
        }

        if(degree == 1 && sys.equals("N")){
            System.out.println("\n  ax + b = 0");

            System.out.println("a = ");
            Double a = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("b = ");
            Double b = scanner.nextDouble();
            scanner.nextLine();

            e.firstDegree1Var(a,b);
        }

        if(degree == 2 && sys.equals("N")){
            System.out.println("\n  ax^2 + bx + c = 0");
            System.out.println("a = ");
            Double a = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("b = ");
            Double b = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("c = ");
            Double c = scanner.nextDouble();
            scanner.nextLine();

            e.secondDegree1Var(a, b, c);
        }

        if(degree == 1 && sys.equals("Y") && var==2){
            System.out.println("\n   a_11x_1 +a_12x_2  = b_1 \n   a_21x_1 + a_22x_2 = b_2");
            System.out.println("a_11 = ");
            Double a_11 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("a_12 = ");
            Double a_12 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("a_21 = ");
            Double a_21 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("a_22 = ");
            Double a_22 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("b_1 = ");
            Double b_1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("b_2 = ");
            Double b_2 = scanner.nextDouble();
            scanner.nextLine();
            
            e.firstDegree2Var(a_11, a_12, a_21, a_22, b_1, b_2);
        }

        scanner.close();

    }

    public void firstDegree1Var(double a, double b){
        if(a==0){
            System.out.println("no solution");
        }
        else{
            System.out.println(-b/a);
        }
    }

    public void secondDegree1Var(double a, double b, double c){
        if(a==0){
            this.firstDegree1Var(b, c);
        }
        else{
            double delta = Math.pow(b, 2) - 4*a*c;
            if (delta < 0){
                System.out.println("No real solution");
            }
            else if (delta == 0){
                System.out.println(-b/(2*a));
            }
            else{
                System.out.println((b+Math.sqrt(delta))/(2*a));
                System.out.println((b-Math.sqrt(delta))/(2*a));
            }
            
        }
    }

    public void firstDegree2Var(double a_11, double a_12, double a_21, double a_22, double b_1, double b_2){
        double D = a_11*a_22 - a_21*a_12;
        double D1 = b_1*a_22 - b_2*a_12;
        double D2 = a_11*b_2 - a_21*b_1;

        if (D == 0){
            if (D1 != 0 && D2 != 0){
                System.out.println("No solution");
            }
            else{
                System.out.println("infinitely many solution");
            }
        }
        else{
            System.out.println("x1 = " + D1/D);
            System.out.println("x2 = " + D2/D);
        }
    }
}
