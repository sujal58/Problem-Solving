import java.util.*;

public class Result{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float positiveNum = 0, negNum = 0, zeroNum = 0;
        float rPos, rNeg, rZero;
        
        System.out.println("Enter a Size of Array:");
         int n = input.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter a numbers between -100 to 100:");
        for(int i = 0; i < n; i++){
             arr[i] = input.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                 negNum += 1;
            }else if(arr[i] > 0){
                positiveNum += 1;
            }else{
                zeroNum +=1;
            }
        }
        
        System.out.println("\n \n");
        for(int i = 0; i < n; i++){
             System.out.printf("%d\t",arr[i]);
        }
        
        rPos = positiveNum / n;
        rNeg = negNum / n;
        rZero = zeroNum / n;
        
        System.out.println(" \n");
        System.out.printf("Value of n: %d\n\n", n);
        System.out.printf("%f\n", rPos);
        System.out.printf("%f\n", rNeg);
        System.out.printf("%f\n", rZero);
           
    }
}
