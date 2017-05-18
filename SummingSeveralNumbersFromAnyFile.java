/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summingseveralnumbersfromanyfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kendrabooker
 */
public class SummingSeveralNumbersFromAnyFile {

   
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.print("Which file would you like to read numbers from: ");
        String input = keyboard.next();
        System.out.println("Reading numbers from " + input);
        
        Scanner file = new Scanner(new File(input));
        
        int sum = 0;
        while(file.hasNext()){
            
            int a = file.nextInt();
             
            System.out.println(a);
            sum = sum + a;
            
        }
        System.out.println("The total is "+ sum);
            
    }
 
    
}
    
    
    
    
    

