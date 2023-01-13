import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayExceriseTest {

	@Test
	public void testreverseOrder()
	{
	
boolean check = true;
char symbols[]= {'a','s','s','i','g','n','m'}; //example array 1
char temp[]= {'a','s','s','i','g','n'}; //example array 2
//Check these arrays, these are identical now mismatched
//Check Length
if(symbols.length!=temp.length) {
	check=false;
	System.out.println("Failed with return code Length \""+check+"\"");
	fail("Failed Length Error"); //FAILURE
}
//Check Elements
if(check) {
	 for (int a=0;a<symbols.length;a++) { //TRAVERSE LENGTHS ARE SAME
		 
		 if(symbols[a]!=temp[a]) {
			 check=false;
			System.out.println("Failed with return code Mismatched \""+check+"\"");
			fail("Failed Mismatched"); //FAILURE
		 } 
	 }
}
//PASS MESSAGE BOOLEAN TYPE TRUE ALWAYS 
System.out.println("Passed with return code \""+check+"\"");

	}
}

