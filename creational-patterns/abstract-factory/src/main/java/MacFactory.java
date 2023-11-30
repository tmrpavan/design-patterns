import button.Button;
import button.MacButton;
import checkbox.Checkbox;
import checkbox.MacCheckbox;

public class MacFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
