import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).toLowerCase() instanceof String doc
            && (Integer) Arrays.stream(new String[]{"trade", "export", "import", "tariff", "market", "price", "customs", "goods", "sales", "tax"}).mapToInt(w -> doc.split(w, -1).length - 1).sum() instanceof Integer trade
            && (Integer) Arrays.stream(new String[]{"the", "of", "and", "to", "in"}).mapToInt(w -> doc.split("\\b" + w + "\\b", -1).length - 1).sum() instanceof Integer common
            ? trade >= 3 ? 3 : common % 2 == 0 ? 1 : 2 : 0);
    }


}
