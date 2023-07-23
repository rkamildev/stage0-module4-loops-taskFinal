package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        if (cathetusLength <= 0)
            System.out.print("");
        else {
            char[][] carr = new char[cathetusLength][cathetusLength];
            for (int i = cathetusLength - 1; i >= 0; i--) {
                for (int j = 0; j < cathetusLength; j++) {
                    if (j >= cathetusLength - i - 1)
                        carr[i][j] = (char) (cathetusLength - j + '0');
                    else
                        carr[i][j] = ' ';
                }
            }
            System.out.println(carr[0]);
            for (int i = 1; i < cathetusLength; i++) {
                System.out.print(carr[i]);
                for (int j = 2; j < i + 2; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
