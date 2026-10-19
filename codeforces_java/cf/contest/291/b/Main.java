import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Pattern.compile("\"([^\"]*)\"|([^ \"]+)").matcher(new Scanner(System.in).nextLine()).results()
            .map(r -> "<" + (r.group(1) != null ? r.group(1) : r.group(2)) + ">").collect(Collectors.joining("\n")));
    }
}
