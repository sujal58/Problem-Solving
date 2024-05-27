public class primeNumber{
    public static void main(String[] args){
        int prime;
        for(int i = 2; i <= 100; i++) {
                prime = 1;
                for(int j = 2; j < i; j++){
                    if( i % j == 0){
                        prime = 0;
                        break;
                    }
                }
                if(prime == 1) System.out.println(i);
            }  
        }

    }