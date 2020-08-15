package Builder.Client;

import Builder.beans.Computer;

public class make {
    public static void main(String[] args){

        Computer comp = new Computer.Builder("16GB", "8TB", "inter i7").build();

        Computer comp1 = new Computer.Builder("16GB", "8TB", "inter i7").setGraphicsCardEnable(true).build();
    }
}
