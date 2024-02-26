import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

public class SortTest {

    @Test
    public void sorted() {
        assertEquals(asList(), sort(asList()));
        assertEquals(asList(1), sort(asList(1)));
        assertEquals(asList(1, 2), sort(asList(1, 2)));
        assertEquals(asList(1, 2), sort(asList(2, 1)));
        assertEquals(asList(1, 2, 3), sort(asList(1, 2, 3)));
        assertEquals(asList(1, 2, 3), sort(asList(2, 1, 3)));
        assertEquals(asList(1, 2, 3), sort(asList(1, 3, 2)));


    }

    private List<Integer> sort(List<Integer> list) {

        if (list.size() > 1) {

            for (int firstIndex = 0; firstIndex < list.size() - 1; firstIndex++) {

                int secondIndex = firstIndex + 1;

                if (list.get(firstIndex) > list.get(secondIndex)) {
                    int first = list.get(firstIndex);
                    int second = list.get(secondIndex);
                    list.set(firstIndex, second);
                    list.set(secondIndex, first);
                }

            }


        }

        return list;
    }
}
