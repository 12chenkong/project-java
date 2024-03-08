/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectFile;

import java.util.Scanner;

/**
 *
 * @author Sovan Computer
 */
public class Main {
    public static void main(String args[]){
         Scanner in=new Scanner(System.in);
         int num=0;
         int i;
         int option;
        
         do{
               System.out.println("1.Input student info: ");
               System.out.println("2.Search for specific student's info");
               System.out.println("3.Exit the program");
               System.out.println("Choose of them below: ");
               option=in.nextInt();
             switch(option){
                 
                 case 1:
                        System.out.println("Enter the number of student you have:");
                        num=in.nextInt();
                        Student[] student=new Student[num];
                        for(i=0;i<num;i++){
                        student[i]=new Student();
                        student[i].input();
                       }
                       System.out.println("\n");
                       System.out.println("\n");
                       System.out.println("\n");
                       System.out.println("\n");
                       System.out.println("\n");
                       System.out.println("\n");
                       System.out.println("Name\tid\tage\tMath\tKhmer\tEnglish\tChemistry\tscore");
                       // sorted array element
                      
                       for(i=0;i<student.length;i++){
                           for(int j=i+1;j<student.length;j++){
                               if(student[i].getTotal()<student[j].getTotal()){
                                    Student temp=student[i];
                                    student[i]=student[j];
                                    student[j]=temp;
                               }
                              
                           }
                       }
                     
                        // print out list of student 
                       for(i=0;i<student.length;i++){
                         student[i].show();
                       }
                      
                       System.out.println("\n");
                       System.out.println("\n");
                       
                      
                         break;
                 case 2:
                     /*
                     String searchId;
                     boolean is_true=false;
                     System.out.print("\nPLease enter studnet's id: ");
                     searchId=in.nextLine();
                     for(i=0;i<num;i++){
                         if(searchId==student[i].getId()){
                             is_true=true;
                             break;
                         }
                     }
                     if(is_true!=false){
                         System.out.println("Student found!!!1");
                     }
                     else 
                         System.out.println("Student not found ");
*/
                     break;
                     
             }
             
         }while(option!=3);
         
         
         
         
        
        
         
    }
}

    
    

