import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new PriorityQueue<Integer>() instanceof PriorityQueue<Integer> pq && new ArrayList<String>() instanceof ArrayList<String> out
            && new BufferedReader(new InputStreamReader(System.in)).lines().skip(1).filter(l -> l.length() > 0).filter(l ->
                l.charAt(0) == 'i' ? (Integer.valueOf(l.substring(7)) instanceof Integer x && pq.add(x) && out.add(l))
                : l.charAt(0) == 'r' ? ((pq.isEmpty() ? (pq.add(0) && out.add("insert 0")) : true) && pq.poll() != null && out.add(l))
                : (Integer.valueOf(l.substring(7)) instanceof Integer y
                    && IntStream.generate(() -> 0).takeWhile(z -> !pq.isEmpty() && pq.peek() < y && pq.poll() != null && out.add("removeMin")).count() >= 0
                    && ((pq.isEmpty() || pq.peek() > y) ? (pq.add(y) && out.add("insert " + y)) : true) && out.add(l))).count() >= 0
            ? out.size() + "\n" + String.join("\n", out) : "");
    }
}
