package zoo;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Section section = new Section("Savannah", "Africa Zone");
        HealthStatus healthyStatus = new HealthStatus("Healthy");

        Animal lion = new AnimalBuilder()
                .setName("Lion")
                .setGender("Male")
                .setBirthDate("2020-03-15")
                .setArrivalDate("2021-05-20")
                .setHealthStatus(healthyStatus)
                .setSection(section)
                .setFoodName("Meat")
                .build();

        List<Animal> animals = Arrays.asList(lion);

        // Сериалізація та десериалізація
        try {
            // JSON
            JsonSerializer jsonSerializer = new JsonSerializer();
            File jsonFile = new File("animal.json");
            jsonSerializer.serialize(lion, jsonFile);
            Animal deserializedJsonAnimal = jsonSerializer.deserialize(jsonFile);
            System.out.println("Deserialized from JSON: " + deserializedJsonAnimal);

            // XML
            XmlSerializer xmlSerializer = new XmlSerializer();
            File xmlFile = new File("animal.xml");
            xmlSerializer.serialize(lion, xmlFile);
            Animal deserializedXmlAnimal = xmlSerializer.deserialize(xmlFile);
            System.out.println("Deserialized from XML: " + deserializedXmlAnimal);

            // YAML
            YamlSerializer yamlSerializer = new YamlSerializer();
            File yamlFile = new File("animal.yaml");
            yamlSerializer.serialize(lion, yamlFile);
            Animal deserializedYamlAnimal = yamlSerializer.deserialize(yamlFile);
            System.out.println("Deserialized from YAML: " + deserializedYamlAnimal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
