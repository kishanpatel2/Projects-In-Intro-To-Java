/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @Kishan Patel, kpp95@scarletmail.rutgers.edu, kpp95:
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {

       	//make parse int values
        boolean orderCheck1 = Integer.parseInt(args[0]) < Integer.parseInt(args[1]);
        boolean orderCheck2 = Integer.parseInt(args[1]) < Integer.parseInt(args[2]);
        boolean orderCheck3 = Integer.parseInt(args[2]) < Integer.parseInt(args[3]);

        //make boolean values equal to each other 
        boolean orderCheck4 = (orderCheck1 == orderCheck2 && orderCheck1 == orderCheck3); 

        //print out value
        System.out.println(orderCheck4);
    }
}
