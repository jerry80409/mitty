package data_structure.linear;

import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SequentialTest {

    @Test
    void findByKey() {
        val sample = new DataStructure[] {
            new DataStructure("key1", "value1"),
            new DataStructure("key2", "value2"),
        };

        val seq = Sequential.init(sample);
        assertEquals("value1", seq.findByKey("key1").value);
        assertEquals("value2", seq.findByKey("key2").value);
    }

    @Test
    void findKeyNotExisted() {
        val sample = new DataStructure[] {
            new DataStructure("key1", "value1"),
            new DataStructure("key2", "value2"),
        };

        val seq = Sequential.init(sample);

        assertNull(seq.findByKey("oops"));
    }

    @Test
    void findByValue() {
        val sample = new DataStructure[] {
            new DataStructure("key1", "value1"),
            new DataStructure("key2", "value1"),
        };

        val seq = Sequential.init(sample);
        assertEquals(2, seq.findByValue("value1").size());
        seq.findByValue("value1").forEach(element -> assertEquals("value1", element.value));
    }

    @Test
    void insert() {
        val sample = new DataStructure[] {
            new DataStructure("key1", "value1"),
            new DataStructure("key2", "value2"),
        };

        val seq = Sequential.init(sample);
        seq.insert(new DataStructure("key3", "value3"));

        assertEquals(3, seq.all().size());
    }

    @Test
    void insertDuplicate() {
        val sample = new DataStructure[] {
            new DataStructure("key1", "value1"),
            new DataStructure("key2", "value2"),
        };

        val seq = Sequential.init(sample);

        assertThrows(RuntimeException.class,
            () -> seq.insert(new DataStructure("key1", "value1")));
    }

    @Test
    void insertOver() {
        val sample = new DataStructure[256];
        IntStream.range(0, 256)
            .forEach(i -> sample[i] = new DataStructure(String.format("key%d", i + 1), String.format("value%d", i + 1)));

        val seq = Sequential.init(sample);

        assertThrows(RuntimeException.class,
            () -> seq.insert(new DataStructure("foo", "foo")));
    }
}