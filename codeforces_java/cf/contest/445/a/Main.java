import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().toList() instanceof List<String> ls
            && new StringTokenizer(ls.get(0)) instanceof StringTokenizer t && Integer.valueOf(t.nextToken()) instanceof Integer n
            ? IntStream.range(0, n).mapToObj(i -> IntStream.range(0, ls.get(i + 1).length()).mapToObj(j -> ls.get(i + 1).charAt(j) == '-' ? "-" : (i + j) % 2 == 0 ? "B" : "W")
                .collect(Collectors.joining())).collect(Collectors.joining("\n")) : "");
    }
}
