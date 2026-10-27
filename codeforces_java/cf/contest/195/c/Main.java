import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().skip(1).map(String::trim).filter(l -> !l.isEmpty()).toList() instanceof List<String> ls
            && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> st
            && Integer.valueOf(IntStream.range(0, ls.size()).filter(i -> ls.get(i).startsWith("throw")).findFirst().orElse(-1)) instanceof Integer t
            && ls.get(t).substring(ls.get(t).indexOf('(') + 1, ls.get(t).lastIndexOf(')')).trim() instanceof String ty
            ? IntStream.range(0, ls.size()).mapToObj(i -> ls.get(i).startsWith("try") ? st.offerFirst(i) ? (Object[]) null : null
                    : ls.get(i).startsWith("catch") && st.pop() instanceof Integer ti
                        ? new Object[]{ti, i, ls.get(i).substring(ls.get(i).indexOf('(') + 1, ls.get(i).indexOf(',')).trim(), ls.get(i).substring(ls.get(i).indexOf('"') + 1, ls.get(i).lastIndexOf('"'))} : null)
                .filter(r -> r != null && (Integer) r[0] < t && (Integer) r[1] > t && ty.equals(r[2]))
                .map(r -> (String) r[3]).findFirst().orElse("Unhandled Exception")
            : "");
    }
}

