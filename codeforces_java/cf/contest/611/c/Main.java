import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer h && Integer.valueOf(t[1]) instanceof Integer w
            && Integer.valueOf(w + 1) instanceof Integer W
            && new int[(h + 1) * W] instanceof int[] ph && new int[(h + 1) * W] instanceof int[] pv
            && IntStream.range(0, h * w).filter(c -> Integer.valueOf(c / w + 1) instanceof Integer i && Integer.valueOf(c % w + 1) instanceof Integer j
                && (ph[i * W + j] = ph[(i - 1) * W + j] + ph[i * W + j - 1] - ph[(i - 1) * W + j - 1] + (j < w && t[1 + i].charAt(j - 1) == '.' && t[1 + i].charAt(j) == '.' ? 1 : 0)) >= 0
                && (pv[i * W + j] = pv[(i - 1) * W + j] + pv[i * W + j - 1] - pv[(i - 1) * W + j - 1] + (i < h && t[1 + i].charAt(j - 1) == '.' && t[2 + i].charAt(j - 1) == '.' ? 1 : 0)) >= 0).count() >= 0
            ? IntStream.range(0, Integer.parseInt(t[h + 2])).mapToObj(qi -> Integer.valueOf(Integer.parseInt(t[h + 3 + 4 * qi])) instanceof Integer r1 && Integer.valueOf(Integer.parseInt(t[h + 4 + 4 * qi])) instanceof Integer c1
                && Integer.valueOf(Integer.parseInt(t[h + 5 + 4 * qi])) instanceof Integer r2 && Integer.valueOf(Integer.parseInt(t[h + 6 + 4 * qi])) instanceof Integer c2
                ? String.valueOf(ph[r2 * W + c2 - 1] - ph[(r1 - 1) * W + c2 - 1] - ph[r2 * W + c1 - 1] + ph[(r1 - 1) * W + c1 - 1]
                    + pv[(r2 - 1) * W + c2] - pv[(r1 - 1) * W + c2] - pv[(r2 - 1) * W + c1 - 1] + pv[(r1 - 1) * W + c1 - 1]) : "").collect(Collectors.joining("\n")) : "");
    }
}
