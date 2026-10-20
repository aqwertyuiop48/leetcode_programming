import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n
            ? (String.valueOf(n).contains("13") ? -1 : IntStream.rangeClosed(2, n).filter(b -> Stream.iterate(n, x -> x > 0, x -> x / b).map(x -> String.valueOf(x % b)).reduce("", (acc, d) -> d + acc).contains("13")).count()) : "");
    }
}
