import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().skip(1).map(s -> s.trim().split(" ")).map(w -> Arrays.stream(w).mapToDouble(Double::parseDouble).toArray()).map(v -> String.format(Locale.US, "%.10f",
            v[1] == 0 ? 1.0 : v[0] == 0 ? 0.5 : v[0] <= 4 * v[1] ? 0.5 + v[0] / (16 * v[1]) : 1 - v[1] / v[0])).collect(Collectors.joining("\n")));
    }
}
