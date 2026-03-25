package main;

import java.util.Map;

public class LRU_Cache {
    int capacity;
    Map<Integer,Node> map;
    D_list list;
    
    LRU_Cache(int x,D_list l,Map<Integer,Node> hm){
    	this.capacity = x;
    	this.list = l;
    	this.map = hm;
    }
    public  synchronized char get(int Key) {
    	if(!map.containsKey(Key)) return '.';
    	list.move_to_First(map.get(Key));
    	return map.get(Key).Value;
    	}
    public synchronized char remove(int Key) {
    	char v = map.get(Key).Value;
    	list.remove(map.get(Key));
    	map.remove(Key);
    	return v;
    }
    public synchronized void put(int Key,char val) {
    	
    	if(map.containsKey(Key)) {
    		map.get(Key).Value = val;
    	}
    	Node node = new Node(Key,val);
    	if(list.size() >= capacity) {
    		int x =list.removeLast();
    		map.remove(x);
    	}
    	list.Addfirst(node);
    	map.put(Key, node);
    }
    
}
