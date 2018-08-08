package saleh;
import java.util.*;
class Pet {
    
        public String name;
        public char type;
        public Pet(String name,char type){
           this.name=name;
           this.type=type;
       }
}
 public class Saleh {
    
   public static void main(String[] args) {
       String name,terminate="stop"; 
       char type;
       Scanner input = new Scanner(System.in);
       ArrayList<Pet> list=new ArrayList<Pet>();
       while(true){
           
           System.out.println("Pet name:");
           name=input.next();
           if(terminate.equalsIgnoreCase(name))break;
           System.out.println("Enter d for dog or c for cat");
           type = input.next(".").charAt(0);
           Pet p=new Pet(name,type);
           list.add(p);
       }
       
        for(Pet p : list){
           System.out.println("Name:"+p.name); 
           System.out.println("Type:"+p.type); 

        }
            
    }
}

