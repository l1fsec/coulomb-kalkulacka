/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coulombkalkulačka;

import java.util.Scanner;

/**
 *
 * @author janpl
 */
public class CoulombKalkulačka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner novObj = new Scanner(System.in);
        System.out.println("Zadej co chces pocitat?");
        System.out.println("1 = Q1");
        System.out.println("2 = Q2");
        System.out.println("3 = r");
        System.out.println("4 = F");
        
         int vyber = novObj.nextInt();  // Read user input
switch (vyber) {
  case 1:
      System.out.println("===============");
    System.out.println("Q1");
    
    break;
  case 2:
    System.out.println("==============");
    Scanner zadani1 = new Scanner(System.in);
      System.out.println("Zadej ");
    break;
  case 3:
            System.out.println("==============");
      System.out.println("F");
      Scanner zadejq1 = new Scanner(System.in);
      System.out.println("Zadej hodnotu Q1");
      int q1 = zadejq1.nextInt();
      Scanner zadejq2 = new Scanner(System.in);
       System.out.println("Zadej hodnotu Q2");
      int q2 = zadejq2.nextInt();
      Scanner zadejR = new Scanner(System.in);
       System.out.println("Zadej hodnotu r");
      int R = zadejR.nextInt();
      
   break;
  case 4:
      System.out.println("==============");
      System.out.println("F");
      Scanner zadejQ1 = new Scanner(System.in);
      System.out.println("Zadej hodnotu Q1");
      int Q1 = zadejQ1.nextInt();
      Scanner zadejQ2 = new Scanner(System.in);
       System.out.println("Zadej hodnotu Q2");
      int Q2 = zadejQ2.nextInt();
      Scanner zadejr = new Scanner(System.in);
       System.out.println("Zadej hodnotu r");
      int r = zadejr.nextInt();
      
    break;
}
    }
    
}
