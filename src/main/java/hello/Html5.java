package hello;

import java.util.List;
import java.util.ArrayList;
//import org.thymeleaf.engine.springintegration.model;

public class Html5 {
	private String vitB;
    private static ArrayList<RadioButton> radioList = new ArrayList<RadioButton>();
    private String radioButtonSelection; 
    // Set up buttons in constructor
    // To do: Expand this to a service class
    
    void Html5() {
    	// I have no idea why I can't use these.
    	RadioButton radio1 = new RadioButton("This is text J","G");
    	RadioButton radio2 = new RadioButton("This is text K","H");
    	RadioButton radio3 = new RadioButton("This is text L","I");
    	radioList.add(radio1);
    	radioList.add(radio2);
    	radioList.add(radio3);
    }
    
    public String getVitB() {
        return vitB;
    }

    public void setVitB(String vitB) {
        this.vitB = vitB;
    }

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
    
    public static ArrayList<RadioButton> findAll() {
    	RadioButton radio1 = new RadioButton("This is text A","D");
    	RadioButton radio2 = new RadioButton("This is text B","E");
    	RadioButton radio3 = new RadioButton("This is text C","F");
    	radioList.add(radio1);
    	radioList.add(radio2);
    	radioList.add(radio3);
    	return radioList;
		//return Arrays.asList(RadioButton.ALL);
	}
}
