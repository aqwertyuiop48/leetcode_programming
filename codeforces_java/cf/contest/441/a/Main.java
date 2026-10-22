import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))) instanceof StringTokenizer t
            && Integer.valueOf(t.nextToken()) instanceof Integer n && Integer.valueOf(t.nextToken()) instanceof Integer v
            && IntStream.rangeClosed(1, n).filter(i -> Integer.valueOf(t.nextToken()) instanceof Integer k && IntStream.generate(() -> Integer.parseInt(t.nextToken())).limit(k).min().getAsInt() < v).boxed().toList() instanceof List<Integer> r
            ? r.size() + "\n" + r.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
