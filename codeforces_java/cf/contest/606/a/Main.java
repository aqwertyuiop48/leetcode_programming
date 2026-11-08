import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t && IntStream.range(0, 6).map(i -> Integer.parseInt(t.nextToken())).toArray() instanceof int[] v
            ? (IntStream.range(0, 3).map(i -> Math.max(0, v[i + 3] - v[i])).sum() <= IntStream.range(0, 3).map(i -> Math.max(0, (v[i] - v[i + 3]) / 2)).sum() ? "Yes" : "No") : "");
    }
}
