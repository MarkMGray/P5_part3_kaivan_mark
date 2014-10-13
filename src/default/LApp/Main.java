package LApp; 

import java.util.Iterator; 
import FList.*; 

import java.util.*; 
public  class  Main {
	

    static MyList mylist;

	

    public static void main(String[] args) {
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
        
        MyList<List<Integer> > test = new MyList<List<Integer> >();
       
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

	

    public static void addArray(MyList l, Entity[] arr) {
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
