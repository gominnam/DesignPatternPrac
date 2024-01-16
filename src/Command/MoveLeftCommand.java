package Command;

public class MoveLeftCommand implements ICommand {
    private Move move;

    public MoveLeftCommand(Move move){
        this.move = move;
    }

    @Override
    public void execute(){
        move.moveLeft();
    }
}
