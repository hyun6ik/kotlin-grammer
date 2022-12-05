package 반복문.Java;

import java.util.Arrays;
import java.util.List;

public class Main {

    private void ForEach() {
        List<Long> numbers = Arrays.asList(1L, 2L, 3L);
        for (Long number : numbers) {
            System.out.println(number);
        }
    }

    private void originalFor() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
    }

    private void downFor() {
        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
