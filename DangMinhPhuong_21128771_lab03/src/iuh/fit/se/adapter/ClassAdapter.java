package iuh.fit.se.adapter;

public class ClassAdapter extends XmlParser implements DataAdapter {

    @Override
    public String convertToJson(String xmlData) {
        String tag = extractTag(xmlData);
        String value = extractValue(xmlData);
        return "{ \"" + tag + "\": \"" + value + "\" }";
    }

    @Override
    public String convertToXml(String jsonData) {
        jsonData = jsonData.replace("{", "").replace("}", "").trim();
        String[] parts = jsonData.split(":");

        String tag = parts[0].replace("\"", "").trim();
        String value = parts[1].replace("\"", "").trim();

        return "<" + tag + ">" + value + "</" + tag + ">";
    }
}
