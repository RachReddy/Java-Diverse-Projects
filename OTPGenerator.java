import java.util.*;
public class OTPGenerator {

	public static void main(String[] args) {
		
		// Specify the length of the OTP (e.g., 6 digits)
        int otpLength = 6;

        // Generate and print the OTP
        String otp = generateOTP(otpLength);
        System.out.println("Generated OTP: " + otp);
        
	}
	
	// Function to generate a random OTP of specified length
    static String generateOTP(int length) {
    	
        // Define characters that can be used in the OTP
        String chars = "0123456789";
        
        // Create a StringBuilder to store the OTP
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < length; i++) {
            // Get a random index within the length of the character set
        	int index= (int) (Math.random() * chars.length()); 
            
            // Append the character at the random index to the OTP
            otp.append(chars.charAt(index));
        }

        // Convert StringBuilder to String and return the OTP
        return otp.toString();
    }

}
