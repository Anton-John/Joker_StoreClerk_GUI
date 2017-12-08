/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jokerRMI.SelectClient;
import jokerRMI.WelcomePage;

/**
 *
 * @author john
 */
public class WelcomePage_Listeners implements ActionListener {

    WelcomePage welcomePage;
    SelectClient selectClient;

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == welcomePage.getLogin_BT_Login()) {
            
            String clerkName = welcomePage.getClerkName_TF_Login().getText();
            String password = welcomePage.getPassword_TF_Login().getText();

            int result = 1;
            //= auth.login(clerkName, password);
            if (result == 1) {
                welcomePage.showMsg("LOGGED IN SUCCESSFULLY");

                selectClient.setLocationRelativeTo(null);
                welcomePage.dispose();
                selectClient.setVisible(true);
            } else {
                welcomePage.showMsg("WRONG USERNAME/PASSWORD");
            }

        } 
//        else if (source == Model.Login.logButton) {
//
//        }

    }

}
