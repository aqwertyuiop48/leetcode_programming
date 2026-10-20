import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Long.valueOf(it.next()) instanceof Long a && Long.valueOf(it.next()) instanceof Long v && Long.valueOf(it.next()) instanceof Long u && Integer.valueOf(it.next()) instanceof Integer n && Long.valueOf(v * v - u * u) instanceof Long D
            ? LongStream.range(0, n).filter(i -> Long.valueOf(Long.parseLong(it.next())) instanceof Long cx && Long.valueOf(Long.parseLong(it.next())) instanceof Long cy
                && (-v * v * (cx * cx + cy * cy) >= 0 || (u * u - v * v) * a * a + 2 * v * v * cx * a - v * v * (cx * cx + cy * cy) >= 0 || D > 0 && cx > 0 && v * v * cx <= a * D && v * v * cx * cx >= D * (cx * cx + cy * cy))).count() : "");
    }
}
