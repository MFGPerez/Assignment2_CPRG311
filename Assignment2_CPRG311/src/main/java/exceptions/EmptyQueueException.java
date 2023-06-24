package exceptions;

/**
 * Class description:
 *
 * @author Marcel Gallardo (000827700)
 *
 * 
 */
public class EmptyQueueException extends Exception {

	public EmptyQueueException() {
		super("queue is empty");

	}
}
