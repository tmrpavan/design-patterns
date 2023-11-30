import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class Rectangle extends Shape{
    private long width;
    private long height;

    @Builder
    public Rectangle(String type, String color) {
        super(type, color);
    }

    private Rectangle(Rectangle rectangle){
        super(rectangle.getType(), rectangle.getColor());
        this.height=rectangle.getHeight();
        this.width=rectangle.getWidth();
    }
    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return new Rectangle(this);
    }
}
