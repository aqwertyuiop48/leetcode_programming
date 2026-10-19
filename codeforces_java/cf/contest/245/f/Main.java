import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().filter(l -> !l.isBlank()).toList() instanceof List<String> ls
            && ls.get(0).trim().split("\\s+") instanceof String[] nm && Long.valueOf(nm[0]) instanceof Long n && Integer.valueOf(nm[1]) instanceof Integer m
            && ls.stream().skip(1).mapToLong(l -> java.time.LocalDateTime.parse(l.substring(0, 19).replace(' ', 'T')).toEpochSecond(java.time.ZoneOffset.UTC)).toArray() instanceof long[] t
            && new int[]{0} instanceof int[] lo
            ? IntStream.range(0, t.length).filter(i -> IntStream.iterate(0, x -> t[lo[0]] <= t[i] - n, x -> x + 1).allMatch(x -> ++lo[0] >= 0) && i - lo[0] + 1 >= m).findFirst() instanceof OptionalInt fi
                ? fi.isPresent() ? ls.get(fi.getAsInt() + 1).substring(0, 19) : "-1" : "" : "");
    }
}
