/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jokerRMI.SelectClient;
import jokerRMI.StoreClerk;

/**
 *
 * @author john
 */
public class SelectClient_Search_BT_ExistingClient_Listener implements ActionListener{

    SelectClient selectClient;


    public SelectClient_Search_BT_ExistingClient_Listener(SelectClient selectClient) {
        this.selectClient = selectClient;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       String Search = selectClient.getSearchName_TF_ExistigCliet().getText();
       // logic functio call
       //Update the table with the client based on the search
       selectClient.showMsg("THE TABLE WAS UPDATED");
    }
    
}
