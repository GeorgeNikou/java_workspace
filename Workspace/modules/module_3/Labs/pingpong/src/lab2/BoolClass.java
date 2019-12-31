package pingpong;

public class BoolClass {
	
	private volatile boolean boolClass;
	
	public BoolClass(boolean boolClass) {
		this.boolClass = boolClass;
	}

	/**
	 * @return the boolClass
	 */
	public boolean isBoolClass() {
		return boolClass;
	}

	/**
	 * @param boolClass the boolClass to set
	 */
	public void setBoolClass(boolean boolClass) {
		this.boolClass = boolClass;
	}

	
}
