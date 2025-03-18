package iuh.fit.se.composite;

import java.util.ArrayList;
import java.util.List;

public class DirectoryComponent implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public DirectoryComponent(String name) {
        this.name = name;
    }

    // Thêm tập tin hoặc thư mục con vào thư mục
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    // Xóa tập tin hoặc thư mục con khỏi thư mục
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    // Xóa toàn bộ nội dung thư mục
    public void clear() {
        System.out.println("Clearing all contents from directory: " + name);
        children.clear();
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "📁 " + name);
        for (FileSystemComponent component : children) {
            component.display(indent + "  ");
        }
    }
}
