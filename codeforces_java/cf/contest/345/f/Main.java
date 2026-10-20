import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().map(String::trim).filter(l -> !l.isEmpty()).toList() instanceof List<String> ls && new HashMap<String, Set<Integer>>() instanceof HashMap<String, Set<Integer>> mp && new int[1] instanceof int[] ci
            && ls.stream().allMatch(l -> l.startsWith("*") ? mp.computeIfAbsent(Arrays.stream(l.substring(1).trim().toLowerCase().split("\\s+")).collect(Collectors.joining(" ")), k -> new HashSet<>()).add(ci[0]) || true : ++ci[0] > 0)
            && Integer.valueOf(mp.values().stream().mapToInt(Set::size).max().orElse(0)) instanceof Integer mx
            ? mp.entrySet().stream().filter(e -> e.getValue().size() == mx).map(Map.Entry::getKey).sorted().collect(Collectors.joining("\n")) : "");
    }
}
