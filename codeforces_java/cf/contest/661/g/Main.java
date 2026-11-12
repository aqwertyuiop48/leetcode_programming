public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            ? (t[1].contains(".") ? "f" : "i") + Character.toUpperCase(t[0].charAt(0)) + t[0].substring(1) : "");
    }
}
