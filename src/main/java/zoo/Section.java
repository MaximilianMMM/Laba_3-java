package zoo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Section {
    private int sectionId; // Якщо цей ID не використовується, ви можете його видалити
    private String sectionName;
    private String location;

    // Публічний конструктор без параметрів
    public Section() {}

    // Конструктор з параметрами
    @JsonCreator
    public Section(@JsonProperty("sectionName") String sectionName,
                   @JsonProperty("location") String location) {
        this.sectionName = sectionName;
        this.location = location;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionName='" + sectionName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
