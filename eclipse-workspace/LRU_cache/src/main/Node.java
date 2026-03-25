package main;

public class Node {
     int Key;
     char Value;
     Node prev;
     Node next;
    
     Node(int k,char v){
    	 this.Key = k;
    	 this.Value = v;
    	 this.prev = null;
    	 this.next = null;
     }
}
