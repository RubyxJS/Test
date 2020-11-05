class Discount15 {
    public static void main(String[] args){

     System.out.println("Enter Price (In cents):");
     int price = Console.readInt();

     if (price > 1400) {
        double discountedPrice = (price * 0.85);
         System.out.println(discountedPrice);
     } else {System.out.println("no discount");}


    }
}
