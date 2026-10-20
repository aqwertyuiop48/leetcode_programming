import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Long.valueOf(it.next()) instanceof Long r && Long.valueOf(it.next()) instanceof Long h && Long.valueOf(h % r) instanceof Long k
            ? 2 * (h / r) + (4 * k * k >= 3 * r * r ? 3 : 2 * k >= r ? 2 : 1) : "");
    }
}
