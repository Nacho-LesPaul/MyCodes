/**
 * 
 */
package payments;

/**
 * @author UO270353
 *
 */
public class Payments {
	private String id;
	private double amount;
	private boolean valid;
	
	public Payments(String id, double amount) {
		setId(id);
		setAmount(amount);
	}

	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	private void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isValid() {
		return valid;
	}

	private void setValid(boolean valid) {
		this.valid = valid;
	}
	
}
