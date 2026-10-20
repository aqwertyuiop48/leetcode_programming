import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Long.valueOf(it.next()) instanceof Long a && Long.valueOf(it.next()) instanceof Long b
            ? Stream.iterate(new long[]{a, b}, p -> p[1] > 0, p -> new long[]{p[1], p[0] % p[1]}).mapToLong(p -> p[0] / p[1]).sum() : "");
    }
}
