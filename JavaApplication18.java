/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;
import java.util.*;

/**
 *
 * @author surafel
 */
public class JavaApplication18 {

    static String AccessLevel(int [] userrights, int min_permission)
    {
        String x="";
        for(int i = 0;i < userrights.length;i++)
        {
            if( min_permission >userrights[i])
                x=x+"D";
            else
            {
                x=x+"A";
            }
        }
        return x;
    }
    
    public static void main(String[] args) {
        int[ ] f = {5,3,2,10,0};
        int j =20;
        
        int[ ] k = {0,1,2,3,4,5};
        int l =2;
        
        int[ ] c = {};
        int aa =20;
        
        int[ ] ff = {34,78,9,52,11,1};
        int jj =49;
        System.out.println(AccessLevel(f,j));
        System.out.println(AccessLevel(k,l));
        System.out.println(AccessLevel(c,aa));
        System.out.println(AccessLevel(ff,jj));
        // TODO code application logic here
    }
    
}
