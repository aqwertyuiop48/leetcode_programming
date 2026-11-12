import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().skip(1).filter(l -> l.trim().length() > 0).map(String::trim)
            .sorted(Comparator.comparingLong(l -> Long.parseLong(l.substring(l.lastIndexOf(' ') + 1)))).map(l -> l.substring(0, l.indexOf(' '))).collect(Collectors.joining("\n")));
    }
}
