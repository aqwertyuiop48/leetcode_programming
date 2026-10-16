import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Long.valueOf(t[1]) instanceof Long m
            && Integer.valueOf((int) t[2]) instanceof Integer k
            && IntStream.range(0, k).mapToLong(i -> (t[4 + 2 * i] - 1) * m + t[5 + 2 * i] - 1).sorted().toArray() instanceof long[] w
            ? IntStream.range(0, (int) t[3]).mapToObj(q -> Long.valueOf((t[4 + 2 * k + 2 * q] - 1) * m + t[5 + 2 * k + 2 * q] - 1) instanceof Long key
                && Integer.valueOf(Arrays.binarySearch(w, key)) instanceof Integer p
                ? (p >= 0 ? "Waste" : new String[]{"Carrots", "Kiwis", "Grapes"}[(int) ((key + p + 1) % 3)]) : "").collect(Collectors.joining("\n")) : "");
    }
}



