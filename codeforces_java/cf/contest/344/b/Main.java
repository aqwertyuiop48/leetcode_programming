import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer a && Integer.valueOf(it.next()) instanceof Integer b && Integer.valueOf(it.next()) instanceof Integer c
            ? ((a + b + c) % 2 != 0 || a + b < c || b + c < a || c + a < b ? "Impossible" : (a + b - c) / 2 + " " + (b + c - a) / 2 + " " + (c + a - b) / 2) : "");
    }
}
