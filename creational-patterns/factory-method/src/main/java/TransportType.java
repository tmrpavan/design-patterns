import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TransportType {
    SEA("SEA"),
    ROAD("ROAD");
    private final String type;
}
