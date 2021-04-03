/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortingSoccerTeamsSoccer.controller;

/**
 *
 * @author Gabriel
 */
public class Sorting {
    public static String[] sortByBubbleSortteams(String[] teamSoccer){
         for (int j = 0; j < 5 ; j++) {
             for (int i = 0; i < 5; i++) {
        
           if (teamSoccer[i].compareTo(teamSoccer[i+1])>0) {
                
                    String temp;
                    temp = teamSoccer[i];
                    teamSoccer[i] = teamSoccer[i + 1];
                    teamSoccer[i + 1] = temp;
                }
               
                
            }
            }
            return teamSoccer;
           
        }
   
    
    }
    

    
         
        
        
       
        
        
        
        