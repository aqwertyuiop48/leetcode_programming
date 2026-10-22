import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Long.valueOf(it.next()) instanceof Long x && Long.valueOf(it.next()) instanceof Long y && Long.valueOf(it.next()) instanceof Long n
            ? (new long[]{x, y, y - x, -x, -y, x - y}[(int) ((n - 1) % 6)] % 1000000007L + 1000000007L) % 1000000007L : "");
    }
}
