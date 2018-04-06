package Command;

import Receiver.QuitReciever;

public class QuitCommand implements ICommand {

    private QuitReciever quitReciever;

    public QuitCommand(QuitReciever quitReciever) {
        this.quitReciever = quitReciever;
    }

    @Override
    public void excute() {
        quitReciever.action(0);
    }

    @Override
    public void undo() {
        //nothing
    }
}
