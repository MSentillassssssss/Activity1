
package com.mycompany.act1;

import java.util.Scanner;

public class Act1 {

    public static void main(String[] args) {
         Scanner scn = new Scanner (System.in);
        
            System.out.println("HELLOOOO");
            System.out.println("Enter Your Full Name");
            
            System.out.println("First Name:" );
            String fName = scn.nextLine();
            
            System.out.println("Middle Name:" );
            String mName = scn.nextLine();
            
            System.out.println("Last Name:" );
            String lName = scn.nextLine();
            
            System.out.println("Enter Your Gender:" );
            String Gender = scn.nextLine();
            
            System.out.println("Enter Your Birth Day:" );
            String bDay = scn.nextLine();
            
            System.out.println("Enter Your Age:");
            String age = scn.nextLine();
            
            System.out.println("Click 'Enter' to See Data");
            String sData = scn.nextLine();
            
            System.out.println("YOUR DATA ");
            
            System.out.println("Name: " + fName +  " " + mName + " " + lName);
            System.out.println("Age: " + age);
            System.out.println("Birth Date: " + bDay);
            System.out.println("Gender: " + Gender);
                    
            scn.close();
    }
}



    
