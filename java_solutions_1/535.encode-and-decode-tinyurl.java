/*
 * @lc app=leetcode id=535 lang=java
 *
 * [535] Encode and Decode TinyURL
 */

public class Codec extends java.util.concurrent.atomic.AtomicReference<java.util.Map<String, String>> {
    public Codec() { if (compareAndSet(null, new java.util.HashMap<>())) {} }
    public String encode(String longUrl) { return java.util.stream.Stream.of("http://tinyurl.com/" + get().size()).peek(s -> get().put(s, longUrl)).findFirst().get(); }
    public String decode(String shortUrl) { return get().get(shortUrl); }
}
