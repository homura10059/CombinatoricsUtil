import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinatoricsUtilTest {

        @Test
        void combination_list_string_exception() {
                List<String> testList = Collections.singletonList("1");
                CombinatoricsUtil<String> util = new CombinatoricsUtil<>();
                assertThrows(IllegalArgumentException.class, () ->  util.combination(testList, 100));
        }


        @Test
        void combination_list_string_1C1() {
                List<String> testList = Collections.singletonList("1");
                CombinatoricsUtil<String> util = new CombinatoricsUtil<>();
                List<List<String>> resultList = util.combination(testList, 1);

                assertIterableEquals(
                        Collections.singletonList(Collections.singletonList("1")),
                        resultList
                );
        }

        @Test
        void combination_list_string_2C1() {
                List<String> testList = Arrays.asList("1", "2");
                CombinatoricsUtil<String> util = new CombinatoricsUtil<>();
                List<List<String>> resultList = util.combination(testList, 1);

                assertIterableEquals(
                        Arrays.asList(
                                Collections.singletonList("1"),
                                Collections.singletonList("2")
                        ),
                        resultList
                );
        }

        @Test
        void combination_list_string_2C2() {
                List<String> testList = Arrays.asList("1", "2");
                CombinatoricsUtil<String> util = new CombinatoricsUtil<>();
                List<List<String>> resultList = util.combination(testList, 2);

                assertIterableEquals(
                        Collections.singletonList(Arrays.asList("1", "2")),
                        resultList
                );
        }

        @Test
        void combination_list_string_3C2() {
                List<String> testList = Arrays.asList("1", "2", "3");
                CombinatoricsUtil<String> util = new CombinatoricsUtil<>();
                List<List<String>> resultList = util.combination(testList, 2);

                assertIterableEquals(
                        Arrays.asList(
                                Arrays.asList("1", "2"),
                                Arrays.asList("1", "3"),
                                Arrays.asList("2", "3")
                        ),
                        resultList
                );
        }

        @Test
        void combination_list_string_4C2() {
                List<String> testList = Arrays.asList("1", "2", "3", "4");
                CombinatoricsUtil<String> util = new CombinatoricsUtil<>();
                List<List<String>> resultList = util.combination(testList, 2);

                assertIterableEquals(
                        Arrays.asList(
                                Arrays.asList("1", "2"),
                                Arrays.asList("1", "3"),
                                Arrays.asList("1", "4"),
                                Arrays.asList("2", "3"),
                                Arrays.asList("2", "4"),
                                Arrays.asList("3", "4")
                        ),
                        resultList
                );

        }

        @Test
        void combination_list_string_4C3() {
                List<String> testList = Arrays.asList("1", "2", "3", "4");
                CombinatoricsUtil<String> util = new CombinatoricsUtil<>();
                List<List<String>> resultList = util.combination(testList, 3);

                assertIterableEquals(
                        Arrays.asList(
                                Arrays.asList("1", "2", "3"),
                                Arrays.asList("1", "2", "4"),
                                Arrays.asList("1", "3", "4"),
                                Arrays.asList("2", "3", "4")
                        ),
                        resultList
                );
        }

        @Test
        void combination_list_string_4C4() {
                List<String> testList = Arrays.asList("1", "2", "3", "4");
                CombinatoricsUtil<String> util = new CombinatoricsUtil<>();
                List<List<String>> resultList = util.combination(testList, 4);

                assertIterableEquals(
                        Collections.singletonList(Arrays.asList("1", "2", "3", "4")),
                        resultList
                );
        }
}