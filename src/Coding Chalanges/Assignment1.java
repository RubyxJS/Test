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
            System.out.println("This is the Average =");
            System.out.print(heightAverage);
        } else if (option == 2) {
            
        }
    }

}
