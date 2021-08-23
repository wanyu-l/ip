import java.util.ArrayList;

public final class ByeCommand extends Command{

  public ByeCommand(ArrayList<String> s) {
    super(s);
  }

  public boolean isExit() {
    return true;
  }

  @Override
  public void execute(TaskList lst, Ui ui, Storage storage) {
    Duke.terminate();
  }
}
