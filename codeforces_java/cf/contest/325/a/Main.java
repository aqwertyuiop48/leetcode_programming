import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> IntStream.generate(() -> Integer.parseInt(st.nextToken())).limit(4).toArray()).toList() instanceof List<int[]> rs
            && Long.valueOf(rs.stream().mapToLong(r -> (long) (r[2] - r[0]) * (r[3] - r[1])).sum()) instanceof Long area
            && Long.valueOf(rs.stream().mapToInt(r -> r[2]).max().getAsInt() - rs.stream().mapToInt(r -> r[0]).min().getAsInt()) instanceof Long w
            && Long.valueOf(rs.stream().mapToInt(r -> r[3]).max().getAsInt() - rs.stream().mapToInt(r -> r[1]).min().getAsInt()) instanceof Long h
            ? w.equals(h) && w * h == area ? "YES" : "NO" : "");
    }
}
