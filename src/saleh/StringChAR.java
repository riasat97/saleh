package saleh;
import java.util.*;
public class StringChAR {

    public static void main(String[] args) {
        System.out.println("Enter something:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
      //  String str=new String("Magnificient");
        System.out.println(str.length());
       // System.out.println(str.charAt(0));
       // System.out.println(str.charAt(str.length()-1));
        
        char[] ch=str.toCharArray();
        System.out.println(ch[0]);
        System.out.println(ch[str.length()-1]);
        
        int low=0,high=str.length()-1;
        int middle=low+(high-low)/2;
        System.out.println(ch[middle]);
    }
    
}
