package iuh.fit.se.composite;

public class Test {
        public static void main(String[] args) {
            // Tạo thư mục gốc
            DirectoryComponent root = new DirectoryComponent("Root");

            // Tạo thư mục con
            DirectoryComponent documents = new DirectoryComponent("Documents");
            DirectoryComponent pictures = new DirectoryComponent("Pictures");

            // Tạo tập tin
            FileComponent file1 = new FileComponent("Resume.pdf", 120);
            FileComponent file2 = new FileComponent("Profile.jpg", 500);
            FileComponent file3 = new FileComponent("Notes.txt", 30);

            // Thêm tập tin vào thư mục Documents
            documents.add(file1);

            // Thêm tập tin vào thư mục Pictures
            pictures.add(file2);

            // Thêm thư mục và tập tin vào thư mục gốc
            root.add(documents);
            root.add(pictures);
            root.add(file3);

            // Hiển thị toàn bộ hệ thống tập tin
            root.display("");
        }

}
