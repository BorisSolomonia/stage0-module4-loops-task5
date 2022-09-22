package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int i = 1; i < sideLength+1; i++) {
            if(i == 1) {
                for (int j = 0; j < sideLength; j++) {
                    System.out.print("8");
                }
            }else if(i == sideLength){
                System.out.println("");
                for (int j = 0; j < sideLength; j++) {
                    System.out.print("8");
                }
            }else {
                for (int k = 1; k < sideLength+1; k++) {
                    if(k == 1){
                        System.out.println("");
                        System.out.print("8");
                    }else if(k == sideLength){
                        System.out.print("8");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
