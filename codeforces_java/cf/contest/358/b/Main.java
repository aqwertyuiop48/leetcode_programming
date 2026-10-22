import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> L
            && Integer.valueOf(L.get(0).strip()) instanceof Integer n
            && ("<3" + L.subList(1, n + 1).stream().map(String::strip).collect(Collectors.joining("<3")) + "<3") instanceof String t
            && new int[]{0} instanceof int[] p
            && L.get(n + 1).strip().chars().allMatch(c -> (p[0] += p[0] < t.length() && t.charAt(p[0]) == c ? 1 : 0) >= 0)
            ? p[0] == t.length() ? "yes" : "no" : "");
    }
}
