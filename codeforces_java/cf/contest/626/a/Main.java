import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && sc.next().toCharArray() instanceof char[] s && new int[n + 1] instanceof int[] X && new int[n + 1] instanceof int[] Y
            && IntStream.rangeClosed(1, n).filter(k -> (X[k] = X[k - 1] + (s[k - 1] == 'R' ? 1 : s[k - 1] == 'L' ? -1 : 0)) > -1000 & (Y[k] = Y[k - 1] + (s[k - 1] == 'U' ? 1 : s[k - 1] == 'D' ? -1 : 0)) > -1000).count() >= 0
            ? IntStream.rangeClosed(0, n).mapToLong(i -> IntStream.rangeClosed(i + 1, n).filter(j -> X[i] == X[j] && Y[i] == Y[j]).count()).sum() : -1);
    }
}
