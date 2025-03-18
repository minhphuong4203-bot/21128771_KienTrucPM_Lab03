package iuh.fit.se.adapter;

public class Test {
    public static void main(String[] args) {

        String xmlData = "<name>John</name>";
        String jsonData = "{ \"name\": \"John\" }";

        System.out.println("=== Class Adapter ===");
        DataAdapter classAdapter = new ClassAdapter();
        System.out.println("JSON Output: " + classAdapter.convertToJson(xmlData));
        System.out.println("XML Output: " + classAdapter.convertToXml(jsonData));

        System.out.println("\n=== Object Adapter ===");
        XmlParser xmlParser = new XmlParser();
        DataAdapter objectAdapter = new ObjectAdapter(xmlParser);
        System.out.println("JSON Output: " + objectAdapter.convertToJson(xmlData));
        System.out.println("XML Output: " + objectAdapter.convertToXml(jsonData));


    }
}
