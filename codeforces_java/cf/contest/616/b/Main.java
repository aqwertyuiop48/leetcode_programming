import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n && Integer.valueOf(st.nextToken()) instanceof Integer m
            ? IntStream.range(0, n).map(i -> IntStream.range(0, m).map(j -> Integer.parseInt(st.nextToken())).min().getAsInt()).max().getAsInt() : "");
    }
}
