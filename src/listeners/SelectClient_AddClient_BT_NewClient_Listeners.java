/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jokerRMI.SelectClient;

/**
 *
 * @author john
 */
public class SelectClient_AddClient_BT_NewClient_Listeners implements ActionListener{
    SelectClient selectClient;

    public SelectClient_AddClient_BT_NewClient_Listeners(SelectClient selectClient) {
        this.selectClient = selectClient;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       String clientName = selectClient.getName_TF_NewClient().getText();
       String clientPass = selectClient.getAddress_TF_NewClient().getText();
       
       //(Logic) search the client if the name and adress the same will not add the client if new will add it
       selectClient.showMsg("THE CLIENT WAS Added");

    }
    
}
