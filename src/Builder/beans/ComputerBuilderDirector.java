package Builder.beans;

public class ComputerBuilderDirector {

    public Computer getBasicComputer(){
        return new Computer.Builder("16GB", "8TB", "inter i7").build();
    }

    public Computer getGraphicCardEnabledComputer(){
        return new Computer.Builder("16GB", "8TB", "inter i7").setGraphicsCardEnable(true).build();
    }
}
