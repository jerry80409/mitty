package encode_and_decode_tinyurl;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class EncodeAndDecodeTinyUrlTest {

    @Test
    void encodeAndDecode() {
        String url = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = EncodeAndDecodeTinyUrl.encode(url);
        log.info("shortUrl: {}", shortUrl);
        assertEquals(url, EncodeAndDecodeTinyUrl.decode(shortUrl));
    }

    @Test
    void md5Digest() throws NoSuchAlgorithmException {
        String url = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = EncodeAndDecodeTinyUrl.md5Digest(url);
        assertEquals(32, shortUrl.length());
        assertEquals("9871c3914430c4a8940cce673174dcf0", shortUrl);
    }
}