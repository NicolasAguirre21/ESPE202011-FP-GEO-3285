/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.concessionaire.controller;

import ec.edu.espe.concessionaire.model.Car;
import utils.FileManager;

/**
 *
 * @author Gabriel
 */
public class CarController {
    public void save(Car car){
        String data = car.getModel()+ " , " + car.getPrice()+" , " + car.getComfort() + " , " + car.getSpace() + " , " + car.getCondition();
        
        FileManager.save(data,"cars");
        
        
    }
    public String read(){
        String data[] = new String[FileManager.returnSize("cars.csv")];
        data = FileManager.read("cars.csv");
        
    
    


    
    
 
    
