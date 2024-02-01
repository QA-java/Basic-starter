

public class WeekExampleConditional {

    public static void main(String... arg){

       int dayOfWeek = 0;

        if (dayOfWeek == 01){
            System.out.println("This is Sunday");
        } 
        else if (dayOfWeek == 02){
            System.out.println("This is Monday");
        }
        if (dayOfWeek == 03){
            System.out.println("This is Tuesday");
        } 
        else if (dayOfWeek == 04){
            System.out.println("This is Wednesday");
        }
        if (dayOfWeek == 05){
            System.out.println("This is Thirsday");
        } 
        else if (dayOfWeek == 06){
            System.out.println("This is Friday");
        }
        else if(dayOfWeek == 07){
            System.out.println("This is Saturday");
        }
        else if(dayOfWeek == 10){
            System.out.println("Value is invalid");
        }

        switch (dayOfWeek){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("wednesday"); break;
            case 5: System.out.println("Thirsday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default : System.out.println("Invalid"); break;
            
        
        }

    }
    
}
