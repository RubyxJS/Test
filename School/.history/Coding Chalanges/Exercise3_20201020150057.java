class OrderChecker {
    public static void main(String[] args) {
        System.out.println("Number of bolts:");
        int boltsNum = Console.readInt();
        
        if (boltsNum > -1) {
            System.out.println("Number of nuts:");
            int nutsNum = Console.readInt();
        }

        if (nutsNum > -1) {
            System.out.println("Number of washers:");
            int washerNum = Console.readInt();
        }

}
}