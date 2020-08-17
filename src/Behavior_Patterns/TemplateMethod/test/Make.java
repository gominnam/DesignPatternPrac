package Behavior_Patterns.TemplateMethod.test;

import Behavior_Patterns.TemplateMethod.beans.Coffee;
import Behavior_Patterns.TemplateMethod.beans.Tea;

public class Make {

    public static void main(String[] args){

        Tea t = new Tea();
        t.prepare();
        System.out.println();

        Coffee c = new Coffee();
        c.prepare();


    }
}
