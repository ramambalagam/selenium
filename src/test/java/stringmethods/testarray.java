package stringmethods;


import java.util.ArrayList;
import java.util.Iterator;

//arraylist in collections
//homo and heterogiun data allowed, means differnt typ of objects
//follows index concepts so order is preserved
//arrays list  size is dynamic
//duplicate eletmsn allowes
//multiple nulls

public class testarray {
	
	public static void main(String[]args)
	{
		
		//declaration
		//ArrayList mylist = new ArrayList();//hetrogenium
		//List mylist1 = new ArrayList();   //child class (arraylist) object can hold in the parent calss(List) object
		//ArrayList<Integer> mylist = new ArrayList<Integer>();  //then only homogenium inter values cane be hold
		//ArrayList<Employee> mylist1 = new ArrayList<Employee>();  //Empleye is an object so hetrogenium 
		
		ArrayList<Comparable> mylist = new ArrayList<Comparable>(); //declartion
		mylist.add(100);  //hetro
		mylist.add(100.5);
		mylist.add(20);
		mylist.add("name");
		mylist.add(100);
		mylist.add(true);
		mylist.add(null);
		mylist.add(null);
		
		//size of array list
		//mylist.size();
		System.out.println("size of an array list              " +mylist.size() );
		
		//printin array list
		System.out.println("data from array list               " +mylist);
		
		//remove elelent
		
		mylist.remove(5);
		System.out.println("after data removal from array list " +mylist);
		
		//insert element in the existing list
		mylist.add(5,true);
		System.out.println("after new data addition            " +mylist);
		
		//replace or modif
		mylist.set(5, false);
		
		System.out.println("replaced data                      " +mylist);
		
		//access specific element
		
		
		System.out.println("get      data                      " +mylist.get(5));
		
		//reading all the elemetn from array list
		
		//first approach normal for loop

		/*for( int i=0;i<mylist.size();i++)
		{
			mylist.get(i);
			System.out.println(	mylist.get(i));

		}*/
		
		/*for (Object x:mylist)x
		{
			System.out.println(x);
		}*/
		
		Iterator it=mylist.iterator(); //Iterator<String> it=mylist.iterator(); if only stirng data in mylist etc
		while(it.hasNext()){
		System.out.println(it.next());
	
		}
		
		
		//cehck if arry is empy or not
		
		System.out.println(mylist.isEmpty());
		
		//remov multiple  elements in list
		ArrayList mylist2 = new ArrayList();
		mylist2.add("name");
		mylist2.add(100);
		mylist2.add(false);
		mylist.removeAll(mylist2);
		
		
		System.out.println("removed the elements ");
		Iterator it2=mylist.iterator(); //Iterator<String> it=mylist.iterator(); if only stirng data in mylist etc
		while(it2.hasNext()){
		System.out.println(it2.next());
	
		}
		
		
		
	}

}
