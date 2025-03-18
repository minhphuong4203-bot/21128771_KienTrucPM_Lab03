package iuh.fit.se.adapter;

public class ObjectAdapter implements DataAdapter {
    private XmlParser xmlParser;

    public ObjectAdapter(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }

    @Override
    public String convertToJson(String xmlData) {
        String tag = xmlParser.extractTag(xmlData);
        String value = xmlParser.extractValue(xmlData);
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
