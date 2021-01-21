package encode_and_decode_tinyurl;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.stream.Collectors.joining;

/**
 * https://leetcode.com/problems/encode-and-decode-tinyurl/
 * <p>
 * TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl
 * and it returns a short URL such as http://tinyurl.com/4e9iAk.
 * <p>
 * Design the encode and decode methods for the TinyURL service.
 * There is no restriction on how your encode/decode algorithm should work.
 * You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
 */
class EncodeAndDecodeTinyUrl {

    private static final String baseUrl = "http://tinyurl.com/";
    private static final Map<String, String> HASH_MAP = new HashMap<>();

    /**
     * Encodes a URL to a shortened URL.
     *
     * @param longUrl
     * @return
     */
    static String encode(String longUrl) {
        HASH_MAP.put(String.format("%h", longUrl), longUrl);
        return baseUrl + String.format("%h", longUrl);
    }

    /**
     * Decodes a shortened URL to its original URL.
     *
     * @param shortUrl
     * @return
     */
    static String decode(String shortUrl) {
        return HASH_MAP.get(shortUrl.replace(baseUrl, ""));
    }

    /**
     * 16 bytes MD5 (容易碰撞)
     *
     * @param source
     * @return
     * @throws NoSuchAlgorithmException
     */
    static String md5Digest(String source) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] bytes = md5.digest(source.getBytes(UTF_8));
        return IntStream.range(0, bytes.length)
            .mapToObj(index -> String.format("%02x", bytes[index]))
            .collect(joining());
    }
}
