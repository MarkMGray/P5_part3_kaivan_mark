package LApp; 

import FList.*; 

import java.util.*; 
import java.util.List; 


import java.util.ArrayList; 
import java.util.Iterator; 
import LApp.Entity; 

public   class  Main {
	

    static MyList<Entity> mylist  ;

	
    static MyList<List<Integer> > test;

	

     private static void  main__wrappee__Base  (String[] args) {
        // Step 1: initialize list
        mylist = new MyList<Entity>();

        addArray(mylist, Entity.entArray1);

        // Step 2: print list out
        System.out.println("original list");
        mylist.print(System.out);

        // Step 3: add more entities
        addArray(mylist, Entity.entArray2);

        // Step 4: print list out
        System.out.println("augmented list");
        mylist.print(System.out);
        
        test = new MyList<List<Integer> >();
       
        ArrayList[] test1 = {
        	new ArrayList<Integer>(new ArrayList<Integer>(Arrays.asList(1,2,3,4))),
        	new ArrayList<Integer>(new ArrayList<Integer>(Arrays.asList(90, 80, 70, 60))), 
        	new ArrayList<Integer>(new ArrayList<Integer>(Arrays.asList(3, 4, 5, 5))),
            new ArrayList<Integer>(new ArrayList<Integer>(Arrays.asList(7))), 
            new ArrayList<Integer>(new ArrayList<Integer>(Arrays.asList(22, 23))), 
            new ArrayList<Integer>(new ArrayList<Integer>(Arrays.asList(20,30,40,50,60,70,80) ))};
        
        addArray(test, test1);
        System.out.println("List with generic type");
        test.print(System.out);

    }

	

     private static void  main__wrappee__dbl  (String[] args) {
        main__wrappee__Base(args);
    }

	

    public static void main(String[] args) {
        main__wrappee__dbl(args);
        
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

	

    public static void addArray  (MyList l, Entity[] arr) {
        for (int j = 0; j < arr.length; j++) {
            l.insert(arr[j]);
        }
    }

	
    
    public static void addArray(MyList l, ArrayList[] arr){
    	for(int j = 0; j < arr.length; j++) {
    		l.insert(arr[j]);
    	}
    }


}
