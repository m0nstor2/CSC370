/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;
import java.util.HashMap;
import java.util.Random;
/**
 *
 * @author suraf
 */
public class JavaApplication24 {
public static String rand_generator(int numx) {
    Random randomnum = new Random();
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk";
   StringBuilder sb = new StringBuilder(numx); 
    int x =0;
    while(x<numx)
    {
         sb.append(chars.charAt(randomnum.nextInt(chars.length())));
            x++;
    }
    return sb.toString();
}
    

public static int random_genrator(){
            int min = 1, max=100;  
        int randonum = (int)Math.floor(Math.random()*(max-min+1)+min);
        return randonum;
    }



    public static void main(String[] args) 
    {
        HashMap<String,Integer> names_ages = new HashMap<>();
        for(int i=0;i<50000;i++){
            names_ages.put(rand_generator(3),random_genrator());
        }
        
        System.out.println(names_ages);
        // TODO code application logic here
    }
    
}
