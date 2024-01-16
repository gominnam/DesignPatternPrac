package Command;

public class MoveUpCommand implements ICommand {
    private Move move;

    public MoveUpCommand(Move move){
        this.move = move;
    }

    @Override
    public void execute(){
        move.moveUp();
    }
}
