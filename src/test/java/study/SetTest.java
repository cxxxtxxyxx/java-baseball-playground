package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void size() {
        assertThat(numbers.size()).isEqualTo(3);
    }


    @Test
    void contains() {
        assertThat(numbers.contains(1)).isEqualTo(true);
        assertThat(numbers.contains(2)).isEqualTo(true);
        assertThat(numbers.contains(3)).isEqualTo(true);
        assertThat(numbers.contains(3)).isEqualTo(false);
    }


    // 결과 값이 동일한 경우만 테스트 가능
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 3})
    void containsWithParameterized(int number) {
        assertThat(numbers.contains(number)).isEqualTo(true);
    }

    // 입력 값에 따라 결과 값이 다른 경우
    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "0:false"}, delimiter = ':')
    void containsWithCsvSource(int value, boolean expected) {
        assertThat(numbers.contains(value)).isEqualTo(expected);
    }
}
