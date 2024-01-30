public class ConditionalStatment{
    public static void main(String... arg){

       int a = 10, b = 18, c = 21, d = 30;

       if (a >= 10){

        System.out.println("Subject  is not a teen or adult");
        }

        if (b >= 12 || b <= 18){
            System.out.println("The subject is an teen ager");
        }
        else{
            System.out.println("The subject is eather child or adult");
        }

    }
}