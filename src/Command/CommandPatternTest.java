package Command;

public class CommandPatternTest {
    public static void main(String[] args){
        Move move = new Move();

        MoveUpCommand moveUpCommand = new MoveUpCommand(move);
        MoveDownCommand moveDownCommand = new MoveDownCommand(move);
        MoveLeftCommand moveLeftCommand = new MoveLeftCommand(move);
        MoveRightCommand moveRightCommand = new MoveRightCommand(move);
        GameButtonController gameButtonController = new GameButtonController();

        gameButtonController.setCommand(moveUpCommand);
        //람다 표현식 gameButtonController.setCommand(() -> move.moveUp());
        gameButtonController.pressButton();

        gameButtonController.setCommand(moveDownCommand);
        gameButtonController.pressButton();

        gameButtonController.setCommand(moveLeftCommand);
        gameButtonController.pressButton();

        gameButtonController.setCommand(moveRightCommand);
        gameButtonController.pressButton();
    }
}

/*
    커멘트 패턴(Command Patter)은 `request`을 객체의 형태로 캡슐화하는 것을 목표로 한다.
    이 패턴은 `request`가 서로 다른 사용자, 시간, 프로젝트에 따라 달라질 수 있을 때 유용하다.
    요청자와 수신자의 결합도를 낮추기 때문이다.
    즉, `request`을 객체로 캡슐화함으로써 요청 내역을 큐에 저장하거나 로그로 기록하고, 작업 취소 기능을 지원하고, 작업을 순차적으로 실행하거나, 원격으로 객체를 실행할 수 있는 방법을 제공한다.

 */