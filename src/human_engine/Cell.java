package human_engine;

import java.awt.Color;

public class Cell {

    private int value;
    private Color color = Color.black;
    
    private boolean changeable = true;
    
    private double horizontal_position; // x position at panel
    private double vertical_position; 	//y position at panel
    
    private int square_position; 				// dentre as N células formadas pelo produto de linhas e colunas
    

    public int getValue() {
        return this.value;
    }

    public boolean setValue(int value) {
        if (this.changeable == true) {
            this.value = value;
            return true;
        }
        return false;
    }

    public boolean getChangeable() {
        return changeable;
    }

    public void setChangeable(boolean changeable) {
        this.changeable = changeable;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public Cell(){
    	
    }

    
}
