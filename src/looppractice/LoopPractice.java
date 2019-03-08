package looppractice;

public class LoopPractice {

    public static void practiceWhileLoop() {
        int x = 0;
        System.out.println("WHILE LOOP");
        while (x < 5) {
            System.out.println("The value of x is " + x);
            x++;
        }
    }

    public static void practiceDoWhileLoop() {
        int x = 0;
        System.out.println("DO WHILE LOOP");
        do {
            System.out.println("The value of x is " + x);
            x++;
        } while (x < 10);
    }

    public static void practiceForLoop() {
        System.out.println("FOR LOOP");
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.println("(" + x + "," + y + ")");
            }
        }
    }

    public static void main(String[] args) {
        //practiceDoWhileLoop();
        //practiceWhileLoop();
        practiceForLoop();
    }

}
