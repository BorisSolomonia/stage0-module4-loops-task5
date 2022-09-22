package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int k =height;
        for (int i = 0; i < (height+1)/2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k-2*i; j++) {
                System.out.print("8");
            }
            if(i < (height+1)/2-1){
                System.out.println("");
            }
        }
        for (int i = (height+1)/2-1; i >-1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            if (i != (height+1)/2-1){
                for (int j = 0; j < k-2*i; j++) {
                    System.out.print("8");
                }
            }
            System.out.println("");
        }
    }
}
