import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer sc && (Integer) Integer.parseInt(sc.nextToken()) instanceof Integer n && sc.nextToken() instanceof String s
            && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> d && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> r
            && IntStream.range(0, n).filter(i -> s.charAt(i) == 'D' ? d.add(i) : r.add(i)).count() >= 0
            && IntStream.range(0, 2 * n).filter(i -> !d.isEmpty() && !r.isEmpty()
                && (d.peekFirst() < r.peekFirst() ? d.add(d.pollFirst() + n) && r.pollFirst() >= 0 : r.add(r.pollFirst() + n) && d.pollFirst() >= 0)).count() >= 0
            ? (d.isEmpty() ? "R" : "D") : "");
    }
}
