import java.io.IOException;
public class StreamsProject {

	public static void main(String[] args) throws IOException{
		final int VALID_PIN  = 1234;  
	    int scannedPin = 0;
	    String newPin = "";
	    
	    System.out.println("Enter password:");
	    char[] s1 = new char [4];
	    for(int i=0; i<4; i++)
	    	s1[i] = (char)System.in.read();
	    for(int i=0; i<4; i++)
	    	newPin += s1[i];
	    scannedPin = Integer.parseInt(newPin);
	    System.out.println("Account accessible? " + (scannedPin == VALID_PIN));
	}

}
