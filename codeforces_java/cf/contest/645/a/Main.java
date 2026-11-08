import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Stream.of(new String[]{t[0], t[1]}, new String[]{t[2], t[3]}).map(p -> (p[0] + new StringBuilder(p[1]).reverse()).replace("X", "")).toList() instanceof List<String> l
            ? (l.get(0) + l.get(0)).contains(l.get(1)) ? "YES" : "NO" : "");
    }
}
