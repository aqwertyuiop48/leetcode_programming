import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] bn
            && Long.valueOf(bn[2]) instanceof Long c
            && new long[]{0} instanceof long[] bModC
            && IntStream.range(0, bn[0].length()).allMatch(i -> (bModC[0] = (bModC[0] * 10 + (bn[0].charAt(i) - '0')) % c) >= 0)
            && bn[1].toCharArray() instanceof char[] arr
            && (Integer) IntStream.range(0, arr.length).filter(i -> arr[i] != '0').max().getAsInt() instanceof Integer idx
            && (arr[idx]-- != 0)
            && IntStream.range(idx + 1, arr.length).allMatch(i -> (arr[i] = '9') > 0)
            && new long[]{1} instanceof long[] result
            && new long[]{bModC[0] % c} instanceof long[] cur
            && IntStream.range(0, arr.length).allMatch(x ->
                Integer.valueOf(arr[arr.length - 1 - x] - '0') instanceof Integer d
                && (Long) (cur[0] * cur[0] % c) instanceof Long c2
                && (Long) (c2 * c2 % c) instanceof Long c4
                && (Long) (c4 * c4 % c) instanceof Long c8
                && (result[0] = result[0] * ((d & 1) != 0 ? cur[0] : 1) % c * ((d & 2) != 0 ? c2 : 1) % c * ((d & 4) != 0 ? c4 : 1) % c * ((d & 8) != 0 ? c8 : 1) % c) >= 0
                && (cur[0] = c8 * c2 % c) >= 0)
            && new long[]{(bModC[0] - 1 + c) % c * result[0] % c} instanceof long[] total
            ? (total[0] == 0 ? c : total[0])
            : 0L);
    }
}




