import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next().toCharArray() instanceof char[] a && IntStream.range(0, s.nextInt()).mapToObj(i -> new int[]{s.nextInt() - 1, s.nextInt(), s.nextInt()}).filter(q -> a.clone() instanceof char[] c && IntStream.range(q[0], q[1]).allMatch(i -> (a[q[0] + (i - q[0] + q[2]) % (q[1] - q[0])] = c[i]) >= 0)).count() >= 0 ? new String(a) : "");
    }
}
