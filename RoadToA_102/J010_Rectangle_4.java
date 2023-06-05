import java.util.*;

public class J010_Rectangle_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i = 1 ; i <= x ; i++){
            if(i == 1 || i == x){
                for(int j = 0 ; j < y ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                System.out.print("*");
                for(int k = 0; k < y-2; k++){
                    System.out.print("-");
                }
                System.out.println("*");
            }
        }
        sc.close();
    }
}