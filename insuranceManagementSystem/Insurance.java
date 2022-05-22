package insuranceManagementSystem;

import java.util.Date;

public abstract class Insurance {
	String insuranceName;
	double insurancePrice;
	Date insuranceBegin;
	Date insuranceFinish;
	
	
	abstract void calculate();
}
