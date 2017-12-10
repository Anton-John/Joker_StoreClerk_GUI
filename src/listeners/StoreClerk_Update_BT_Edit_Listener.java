/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import JokerStoreClerk.StoreClerk;

/**
 *
 * @author john
 */
public class StoreClerk_Update_BT_Edit_Listener implements ActionListener {

    StoreClerk storeClerk;

    public StoreClerk_Update_BT_Edit_Listener(StoreClerk storeClerk) {
        this.storeClerk = storeClerk;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = storeClerk.getName_TF_Edit().getText();
        String Address = storeClerk.getName_TF_Edit().getText();

        //change the Client data in the database 
        storeClerk.showMsg("THE ITEM CLIENT UPDATED AND THE TABLE WAS UPDATED");
        //and update the client Name in the up right of the page
        //update the Client table

    }

}
