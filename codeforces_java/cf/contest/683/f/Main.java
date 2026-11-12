import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().replaceAll("\\s*([,.])\\s*", "$1 ").replaceAll("\\s+([,.])", "$1").replaceAll("\\s+", " ").trim().toLowerCase() instanceof String s
            ? java.util.regex.Pattern.compile("(^|\\. )([a-z])").matcher(s).replaceAll(m -> m.group(1) + m.group(2).toUpperCase()) : "");
    }
}
