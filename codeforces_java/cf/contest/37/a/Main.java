import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).skip(1).mapToInt(Integer::parseInt).boxed()
            .collect(Collectors.groupingBy(x -> x, Collectors.counting())) instanceof Map<Integer, Long> c
            ? Collections.max(c.values()) + " " + c.size()
            : "");
    }
}




