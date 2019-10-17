/*************************************************************************
 *  Compilation:  javac LuckySevens.java
 *  Execution:    java LuckySevens 421
 *
 *  @Kishan Patel, kpp95@scarletmail.rutgers.edu, kpp95:
 *
 * LuckySevens takes an int as a command-line argument and displays
 * how many digits in the integer number are 7s.  
 *
 * Note: the number can be negative.
 *
 *  % java LuckySevens 3482
 *  0
 *
 *  % java LuckySevens 372777
 *  4
 * 
 *  % java LuckySevens -2378272
 *  2
 *************************************************************************/

public class LuckySevens {

    public static void main(String[] args) {
	int sevens = Integer.parseInt(args[0]);
        int numberCounter = 0;
        while (sevens > 0 || sevens < 0) {
            if (sevens % 10 == 7 || sevens % 10 == -7){
                numberCounter = numberCounter + 1;
            }
            	sevens = sevens / 10;

            }
        

        System.out.println(numberCounter);
    }

}
