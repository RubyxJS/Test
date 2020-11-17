class TestGrader{
    public static void main(String[] args) {
        System.out.print("Enter Score :");
       int score = Console.readInt();
       
       if (score >= 80) {
        System.out.print("Distincion!!");
       }
        else if (score >= 65) {
        System.out.print("Merit!!");
        }
         else if (score >= 50 ){
          System.out.print("Pass");
         }
          else if (score <= 49){
            System.out.print("Fail");
           }       
        }
    }
        