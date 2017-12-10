/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import JokerStoreClerk.SelectClient;
import JokerStoreClerk.StoreClerk;

/**
 *
 * @author john
 */
public class SelectClient_Select_BT_ExistingClient_Listener implements ActionListener{
    SelectClient selectClient;
    StoreClerk storeClerk;

    public SelectClient_Select_BT_ExistingClient_Listener(SelectClient selectClient) {
        this.selectClient = selectClient;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
       int clientId = Integer.parseInt(selectClient.getClientID_TF_ExistigCliet().getText());
       
       
       //get the client and pass it to Store clerk (logic)
       
       if(clientId==1){//if clientID in the database
           
       selectClient.showMsg("SELECT CLIENT SUCCESSFULLY");
       
                storeClerk = new StoreClerk();
                storeClerk.setLocationRelativeTo(null);
                selectClient.dispose();
                storeClerk.setVisible(true);
       }else{
       selectClient.showMsg("THE CLIENT ID IS WRONG");
       
       }
    }
    
}
