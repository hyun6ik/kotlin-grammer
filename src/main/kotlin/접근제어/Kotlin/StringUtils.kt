package 접근제어.Kotlin

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}