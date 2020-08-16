package Structural_Patterns.Adapter.beans;

public class WebDriverAdapter implements WebDriver{

    IEDriver ieDriver;

    public WebDriverAdapter(IEDriver iedriver){
        this.ieDriver = iedriver;
    }

    @Override
    public void getElement() {
        ieDriver.findElement();
    }

    @Override
    public void selectElement() {
        ieDriver.clickElement();
    }
}
