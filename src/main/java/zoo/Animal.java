package zoo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Animal implements Comparable<Animal> {
    private String name;
    private String gender;
    private String birthDate;
    private String arrivalDate;
    private HealthStatus healthStatus;
    private Section section;
    private String foodName;

    // Публічний конструктор без параметрів
    public Animal() {}

    // Конструктор з параметрами для використання з Builder
    @JsonCreator
    protected Animal(AnimalBuilder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.birthDate = builder.birthDate;
        this.arrivalDate = builder.arrivalDate;
        this.healthStatus = builder.healthStatus;
        this.section = builder.section;
        this.foodName = builder.foodName;
    }

    // Геттери
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public Section getSection() {
        return section;
    }

    public String getFoodName() {
        return foodName;
    }

    @Override
    public int compareTo(Animal other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", healthStatus=" + healthStatus +
                ", section=" + section +
                ", food='" + foodName + '\'' +
                '}';
    }
}
