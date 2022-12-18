/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 *
 * @author egese
 */
public class Kart {
    private char value;
    private boolean prediction=false;

    public Kart(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean isPrediction() {
        return prediction;
    }

    public void setPrediction(boolean prediction) {
        this.prediction = prediction;
    }
    
}
