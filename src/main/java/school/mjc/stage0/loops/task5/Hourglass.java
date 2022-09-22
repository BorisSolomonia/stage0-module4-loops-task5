package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int k =cathetusLength;
        for (int i = 0; i < (cathetusLength+1)/2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k-2*i; j++) {
                System.out.print("8");
            }
            if(i < (cathetusLength+1)/2-1){
                System.out.println("");
            }
        }
        for (int i = (cathetusLength+1)/2-1; i >-1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            if (i != (cathetusLength+1)/2-1){
                for (int j = 0; j < k-2*i; j++) {
                    System.out.print("8");
                }
            }
            System.out.println("");
        }
    }
}
