import java.util.*;

public class J030_Triangle_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i = 0; i < x; i++){
            for(int j = 0 ; j < x-i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
