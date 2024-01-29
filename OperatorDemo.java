import javax.security.auth.x500.X500Principal;

public class OperatorDemo {

    public static void main(String... arg) {
        int a = 100, b = 2, sum = a + b, sub = a - b, multi = a * b, devide = a / b, remainder = a % b;
        System.out.println("Value of a =" + (a));
        System.out.println("Value of b =" + (b));
        System.out.println("sum of a+b =" + (sum));
        System.out.println("Value of a-b =" + (sub));
        System.out.println("Value of a*b =" + (multi));
        System.out.println("Value of a/b =" + (devide));
        System.out.println("remainder of a/b =" + (remainder));

        System.out.println(a > b);
        System.out.println(a + b < a / b);
        System.out.println(a != b);
        System.out.println(a == b);

        System.out.println(multi + sum);
        System.out.println((a * b) + (a + b));

        boolean bu = multi + sum != (a * b) + (a + b);

        System.out.println(bu);

        System.out.println(" ****************Case2***************");

        boolean x = true;
        boolean y = false;

        System.out.println(x); //ture
        System.out.println(y); //false
        System.out.println(x && y); //false
        System.out.println(x || y); //true
        System.out.println(!x); // false
        System.out.println(!y); //true

        System.out.println(" ****************Case3***************");

        int s = 10;
         s = s++; //a+1 = a++

        System.out.println(s);

        System.out.println(" ****************Case4***************");

    }

}
