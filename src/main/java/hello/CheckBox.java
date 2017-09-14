package hello;

public class CheckBox {
	private String checkName;
	private String checkValue;
	
	// An empty constructor is fine, too.
	public CheckBox() {}
	
	// But Imma get all fancy.
	public CheckBox(String checkName, String checkValue) {
		this.checkName = checkName;
		this.checkValue = checkValue;
	}
	
    public String getCheckName() {
        return checkName;
    }
    
    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public String getCheckValue() {
        return checkValue;
    }
    
    public void setCheckValue(String checkValue) {
        this.checkValue = checkValue;
    }
}
