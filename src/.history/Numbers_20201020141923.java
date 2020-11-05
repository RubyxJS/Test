class Discount {
    public static void main(String[] args){

     System.out.println("Enter Price (In cents):");
     int price = Console.readInt();

     if (price > 1000) {
        int discountedPrice = (price - (price/10));
         System.out.println(discountedPrice, "cents");
     } else {System.out.println("no discount");}


    }
}