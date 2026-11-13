import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split(",") instanceof String[] tk
            && Integer.valueOf(tk.length / 2) instanceof Integer n
            && new int[n + 1] instanceof int[] rem && new int[n] instanceof int[] lv && new int[]{0} instanceof int[] sp
            && IntStream.range(0, n).filter(i -> IntStream.generate(() -> 0).takeWhile(z -> sp[0] > 0 && rem[sp[0] - 1] == 0).filter(z -> --sp[0] < 0).count() >= 0
                && (lv[i] = sp[0] + 1) > 0 && (sp[0] == 0 || --rem[sp[0] - 1] >= 0) && (rem[sp[0]++] = Integer.parseInt(tk[2 * i + 1].trim())) < 0).count() >= 0
            && Integer.valueOf(Arrays.stream(lv).max().orElse(0)) instanceof Integer D
            && new int[D + 2] instanceof int[] start && IntStream.range(0, n).filter(i -> ++start[lv[i] + 1] < 0).count() >= 0
            && IntStream.rangeClosed(1, D + 1).filter(l -> (start[l] += start[l - 1]) < 0).count() >= 0
            && new int[D + 2] instanceof int[] fill && new int[n] instanceof int[] ord
            && IntStream.range(0, n).filter(i -> (ord[start[lv[i]] + fill[lv[i]]++] = i) < 0).count() >= 0
            ? D + "\n" + IntStream.rangeClosed(1, D).mapToObj(l -> IntStream.range(start[l], start[l + 1]).mapToObj(j -> tk[2 * ord[j]].trim()).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
