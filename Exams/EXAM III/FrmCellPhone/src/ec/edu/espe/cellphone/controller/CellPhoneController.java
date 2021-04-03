/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphone.controller;

import ec.edu.espe.cellphone.model.CellPhone;
import utils.FileManager;

/**
 *
 * @author Gabriel
 */
public class CellPhoneController {
public void save( CellPhone cellphone){
        String data = cellphone.getModel()+ " , " + cellphone.getPrice()+" , " + cellphone.getColor() + " , " + cellphone.getGama() + " , " + cellphone.getMemoryram();
        
        FileManager.save(data,"cellphones");
        
        
    }
    public String read(){
        String data[] = new String[FileManager.returnSize("cellphones.csv")];
        data = FileManager.read("cellphones.csv");
    return null;
 }
    }
    
    

