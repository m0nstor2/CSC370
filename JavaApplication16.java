/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;
import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author suraf
 */
public class JavaApplication16 {
class comparator implements Comparator<String> {

      public int compare(String one, String two) {
          String[] first = one.split("/");
          String[] second = two.split("/");
          int difference = first.length - second.length;

         while (difference != 0) {
            return difference;
          } 

          return one.compareTo(two);
        }
  }


      public String[] sort(String[] dirs) {
        Arrays.sort(dirs, new comparator());
        return dirs;
      }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         JavaApplication16 main = new JavaApplication16();
 String[] string1 =  {"/","/a/","/b/","/c/","/d/","/e/","/f/","/g/","/a/a/","/b/g/c/","/g/f/"};
     main.sort(string1);     
 for(int i=0; i<string1.length; i++) {
            System.out.println(string1[i]);
          }
// TODO code application logic here
    }
    
}

