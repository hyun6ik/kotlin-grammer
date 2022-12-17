package 접근제어.Java;

public abstract class StringUtils {

    private StringUtils() {}

    public boolean isDirectoryPath(String path) {
        return path.endsWith("/");
    }
}
