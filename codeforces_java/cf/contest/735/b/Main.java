import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n
            && Integer.valueOf(Math.min(Integer.parseInt(tk[1]), Integer.parseInt(tk[2]))) instanceof Integer lo
            && Integer.valueOf(Math.max(Integer.parseInt(tk[1]), Integer.parseInt(tk[2]))) instanceof Integer hi
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk[3 + i])).sorted().toArray() instanceof long[] a
            ? String.format("%.8f", (double) IntStream.range(0, lo).mapToLong(i -> a[n - 1 - i]).sum() / lo
                + (double) IntStream.range(lo, lo + hi).mapToLong(i -> a[n - 1 - i]).sum() / hi) : "");
    }
}
