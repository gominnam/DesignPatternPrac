package Structural_Patterns.Adapter.beans;

public class ChromeDriver implements WebDriver {

    @Override
    public void getElement() {
        System.out.println("Get element from ChromeWebDriver");
    }

    @Override
    public void selectElement() {
        System.out.println("Set element from ChromeWebDriver");
    }
}
