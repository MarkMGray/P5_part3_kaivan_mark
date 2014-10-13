package FList; 

import java.util.Iterator; 

public  class  MyIterator <T>  implements Iterator {
	

    MyNode<T> current;

	
    MyList list;

	
    boolean alreadyAdvanced;

	

    MyIterator(MyList list) {
        current = list.head;
        this.list = list;
        alreadyAdvanced = true;
    }

	

    public boolean hasNext() {
        if (alreadyAdvanced) {
            return current != null;
        } else {
            return current.right != null;
        }
    }

	

    public T next() {
        if (alreadyAdvanced) {
            alreadyAdvanced = false;
        } else {
            current = current.right;
        }
        return current.elem;
    }

	

    public void remove() {
    	// Not implemented for Base Class
    }


}
