import java.util.*;

public class J011_Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // top part
        for (int j = 1; j < x; j++) {
            System.out.print("-");
        }
        for (int k = 0; k < x; k++) {
            System.out.print("*");
        }
        System.out.println();

        for (int u = 2; u < x; u++) {
            for (int l = 0; l < x - u; l++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int in = 0; in < x - 2; in++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int si = 0; si < u - 2; si++) {
                System.out.print("-");
            }
            System.out.print("*");
            System.out.println();
        }
        // bottom part
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        for (int i = 2; i < x; i++) {
            System.out.print("-");
        }
        System.out.println("*");

        for(int bt = 2 ; bt < x ; bt++){
            System.out.print("*");
            for(int j = 2 ; j < x ; j++){
                System.out.print("-");
            }
            System.out.print("*");
            for (int k = 1 ; k < x-bt ; k++){
                System.out.print("-");
            }
            System.out.print("*");
            System.out.println();
        }

        for(int i = 0; i < x; i++){
            System.out.print("*");
        }

        sc.close();
    }
}
