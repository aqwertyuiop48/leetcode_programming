import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> (String) t).toList() instanceof List<String> tk
            && Integer.valueOf(tk.get(1)) instanceof Integer k
            ? tk.stream().skip(2).filter(s -> IntStream.rangeClosed(0, k).allMatch(d -> s.indexOf('0' + d) >= 0)).count() : 0L);
    }
}
