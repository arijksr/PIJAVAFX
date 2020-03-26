/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev;

import Util.UserSession;
import entities.User;
import services.UserServices;

/**
 *
 * @author rejeb
 */
public class Pidev {

     /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         UserServices us = new UserServices();
         
         User e = new User("java", "java");
         us.Authentification(e);
         UserSession.getInstance().addToPanier(4,5);
         UserSession.getInstance().addToPanier(4,60);
         UserSession.getInstance().addToPanier(5,30);
         System.out.println(UserSession.getInstance().getPanier());
         UserSession.getInstance().removeFromPanier(4);
         System.out.println(UserSession.getInstance().getPanier());
         UserSession.getInstance().removeFromPanier(6);

         
       
    }
      
}
