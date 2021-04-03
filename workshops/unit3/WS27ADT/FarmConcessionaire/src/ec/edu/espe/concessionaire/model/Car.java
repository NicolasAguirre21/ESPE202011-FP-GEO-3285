/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.concessionaire.model;

/**
 *
 * @author Gabriel
 */
public class Car {
    private String model;
    private int price;
    private String comfort;
    private String space;
    private String condition;

    public Car(String model, int price, String comfort, String space, String condition) {
        this.model = model;
        this.price = price;
        this.comfort = comfort;
        this.space = space;
        this.condition = condition;
    }
    
    

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the comfort
     */
    public String getComfort() {
        return comfort;
    }

    /**
     * @param comfort the comfort to set
     */
    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    /**
     * @return the space
     */
    public String getSpace() {
        return space;
    }

    /**
     * @param space the space to set
     */
    public void setSpace(String space) {
        this.space = space;
    }

    /**
     * @return the condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * @param condition the condition to set
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }
    
    
    
    
}
