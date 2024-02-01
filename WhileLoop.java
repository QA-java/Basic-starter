public class WhileLoop {

    public static void main(String... arg){

        /*int i = 1;

        while (i <= 10){

            System.out.println(i);
            i++;
        }

        int i = 1;

        while (i <= 10) {

            System.out.println("Hi");
            i++;

            
        }

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i+=2;  
            
        }*/

        int i = 1;
        while (i <=10){
            if(i%2==0){
                System.out.println(i + " Even number");
            }
            else{
                System.out.println(i + " Odd Number");
            }
            i++;
        }
    }
    
}
