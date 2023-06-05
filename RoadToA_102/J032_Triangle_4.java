import java.util.*;

public class J032_Triangle_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i = 0; i < x; i++){
            for(int k = 0 ; k < i ; k++){
                System.out.print("-");
            }
            for(int j = 0 ; j < x-i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
