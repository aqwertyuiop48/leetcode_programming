public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && t[0].replaceFirst("^0+", "") instanceof String a && t[1].replaceFirst("^0+", "") instanceof String b
            ? (a.length() != b.length() ? (a.length() < b.length() ? "<" : ">") : a.compareTo(b) < 0 ? "<" : a.compareTo(b) > 0 ? ">" : "=") : "");
    }
}
