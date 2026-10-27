import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().toList() instanceof List<String> ls
            && Integer.valueOf(Integer.parseInt(ls.get(0).trim())) instanceof Integer n
            && ls.subList(1, n + 1).stream().map(l -> l.replaceAll("[(),]", " ").trim().split("\\s+")).toList() instanceof List<String[]> procs
            && Integer.valueOf(Integer.parseInt(ls.get(n + 1).trim())) instanceof Integer m
            && ls.subList(n + 2, n + 2 + m).stream().map(l -> l.trim().split("\\s+")).collect(Collectors.toMap(a -> a[1], a -> a[0])) instanceof Map<String, String> vars
            && Integer.valueOf(Integer.parseInt(ls.get(n + m + 2).trim())) instanceof Integer k
            ? ls.subList(n + m + 3, n + m + 3 + k).stream().map(l -> l.replaceAll("[(),]", " ").trim().split("\\s+")).map(call -> String.valueOf(procs.stream()
                .filter(p -> p[1].equals(call[0]) && p.length - 2 == call.length - 1
                    && IntStream.range(1, call.length).allMatch(i -> p[i + 1].equals("T") || p[i + 1].equals(vars.get(call[i])))).count())).collect(Collectors.joining("\n"))
            : "");
    }
}

