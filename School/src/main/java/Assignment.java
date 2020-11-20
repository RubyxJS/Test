import java.util.Scanner;

class HeightCalculator {
    public static void main(String[] args) {

        // makes the code loop when an option is complete
        // asks the end user what task they want to carry out
        while (true) {
            System.out.println("Enter 1 to calculate average");
            System.out.println("Enter 2 to calculate total");
            System.out.println("Enter 3 to calculate quantity");
            System.out.println("Enter 4 to quit program");
            System.out.println("Enter option:");

            Scanner consolei = new Scanner(System.in);
            int option = consolei.nextInt();
            // if 4 is entered for "option" the program ends
            if (option >= 4) {
                System.out.println("Program closed");
                break;
            } else if (option == 1) {
                // if 1 is entered for option the user is asked for the sum of the heights and
                // the amount of people, and is given the average
                System.out.println("Enter Sum of heights:");
                double sumHeight = consolei.nextInt();

                System.out.println("Enter amount of People:");
                double amountPeople = consolei.nextInt();

                double heightAverage = (sumHeight / amountPeople);
                System.out.print("The Average is = ");
                System.out.println(heightAverage);
                System.out.println("   ");
                System.out.println("******** NEW CHIOCE ********");


            } else if (option == 2) {
                // if 2 is entered for "option" the user is asked the amount of people and then
                // has to put in all the height values, and the Height total
                System.out.println("Enter amount of people:");
                int sumPeople = consolei.nextInt();
                if (sumPeople <= 0) {
                    System.out.println("Invalid Number");
                } else {
                    double totalHeight = 0;
                    for (int i = 1; i <= sumPeople; i++) {
                        System.out.println("Insert Height for person " + i + ": ");
                        totalHeight += consolei.nextInt();
                    }
                    System.out.print("The Height Total = ");
                    System.out.println(totalHeight);
                    System.out.println("   ");
                    System.out.println("******** NEW CHIOCE ********");

                }

            } else if (option == 3) {
                // if 3 is entered for "option" the user is asked the average
                // then the amount of people is given
                System.out.println("Enter average height: ");
                double heightAverage = consolei.nextInt();

                System.out.println("Enter height total: ");
                double heightTotal = consolei.nextInt();

                double heightQuantity = heightTotal / heightAverage;
                System.out.println("Height Quantity = " + heightQuantity);
                System.out.println("   ");
                System.out.println("******** NEW CHIOCE ********");
                
            }
        }
    }

}