package iuh.fit.se.adapter;

public class XmlParser {
    public String extractTag(String xml) {
        return xml.substring(1, xml.indexOf(">"));  // Lấy tên thẻ
    }

    public String extractValue(String xml) {
        return xml.substring(xml.indexOf(">") + 1, xml.lastIndexOf("<")); // Lấy nội dung
    }
}
