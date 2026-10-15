import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Pattern.compile("^([A-Za-z0-9_]{1,16})@([A-Za-z0-9_]{1,16}(?:\\.[A-Za-z0-9_]{1,16})*)(?:/([A-Za-z0-9_]{1,16}))?$").matcher(s.next()) instanceof Matcher m
            && m.matches() && m.group(2).length() <= 32 ? "YES" : "NO"));
    }
}



