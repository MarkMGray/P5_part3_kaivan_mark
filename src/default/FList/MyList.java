package FList; 
import java.io.PrintStream; 

import java.util.Iterator; 

public  class  MyList <T>  implements Iterable {
	

    MyNode head;

	

    public MyList() {
        head = null;
    }

	

    public void insert(T elem) {
        insert(new MyNode(elem));
    }

	

    void insert(MyNode n) {
        n.right = head;
        head = n;
    }

	

    public Iterator iterator() {
        return new MyIterator(this);
    }

	

    public void print(PrintStream out) {
        for (Iterator eIterator = iterator(); 
		eIterator.hasNext();) {
            T e = (T) eIterator.next();
            out.println(e);
        }
    }


}
