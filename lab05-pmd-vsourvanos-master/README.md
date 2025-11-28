# PROGRAMMING METHODOLOGY AND DESIGN
## LAB 5: Methods


### Introduction
This Lab is an introduction to methods.

By the end of this lab a student should be able to:
+ determine a method’s signature (parameters and return type);
+ define developer-defined methods to solve complex problems in a structured, disciplined way, and call them;
+ break a problem into smaller parts;
+ test their methods using JUnit; and
+ use Java’s API Documentation.


**Important Note**: Name your classes (and files) using the names of the exercises that appear in bold.


-----------------


### 1.	NumberMethods
Define in this class the following methods:
+ `minimumInt`, which finds the minimum of two integer numbers. Likewise define the methods `maximumInt`, `minimumDouble`, and `maximumDouble`.
+ `median`, which finds the median of three integer numbers.
+ `average`, which finds the average of five integer numbers.
+ `isEven`, which finds whether a number is even.
+ `sumAllNumbersUpTo`, which finds the sum of all integer numbers from 1 up to the integer number that is provided as an argument.
+ `sumEvenNumbersUpTo`, which finds the sum of all even integer numbers from 1 up to the integer number that is provided as an argument.
+ `percentage`, which given two integer numbers finds what percentage of the first number is the second one.
+ `solveEquation`, which given two numbers a and b solves the equation: 

  *a\*x + b = 0*

+ `squarePerimeter`, which given the side length of a square returns its perimeter.
+ `triangleArea`, which given the height and the base of a triangle returns the area of the triangle. 
+ `sumOfDigits`, which returns the sum of all digits of an integer that is provided as an argument.
+ `reverseNum`, which gets a 2-digit integer as a parameter and returns the integer produced by reversing the initial digits (e.g., 23 -> 32).



### 2.	StringMethods
Define in this class the following methods:
+ `appearsIn`, which determines whether a particular character appears in a particular String.
+ `countOccurences`, which counts how many times a particular character appears in a particular String.
+ `displayManyTimes`, which given a positive integer and a String prints the String on the screen as many times as the number.
+ `middleChar`, which returns the middle character of a string (exists only if its length is odd)
+ `countVowels`, which counts all vowels in a string. 
+ `countWords`, which counts all words in a string. 
+ `validPass`, which returns true if a string is a valid password. It is valid if it has at least 6 characters (only letters and digits) and three of them must be digits.



### 3.	GradeMethods
Define in this class the following methods:
+ `promptForGrade`, which prompts the user to enter a grade (as many times as necessary until the user enters a valid grade).
+ `isPassGrade`, which finds if a grade is a pass grade.
+ `isFirstClass`, which finds if a grade is a first-class grade.
+ `findClassification`, which finds the classification of a grade.
+ `calculateFinalGrade`, which given (a) the grade of the assignment, and (b) the grade of the final exam, calculates the final mark for a module. The assignment contributes 40% to the final module grade and the final exam contributes 60%.



### 4.	VariousMethods
Define in this class the following methods:
+ `monthAsString`, which given a number returns a String with the month that the month corresponds to. (In the case the number does not correspond to a month, the method returns the empty String.)
+ `isLeapYear`, which determines whether a year is a leap year. The rules for determining whether a year is a leap year or not are:
   - Years that are not divisible by 100 are leap years if they are divisible by 4,
   - Years that are divisible by 100 are leap years if they are divisible by 400,
   - In all other cases, a year is not a leap year.
+ `fahrenheitToCelcius`, and `celciusToFahrenheit`, which convert temperature degrees accordingly, knowing that:

  *Celsius = 5 * (Fahrenheit - 32) / 9*



### 5.	DiceGame
Write a dice game program played by two players. The program initially prompts the users to enter their names and the amount of money they have at the disposal for the game. In every round:
+ Each player specifies what amount of their money they will bet in this round.
+ The program throws two dice for each player.
+ The winner of the round is the player with the biggest dice sum.
+ At the end of each round the players are asked whether they wish to continue playing.
The game ends:
+ either when a player decides to stop playing,
+ or when one of the players runs out of money.
The winner of the game is the player who has the most money at the end.

**Use methods extensively.**

Also, you may implement two separate versions of the game:
+ one that uses only local variables, and
+ one that uses class variables
to see how the implementations of the methods are affected.



### 6.	CallingMathMethods
Write a program that call various methods of the `Math` class and prints their results on the screen. See [here](https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html) for the Documentation of the Math class.


### 7.	CallingStringMethods
Write a program that call various methods of the `String` class and prints their results on the screen. See [here](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) for the Documentation of the String class.

