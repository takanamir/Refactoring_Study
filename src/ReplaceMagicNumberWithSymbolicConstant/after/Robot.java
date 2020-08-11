package ReplaceMagicNumberWithSymbolicConstant.after;

public class Robot {
	public static final int COMMAND_WALK = 0;
	public static final int COMMAND_STOP = 1;
	public static final int COMMAND_JUMP = 2;
	private final String _name;

	public Robot(String name) {
		_name = name;
	}

	public void order(int command) {
		if (command == COMMAND_WALK) {
			System.out.println(_name + " walks.");
		} else if (command == COMMAND_STOP) {
			System.out.println(_name + " stops.");
		} else if (command == COMMAND_JUMP) {
			System.out.println(_name + " jumps.");
		} else {
			System.out.println("Command error. command = " + command);
		}
	}
}