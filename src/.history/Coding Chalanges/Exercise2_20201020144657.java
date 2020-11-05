class ScoreCheck {
    public static void main(String[] args) {
        System.out.print("Enter Score:");
        int score = Console.readInt();

        if (score >= 280) {
            System.out.print("Fail");
        }
        else if (score <= 220) {
            System.out.print("Fail");
        } else { System.out.println("Pass");}
    }
}
