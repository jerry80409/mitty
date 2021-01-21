package unique_email_addresses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueEmailAddressesTest {

    @Test
    void numUniqueEmails() {
        String[] emails = new String[]{
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        };

        int act = UniqueEmailAddresses.numUniqueEmails(emails);
        assertEquals(2, act);
    }
}