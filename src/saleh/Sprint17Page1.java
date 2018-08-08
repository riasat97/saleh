/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saleh;

/**
 *
 * @author Envy
 */
public class Sprint17Page1 {
    public static void main(String[] args)throws Exception{
       //ans to ques-1
//       a)i;
//       b)System.out.print("Augustus".length());//8
//       c)byte short int long float double
//               
//       e)   int a,b,x,y,z;
//           if(a>=b)x=y;
//           else x=z;
//       f)true
         int x=1,y=1,z=3;
         System.out.print(x<=y&&!(z!=z)||x>y);
//       g)
//          it will not compile, but it could be fixed by adding a try/catch block
//          it will not compile, but it could be fixed by adding a throws clause to the method header
         //check(-1);
         //check(-1);
         
         //h)
         for(int count=1,sum=0;count<=30;count+=3)
         sum+=count;
         
         //2/b)
         //https://dzone.com/articles/random-number-generation-in-java
         System.out.println("Double between 0.5 and 2.5: RandomDoubleNumber = "+getRandomDoubleBetweenRange(0.5, 2.5));
         System.out.println("Integer between 100 and 999: RandomIntegerNumber = "+getRandomIntegerBetweenRange(100,999));
         
            
}
    public static double getRandomDoubleBetweenRange(double min, double max){
    double x = (Math.random()*((max-min)+1))+min;
    return x;
    }
    public static double getRandomIntegerBetweenRange(double min, double max){
    double x = (int)(Math.random()*((max-min)+1))+min;
    return x;
    }
     private static void check(final int number) throws Exception {
    if (number < 0) {
        throw new Exception("No negative number please!");
    }
    }
      private static void check2(final int number) throws Exception {
        int a;
        try {
            a=number/0;
        }
        catch (Exception e){
            if (number < 0) {
        throw new Exception("No negative number please!");
    }
        }
        

    }

}
