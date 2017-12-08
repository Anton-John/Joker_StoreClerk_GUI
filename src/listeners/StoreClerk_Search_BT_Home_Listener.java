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
public class StoreClerk_Search_BT_Home_Listener  implements ActionListener{
    StoreClerk storeClerk;

    public StoreClerk_Search_BT_Home_Listener(StoreClerk storeClerk) {
        this.storeClerk = storeClerk;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    String Search = storeClerk.getSearchItem_TF_Home().getText();
       // logic functio call
       //Update the table with the item based on the search
       storeClerk.showMsg("THE TABLE WAS UPDATED");
    
    }
    
}
