import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String a && sc.next() instanceof String b
            && new int[a.length() + 1][b.length() + 1] instanceof int[][] d
            && IntStream.rangeClosed(0, a.length()).allMatch(i -> IntStream.rangeClosed(0, b.length()).allMatch(j ->
                (d[i][j] = i == 0 && j == 0 ? 0 : i == 0 ? d[i][j - 1] + b.charAt(j - 1) - 'a' + 1 : j == 0 ? d[i - 1][j] + a.charAt(i - 1) - 'a' + 1
                    : Math.min(d[i - 1][j - 1] + Math.abs(a.charAt(i - 1) - b.charAt(j - 1)), Math.min(d[i - 1][j] + a.charAt(i - 1) - 'a' + 1, d[i][j - 1] + b.charAt(j - 1) - 'a' + 1))) >= 0))
            ? d[a.length()][b.length()] : 0);
    }
}
