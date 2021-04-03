/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphone.model;

/**
 *
 * @author Gabriel
 */
public class CellPhone {
     private String model;
    private int price;
    private String color;
    private String gama;
    private int memoryram;

    public CellPhone(String model, int price, String color, String gama, int memoryram) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.gama = gama;
        this.memoryram = memoryram;
        
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the gama
     */
    public String getGama() {
        return gama;
    }

    /**
     * @param gama the space to set
     */
    public void setGama(String gama) {
        this.gama = gama;
    }

    /**
     * @return the memoryram
     */
    public int getMemoryram() {
        return memoryram;
        
    }

    /**
     * @param memoryram the memoryram to set
     */
    public void setMemoryram(int memoryram) {
        this.memoryram = memoryram;
    }
    }
    
    
    
    

    
    

