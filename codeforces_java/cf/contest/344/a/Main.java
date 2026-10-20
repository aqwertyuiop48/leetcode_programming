import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && IntStream.range(0, n).mapToObj(i -> it.next()).toList() instanceof List<String> s
            ? 1 + IntStream.range(1, n).filter(i -> !s.get(i).equals(s.get(i - 1))).count() : "");
    }
}
