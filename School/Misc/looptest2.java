class Looptest2 {
    public static void main(String[] args) {
        String astericks = "**********";
        for (int number = 0; number < 10; number++) {
            System.out.print(astericks);
            astericks = astericks - "*";
        }
    }
    
}
