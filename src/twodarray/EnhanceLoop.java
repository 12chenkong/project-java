/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twodarray;

import java.util.Scanner;

/**
 *
 * @author Sovan Computer
 */
public class EnhanceLoop {
    public static void main(String args[])
    {
        int arr[]=new int[10];
         int size;
         int i=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of array");
        size=scan.nextInt();
        while(size>10)
        {
            System.out.println("The maximum of arry is 10 but you enter "+size);
            size=scan.nextInt();
            i++;
           
        }
        System.out.println("you have attemped "+i);
        // input element to the array
        System.out.println("Please enter the elements to the array");
        for(int j=0;j<size;j++)
        {
            arr[i]=scan.nextInt();
        }
       // output the elements by using enhance loop inseat of tranditional loop 
       System.out.println("Here are the array elements:");
       for( int k=0;k<size;k++)
       {
          System.out.println(arr[k]);
       }
        
        
    }
}
