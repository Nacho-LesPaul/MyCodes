/**
 * 
 */
package payments;

/**
 * @author UO270353
 *
 */
public class CreditCard extends Payments {
	public static final String MERCHAN_ID = "1111-22";
	private int number;
	private int month;
	private int year;
	
	public CreditCard(int number, int month, int year, String id, double amount) {
		super(id, amount);
		
	}
}
