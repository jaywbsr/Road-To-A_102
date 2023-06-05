import java.util.*;
/**
 * J006_Rectangle_2
 */
public class J006_Rectangle_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i = 0; i < x ; i++){
            for(int j = 0 ; j < y ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
/*

4 2
**
**
**
**

*/