import java.util.*;
import java.util.stream.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            new int[]{Integer.parseInt(sc.nextLine().trim())} instanceof int[] n
            && Pattern.compile("\\[(\\d+):(\\d+) ([ap])\\.m\\.\\]") instanceof Pattern p
            && new long[]{-1, 0, 1} instanceof long[] st
            && IntStream.range(0, n[0]).allMatch(i ->
                sc.nextLine() instanceof String line
                && p.matcher(line) instanceof Matcher m
                && m.find()
                && new long[]{((Integer.parseInt(m.group(1)) % 12) + (m.group(3).equals("p") ? 12 : 0)) * 60 + Integer.parseInt(m.group(2))} instanceof long[] t
                && ((t[0] == st[0] && st[1] < 10) ? (st[1] += 1) >= 0
                    : (t[0] > st[0]) ? ((st[0] = t[0]) >= 0 && (st[1] = 1) >= 0)
                    : ((st[2] += 1) >= 0 && (st[0] = t[0]) >= 0 && (st[1] = 1) >= 0)))
            ? st[2]
            : 0L));
    }
}



