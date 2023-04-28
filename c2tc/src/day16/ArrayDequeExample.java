package day16;

import java.util.*;  
public class ArrayDequeExample {  
   public static void main(String[] args) {  
   //Creating Deque and adding elements  
   Deque<String> deque = new ArrayDeque<String>();  
   deque.add("hi");    
   deque.add("dude");     
   deque.add("whatsapp");    
   //Traversing elements  
   for (String str : deque) {  
   System.out.println(str);  
   }  
   }  
}  
