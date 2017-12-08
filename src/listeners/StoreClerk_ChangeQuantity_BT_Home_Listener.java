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
public class StoreClerk_ChangeQuantity_BT_Home_Listener implements ActionListener{
    StoreClerk storeClerk;

    public StoreClerk_ChangeQuantity_BT_Home_Listener(StoreClerk storeClerk) {
        this.storeClerk = storeClerk;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int itmeId = Integer.parseInt(storeClerk.getItmeIDShopping_TF_Home().getText());
        int quantity = Integer.parseInt(storeClerk.getQuantityShopping_TF_Home().getText());
        
        //validate the item number if in the database of the shoping Cart of this Client
        //change the item Quantity in the shoping chart 
        storeClerk.showMsg("THE ITEM QUANTITY CHANGED AND THE TABLE WAS UPDATED");
        //update the shoping cart table
    
    
    }
    
}
