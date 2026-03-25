package main;


public class D_list {
    Node head;
    Node tail;
    int size;
    
    public D_list() {
    	this.head = new Node(-1,' ');
    	this.tail = new Node(-1,' ');
    	 head.next = tail;
    	 tail.prev = head;
    	 size =0;
    }
   
    public void Addfirst(Node node) {
       node.next = head.next;
       head.next.prev = node;
       node.prev = head;
       head.next = node;
       size++;
    }
    
    public void remove(Node node) {
    	node.prev.next = node.next;
    	node.next.prev = node.prev;
    	size--;
    }
    
    public int removeLast() {
    	Node removed = tail.prev;
    	tail.prev.prev.next = tail;
    	tail.prev = tail.prev.prev;
    	size--;
    	return removed.Key;
    }
    
    public void move_to_First(Node node){
    	node.prev.next = node.next;
    	node.next.prev = node.prev;
    	
    	head.next.prev = node;
    	node.next = head.next;
    	head.next = node;
    	node.prev = head;
    }

	public int size() {
		return this.size;
	}
}
