package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        char[][] carr = new char[cathetusLength][cathetusLength];
        for (int i = cathetusLength - 1; i >= 0; i--) {
            for (int j = 0; j < cathetusLength; j++) {
                if (j >= cathetusLength - i - 1)
                    carr[i][j] = '*';
                else
                    carr[i][j] = ' ';
            }
        }
        for (char[] c : carr){
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
