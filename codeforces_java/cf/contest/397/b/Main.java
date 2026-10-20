import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf((int) (long) it.next()) instanceof Integer t
            ? IntStream.range(0, t).mapToObj(i -> Long.valueOf(it.next()) instanceof Long n && Long.valueOf(it.next()) instanceof Long a && Long.valueOf(it.next()) instanceof Long b
                ? n / a * b >= n ? "Yes" : "No" : "").collect(Collectors.joining("\n")) : "");
    }
}
