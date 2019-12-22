
public class EmptyStackException extends RuntimeException{

	private String stack = "";
	private static String message = "There are no items in the stack";

	public EmptyStackException(){
		super(message);
	}
	public EmptyStackException(Throwable throwable){
		super(message, throwable);
	}
	
}
