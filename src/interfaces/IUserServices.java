/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.User;

/**
 *
 * @author rejeb
 */
public interface IUserServices {

    boolean Authentification(User u);

    void create(User u);

    User findById(Integer id);
    
}
