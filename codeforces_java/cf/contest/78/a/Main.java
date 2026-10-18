import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().limit(3).map(s -> s.chars().filter(c -> "aeiou".indexOf(c) >= 0).count()).collect(Collectors.toList()).equals(List.of(5L, 7L, 5L)) ? "YES" : "NO");
    }
}




