// Abdelrahman Ahmed Owies
// 20216687
import java.util.*;
public class Practicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<13;i++)
        {
            int a =i*n;
            System.out.print("%d * %d = %d \n", n, i, a);
        }
    }
}
