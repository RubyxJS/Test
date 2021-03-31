class LoopTest {
    public static void main(String[] args) {
        String astericks = "*";

        for (int number = 0; number < 10; number++) {
            System.out.println(astericks);
            astericks = astericks + "*";
        }
    }
}
