package zoo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HealthStatus {
    private int healthStatusId; // якщо цей ID не використовується, ви можете його видалити
    private String status;

    // Публічний конструктор без параметрів
    public HealthStatus() {}

    // Конструктор з параметрами
    @JsonCreator
    public HealthStatus(@JsonProperty("status") String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HealthStatus{" +
                "status='" + status + '\'' +
                '}';
    }
}
