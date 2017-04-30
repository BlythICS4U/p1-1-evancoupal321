# P1-1 Random Numbers Practice

Create new NetBeans projects as you deem necessary to complete the exercises below. Ensure that all new NetBeans projects are created inside the same directory where this repository was cloned.

As a reminder, generating a random number can be done as follows:
```
Random rand = new Random(); // Make sure to import java.util.Random at the top of your class
int randomInteger = rand.nextInt(100) + 1; // Will generate a random integer in the range [1, 100]
```
More information on the java.util.Random class can be found [here](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)

(1) Write statements to generate sets of random numbers with the following values:
 * 1, 2, 3, 4, 5, 6
 * 0, 1
 * 1, 2, 3, 4, 5, ... ,50, 51, 52
 * 0, 1, 2, 3, 4, 5, 6, 7
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
 * 1, 2, 3, ... , 99, 100
 * -10, -9, -8, -7, ... , -2, -1
 * -50, -49, -48, -47, ... , 48, 49, 50

(2) (a) Write a program that simulates the flipping of a coin 1000 times and outputs the percentage of flips that are "heads" and the percentage that are "tails".

(b) Improve the program so that the user can input the number of coins to flip.

(c) Improve the program to ensure that,  when asked how many coins to flip, the number entered is greater than 0.

(3) (a) Write a program that simulates the rolling of a pair of dice 1000 times. Find the sum of the two dice each time they are rolled. Use 11 variables called *two*, *three*, *four*, ... , *eleven*, and *twelve* which will contain the number of occurrences of each possible total:
```
Twos:     16
Threes:   24
Fours:    41
...
Twelves:  13
```

(b) Improve the program by allowing the user to enter the number of dice pairs to roll. Enhance the output so that  it graphs the final results as a line of stars instead of displaying the numerical values:
```
Twos:     ****************
Threes:   ************************
Fours:    *******************************************
...
Twelves:  ***********
```
