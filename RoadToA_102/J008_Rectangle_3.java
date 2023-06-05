import java.util.*;

public class J008_Rectangle_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i = 1 ; i <= x ; i++){
           if(i == 1 || i == x){
            System.out.print("-");
            for(int j = 0 ; j < x-2 ; j++){
                System.out.print("*");
            }
            System.out.println("-");
           }else{
            for(int k = 0 ; k < x ; k++){
                System.out.print("*");
            }
            System.out.println();
           }
            
        }
        sc.close();

    }
}