/*Input a number*/	
		/*Duplicate the number*/ 
 /*Duplicate the number*/ 
 /*Test if number is negative then jump to the end (location 1100)*/
				  
/*Test if number is zero then jump to the end (location 1110)*/
	 			 
/*Now the number is positive, call recursive subroutine to calculate Fibonacci (location 0000)*/
 	    
/*Print the result*/	
 	/*Jump unconditionally to the end of the program (location 1111)*/
 
				
/*Subroutine to calculate Fibonacci for positive number n (location 0000)*/
      
/*Duplicate the number*/ 
 /*Push number 1 to the stack*/   	
/*Subtraction*/	  	/*Duplicate the number*/ 
 /*Test if number is zero then jump to return Fib(1) (location 0001)*/
	    	
/*Push number 1 to the stack*/   	
/*Subtraction*/	  	/*Test if number is zero then jump to return Fib(2) (location 0010)*/
	   	 
/*Push number 1 to the stack*/   	
/*Subtraction*/	  	/*Duplicate the number*/ 
 /*Call subroutine to calculate Fibonacci for positive number (n - 1) (location 0000)*/
 	    
/*Swap the top 2 elements of the stack*/ 
	/*Push number 1 to the stack*/   	
/*Subtraction*/	  	/*Call subroutine to calculate Fibonacci for positive number (n - 2) (location 0000)*/
 	    
/*Add Fib(n-1) + Fib(n-2)*/	   /*End of subroutine*/
	
/*Branch to return Fib(1) (location 0001)*/
     	
/*Discard the top element of the stack*/ 

/*Discard the top element of the stack*/ 

/*Push number 1 to the stack*/   	
/*End of subroutine*/
	
/*Branch to return Fib(2) (location 0010)*/
    	 
/*Discard the top element of the stack*/ 

/*Push number 2 to the stack*/   	 
/*End of subroutine*/
	
/*Mark end of program (location 1100)*/
  		  
/*Discard the top element of the stack*/ 

/*Mark end of program  (location 1110)*/
  			 
/*Discard the top element of the stack*/ 

/*Mark end of program (location 1111)*/
  				
/*Finish*/


