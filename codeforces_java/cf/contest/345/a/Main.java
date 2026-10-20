import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && it.next() instanceof String s && Double.valueOf(it.next()) instanceof Double p
            ? String.format(Locale.US, "%.5f", s.chars().mapToDouble(c -> c == '1' ? 1.0 : c == '?' ? p : 0.0).sum() / s.length()) : "");
    }
}
