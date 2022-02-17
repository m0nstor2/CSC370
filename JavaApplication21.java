/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author suraf
 */
public class JavaApplication21 {
   
   
    
public String[] draw(int[] parents, String[] names) {
 int RT = rot(parents,names);
 String r = names[RT]; 
 HashMap<String, ArrayList<String>> y = new HashMap<String, ArrayList<String>>();
 y = mapdraw(r, parents, names, y);
 ArrayList<String> output = new ArrayList<String>();
         output = print("", r, 0, output, false, y);
         
         String[] result = output.toArray(new String[output.size()]);
         return result;
 
 }
 public ArrayList<String> print(String prefix, String r, int x ,ArrayList<String> l, boolean childrens, HashMap<String, ArrayList<String>> y)
 {
     String node = prefix + "+-" + r; 
    	  if(childrens = childrens)
          { 
              prefix = prefix + "| "; 
   
          }
    	  else
          {  
              prefix = prefix + "  "; 
          
          }
          l.add(node);
       
    	  if(y.containsKey(r)){
    		  ArrayList<String> outputtree = y.get(r);
    		  String lastChild = outputtree.get(outputtree.size()-1);
        	  if(!outputtree.isEmpty()){
        		  for(String child : outputtree){
        			  if(y.containsKey(child) & !child.equals(lastChild)){
        				  childrens = true; 
        			  }
        			  else{ childrens = false; } 
            		  l = print(prefix, child, x+1, l, childrens, y);
            	  }
        	  }
    	  }   
         return l;   
 }
 
 public HashMap<String, ArrayList<String>> mapdraw(String r, 
    		  int[] parents, String[] names, 
    		  HashMap<String, ArrayList<String>> y){
    	  
    	  ArrayList<String> children = new ArrayList<String>(); 
    	
    	  for(int i=0; i< names.length; i++)
          {
                     
    		  int parent = parents[i];
    		  if(parent!=-1){
    			  String par = names[parent];
        		  if(par.equals(r)){
        			
        			  children.add(names[i]);
        		  }
    		  }
    		  
    	  }
    	  if(children.isEmpty()){
    		  return y; 
    	  }
    	  else{
    		  y.put(r, children);
    		  for(String child : children){
    			  y = mapdraw(child, parents, names, y);
    		  }
    		  return y;
    	  }
    	  
      }
 
 
 
 
public int rot(int[] parents, String[] names)
{
    int RT =0;
    
    for(int i=0; i<names.length; i++)
    {
        
        int parent = parents[i];
        if(parent==-1)
        {
            RT=i;
        }
    }
    return RT;
}
     
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication21 res = new JavaApplication21();
     int[] parent1 ={-1,0,1,1,0,0,5,5};
     String[] name1 = {"Root","SubB","LEAF1","LEAF2","LEAF3","SubA","LEAF4","LEAF5"};
     String[] result1 = res.draw(parent1, name1);
    
      
             
    int[] parent2 = {6,2,3,4,5,6,-1};
     String[] name2 = {"A","B","C","D","E","F","G"};
     String[] result2 = res.draw(parent2, name2);
    
             
   int[] parent3 = {-1,0,1,1,2,2,3,3,0,8,8,9,9,10,10};
     String[] name3 = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"};
     String[] result3 = res.draw(parent3, name3);
  
     int[] parent4 = {1,2,3,4,6,6,-1};
     String[] name4 = {"A","B","C","D","E","F","G"};
     String[] result4 = res.draw(parent4,name4);
     
             
             
     
     
     
     
    for(int x=0; x<result4.length; x++){
 		  {
  			  
                          System.out.println(result4[x]);
  		  }
                  
    
}
    System.out.println("");
    
    for(int x=0; x<result3.length; x++){
 		  {
  			  
                          System.out.println(result3[x]);
  		  }
    
    
    }
    System.out.println(" ");
    for(int x=0; x<result2.length; x++){
 		  {
  			  
                          System.out.println(result2[x]);
  		  }
    
    
    }
    
    
    
    
    
    
    
    
}
}