package iuh.fit.se.adapter;

public interface DataAdapter {
    String convertToJson(String xmlData);
    String convertToXml(String jsonData);
}
