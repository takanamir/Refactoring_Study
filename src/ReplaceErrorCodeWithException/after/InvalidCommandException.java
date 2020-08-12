package ReplaceErrorCodeWithException.after;

public class InvalidCommandException extends Exception {
	public InvalidCommandException(String name) {
		super(name);
	}

	public InvalidCommandException() {
	}
}