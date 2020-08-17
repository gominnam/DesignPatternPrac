package Structural_Patterns.Adapter.beans;

public class WebDriverAdapter implements WebDriver{

    IEDriver ieDriver;

    public WebDriverAdapter(IEDriver iedriver){
        this.ieDriver = iedriver;
    }

    @Override
    public void getElement() {
        ieDriver.findElement();
    } // name은 같지만 기능은 idDriver로 작동 사용자에게 일관적이여서 좋다.

    @Override
    public void selectElement() {
        ieDriver.clickElement();
    }
}
