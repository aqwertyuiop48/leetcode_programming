import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer m
            ? (n == 1 ? 1 : (m - 1 >= n - m ? m - 1 : m + 1))
            : 0);
    }
}
