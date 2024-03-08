/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectFile;

import java.util.Scanner;

public class Student {
    
    private String id;
    private String name;
    private int age;
    private int math;
    private int english;
    private int khmer;
    private int chemist;
    private int total;
    Scanner in=new Scanner(System.in);
    
     public int getTotal(){
        return total;
    }
    public String getId(){
        return id;
    }
    
    public void input(){
       
        System.out.println("Enter your id: ");
        id=in.nextLine();
         /*
        System.out.println("Enter your name: ");
        name=in.nextLine();
        System.out.println("enter your age: ");
        age=in.nextInt();
        System.out.println("enter your math score ");
        math=in.nextInt();
        System.out.println("enter your English socre ");
        english=in.nextInt();
        System.out.println("enter your Khmer socre: ");
        khmer=in.nextInt();
            */
        System.out.println("enter your Chemisty socre: ");
        chemist=in.nextInt();
        
        
    }
    
    public void show(){
        
        total=math+khmer+english+chemist;
        System.out.println(name+"\t"+id+"\t"+age+"\t"+math+"\t"+khmer+"\t"+english+"\t"+chemist+"\t\t"+total);
        
    }
    
    
    
        
       
   
    
    
}
