package 람다.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    private void createFruitList() {
        List<JavaFruit> fruits = Arrays.asList(
                new JavaFruit("사과", 1000),
                new JavaFruit("사과", 1200),
                new JavaFruit("사과", 1200),
                new JavaFruit("사과", 1500),
                new JavaFruit("바나나", 3000),
                new JavaFruit("바나나", 3200),
                new JavaFruit("바나나", 2500),
                new JavaFruit("수박", 10000)
        );
    }

    private List<JavaFruit> findApples(List<JavaFruit> fruits) {
        List<JavaFruit> apples = new ArrayList<>();

        for (JavaFruit fruit : fruits) {
            if (fruit.getName().equals("사과")) {
                apples.add(fruit);
            }
        }
        return apples;
    }

    private List<JavaFruit> filterFruits(List<JavaFruit> fruits, JavaFruitFilter filter) {
        List<JavaFruit> results = new ArrayList<>();

        for (JavaFruit fruit : fruits) {
            if (filter.isSelected(fruit)) {
                results.add(fruit);
            }
        }
        return results;
    }

    private List<JavaFruit> filterFruits2(List<JavaFruit> fruits, Predicate<JavaFruit> fruitFilter) {
        return fruits.stream()
                .filter(fruitFilter)
                .collect(Collectors.toList());
    }
}
