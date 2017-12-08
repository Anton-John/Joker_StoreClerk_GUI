/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jokerRMI.StoreClerk;

/**
 *
 * @author john
 */
public class StoreClerk_Purchase_BT_Home_Listener implements ActionListener {

    StoreClerk storeClerk;

    public StoreClerk_Purchase_BT_Home_Listener(StoreClerk storeClerk) {
        this.storeClerk = storeClerk;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // get all client item in the shoping cart an Puchase all
        storeClerk.showMsg("ALL ITEM IN SHOPPING CART ARE PUCHAS, THANKS");

    }

}
