// Abdelrahman Ahmed Owies
// 202106687
import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
            if(a[i]>0){
                a[i]=1;
            }
            else{
                if(a[i]<0){
                    a[i]=2;
                    
                }
                else{
                    a[i]=0;
                }
                
            }
            
        }
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
        }
    }}