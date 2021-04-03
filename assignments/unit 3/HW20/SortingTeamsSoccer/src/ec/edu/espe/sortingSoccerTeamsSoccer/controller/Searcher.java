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
public class Searcher {
      public static int SearchteamSoccer(String[]teamSoccer,String dataToFind){
     
        int n = teamSoccer.length;
        for (int i = 0; i < n ; i++) {
           
            if (dataToFind == null ? (teamSoccer[i]) == null : dataToFind.equals(teamSoccer[i])){
                return 1;
            }
        }
        return -1;
    }

   
}

