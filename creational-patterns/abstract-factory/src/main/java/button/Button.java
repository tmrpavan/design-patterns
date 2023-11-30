package button;

public interface Button {
    default void show(){
        System.out.println(this.getClass());
    }
}
