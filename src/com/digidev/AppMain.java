package com.digidev;

import com.digidev.beans.MySimpleClass;

public class AppMain {
	public static void main(String[] args) {

		/*
		 * So let's talk through this example.
		 * 
		 * First of all we have a line that creates the new mySimpleClassObject object
		 * the constructor of the mySimpleClassObject takes a string.
		 * 
		 */
		MySimpleClass mySimpleClassObject = new MySimpleClass("name");
		/*
		 * So the first thing that will happen is a string will be created on the heap.
		 * ----->new String("name");
		 * 
		 * 
		 */
		/*
		 * Then the MySimpleClass will be created with a property that references the
		 * string object and a variable(i.e. mySimpleClassObject) will create it on the
		 * stack pointing to this MySimpleClass object.
		 * 
		 * Now if we call rename() because we pass the value of the mySimpleClassObject
		 * by value.
		 * 
		 * 
		 */
		rename(mySimpleClassObject);

		/*
		 * 
		 * 
		 * Is that a new string object is created on the heap and Java changes the
		 * pointer from the name in the
		 * 
		 * mySimpleClassObject object to this new string.
		 * 
		 * The original string object is no longer referenced from anywhere and so it
		 * can be garbage collected at some point in the future.
		 */

		/*
		 * 
		 * Finally we exit the renamed mySimpleClassObject method and go to the print
		 * line.
		 * 
		 * 
		 * 
		 */

		System.out.println(mySimpleClassObject.getName());

		/*
		 * And now our mySimpleClassObject variable references the amended object.
		 * mySimpleClassObject which has a name pointing to the new string "name changed".
		 * So the output should be the now ----> "name changed". 
		 * And now you do understand the mechanism of how variables are passed between methods.
		 */

	}

	private static void rename(MySimpleClass msc) {
		/*
		 * 
		 * 
		 * A new vote bill will be created on the stack called cast which will be given
		 * a copy of the pointer to the mySimpleClassObject on the heap. Now we changed
		 * the name of the mySimpleClassObject.
		 * 
		 * I hope you remember that strings are immutable in Java. That is you can't
		 * change the value of a string. If you do this you actually create a new string
		 * object. So what happens when this method runs.
		 * 
		 */
		msc.setName("name changed");
	}

}
