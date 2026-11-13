import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday") instanceof List<String> d
            && Integer.valueOf(((d.indexOf(t[1]) - d.indexOf(t[0])) % 7 + 7) % 7) instanceof Integer diff
            ? (diff == 0 || diff == 2 || diff == 3 ? "YES" : "NO") : "");
    }
}
