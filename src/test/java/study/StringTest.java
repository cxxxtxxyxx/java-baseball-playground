package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split_1(){
        String[] test = "1,2".split(",");

        assertThat(test).containsExactly("1", "2");
    }

    @Test
    void split_2() {
        String[] test = "1".split(",");
        assertThat(test).containsExactly("1");
    }

    @Test
    void subString() {
        String ex = "(1,2)";
        String test = ex.substring(1, ex.length() - 1);
        assertThat(test).isEqualTo("1,2");
    }

    @DisplayName("charAt을 통해 특정 위치 문자열 가져오기")
    @Test
    void charAt(){
        String ex = "abc";
        assertThat(ex.charAt(0)).isEqualTo('a');
        assertThat(ex.charAt(1)).isEqualTo('b');
        assertThat(ex.charAt(2)).isEqualTo('c');

    }

    @DisplayName("charAt에서 발생하는 Exception 테스트 하기")
    @Test
    void charAt_exception(){

    }
}
