
package Assignment_6;																					
import java.util.Scanner;																				
public class Assignment_6_3 {																			
public static  Scanner in = new Scanner(System.in);														
public static void main(String[] args) {																
	int counter, first, last, middle, numberOfElements, search, array[];								
	System.out.print("Enter number of elements : ");													
	numberOfElements = in.nextInt(); 																	
	    array = new int[numberOfElements];																
	System.out.println("Enter One-Dimensional Array of " + numberOfElements + " integers : ");			
		for (counter = 0; counter < numberOfElements; counter++)										
	      array[counter] = in.nextInt();																
	System.out.print("Enter value to be found : ");														
	    search = in.nextInt();																			
	    first  = 0;																						
	    last   = numberOfElements - 1;																	
	    middle = (first + last)/2;																		
	    while( first <= last ) {																		
	      if ( array[middle] < search )																	
	        first = middle + 1;    																		
	      else if ( array[middle] == search ) {															
	        System.out.println("\n"+search + " found at location " + (middle + 1) + ".");				
	        break;}																						
	      else																							
	         last = middle - 1;																			
	      middle = (first + last)/2;}																	
	   if ( first > last )																				
	      System.out.println("\n"+search + " is not present in the list.\n");							
	}																									
}																										

