# 560progassign2

This is a simple application that exercises the basic arithmetic operations (addition, subtraction, multiplication, division).

It uses the library provided in this repository:  https://github.com/kms0079/seng560-Assignment1

To run this, there are two ways:

	A) In Eclipse, run the SimpleCalc class which will execute the main method OR,
	
	B) From command line, run this command:  java SimpleCalc

Once the program is running it will accept an arithmetic expression and pressing Enter will give the result and allow you to enter a different expression.  

An expression should be entered in the following format along with spaces separating the input values and operator:  

input1 operator input2  

Example:  1 + 2 is fine but 1+2 is not  

Only the following four operators are allowed: +, -, *, /.  Press the letter 'q' followed by Enter to quit the program.

Using the library was very easy and quick. I just had to copy the main package (which contained two classes) to my Eclipse project and import that main package into my java class SimpleCalc and that's it I was able to start using the library.  I did not need to know the internals of the methods (how they are implemented) and did not have to struggle to figure out how to call them.  I was able to reuse the code in the library without making any changes to it (black-box reuse).  So with this library I had a good experience with reuse.