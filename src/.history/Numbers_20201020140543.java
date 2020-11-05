class Discount {
    public static void main(String[] args){

     System.out.println("Enter Price (In cents):");
     int price = Console.readInt();
     int discountedPrice = (price * 0.9);

     if (price > 10) {
         System.out.println("discountedPrice");
     } else {System.out.println("no discount");}


    }
}