package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 1; i < height+1; i++) {
            if(i == 1) {
                for (int j = 0; j < length; j++) {
                    System.out.print("8");
                }
            }else if(i == height){
                System.out.println("");
                for (int j = 0; j < length; j++) {
                    System.out.print("8");
                }
            }else {
                for (int k = 1; k < length+1; k++) {
                    if(k == 1){
                        System.out.println("");
                        System.out.print("8");
                    }else if(k == length){
                        System.out.print("8");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
