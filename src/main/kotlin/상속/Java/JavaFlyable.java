package 상속.Java;

public interface JavaFlyable {

    default void act() {
        System.out.println("파닥 파닥");
    }
}
