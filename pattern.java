public class pattern{
    public static void main(String[] args){
        System.out.println("Star pattern");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j<= i; j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

        nepathyaPattern();
    }

    static void nepathyaPattern(){
        String str = "NEPATHYA";

        for(int i = 0; i< str.length(); i++){
            for(int j = 0; j < str.length(); j++){
                if( j<= i){
                    System.out.print(str.charAt(j));
                }else System.out.print('-');

            }
            System.out.printf("\n");
        }
    }

}