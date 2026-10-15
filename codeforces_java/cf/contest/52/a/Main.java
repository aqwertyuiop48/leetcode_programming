import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> L
            && L.get(1).chars().filter(c -> c >= '1' && c <= '3').toArray() instanceof int[] d
            ? d.length - IntStream.rangeClosed('1', '3').map(k -> (int) Arrays.stream(d).filter(c -> c == k).count()).max().getAsInt()
            : 0);
    }
}



