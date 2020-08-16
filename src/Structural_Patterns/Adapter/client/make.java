package Structural_Patterns.Adapter.client;

import Structural_Patterns.Adapter.beans.ChromeDriver;
import Structural_Patterns.Adapter.beans.IEDriver;
import Structural_Patterns.Adapter.beans.WebDriver;
import Structural_Patterns.Adapter.beans.WebDriverAdapter;

public class make {
    public static void main(String[] args){

        ChromeDriver chromeD = new ChromeDriver();
        chromeD.getElement();
        chromeD.selectElement();

        IEDriver ieD = new IEDriver();
        ieD.findElement();
        ieD.clickElement();

        WebDriver Wd = new WebDriverAdapter(ieD);
        Wd.getElement();
        Wd.selectElement();

    }
}
