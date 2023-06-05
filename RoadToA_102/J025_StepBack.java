import java.util.Scanner;

public class J025_StepBack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int max = Math.max(x, y);
        int min = Math.min(x, y); 

        int group = max - min + 1;

        for (int i = 0; i < group; i++) {
            // for (int j = max; j >= max - i; j--) {
            //     System.out.print(j + " ");
            // }
            for (int j = 0; j <= i; j++) {
                System.out.print(max-j+" ");
            }
        }

        


        sc.close();
    }
}