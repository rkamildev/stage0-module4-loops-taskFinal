package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int ans = 1;
        if (power == 0)
            System.out.println(ans);
        else {
            for (int i = 0; i < power; i++) {
                ans *= numberToPrint;
            }
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
