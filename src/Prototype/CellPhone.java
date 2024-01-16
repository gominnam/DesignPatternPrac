package Prototype;

public class CellPhone implements Cloneable{
    private String model;

    public CellPhone(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    @Override
    public CellPhone clone(){
        try{
            return (CellPhone) super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}
