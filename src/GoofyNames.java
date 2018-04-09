/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
String name = JOptionPane.showInputDialog("What is your name?");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
System.out.println(name.toUpperCase());

String gn = "";
for (int i=0; i<name.length(); i++) {
		System.out.println(name.charAt(i));
		name.substring(i,i+1);	
		
		if (i%2==0) {
			gn += name.substring(i, i + 1).toLowerCase();
		}
		if (i%2==1) {
			gn += name.substring(i, i + 1).toUpperCase();
		}
		}

	JOptionPane.showMessageDialog(null,"Your goofy name is " + gn);

}
}		//    HINT: Use .length() to determine the number of characters in the String.

			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)

			//    HINT: replace 'start' and 'end' to get String with character at i 
			
			// 5. Use MODULO to set this variable to upper case for EVEN characters
	
			// 6. ADD this String  (containing 1 char) to the goofyName String

		
		// 7. Use pop-up to show user their Goofy name

	

