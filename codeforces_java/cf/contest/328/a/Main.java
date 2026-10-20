import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            ? (t[1] - t[0] == t[2] - t[1] && t[2] - t[1] == t[3] - t[2] ? t[3] + t[1] - t[0]
                : t[1] * t[1] == t[0] * t[2] && t[2] * t[2] == t[1] * t[3] && t[3] * t[3] % t[2] == 0 ? t[3] * t[3] / t[2] : 42) : "");
    }
}
