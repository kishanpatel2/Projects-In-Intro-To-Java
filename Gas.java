/*************************************************************************
 *  Compilation:  javac Gas.java
 *  Execution:    java Gas 3.40 15.0 true
 *
 *  @Kishan Patel, kpp95@scarletmail.rutgers.edu, kpp95:
 *
 * The program Gas computes and displays the price a
 * person will pay for gas at the gas station.
 *
 *  % java Gas 3.40 15.0 false
 *  56.1
 *
 *  % java Gas 3.40 15.0 true
 *  51.0
 *
 *************************************************************************/

public class Gas {

    public static void main(String[] args) {
     	double pricePerGallon = Double.parseDouble(args[0]);
        double numberOfGallons = Double.parseDouble(args[1]);
        boolean creditCard = Boolean.parseBoolean(args[2]);

        if(pricePerGallon <= 0 || numberOfGallons <= 0 ){
            System.out.println("Illegal input");
            return;
        }
        if(creditCard == true){
            System.out.println(pricePerGallon * numberOfGallons);
        }
        else if (creditCard == false){
            System.out.println((pricePerGallon * numberOfGallons * .10) + (pricePerGallon * numberOfGallons));
        }
        }

        // WRITE YOUR CODE HERE
    }



