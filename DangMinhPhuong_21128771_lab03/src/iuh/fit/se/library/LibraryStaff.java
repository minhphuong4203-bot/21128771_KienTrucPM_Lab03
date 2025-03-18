package iuh.fit.se.library;

class LibraryStaff implements Observer {
    private String name;

    public LibraryStaff(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println("👨‍💼 " + name + " nhận thông báo: " + message);
    }
}