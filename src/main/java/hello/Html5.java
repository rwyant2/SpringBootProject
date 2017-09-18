package hello;

import java.util.ArrayList;

public class Html5 {
	private String textField;
    private static ArrayList<RadioButton> radioList = new ArrayList<RadioButton>();
    private String radioButtonSelection; 
    private static ArrayList<CheckBox> checkList = new ArrayList<CheckBox>();
    private String checkBoxSelection;
    private static ArrayList<DropDownItem> dropList = new ArrayList<DropDownItem>();
    private String dropDownSelection;
    private String textArea;
    
    public String getTextField() {
        return textField;
    }

    public void setTextField(String textField) {
        this.textField = textField;
    }
// Radio button stuff
    public String getRadioButtonSelection() {
        return radioButtonSelection;
    }

    public void setRadioButtonSelection(String radioButtonSelection) {
        this.radioButtonSelection = radioButtonSelection;
    }

    public ArrayList<RadioButton> getRadioList() {
    	return radioList;
    }
    
    public void setRadioList(ArrayList<RadioButton> radioList) {
    	Html5.radioList = radioList;
    }

    public static ArrayList<RadioButton> buildRadioButtons() {    	
    	// In reality I might be reading this from a database or something
    	radioList.clear();
    	RadioButton radio1 = new RadioButton("This is text A","apple");
    	RadioButton radio2 = new RadioButton("This is text B","banana");
    	RadioButton radio3 = new RadioButton("This is text C","cherry");
    	radioList.add(radio1);
    	radioList.add(radio2);
    	radioList.add(radio3);
    	return radioList;
	}
// check box stuff    
    public String getCheckBoxSelection() {
        return checkBoxSelection;
    }

    public void setCheckBoxSelection(String checkBoxSelection) {
        this.checkBoxSelection = checkBoxSelection;
    }    
    
    public ArrayList<CheckBox> getCheckList() {
    	return checkList;
    }
    
    public void setCheckList(ArrayList<CheckBox> checkList) {
    	Html5.checkList = checkList;
    }    

    public static ArrayList<CheckBox> buildCheckBoxes() {    	
    	// In reality I might be reading this from a database or something
    	checkList.clear();
    	CheckBox check1 = new CheckBox("This is #1","one");
    	CheckBox check2 = new CheckBox("This is #2","two");
    	CheckBox check3 = new CheckBox("This is #3","three");
    	checkList.add(check1);
    	checkList.add(check2);
    	checkList.add(check3);
    	return checkList;
	}
 // drop down box stuff    
    public String getDropDownSelection() {
        return dropDownSelection;
    }

    public void setDropDownSelection(String dropDownSelection) {
        this.dropDownSelection = dropDownSelection;
    }    
    
    public ArrayList<DropDownItem> getDropList() {
    	return dropList;
    }
    
    public void setDropList(ArrayList<DropDownItem> dropList) {
    	Html5.dropList = dropList;
    }    

    public static ArrayList<DropDownItem> buildDropDown() {    	
    	// In reality I might be reading this from a database or something
    	dropList.clear();
    	DropDownItem drop1 = new DropDownItem("mustard","yellow");
    	DropDownItem drop2 = new DropDownItem("tomato","red");
    	DropDownItem drop3 = new DropDownItem("onions","white");
    	dropList.add(drop1);
    	dropList.add(drop2);
    	dropList.add(drop3);
    	return dropList;
	}

// text area stuff
    public String getTextArea() {
        return textArea;
    }

    public void setTextArea(String textArea) {
        this.textArea = textArea;
    }
}
