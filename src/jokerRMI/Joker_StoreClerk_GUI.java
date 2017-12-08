/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokerRMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import listeners.*;

/**
 *
 * @author john
 */
public class Joker_StoreClerk_GUI {

    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        //All JFrame int the system (all views)
        WelcomePage welcomePage;
        //SelectClient selectClient=null;
       // StoreClerk storeClerk=null;
        
        //Registry with port num as in the server
        //Registry reg = LocateRegistry.getRegistry(1099);
        //AuthInterface auth = (AuthInterface) reg.lookup("auth");
        
        //first View is Welcome view and on it will continue the System flow
        welcomePage = new WelcomePage();
        welcomePage.setLocationRelativeTo(null);
        welcomePage.setVisible(true);
        
        //Add listeners for all the button
        //WelcomePage listeners
        
//        welcomePage.getLogin_BT_Login()
//                .addActionListener(new WelcomePage_Login_BT_Login_Listener(welcomePage, selectClient));        
//        //SelectClient listeners
//        
//      selectClient.getSearch_BT_ExistingClient()
//               .addActionListener(new SelectClient_Search_BT_ExistingClient_Listener(selectClient) );
//        
//       selectClient.getSelect_BT_ExistingClient()
//               .addActionListener(new SelectClient_Select_BT_ExistingClient_Listener(selectClient,storeClerk));
    }
}
