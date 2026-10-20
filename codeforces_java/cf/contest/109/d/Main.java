import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        java.util.Optional.of(new String(System.in.readAllBytes()).trim().split("\\s+")).map(tk -> Arrays.stream(tk).mapToInt(Integer::parseInt).toArray()).map(t -> (Integer) t[0] instanceof Integer n && Arrays.copyOfRange(t, 1, n + 1) instanceof int[] a && IntStream.range(0, n).mapToLong(i -> (long) a[i] << 17 | i).sorted().toArray() instanceof long[] ks && new int[n] instanceof int[] tg && new int[n] instanceof int[] who && IntStream.range(0, n).allMatch(j -> (tg[(int) (ks[j] & 131071)] = j) >= 0 && (who[j] = (int) (ks[j] & 131071)) >= 0) && new java.util.ArrayList<String>() instanceof java.util.ArrayList<String> log && IntStream.range(0, n).filter(i -> Integer.toString(a[i]).chars().allMatch(c -> c == '4' || c == '7')).findFirst() instanceof OptionalInt lu ? (lu.isEmpty() ? (IntStream.range(0, n).allMatch(i -> tg[i] == i) ? "0" : "-1") : (Integer) tg[lu.getAsInt()] instanceof Integer home && IntStream.range(0, n).filter(i -> i != home).allMatch(i -> tg[i] == i || ((who[home] == i || (Integer) who[home] instanceof Integer p && (Integer) tg[i] instanceof Integer ti && (tg[p] = ti) >= 0 && (tg[i] = home) >= 0 && (who[ti] = p) >= 0 && (who[home] = i) >= 0 && log.add((p + 1) + " " + (i + 1))) && (Integer) who[i] instanceof Integer q && (Integer) tg[i] instanceof Integer th && (tg[q] = th) >= 0 && (tg[i] = i) >= 0 && (who[th] = q) >= 0 && (who[i] = i) >= 0 && log.add((q + 1) + " " + (i + 1)))) ? log.size() + (log.isEmpty() ? "" : "\n" + String.join("\n", log)) : "") : "").ifPresent(System.out::println);
    }
}
