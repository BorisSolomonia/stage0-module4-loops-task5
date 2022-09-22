package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        int k =cathetusLength;
        for (int i = 1; i < cathetusLength+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("8");
            }
            for (int j = 0; j < k-i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
