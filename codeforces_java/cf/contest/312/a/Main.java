import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().skip(1)
            .map(s -> s.endsWith("lala.") && !s.startsWith("miao.") ? "Freda's" : s.startsWith("miao.") && !s.endsWith("lala.") ? "Rainbow's" : "OMG>.< I don't know!")
            .collect(Collectors.joining("\n")));
    }
}
