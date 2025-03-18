package iuh.fit.se.observer;

public class Investor implements Observer{

    private String name;

    public Investor(String name) {
        this.name = name;
    }
    @Override
    public void update() {
        System.out.println(name + " nhận thông báo: Giá cổ phiếu đã thay đổi!");
    }

    @Override
    public void setSubject(Subject s) {

    }
}
