import java.util.*;

public class J031_Triangle_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i = 0; i < x; i++){
            for(int k = 0 ; k < x-i-1 ; k++){
                System.out.print("-");
            }
            for(int j = 0 ; j < i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}