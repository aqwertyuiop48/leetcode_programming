import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new BufferedReader(new InputStreamReader(System.in)).lines().toList()).ifPresent(l -> Optional.of(l.get(1).trim()).ifPresent(a -> Optional.of(l.size() > 2 ? l.get(2).trim() : "").ifPresent(b -> System.out.print(a.length() + b.length() - 2 * IntStream.range(0, Math.min(a.length(), b.length())).takeWhile(i -> a.charAt(i) == b.charAt(i)).count() <= Long.parseLong(l.get(0).trim()) ? "Yes" : "No"))));
    }
}




