class HeightCalculator {
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("Enter 1 to calculate average");
            System.out.println("Enter 2 to calculate total");
            System.out.println("Enter 3 to calculate quantity");
            System.out.println("Enter 4 to quit program");
            System.out.println("Enter option:");

            int option = Console.readInt();
            if (option >= 4) {
                System.out.println("Program closed");
                break;
            } else if (option == 1) {
                System.out.println("Enter Sum of heights:");
                double sumHeight = Console.readInt();

                System.out.println("Enter amount of People:");
                double amountPeople = Console.readInt();

                double heightAverage = (sumHeight / amountPeople);
                System.out.print("The Average is = ");
                System.out.println(heightAverage);
                System.out.println("   ");

            } else if (option == 2) {
                System.out.println("Enter amount of people:");
                int sumPeople = Console.readInt();
                if (sumPeople <= 0) {
                    System.out.println("Invalid Number");
                } else {
                    double totalHeight = 0;
                    for (int i = 1; i <= sumPeople; i++) {
                        System.out.println("Insert Height for person "+i+": ");
                        totalHeight += Console.readInt(); 
                    }
                    System.out.print("The Height Total = ");
                    System.out.println(totalHeight);
                    System.out.println("   ");

                }

            } else if (option == 3) {
                System.out.println("Enter average height: ");
                double heightAverage = Console.readInt();

                System.out.println("Enter height total: ");
                double heightTotal = Console.readInt();

                double heightQuantity = heightTotal/heightAverage;
                System.out.println("Height Quantity = " + heightQuantity);
                System.out.println("   ");
            }
        }
    }

}