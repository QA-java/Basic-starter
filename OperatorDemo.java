// Source code is decompiled from a .class file using FernFlower decompiler.
public class OperatorDemo {
    public OperatorDemo() {
    }
 
    public static void main(String... var0) {
       byte var1 = 100;
       byte var2 = 2;
       int var3 = var1 + var2;
       int var4 = var1 - var2;
       int var5 = var1 * var2;
       int var6 = var1 / var2;
       int var7 = var1 % var2;
       System.out.println("Value of a =" + var1);
       System.out.println("Value of b =" + var2);
       System.out.println("sum of a+b =" + var3);
       System.out.println("Value of a-b =" + var4);
       System.out.println("Value of a*b =" + var5);
       System.out.println("Value of a/b =" + var6);
       System.out.println("remainder of a/b =" + var7);
       System.out.println(var1 > var2);
       System.out.println(var1 + var2 < var1 / var2);
       System.out.println(var1 != var2);
       System.out.println(var1 == var2);
       System.out.println(var5 + var3);
       System.out.println(var1 * var2 + var1 + var2);
       boolean var8 = var5 + var3 != var1 * var2 + var1 + var2;
       System.out.println(var8);
       System.out.println(" ****************Case2***************");
       boolean var9 = true;
       boolean var10 = false;
       System.out.println(var9);
       System.out.println(var10);
       System.out.println(var9 && var10);
       System.out.println(var9 || var10);
       System.out.println(!var9);
       System.out.println(!var10);
       System.out.println(" ****************Case3***************");
       int var11 = 10;
       int var12 = var11++;
       System.out.println(var12);
       System.out.println(" ****************Case4***************");
    }
 }
 