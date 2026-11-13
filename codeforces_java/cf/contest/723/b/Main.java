import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+")[1] instanceof String s
            ? Arrays.stream(s.replaceAll("\\([^)]*\\)", "_").split("[^A-Za-z]+")).mapToInt(String::length).max().orElse(0) + " "
                + Pattern.compile("\\(([^)]*)\\)").matcher(s).results().mapToLong(r -> Pattern.compile("[A-Za-z]+").matcher(r.group(1)).results().count()).sum() : "");
    }
}
