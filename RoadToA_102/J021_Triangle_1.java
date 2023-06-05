import java.util.*;

public class J021_Triangle_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i = 0 ; i < x ; i++){
            for(int j = 0 ; j < i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
