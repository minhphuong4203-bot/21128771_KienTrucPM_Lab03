package iuh.fit.se.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private List<Observer> investors = new ArrayList<>();
    private String stockName;
    private double price;
    private boolean changed = false; // Biến kiểm tra có thay đổi không

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    @Override
    public void register(Observer obj) {
        investors.add(obj);
        obj.setSubject(this); // Gán Subject cho Observer
    }

    @Override
    public void notifyObserver() {
        if (!changed) return; // Chỉ thông báo nếu có thay đổi
        for (Observer obj : investors) {
            obj.update();
        }
        changed = false; // Reset trạng thái sau khi thông báo
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.price;
    }

    public void setPrice(double newPrice) {
        if (this.price != newPrice) { // Kiểm tra có thực sự thay đổi không
            System.out.println("📢 Cổ phiếu " + stockName + " cập nhật giá: " + newPrice + " USD");
            this.price = newPrice;
            this.changed = true;
            notifyObserver();
        }
    }
}
