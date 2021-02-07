package data_structure.linear;

import lombok.NonNull;
import lombok.val;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Sequential list
 */
class Sequential {

    private static final int DEFAULT_MAX_LENGTH = 256;

    private static Sequential INSTANCE;

    private DataStructure[] data;

    private Sequential(DataStructure[] data) {
        this.data = Arrays.copyOf(data, DEFAULT_MAX_LENGTH);
    }

    /**
     * Singleton instance
     *
     * @param data
     * @return
     */
    static synchronized Sequential init(@NonNull DataStructure[] data) {

        INSTANCE = new Sequential(data);
        return INSTANCE;
    }

    /**
     * insert
     *
     * @param element
     */
    public void insert(DataStructure element) {
        if (duplicateKey(element.key)) {
            throw new RuntimeException("Duplicate key: " + element.key);
        }

        val current = currentPosition();
        if (current >= DEFAULT_MAX_LENGTH) {
            throw new RuntimeException("Over length");
        }
        data[current + 1] = element;
    }

    // delete by key

    /**
     * find by key
     *
     * @param key
     * @return
     */
    public DataStructure findByKey(@NonNull final String key) {
        return Stream.of(data).filter(Objects::nonNull)
            .filter(element -> key.equals(element.key))
            .findFirst()
            .orElse(null);
    }

    /**
     * find by value
     *
     * @param value
     * @return
     */
    public List<DataStructure> findByValue(@NonNull final String value) {
        return Stream.of(data).filter(Objects::nonNull).filter(e -> value.equals(e.value)).collect(toList());
    }

    /**
     * all
     *
     * @return
     */
    public List<DataStructure> all() {
        return Stream.of(data).filter(Objects::nonNull).collect(toList());
    }

    /**
     * check duplicate key
     *
     * @param key
     * @return
     */
    private boolean duplicateKey(@NonNull final String key) {
        return Stream.of(data).filter(Objects::nonNull)
            .map(element -> element.key)
            .collect(toList()).contains(key);
    }

    /**
     * current position
     *
     * @return
     */
    private int currentPosition() {
        int position = 0;
        for (DataStructure iterator : data) {
            if (Objects.nonNull(iterator)) {
                position++;
            }
        }
        return position;
    }
}
