package data_structure.linear;

import lombok.*;

import static lombok.AccessLevel.PACKAGE;

@NoArgsConstructor(access = PACKAGE)
@AllArgsConstructor(access = PACKAGE)
class DataStructure {
    /**
     * unique key
     */
    @NonNull
    String key;

    /**
     * value
     */
    @NonNull
    String value;
}
