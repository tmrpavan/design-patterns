import button.Button;
import checkbox.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();

    static UIFactory get(String type){
        if ("win".equalsIgnoreCase(type)){
            return new WinFactory();
        }
        return new MacFactory();
    }
}
