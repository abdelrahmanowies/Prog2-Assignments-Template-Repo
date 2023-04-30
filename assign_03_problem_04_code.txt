//Abdelrahman Ahmed Owies
// 202106687

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0 ;i<t ;i++){
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if(y==0){
            System.out.println(0);
        }
        else{
            if(x%2==0){
                x++;
            }
            
 
            int s = (y * (x + (y-1)));
            System.out.println(s);
        }
    }   
}
}
