/*************************************************************************
 *  Compilation:  javac TrainTicket.java
 *  Execution:    java TrainTicket
 *
 *  @Kishan Patel, kpp95@scarletmail.rutgers.edu, kpp95:
 *
 * The program TrainTicket takes two command-line arguments: an int
 * referring to the persons age and a boolean referring to whether or
 * not the ticket was bought at the train station (true for a ticket
 * bought at the train station). The program computes and displays the
 * ticket price the person needs to pay for the train ride.
 *
 *  % java TrainTicket 23.0 true
 *  13.20
 *
 *  % java TrainTicket 23.0 false
 *  15.84
 * 
 *  % java TrainTicket 230 false
 *  Illegal input
 *
 *************************************************************************/

public class TrainTicket {

    public static void main(String[] args) {
    	double ageGuest = Double.parseDouble(args[0]);
        boolean ticketLocation = Boolean.parseBoolean(args[1]);
        if (ageGuest > 120 || ageGuest < 0) {
        System.out.println("Illegal input");
        return;
    }
    if(ticketLocation == true) {
    if (ageGuest < 7) {
        System.out.println("0.0");
    } else if (ageGuest > 65) {
        System.out.println("7.50");
    } else
        System.out.println("13.20");

}

        if(ticketLocation == false){
            if (ageGuest < 7){
                System.out.println(0);
            }

            else if (ageGuest > 65 ){
                System.out.println((7.50 * .20) + 7.50);
            }

            else
                System.out.println((13.20 *.20) + 13.20);

        }

    }
    
}

 