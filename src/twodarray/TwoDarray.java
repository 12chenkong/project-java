/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twodarray;

import java.util.Scanner;

/**
 *
 * @author Sovan Computer
 */
public class TwoDarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row,column;
        System.out.println("Enter the number of rows:");
        row=scan.nextInt();
        System.out.println("Enter the the number of columns");
        column=scan.nextInt();
        System.out.println("Enter the number of array: ");
        int arr[][]=new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("Here is the output the elements");
        System.out.println(" matrix "+row+" x "+column);
        System.out.println("There are "+(row*column)+" elemetns in the matrix");
       
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
