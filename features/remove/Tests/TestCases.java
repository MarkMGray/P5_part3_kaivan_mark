package Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

import FList.MyList;
import LApp.Entity;
import LApp.Main;
public class TestCases {
	@Test
	public void removeNodesTest() {
		MyList<Entity> myList = new MyList<Entity>();
		Main.addArray(myList, Entity.entArray1);
		Main.addArray(myList, Entity.entArray2);
		Entity[] ent2 = Entity.entArray2;
		for (Iterator<Entity> i = myList.iterator(); i.hasNext();) {
			Entity x = (Entity) i.next();
			for (int j = 0; j < ent2.length; j++) {
				if (ent2[j] == x) {
					i.remove();
					break;
				}
			}
		}
		boolean pass = true;
		boolean entityPresent;
		Entity[] ent = Entity.entArray1;
		for (int j=0; j<ent.length; j++) {
			entityPresent = false;
			for (Iterator<Entity> i = myList.iterator(); i.hasNext();) {
				Entity x = (Entity) i.next();
				if (ent[j] == x) {
					entityPresent = true;
					break;
				}
			}
			if (!entityPresent) {
				pass = false;
			}
		}
		for (int j=0; j<ent2.length; j++) {
			entityPresent = false;
			for (Iterator<Entity> i = myList.iterator(); i.hasNext();) {
				Entity x = (Entity) i.next();
				if (ent2[j] == x) {
					entityPresent = true;
					break;
				}
			}
			if (entityPresent) {
				pass = false;
			}
		}
		if (pass) {
			System.out.println("Test: Remove nodes from List - Passed");
		} else {
			fail("Test: Remove nodes from List - Failed");
		}
	}
	
	@Test
	public void removeGenericNodeTest(){
		MyList<ArrayList<Integer> > myList = new MyList<ArrayList<Integer> >();
		
		ArrayList[] test1 = {
	        	new ArrayList<Integer>(new ArrayList<Integer>(Arrays.asList(1,2,3,4))),
	        	new ArrayList<Integer>(new ArrayList<Integer>(Arrays.asList(90, 80, 70, 60))), 
	        	new ArrayList<Integer>(new ArrayList<Integer>(Arrays.asList(3, 4, 5, 5))),
	            new ArrayList<Integer>(new ArrayList<Integer>(Arrays.asList(7))), 
	            new ArrayList<Integer>(new ArrayList<Integer>(Arrays.asList(22, 23))), 
	            new ArrayList<Integer>(new ArrayList<Integer>(Arrays.asList(20,30,40,50,60,70,80) ))};
	        
		for(int j = 0; j < test1.length; j++) {
    		myList.insert(test1[j]);
    	}
		
		for(Iterator<ArrayList<Integer> > i = myList.iterator(); i.hasNext();){
			ArrayList<Integer> obj = (ArrayList) i.next();
			if(obj.get(0).intValue() % 2 == 0)
				i.remove();
		}
		
		boolean pass = true;
		for(Iterator<ArrayList<Integer> > i = myList.iterator(); i.hasNext();){
			ArrayList<Integer> obj = (ArrayList) i.next();
			if(obj.get(0).intValue() % 2 == 0)
				pass = false;
		}
		
		if(pass){
			System.out.println("Test: Remove even leading list items - Passed");
		} else {
			fail("Test: Remove even leading list items - Failed");
		}
		
	}
	
	@Test
	public void removeAllNodesTest() {
		MyList<Entity> myList = new MyList<Entity>();
		Main.addArray(myList, Entity.entArray1);
		Main.addArray(myList, Entity.entArray2);
		Entity[] ent2 = Entity.entArray2;
		Entity[] ent1 = Entity.entArray1;
		for (Iterator<Entity> i = myList.iterator(); i.hasNext();) {
			Entity x = (Entity) i.next();
			for (int j = 0; j < ent2.length; j++) {
				if (ent2[j] == x) {
					i.remove();
					break;
				}
			}
			for (int j = 0; j < ent1.length; j++) {
				if (ent1[j] == x) {
					i.remove();
					break;
				}
			}
		}
		boolean pass = true;
		boolean entityPresent;
		for (int j=0; j<ent2.length; j++) {
			entityPresent = false;
			for (Iterator<Entity> i = myList.iterator(); i.hasNext();) {
				Entity x = (Entity) i.next();
				if (ent2[j] == x) {
					entityPresent = true;
					break;
				}
			}
			if (entityPresent) {
				pass = false;
			}
		}
		for (int j=0; j<ent1.length; j++) {
			entityPresent = false;
			for (Iterator<Entity> i = myList.iterator(); i.hasNext();) {
				Entity x = (Entity) i.next();
				if (ent1[j] == x) {
					entityPresent = true;
					break;
				}
			}
			if (entityPresent) {
				pass = false;
			}
		}
		if (pass) {
			System.out.println("Test: Remove all nodes from List - Passed");
		} else {
			fail("Test: Remove all nodes from List - Failed");
		}
	}
}