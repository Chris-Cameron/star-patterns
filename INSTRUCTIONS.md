# java-star-patterns

Use nested loops and conditional operators to draw the following
patterns. You are only allowed to have these 3 print statements
in each method, and each should appear be used once.

	System.out.print("*");
	System.out.print(" ");
	System.out.println();
 
Write abstract methods that take appropriate parameters to describe
the dimensions of each shape.


The starBox() method should draw this:

	*********
	*       *
	*       *
	*       *
	*       *
	*********


The starX() method should draw this:

	*     *     
	 *   *
	  * *
	   *
	  * *
	 *   *
	*     *


The starZ() method should draw this:

	*******
	     *
	    *
	   *
	  *
	 *
	*******


The starXBox() method should draw this:

	*********
	**     **     
	* *   * *
	*  * *  *
	*   *   *
	*  * *  *
	* *   * *
	**     **
	*********


The twoStarBoxes() method should draw this:

	******
	******
	******
	******
	      ******
	      ******
	      ******
	      ******


The starTriangle() method should draw this:

	*
	**
	***
	****
	*****
	******


The emptyTriangle() method should draw this:

	*
	**
	* *
	*  *
	*   *
	******


The starTriangleUR() method should draw this:

	**********
	 *********
	  ********
	   *******
	    ******
	     *****
	      ****
	       ***
 	        **
	         *



The problems you have done so far mostly required you to write
conditional statements that described the figures. The next four 
problems will require you to be a bit clever in discovering the 
mathematical relationships. Figure out those relationships before 
you start coding. Scratch paper helps!
		 
The isoscelesStarTriangle() method should draw this:

	    *
	   ***
	  *****
	 *******
	*********

(The only parameter this should need is a height. The width
 is a function of the height. Also, the location where stars
 begin and end in each row is a function of the width and row.
 

The checkerBoard() method should draw this:

	* * * * 
	 * * * * 
	* * * * 
	 * * * * 
	* * * * 
	 * * * * 


The biggerCheckerBoard() method should draw this:

	***   ***   ***   ***   ***
	***   ***   ***   ***   ***
	***   ***   ***   ***   ***
	   ***   ***   ***   ***   ***
	   ***   ***   ***   ***   ***
	   ***   ***   ***   ***   ***
	***   ***   ***   ***   ***
	***   ***   ***   ***   ***
	***   ***   ***   ***   ***
	   ***   ***   ***   ***   ***
	   ***   ***   ***   ***   ***
	   ***   ***   ***   ***   ***
	***   ***   ***   ***   ***
	***   ***   ***   ***   ***
	***   ***   ***   ***   ***
	   ***   ***   ***   ***   ***
	   ***   ***   ***   ***   ***
	   ***   ***   ***   ***   ***
	***   ***   ***   ***   ***
	***   ***   ***   ***   ***
	***   ***   ***   ***   ***
	   ***   ***   ***   ***   ***
	   ***   ***   ***   ***   ***
	   ***   ***   ***   ***   ***


The upsideDownCheckeredTriangle() method should draw this:

	* * * * * *
	 * * * * *
	  * * * *
	   * * *
	    * *
	     *


The primeStars() method should draw this:

	**
	***
	*****
	*******
	***********
	**************
	*****************

(It will be helpful to copy your isPrime method into your
 stars program.)


The fibonacciStars() method should draw this:

	*
	*
	**
	***
	*****
	********
	*************
	*********************
 

Try starFlag() using only .print("*"), .print("R"), and .println():
This method does not need to be abstract. You can hard code the dimensions.

	*****************RRRRRRRRRRRRRRRRRRRR
	*****************                    
	*****************RRRRRRRRRRRRRRRRRRRR
	*****************                    
	*****************RRRRRRRRRRRRRRRRRRRR
	*****************                    
	*****************RRRRRRRRRRRRRRRRRRRR

	RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR

	RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR

	RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
