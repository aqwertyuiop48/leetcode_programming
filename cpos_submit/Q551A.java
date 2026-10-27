import java.util.*;

public class Q551A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++) {
            int c=1;
            for(int j=0;j<n;j++)
                if(a[j]>a[i]) c++;
            System.out.print(c+" ");
        }
    }
}