package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task205Test {
    private final Task205 task205 = new Task205();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("egg", "add", true),
                Arguments.of("foo", "bar", false),
                Arguments.of("paper", "title", true),
                Arguments.of("badc","baba", false)
        );
    }
    @ParameterizedTest
    @MethodSource("generateData")
    void isIsomorphicTest(String s, String t, Boolean expected) {
        boolean actual = task205.isIsomorphic(s,t);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}