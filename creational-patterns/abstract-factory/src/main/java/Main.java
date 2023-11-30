import button.Button;
import checkbox.Checkbox;

public class Main {
    public static void main(String[] args) {
        UIFactory macUiFactory = UIFactory.get("win");
        Button macButton = macUiFactory.createButton();
        macButton.show();
        Checkbox macCheckbox = macUiFactory.createCheckbox();
        macCheckbox.show();

        UIFactory winUiFactory = UIFactory.get("mac");
        Button winButton = winUiFactory.createButton();
        winButton.show();
        Checkbox winCheckbox = winUiFactory.createCheckbox();
        winCheckbox.show();
    }
}
