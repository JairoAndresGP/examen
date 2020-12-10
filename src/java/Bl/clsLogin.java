/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bl;

/**
 *
 * @author jairo
 */
public class clsLogin {

    public boolean validarLogin(Models.ClsLogin obclsLogin) {
        try {
            return obclsLogin.getStEmail().equals("jairo_gomez1perez@hotmail.com")
                    && obclsLogin.getStPassword().equals("123456");
        } catch (Exception ex) {
            throw ex;
        }
    }
}
