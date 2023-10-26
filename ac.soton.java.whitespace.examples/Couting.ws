/*Put a 1 on the stack*/   	
/*Set a Label (01000011) at this point*/
   	    		
/*Duplicate the top stack item*/ 
 /*Output the current value*/	
 	/*Put 10 (newline) on the stack...*/   	 	 
/*...and output the newline*/	
  /*Put a 1 on the stack*/   	
/*Addition. This increments our current value.*/	   /*Duplicate that value so we can test it*/ 
 /*Push 11 onto the stack*/   	 		
/*Subtraction. So if we've reached the end, we have a zero on the stack.*/	  	/*If we have a zero, jump to the end*/
	  	   	 	
/*Jump to the start*/
 
 	    		
/*Set the end label (01000101)*/
   	   	 	
/*Discard our accumulator, to be tidy*/ 

/*Finish*/


