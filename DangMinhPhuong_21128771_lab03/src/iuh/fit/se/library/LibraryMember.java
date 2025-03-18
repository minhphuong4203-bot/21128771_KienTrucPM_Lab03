package iuh.fit.se.library;

class LibraryMember implements Observer {
    private String name;

    public LibraryMember(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println("📢 " + name + " nhận thông báo: " + message);
    }
}