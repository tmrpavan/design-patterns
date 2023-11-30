import button.Button;
import button.WinButton;
import checkbox.Checkbox;
import checkbox.WinCheckbox;

public class WinFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
