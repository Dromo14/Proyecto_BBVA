package cl.kvz.bbva.ccp.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * 
 * @author Américo Faúndez
 *
 */
public class Utils {
	
public String desencriptar (String input)
{
 String output = ""; 
 SecretKeySpec key = new SecretKeySpec(Constants.SEASSAP32.getBytes(), "AES");
 Cipher cipher;
 try {
	   cipher = Cipher.getInstance("AES");
	   cipher.init(Cipher.DECRYPT_MODE, key);
	   byte[] s = cipher.doFinal(input.getBytes());
	   output = new String(s); 
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
 return output;
}

public String encriptar (String input)
{
	 String output = ""; 
	 SecretKeySpec key = new SecretKeySpec(Constants.SEASSAP32.getBytes(), "AES");
	 Cipher cipher;
	 try {
		   cipher = Cipher.getInstance("AES");
		    
		   cipher.init(Cipher.ENCRYPT_MODE, key);
		   byte[] s = cipher.doFinal(input.getBytes());
		   output = new String(s);
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
	 return output;
}

}
