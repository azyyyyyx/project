package radiocare.Exception;

public class NegativeAge extends Exception{
	public NegativeAge() {
		super("NegativeAge");
	}
	public NegativeAge(String message) {
		super(message);
	}
}