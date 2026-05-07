package BasicJavaPrograms;

import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        //datatype variable = value - Variable declaration
        Scanner sc= new Scanner(System.in);
        //int fNumber=5, sNumber=6;
        System.out.println("Enter the first number");
        int fNumber=sc.nextInt(); //reading data
        System.out.println("Enter the second number");
        int sNumber=sc.nextInt();
        int sum=fNumber + sNumber;
        System.out.println("Sum="+sum);
    }
}
