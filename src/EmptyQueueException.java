
public class EmptyQueueException extends RuntimeException{
	
	private String queue = "";
	private static String message = "There are no items in the queue";

	public EmptyQueueException(){
		super(message);
	}
	public EmptyQueueException(Throwable throwable){
		super(message, throwable);
	}
	
}
