package PayPal.payments_students.src.payments;

/**
 * @author UO270353
 *
 */
public class PayPal extends Payments {
	private String username;
	private String password;
	
	PayPal(String username, String password, String id, double amount){
		super(id, amount);
		
	}
}
