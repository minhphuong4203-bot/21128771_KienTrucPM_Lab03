package iuh.fit.se.composite;

import java.nio.file.FileSystem;

public class FileComponent implements FileSystemComponent {
    private String name;
    private int size; // Dung lượng tính bằng KB

    public FileComponent(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "📄 " + name + " (" + size + " KB)");
    }
}
