import java.util.*;

public class J004_Rectangle_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i = 0; i < x; i++){
            for(int j = 0;j < x; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}


/*
5
*****
*****
*****
*****
*****

2
**
**
*/