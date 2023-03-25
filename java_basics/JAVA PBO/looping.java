public class looping {
    public static void main(String[] args) {
        // for (int counter = 0; counter <= 10; counter++) {
        //     System.out.println("Loop ke - " + counter);
        // }

        //while loop
        int counterLoop = 0;
        // while (counterLoop <=5) {
        //     System.out.println("While Loop ke - " + counterLoop);
        //     counterLoop++;
        // }
        //Do While Loop
        do {
            System.out.println("Do While Loop ke - " + counterLoop);
            counterLoop++;
        } while (counterLoop <= 10);
        //Loop Array
        Number[] myNumbers = {90, 10, 11, 20};
        for (int counter = 0; counter < myNumbers.length; counterLoop++) {
            System.out.println(myNumbers[counterLoop]);
        }
    } 
}
