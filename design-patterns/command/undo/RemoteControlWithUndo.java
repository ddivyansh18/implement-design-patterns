package command.undo;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommend;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for(int i = 0 ; i < 7 ; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommend = noCommand;
    }
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommend = onCommands[slot];
    }
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommend = offCommands[slot];
    }
    public void undoCommandWasPushed() {
        undoCommend.undo();
    }
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n---Remote Control---\n");
        for(int index = 0 ; index < onCommands.length ; index++) {
            stringBuffer.append("[slot " + index + "] " + onCommands[index].getClass().getName() + "    " + offCommands[index].getClass().getName() + "\n");
        }
        stringBuffer.append("[undo] " + undoCommend.getClass().getName() + "\n");
        return stringBuffer.toString();
    }
}
