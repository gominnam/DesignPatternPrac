package Command;

public class MoveRightCommand implements ICommand {
    private Move move;

    public MoveRightCommand(Move move){
        this.move = move;
    }

    @Override
    public void execute(){
        move.moveRight();
    }
}
