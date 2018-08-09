package saleh;

public class Fall16 {
public int adjust(double amount){ return (int)amount;}
public void adjust(double amount,double charge){}

    public static void main(String[] args)
      {
          Fall16 s=new Fall16();
          //g)
          int sum=0;
          int i,j,k=2;
          for(i=0;i<=10;i++){
              for(j=0;j<=10;j++)
                sum+=i;
          }
          System.out.println(sum);//605
         // i)'a'=char and "a" = String
          //j)
          i=1;sum=0;
          do{
              sum+=i;
              i+=k++;
          }while(i<=99);
          System.out.println(sum);
          //h)valid
          s.adjust(10.0);
          s.adjust(10.9,11.3);
         // e)false
          //f)
          int x,y=0,a,b=0;
          for(double l=1.0;l<=2.0;l+=0.1){
              x=y;
              a=b;
          }
          //d)3.0 || data type missing befor w.. assign double before w
          i=1;j=3;
          double w=Math.pow(3, Math.pow(i, j));
          System.out.println(w);
          //c)the output is 12
          x=1;y=2;
          System.out.println("output "+x+y);
          //a)both invalid || only underscore,digit,upper or lower alphabets are allowed.. must start with letter or underscore
          //b)
          x=8;y=1;
          System.out.println("cube root "+Math.cbrt(x*y));
      }    
}
