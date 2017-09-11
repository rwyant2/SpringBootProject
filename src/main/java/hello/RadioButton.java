package hello;

public class RadioButton {
	private String radioName;
	private String radioValue;
	
	// An empty constructor is fine, too.
	public RadioButton() {}
	
	// But Imma get all fancy.
	public RadioButton(String radioName, String radioValue) {
		this.radioName = radioName;
		this.radioValue = radioValue;
	}
	
    public String getRadioName() {
        return radioName;
    }
    
    public void setRadioName(String radioName) {
        this.radioName = radioName;
    }

    public String getRadioValue() {
        return radioValue;
    }
    
    public void setRadioValue(String radioValue) {
        this.radioValue = radioValue;
    }
}
