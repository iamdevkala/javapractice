import java.util.Scanner;

public class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        int num1;
//        int num2;
//        int num3;

        Scanner input = new Scanner(System.in);
        System.out.println("enter numbers");
        num1 = input.nextInt();
//        num2 = input.nextInt();
//        num3 = input.nextInt();
//
        if((num1 >=0) && (num1 !=-)){
            System.out.println("The number is positive" );
        }

        else if(num1 == -){
            System.out.println("The num is negative");
        }

        else{
            System.out.println("The num is 0");
        }
    }
}
