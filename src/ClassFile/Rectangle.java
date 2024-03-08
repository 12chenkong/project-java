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
public class Rectangle {
    private float width;
    protected float length;
    Scanner scan=new Scanner (System.in);
    // Defautl Constrcutor 
    Rectangle(){
        width=0.0f;
        length=0.0f;
    }
    //Parameterized constructor 
    Rectangle(float a,float b){
        width=a;
        length=b;
    }
   // Using getter and setter
    void setwidth(float a){
        width=a;
    }
    void setLength(float b){
        length=b;
    }
    float getWidth()
    {
        return width;
    }
    float getLength(){
        return length;
    }
    
    // Using method to assign value to attribute
    public void input()
    {
        System.out.println("Enter the width :");
        width=scan.nextFloat();
        System.out.println("Enter the length :");
        length=scan.nextFloat();
        
    }
    public float area()
    {
      return  (length*width);
    }
    
    
}
