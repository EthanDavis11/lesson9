
abstract public class Employee {
	protected String name;
	protected int type;
	protected double rate;
	protected int hours;
        
        private static double MIN_RATE = 6.50;
        private static double MAX_RATE = 30.50;
	
        private static double MIN_HOURS = 1;
        private static double MAX_HOURS = 60;
        
        protected static double total_pay=0;
        
	public Employee() {
	 name = "";
	 type = 0;
	 rate = 0;
	 hours = 0;	
	}

	public static double getTotalPay(){
            return total_pay;
        }
        
	static public String getNameRules() {
	 	return "nonblank";
	}

	static public String getTypeRules() {
		return "1 or 2";
	}


	static public String getRateRules() {
		return "between " + MIN_RATE + " and "+ MAX_RATE + ", inclusive";
	}

	
	static public String getHoursRules() {
		return "between " + MIN_HOURS + " and " + MAX_HOURS + ", inclusive";
	}

	public boolean setName(String nm) {
		if (nm.equals(""))
			return false;
		else{
			name=nm;
			return true;
		}
	}

	
	final public boolean setType(int tp) {
		if (tp != 1 && tp != 2)
			return false;
		else{
			type=tp;
			return true;
		}
	}

	
	final public boolean setRate(double rt) {
		if (rt < MIN_RATE || rt > MAX_RATE)
			return false;
		else{
			rate=rt;
			return true;
		}
	}

	final public boolean setHours(int hrs) {
		if (hrs < MIN_HOURS || hrs > MAX_HOURS)
			return false;
		else{
			hours=hrs;
			return true;
		}
	}

	final public String getName() {
		return name;
	}

	abstract public double getPay();	
}
