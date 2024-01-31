public class ConditionalStatment{
    public static void main(String... arg){

       int a = 10, b = 18, c = 21, d = 30;

       if (a >= 10){

        System.out.println("Example number 1:- Subject  is not a teen or adult");
        }

        if (b >= 12 || b <= 18){
            System.out.println("Example number 2:- The subject is an teen ager");
        }
        else{
            System.out.println("Example number 2:- The subject is eather child or adult");
        }

        int num = 10;

        if(num%2 == 0){

            System.out.println("Example number 3:- The number is an even number");
        }
        else{
         System.out.println("Example number 3:- The number is an odd number");
        }

        if(true){
            System.out.println("This is an example of only true value" + (1));
        }
        else{
            System.out.println("This is an example of only true value" + (2));
        }

    
    
    }
}