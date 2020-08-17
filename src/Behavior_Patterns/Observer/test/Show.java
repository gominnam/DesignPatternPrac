package Behavior_Patterns.Observer.test;

import Behavior_Patterns.Observer.beans.*;

public class Show {

    public static void main(String[] args){
        DeliveryData topic = new DeliveryData();

        Observer obj1 = new Seller();
        Observer obj2 = new User();
        Observer obj3 = new DeliveryWareHouseCenter();

        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        topic.locationChanged();
        System.out.println();

        topic.unregister(obj3);
        topic.locationChanged();
    }
}
