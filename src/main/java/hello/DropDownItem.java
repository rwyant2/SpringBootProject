package hello;

public class DropDownItem {
	private String dropName;
	private String dropValue;
	
	// An empty constructor is fine, too.
	public DropDownItem() {}
	
	// But Imma get all fancy.
	public DropDownItem(String dropName, String dropValue) {
		this.dropName = dropName;
		this.dropValue = dropValue;
	}
	
    public String getDropName() {
        return dropName;
    }
    
    public void setDropName(String dropName) {
        this.dropName = dropName;
    }

    public String getDropValue() {
        return dropValue;
    }
    
    public void setDropValue(String dropValue) {
        this.dropValue = dropValue;
    }
}
