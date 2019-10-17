/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @Kishan Patel, kpp95@scarletmail.rutgers.edu, kpp95:
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {
    	
        //Different Values 
        double smallestNumber1 = Double.parseDouble(args[0]);
       	double smallestNumber2 = Double.parseDouble(args[1]);
    	double temporaryVariable;

        	//If Statement to make temporary equal to small
            if (smallestNumber1 > smallestNumber2) {
                temporaryVariable = smallestNumber1;
                smallestNumber1 = smallestNumber2; 
                smallestNumber2 = temporaryVariable;
                 
            }

            	//For Loop to choose amount of variables 
            	for (int i = 2; i < args.length; i++) {
            		double number = Double.parseDouble(args[i]);

            		//If Statement to check if amount of variables is less than first small
                	if (number < smallestNumber1) {
                    	smallestNumber2 = smallestNumber1;
                    	smallestNumber1 = number;

                //If Statement ot check if amount of varaibles is less than second small
               	} 
            else if (number < smallestNumber2) {
                smallestNumber2 = number;
                }
            }

            //output 
            System.out.println(smallestNumber1);
            System.out.println(smallestNumber2);               
  }
}
      
    



