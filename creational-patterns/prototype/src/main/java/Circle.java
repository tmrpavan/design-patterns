import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class Circle extends Shape{
    private long radius;

    @Builder
    public Circle(String type, String color, long radius) {
        super(type, color);
        this.radius = radius;
    }

    private Circle(Circle circle){
        super(circle.getType(), circle.getColor());
        this.radius = circle.getRadius();
    }
    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return new Circle(this);
    }
}
