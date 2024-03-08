/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassFile;

import java.util.Scanner;

/**
 *
 * @author Sovan Computer
 */
public class Demo {
   public static void main(String args[])
   {
      Scanner in=new Scanner(System.in);
      int num;
      System.out.println("enter n : ");
      num=in.nextInt();
      Rectangle[] obj=new Rectangle[num];
      for(int i=0;i<num;i++){
          System.out.println("NO:"+(i+1));
          obj[i]=new Rectangle();
          obj[i].input();
      }
      
      for(int i=0;i<num;i++){
          
          System.out.println("NO: "+(i+1));
          System.out.println(obj[i].area());
      }
      
        
   }
    
}
