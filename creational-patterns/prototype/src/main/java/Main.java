public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = Circle.builder()
                .color("RED")
                .radius(123L)
                .build();

        Circle cloneCircle = circle.clone();

        System.out.println(circle);
        System.out.println(cloneCircle);
        System.out.println(circle == cloneCircle);
    }
}
