package Command;

public class MoveDownCommand implements ICommand {
    private Move move;

    public MoveDownCommand(Move move){
        this.move = move;
    }

    @Override
    public void execute(){
        move.moveDown();
    }
}
