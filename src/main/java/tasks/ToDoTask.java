package tasks;

/**
 * The tasks.ToDoTask class is a child class for tasks.Task
 * to support different specificities of a task
 * as input by user
 */
public final class ToDoTask extends Task {

  /**
   * The String to store the type of task information
   * that identifies a ToDo task
   */
  private final String type = "[T]";

  /**
   * Constructor for a ToDo task
   *
   * @param s the input string to describe the ToDO task
   */
  public ToDoTask(String s) {
    super(s);
  }

  /**
   * To retrieve the information on the type of tasks.Task
   *
   * @return the String description of the type of tasks.Task
   */
  @Override
  public String getType() {
    return this.type;
  }

  @Override
  public String getSaveFormat() {
    if (super.getStatus().equals("[ ]")) {
      return "T" + "|" + this.getTask().strip() + "|" + 0;
    } else {
      return "T" + "|" + this.getTask().strip() + "|" + 1;
    }
  }
}

