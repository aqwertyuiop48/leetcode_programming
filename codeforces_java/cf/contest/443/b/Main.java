import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().toList() instanceof List<String> ls
            && ls.get(0).trim() instanceof String s && Integer.valueOf(ls.get(1).trim()) instanceof Integer k
            && Integer.valueOf(s.length()) instanceof Integer n && Integer.valueOf(n + k) instanceof Integer L
            ? 2 * IntStream.rangeClosed(1, L / 2).filter(l -> IntStream.rangeClosed(0, L - 2 * l).anyMatch(i -> IntStream.range(i, i + l)
                .allMatch(j -> j + l >= n || s.charAt(j) == s.charAt(j + l)))).max().getAsInt() : "");
    }
}
