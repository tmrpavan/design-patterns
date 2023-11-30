package checkbox;

public interface Checkbox {
    default void show(){
        System.out.println(this.getClass());
    }
}
