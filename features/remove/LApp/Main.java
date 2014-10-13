package LApp;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import FList.*;
import LApp.Entity;

public class Main {

    static MyList<Entity> mylist;

    public static void main(String[] args) {
        original(args);
        
        //Step 5: remove added nodes
        Entity[] ent = Entity.entArray2;
        for (Iterator i = mylist.iterator(); i.hasNext();) {
        	Entity x = (Entity) i.next();
        	for (int j = 0; j < ent.length; j++) {
        		if (ent[j] == x) {
        			i.remove();
        			break;
        		}
        	}
        }
        
        //Step 6: print remaining nodes
        System.out.println("revised list");
        mylist.print(System.out);
        
        
        for(Iterator i = test.iterator(); i.hasNext();){
			ArrayList<Integer> obj = (ArrayList) i.next();
			if(obj.get(0).intValue() % 2 == 0)
				i.remove();
		}
		System.out.println("removed starting with even nums");
        test.print(System.out);
        
    }

    public static void addArray(MyList l, Entity[] arr) {
        for (int j = 0; j < arr.length; j++) {
            l.insert(arr[j]);
        }
    }
}