import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new HashMap<String, Integer>() instanceof HashMap<String, Integer> cnt
            && new ArrayDeque<String>() instanceof ArrayDeque<String> st
            && new long[1] instanceof long[] tot
            && Pattern.compile("[A-Za-z]+|\\.").matcher(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining()))
                .results().map(MatchResult::group)
                .allMatch(tk -> tk.equals(".")
                    ? cnt.merge(st.pollLast(), -1, Integer::sum) != null
                    : (tot[0] += cnt.getOrDefault(tk, 0)) >= 0 && cnt.merge(tk, 1, Integer::sum) > 0 && st.add(tk))
            ? tot[0]
            : -1L);
    }
}


