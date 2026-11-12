public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            ? (t[1].length() > 26 ? -1 : t[1].length() - (int) t[1].chars().distinct().count()) : "");
    }
}
