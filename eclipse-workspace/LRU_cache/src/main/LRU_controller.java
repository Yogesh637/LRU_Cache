package main;
import java.util.*;
public class LRU_controller{
	LRU_controller(){}
	   public void start() {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Node> hm = new HashMap<>();
		 System.out.println("Enter capacity of lru cache:");
    	 int cap = sc.nextInt();
		LRU_Cache lru = new LRU_Cache(cap,new D_list(),hm);
     while(true) {
    	
    	 System.out.println("Enter 1 to start 2 to Exit");
    	 int n = sc.nextInt();
    	 if(n==2) {System.out.println("Thank You :) ");  sc.close();return;}
    	 System.out.println("Enter Your choice \n  1.put \n  2.get \n  3.remove \n  4.Display values in LRU_Cache");
         int opt = sc.nextInt();
         switch(opt) {
           case 2:{
        	 System.out.println("Enter Key:");
        	 int key = sc.nextInt();
        	 char c =lru.get(key);
        	 if(c=='.') {
        		 System.out.println("Key Not Found!!");
        	 }else {
        		 System.out.println("Key Found,Value is "+c);
        	 } break;      	 
          }
          case 1:{
        	 System.out.println("Enter Key: ");
        	 int key = sc.nextInt();
        	 System.out.println("Enter Value: ");
        	 char val = sc.next().charAt(0);
        	 
        	 lru.put(key, val);
        	 System.out.println("Key added successfully");
        	 break;
          }
          case 3:{
        	  System.out.println("Enter key to be removed:");
        	  int rem = sc.nextInt();
        	  char v = lru.remove(rem);
        	  System.out.println("Key Removed Successfully with value  " + v);
        	  break;
          }
          case 4:{
        	  System.out.println("Values in Cache are:");       	  
        	  for(Map.Entry<Integer, Node> entry : hm.entrySet()) {
      			System.out.println("  Key : " + entry.getKey() + "  Value : " + entry.getValue().Value);
      		}
          }
         }
      }
     
	}
}
