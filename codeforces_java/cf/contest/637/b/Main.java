import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            ? IntStream.range(1, t.length).mapToObj(i -> t[t.length - i]).distinct().collect(Collectors.joining("\n")) : "");
    }
}
