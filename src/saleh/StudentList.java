/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saleh;

import java.util.Scanner;

/**
 *
 * @author Envy
 */
class Student{
    String name,id,gender;
    public void input(String name,String id,String gender){
        this.name=name;
        this.id=id;
        this.gender=gender;
    }
    public void display(){
        System.out.println("Name :"+this.name+" ID:"+this.id+" Gender:"+this.gender);
    }
}
public class StudentList {
    
   
   public static void main(String[] args)
      {
          String name,id,gender;
          int n,i;
          Scanner input=new Scanner(System.in);         
          System.out.print("Enter number of student :");
          n=input.nextInt();
          Student arr[]=new Student[n];
          for(i=0;i<arr.length;i++){
              System.out.print("Enter Student "+(i+1)+" Name:");
              name=input.next();
              System.out.print("Enter Student "+(i+1)+" ID:");
              id=input.next();
              System.out.print("Enter Student "+(i+1)+" Gender:");
              gender=input.next();
              Student stu=new Student();
              stu.input(name, id, gender);
              arr[i]=stu;
          }
          for(i=0;i<arr.length;i++)
              arr[i].display();
      }
}
