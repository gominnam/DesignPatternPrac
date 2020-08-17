package Behavior_Patterns.Observer.beans;

public class DeliveryWareHouseCenter implements Observer{
    private String location;

    @Override
    public void update(String location) {
        this.location = location;
        showLocation();
    }

    public void showLocation(){
        System.out.println("Notification at WareHouse - Current Location : " + location);
    }
}
