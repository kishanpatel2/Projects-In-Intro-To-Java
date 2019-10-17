/*************************************************************************
 *  Compilation:  javac WCS111FM.java
 *  Execution:    java WCS111FM 53
 *
 *  The program takes the number of hours the listener spends
 *  programming as an int argument. Based on the number of hours spent
 *  programming, display the listener prize
 *
 *  @Kishan Patel, kpp95@scarletmail.rutgers.edu, kpp95:
 *
 *  % java WCS111FM 3
 *  T-shirt
 *
 *  % java WCS111FM 9
 *  Laptop
 *  TV
 * 
 *  % java WCS111FM 0
 *  Nothing
 *************************************************************************/

public class WCS111FM {

    public static void main(String[] args) {
    int timeCoded = Integer.parseInt(args[0]);
        if(timeCoded < 0){
            System.out.println("Illegal Input");
            return;

        }
        else if (timeCoded == 0){
            System.out.println("Nothing");
        }
        else if (timeCoded >= 1 && timeCoded <= 5){
            System.out.println("T-shirt");
        }
        else if (timeCoded >= 6 && timeCoded <= 400){
        	if (timeCoded % 10 == 9)
       			System.out.println("Laptop");
            
			if (timeCoded % 2 == 0)
            	System.out.println("Hat");
           
        	if (timeCoded % 3 == 0)
            	System.out.println("TV");
        }  

        else if(timeCoded > 400)
            System.out.println("Cat");
        

    }

}
 

