import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Double) Double.parseDouble(tk.nextToken()) instanceof Double h && (Double) Double.parseDouble(tk.nextToken()) instanceof Double p
            && IntStream.range(0, n + 2).mapToDouble(i -> i == 0 ? -1e18 : i == n + 1 ? 1e18 : 0).toArray() instanceof double[] X
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).sorted().toArray() instanceof int[] xs
            && IntStream.range(0, n).allMatch(i -> (X[i + 1] = xs[i]) > -1e17)
            && new int[n + 2] instanceof int[] RR && new int[n + 2] instanceof int[] LL
            && IntStream.rangeClosed(1, n).map(i -> n + 1 - i).allMatch(i -> (RR[i] = i < n && X[i + 1] - X[i] < h ? RR[i + 1] : i) > 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> (LL[i] = i > 1 && X[i] - X[i - 1] < h ? LL[i - 1] : i) > 0)
            && (Integer) ((n + 2) * (n + 3) - (n + 2) * (n + 1) / 2 + 2) instanceof Integer T && new double[4 * T] instanceof double[] E
            && IntStream.rangeClosed(1, n).map(i -> n + 1 - i).allMatch(l -> IntStream.range(0, 4 * (n - l + 1)).allMatch(c -> (E[(((c % 4)) * T + (l) * (n + 3) - (l) * ((l) - 1) / 2 + ((l + c / 4) - l + 1))] = 0.5 * (p * (X[l] - Math.max(X[l] - h, (((c % 4) >> 1) == 1 ? X[l - 1] + h : X[l - 1])) + E[((((c % 4) & 1)) * T + (l + 1) * (n + 3) - (l + 1) * ((l + 1) - 1) / 2 + ((l + c / 4) - l))]) + (1 - p) * (Math.min(X[Math.min(RR[l], (l + c / 4))] + h, Math.min(RR[l], (l + c / 4)) - (l + c / 4) == 0 ? (((c % 4) & 1) == 1 ? X[(l + c / 4) + 1] - h : X[(l + c / 4) + 1]) : 1e30) - X[l] + E[((2 + ((c % 4) & 1)) * T + (Math.min(RR[l], (l + c / 4)) + 1) * (n + 3) - (Math.min(RR[l], (l + c / 4)) + 1) * ((Math.min(RR[l], (l + c / 4)) + 1) - 1) / 2 + ((l + c / 4) - Math.min(RR[l], (l + c / 4))))])) + 0.5 * ((1 - p) * (Math.min(X[(l + c / 4)] + h, (((c % 4) & 1) == 1 ? X[(l + c / 4) + 1] - h : X[(l + c / 4) + 1])) - X[(l + c / 4)] + E[((((c % 4) >> 1) * 2) * T + (l) * (n + 3) - (l) * ((l) - 1) / 2 + ((l + c / 4) - l))]) + p * (X[(l + c / 4)] - Math.max(X[Math.max(LL[(l + c / 4)], l)] - h, Math.max(LL[(l + c / 4)], l) - l == 0 ? (((c % 4) >> 1) == 1 ? X[l - 1] + h : X[l - 1]) : -1e30) + E[((((c % 4) >> 1) * 2 + 1) * T + (l) * (n + 3) - (l) * ((l) - 1) / 2 + (Math.max(LL[(l + c / 4)], l) - l))]))) > -1e30))
            ? String.format(Locale.US, "%.9f", E[((0) * T + (1) * (n + 3) - (1) * ((1) - 1) / 2 + (n))]) : "");
    }
}
