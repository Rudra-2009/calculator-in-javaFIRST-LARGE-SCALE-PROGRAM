import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please the type of mathamatical operator you want to use here (add/minus/multiply/divide)");
        String a = myObj.nextLine();
        if (a.equals("add")) {
            System.out.println("Enter the two nos. you want to add");
            System.out.println("Enter 1st no.");
            int addNo1 = myObj.nextInt();
            System.out.println("Enter 2nd no.");
            int addNo2 = myObj.nextInt();
            int addAnswer= addNo1+addNo2;
            System.out.println("Your answer is "+ addAnswer);
        }
        if(a.equals("minus")) {
            System.out.println("Enter the two nos. you want to subtract");
            System.out.println("Enter 1st no.");
            int minusNo1 = myObj.nextInt();
            System.out.println("Enter 2nd no.");
            int minusNo2 = myObj.nextInt();
            int minusAnswer= minusNo1-minusNo2;
            System.out.println("Your answer is "+ minusAnswer);
        }
         if(a.equals("multiply")) {
            System.out.println("Enter the two nos. you want to multiply");
            System.out.println("Enter 1st no.");
            int multiplyNo1 = myObj.nextInt();
            System.out.println("Enter 2nd no.");
            int multiplyNo2 = myObj.nextInt();
            int multiplyAnswer= multiplyNo1*multiplyNo2;
            System.out.println("Your answer is "+ multiplyAnswer);
        }
        if(a.equals("divide")) {
            System.out.println("Enter the two nos. you want to divide");
            System.out.println("Enter 1st no.");
            int divideNo1 = myObj.nextInt();
            System.out.println("Enter 2nd no.");
            int divideNo2 = myObj.nextInt();
            int divideAnswer= divideNo1/divideNo2;
            System.out.println("Your answer is "+ divideAnswer);
        }
    }
}

