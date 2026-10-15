import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).readLine() instanceof String line
            && Pattern.compile("\\d+|,|\\.\\.\\.").matcher(line).results().map(MatchResult::group).toArray(String[]::new) instanceof String[] tk
            ? IntStream.range(0, tk.length).mapToObj(i -> (i == 0 ? "" : tk[i - 1].equals(",") || tk[i].equals("...") || (Character.isDigit(tk[i - 1].charAt(0)) && Character.isDigit(tk[i].charAt(0))) ? " " : "") + tk[i]).collect(Collectors.joining()) : "");
    }
}

