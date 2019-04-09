package model;

/**
 * when a username isn't found in the players file, this exception is thrown.
 * 
 * @author Shaun Davis
 *
 */

@SuppressWarnings("serial")
public class PlayerNotFoundException extends Exception {

	public PlayerNotFoundException() {
		this("Player isn't present in the list of registered players.");
	}

	public PlayerNotFoundException(String msg) {
		super(msg);
	}
	
}
