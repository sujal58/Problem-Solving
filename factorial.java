import java.util.Scanner;

public class factorial{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to find factorial: ");
        int num = input.nextInt();

        int factorial = Factorial(num);
        System.out.printf("Factorial of given number is :  %d", factorial);


    }

    public static int Factorial(int num){
        int f = 1;

        for(int i = 1; i <= num; i++){
            f = f * i;
        }

        return f;
    }
}