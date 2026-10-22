import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] req = {1, 1, 2, 7, 4};
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) ans = Math.min(ans, sc.nextInt() / req[i]);
        System.out.println(ans);
    }
}
