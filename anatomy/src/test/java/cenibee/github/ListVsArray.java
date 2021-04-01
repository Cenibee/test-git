package cenibee.github;

import org.junit.jupiter.api.*;

import java.util.List;
import java.util.Set;

@DisplayName("불변 리스트와 배열의 속도 비교")
public class ListVsArray {

    // ?? 혹시 최초 사용시 초기화가 있을지 모르니
    @BeforeEach
    void beforeEach() {
        List<Integer> l = List.of(1,2);
        int[] a = new int[]{1,2};
    }

    @Nested
    @DisplayName("2차원 동작")
    public class CreateTwoTuple {
        @Test
        @DisplayName("불변 집합 -  1000개 생성하기")
        void createBySet() {
            for (int i = 0; i < 100000; i++) {
                Set<Integer> l = Set.of(1,2);
            }
        }
        @Test
        @DisplayName("불변 리스트 -  1000개 생성하기")
        void createByList() {
            for (int i = 0; i < 100000; i++) {
                List<Integer> l = List.of(1,2);
            }
        }
        @Test
        @DisplayName("int 배열 - 1000개 생성하기")
        void createByIntArray() {
            for (int i = 0; i < 100000; i++) {
                int[] a = new int[]{1,2};
            }
        }
        @Test
        @DisplayName("Integer 배열 - 1000개 생성하기")
        void createByIntegerArray() {
            for (int i = 0; i < 100000; i++) {
                Integer[] a = new Integer[]{1,2};
            }
        }
    }
}
