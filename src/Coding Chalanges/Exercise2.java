class ScoreCheck {
    public static void main(String[] args) {
        System.out.println("Enter Score:");
        int score = Console.readInt();

        if (score >= 280) {
            System.out.println("Fail");
        }
        else if (score <= 220) {
            System.out.println("Fail");
        } else { System.out.println("Pass");}
    }
}
