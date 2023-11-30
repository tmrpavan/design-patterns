import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public abstract class Shape implements Cloneable{
    private String type;
    private String color;

    protected abstract Shape clone() throws CloneNotSupportedException;
}
