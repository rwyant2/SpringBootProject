package hello;

import java.util.List;
import java.util.ArrayList;
//import org.thymeleaf.engine.springintegration.model;

public class Html5 {
	private String vitB;
    private static ArrayList<RadioButton> radioList = new ArrayList<RadioButton>();
    private String radioButtonSelection; 
    private static ArrayList<CheckBox> checkList = new ArrayList<CheckBox>();
    private String checkBoxSelection;
    private static ArrayList<DropDownItem> dropList = new ArrayList<DropDownItem>();
    private String dropDownSelection;
       
    public String getVitB() {
        return vitB;
    }

    public void setVitB(String vitB) {
        this.vitB = vitB;
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
    	this.radioList = radioList;
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
    	this.checkList = checkList;
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
    	this.dropList = dropList;
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
}
