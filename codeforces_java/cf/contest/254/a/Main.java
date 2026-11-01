import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] nm && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0
                : st[2] == 0 || ((nm[st[1]++] = st[0]) >= 0 & (st[0] = 0) == 0 & (st[2] = 0) == 0)) || true)
            && new int[5001] instanceof int[] pend && new StringBuilder() instanceof StringBuilder sb
            && IntStream.rangeClosed(1, 2 * nm[0]).allMatch(i -> (pend[nm[i]] == 0 ? (pend[nm[i]] = i) > 0 : sb.append(pend[nm[i]]).append(' ').append(i).append('\n') != null && (pend[nm[i]] = 0) == 0))
            ? Arrays.stream(pend).allMatch(x -> x == 0) ? sb.toString().trim() : "-1" : "");
    }
}
