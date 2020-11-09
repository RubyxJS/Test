class HeightCalculator {
    public static void main(String[] args) {
        System.out.println("Enter 1 to calculate average");
        System.out.println("Enter 2 to calculate total");
        System.out.println("Enter 3 to calculate quantity");
        System.out.println("Enter 4 to quit program");
        System.out.println("Enter option:");

        int option = Console.readInt();
        if (option >= 4) {
            System.out.println("Program closed");
        } else if (option == 1) {
            System.out.println("Enter Sum of heights:");
            double sumHeight = Console.readInt();

            System.out.println("Enter amount of People:");
            double amountPeople = Console.readInt();

            double heightAverage = (sumHeight / amountPeople);
            System.out.print("The Average is = ");
            System.out.print(heightAverage);
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
                System.out.print("This is the Total = ");
                System.out.print(totalHeight);
            }

        }
    }

}