package iuh.fit.se.library;

public class SingletonTest {
    public static void main(String[] args) {
        Library lib1 = Library.getInstance();
        Library lib2 = Library.getInstance();

        System.out.println("lib1 == lib2: " + (lib1 == lib2)); // Phải in ra "true"
    }
}
