package 상속.Java;

public interface JavaSwimable {

    default void act() {
        System.out.println("어푸 어푸");
    }
}
