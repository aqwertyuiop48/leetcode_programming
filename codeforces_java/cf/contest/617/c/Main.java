import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> (Long.parseLong(t[5 + 2 * i]) - Long.parseLong(t[1])) * (Long.parseLong(t[5 + 2 * i]) - Long.parseLong(t[1])) + (Long.parseLong(t[6 + 2 * i]) - Long.parseLong(t[2])) * (Long.parseLong(t[6 + 2 * i]) - Long.parseLong(t[2]))).toArray() instanceof long[] d1
            && IntStream.range(0, n).mapToLong(i -> (Long.parseLong(t[5 + 2 * i]) - Long.parseLong(t[3])) * (Long.parseLong(t[5 + 2 * i]) - Long.parseLong(t[3])) + (Long.parseLong(t[6 + 2 * i]) - Long.parseLong(t[4])) * (Long.parseLong(t[6 + 2 * i]) - Long.parseLong(t[4]))).toArray() instanceof long[] d2
            ? IntStream.rangeClosed(0, n).mapToLong(c -> (c == 0 ? 0L : d1[c - 1]) + IntStream.range(0, n).filter(i -> d1[i] > (c == 0 ? 0L : d1[c - 1])).mapToLong(i -> d2[i]).max().orElse(0L)).min().getAsLong() : "");
    }
}
