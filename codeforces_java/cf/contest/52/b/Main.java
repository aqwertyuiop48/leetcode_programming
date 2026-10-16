import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new BufferedReader(new InputStreamReader(System.in)).lines().filter(l -> !l.isBlank()).skip(1).toList() instanceof List<String> g
            && g.stream().mapToLong(r -> r.chars().filter(c -> c == '*').count()).toArray() instanceof long[] rc
            && IntStream.range(0, g.get(0).length()).mapToLong(j -> g.stream().filter(r -> r.charAt(j) == '*').count()).toArray() instanceof long[] cc
            ? IntStream.range(0, g.size()).mapToLong(i -> IntStream.range(0, cc.length).filter(j -> g.get(i).charAt(j) == '*').mapToLong(j -> (rc[i] - 1) * (cc[j] - 1)).sum()).sum()
            : 0L);
    }
}



