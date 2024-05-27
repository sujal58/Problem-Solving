import java.util.Scanner;

public class primeFactor {
    public static void main(String[] arg) {

        int num = 13195;
        Scanner input = new Scanner(System.in);

        int currentPrime = 2;
        while (num > 1) {
            if (num % currentPrime == 0) {
                num = num / currentPrime;
            } else {
                currentPrime = getNextPrime(currentPrime);
            }
        }
        System.out.println(currentPrime);

        // System.out.printf("Prime factor of %d is:", num);
        // for (int i = 2; i <= num; i++) {

        // if (num % i == 0) {

        // isPrime = 1;

        // for(int j = 2; j <= i/2; j++){
        // if( i % j == 0){
        // isPrime = 0;
        // break;
        // }
        // }
        // }

        // if(isPrime == 1) System.out.printf("%d"+ " ", i);
        // }

    }

    public static int getNextPrime(int currentPrime) {
        int prime;
        int[] primeArr = new int[100];
        int k = 0;

        for (int i = 2; i <= 100; i++) {
            prime = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = 0;
                    break;
                }
            }

            if (prime == 1) {
                primeArr[i - 2] = i;
                System.out.println(i);
            }

        }

        for (int i = 0; i < primeArr.length; i++) {
            System.out.printf("%d \t", primeArr[i]);
        }

        return primeArr[k + 1];
    }
}

// getNextPrime(2) = 3
// getNextPrime(11) = 13
