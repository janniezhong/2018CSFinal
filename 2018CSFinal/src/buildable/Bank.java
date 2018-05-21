package buildable;
/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class Bank extends Building{

	public Bank() {
		super("bank.png");
		super.setSize(2);
		super.setRevenue(6);
		super.setHappiness(-2);

	}
}
