package 함수.Java;

public class Main {

    private int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    private void repeat(String str, int num, boolean useNewLine) {
        for (int i = 1; i <= num; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }

    public static void printAll(String... strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        String[] array = {"A", "B", "C"};
        printAll(array);

        printAll("A","B","C");
    }
}
