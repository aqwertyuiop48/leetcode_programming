import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new ArrayDeque<int[]>() instanceof ArrayDeque<int[]> st
            && new ArrayList<Integer>() instanceof ArrayList<Integer> res
            && Pattern.compile("</?\\w+>").matcher(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining()))
                .results().map(MatchResult::group)
                .allMatch(tok -> tok.equals("<table>") ? st.add(new int[1]) : tok.equals("<td>") ? st.peekLast()[0]++ >= 0 : tok.equals("</table>") ? res.add(st.pollLast()[0]) : true)
            ? res.stream().sorted().map(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}



