/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokerRMI;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import listeners.StoreClerk_AddToShopping_BT_Home_Listener;
import listeners.StoreClerk_ChangeQuantity_BT_Home_Listener;
import listeners.StoreClerk_Purchase_BT_Home_Listener;
import listeners.StoreClerk_RemoveFromChart_BT_Home_Listener;
import listeners.StoreClerk_Search_BT_Home_Listener;
import listeners.StoreClerk_Update_BT_Edit_Listener;

/**
 *
 * @author JOHN
 */
public class StoreClerk extends javax.swing.JFrame {

    /**
     * Creates new form SallerPage
     */
    public StoreClerk() {
        initComponents();
        Container a = this.getContentPane();
        a.setBackground(Color.WHITE);
        
        //Add all listener classes
        AddToShopping_BT_Home.addActionListener(new StoreClerk_AddToShopping_BT_Home_Listener(this));
        ChangeQuantity_BT_Home.addActionListener(new StoreClerk_ChangeQuantity_BT_Home_Listener(this));
        Purchase_BT_Home.addActionListener(new StoreClerk_Purchase_BT_Home_Listener(this));
        RemoveFromChart_BT_Home.addActionListener(new StoreClerk_RemoveFromChart_BT_Home_Listener(this));
        Search_BT_Home.addActionListener(new StoreClerk_Search_BT_Home_Listener(this));
        Update_BT_Edit.addActionListener(new StoreClerk_Update_BT_Edit_Listener(this));
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProductCategory_BG = new javax.swing.ButtonGroup();
        AccssoresCategory_BG = new javax.swing.ButtonGroup();
        TabbedPane = new javax.swing.JTabbedPane();
        Home_Panel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ShopingChart_Table_Home = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        AllIem_Table_Home = new javax.swing.JTable();
        Items_LB_Home = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SearchItem_LB_Home = new javax.swing.JLabel();
        SearchItem_TF_Home = new javax.swing.JTextField();
        Search_BT_Home = new javax.swing.JButton();
        ItemID_LB_Home = new javax.swing.JLabel();
        ItmeID_TF_Home = new javax.swing.JTextField();
        AddToShopping_BT_Home = new javax.swing.JButton();
        Purchase_BT_Home = new javax.swing.JButton();
        RemoveFromChart_BT_Home = new javax.swing.JButton();
        ItemIDShopping_LB_Home = new javax.swing.JLabel();
        ItmeIDShopping_TF_Home = new javax.swing.JTextField();
        ChangeQuantity_BT_Home = new javax.swing.JButton();
        ItemIDShopping_LB_Home1 = new javax.swing.JLabel();
        QuantityShopping_TF_Home = new javax.swing.JTextField();
        Edit_Panel = new javax.swing.JPanel();
        Name_LB_Edit = new javax.swing.JLabel();
        Address_LB_Edit = new javax.swing.JLabel();
        Update_BT_Edit = new javax.swing.JButton();
        Name_TF_Edit = new javax.swing.JTextField();
        Address_TF_Edit = new javax.swing.JTextField();
        StoreClerkName_LB = new javax.swing.JLabel();
        StoreClerk_LB = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        Logo2 = new javax.swing.JLabel();
        SelectedClient_LB = new javax.swing.JLabel();
        ClientName_LB = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        TabbedPane.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        Home_Panel.setBackground(new java.awt.Color(245, 245, 245));

        ShopingChart_Table_Home.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(ShopingChart_Table_Home);
        if (ShopingChart_Table_Home.getColumnModel().getColumnCount() > 0) {
            ShopingChart_Table_Home.getColumnModel().getColumn(0).setResizable(false);
            ShopingChart_Table_Home.getColumnModel().getColumn(1).setResizable(false);
            ShopingChart_Table_Home.getColumnModel().getColumn(2).setResizable(false);
        }

        AllIem_Table_Home.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(AllIem_Table_Home);
        if (AllIem_Table_Home.getColumnModel().getColumnCount() > 0) {
            AllIem_Table_Home.getColumnModel().getColumn(0).setResizable(false);
            AllIem_Table_Home.getColumnModel().getColumn(1).setResizable(false);
            AllIem_Table_Home.getColumnModel().getColumn(2).setResizable(false);
            AllIem_Table_Home.getColumnModel().getColumn(3).setResizable(false);
        }

        Items_LB_Home.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Items_LB_Home.setText("Items:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Cliet Shoping Chart:");

        SearchItem_LB_Home.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        SearchItem_LB_Home.setText("Search Item");

        SearchItem_TF_Home.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        Search_BT_Home.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Search_BT_Home.setForeground(new java.awt.Color(102, 102, 102));
        Search_BT_Home.setText("Search");
        Search_BT_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_BT_HomeActionPerformed(evt);
            }
        });

        ItemID_LB_Home.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ItemID_LB_Home.setText("Item ID");

        ItmeID_TF_Home.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        AddToShopping_BT_Home.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AddToShopping_BT_Home.setText("Add To Shopping");
        AddToShopping_BT_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToShopping_BT_HomeActionPerformed(evt);
            }
        });

        Purchase_BT_Home.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Purchase_BT_Home.setText("Purchase");
        Purchase_BT_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Purchase_BT_HomeActionPerformed(evt);
            }
        });

        RemoveFromChart_BT_Home.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        RemoveFromChart_BT_Home.setForeground(new java.awt.Color(255, 0, 0));
        RemoveFromChart_BT_Home.setText("Remove From Chart");
        RemoveFromChart_BT_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveFromChart_BT_HomeActionPerformed(evt);
            }
        });

        ItemIDShopping_LB_Home.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ItemIDShopping_LB_Home.setText("Item ID");

        ItmeIDShopping_TF_Home.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        ChangeQuantity_BT_Home.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ChangeQuantity_BT_Home.setText("Change Quantity");
        ChangeQuantity_BT_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeQuantity_BT_HomeActionPerformed(evt);
            }
        });

        ItemIDShopping_LB_Home1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ItemIDShopping_LB_Home1.setText("Quantitiy");

        QuantityShopping_TF_Home.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout Home_PanelLayout = new javax.swing.GroupLayout(Home_Panel);
        Home_Panel.setLayout(Home_PanelLayout);
        Home_PanelLayout.setHorizontalGroup(
            Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Home_PanelLayout.createSequentialGroup()
                        .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Home_PanelLayout.createSequentialGroup()
                                .addComponent(SearchItem_LB_Home)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchItem_TF_Home)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Search_BT_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Home_PanelLayout.createSequentialGroup()
                                .addComponent(ItemID_LB_Home)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ItmeID_TF_Home)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddToShopping_BT_Home)))
                        .addGap(147, 147, 147))
                    .addGroup(Home_PanelLayout.createSequentialGroup()
                        .addComponent(Items_LB_Home)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Purchase_BT_Home)
                        .addGroup(Home_PanelLayout.createSequentialGroup()
                            .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(Home_PanelLayout.createSequentialGroup()
                                    .addComponent(ItemIDShopping_LB_Home1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(QuantityShopping_TF_Home))
                                .addGroup(Home_PanelLayout.createSequentialGroup()
                                    .addComponent(ItemIDShopping_LB_Home)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ItmeIDShopping_TF_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(96, 96, 96)
                            .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ChangeQuantity_BT_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RemoveFromChart_BT_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(222, 222, 222))
        );
        Home_PanelLayout.setVerticalGroup(
            Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_PanelLayout.createSequentialGroup()
                .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Home_PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ItmeIDShopping_TF_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ItemIDShopping_LB_Home))
                            .addComponent(RemoveFromChart_BT_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(QuantityShopping_TF_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ItemIDShopping_LB_Home1))
                            .addComponent(ChangeQuantity_BT_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(Home_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchItem_LB_Home)
                            .addComponent(SearchItem_TF_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search_BT_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Items_LB_Home)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Home_PanelLayout.createSequentialGroup()
                        .addGroup(Home_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItmeID_TF_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddToShopping_BT_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemID_LB_Home))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(Purchase_BT_Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        TabbedPane.addTab("Home", Home_Panel);

        Edit_Panel.setBackground(new java.awt.Color(245, 245, 245));

        Name_LB_Edit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Name_LB_Edit.setText("Name");

        Address_LB_Edit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Address_LB_Edit.setText("Address");

        Update_BT_Edit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Update_BT_Edit.setText("Update");
        Update_BT_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_BT_EditActionPerformed(evt);
            }
        });

        Name_TF_Edit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Name_TF_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_TF_EditActionPerformed(evt);
            }
        });

        Address_TF_Edit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout Edit_PanelLayout = new javax.swing.GroupLayout(Edit_Panel);
        Edit_Panel.setLayout(Edit_PanelLayout);
        Edit_PanelLayout.setHorizontalGroup(
            Edit_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Edit_PanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(Edit_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Address_LB_Edit)
                    .addComponent(Name_LB_Edit))
                .addGap(18, 18, 18)
                .addGroup(Edit_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Name_TF_Edit, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(Address_TF_Edit)
                    .addComponent(Update_BT_Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(930, Short.MAX_VALUE))
        );
        Edit_PanelLayout.setVerticalGroup(
            Edit_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Edit_PanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(Edit_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Name_LB_Edit)
                    .addComponent(Name_TF_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Edit_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address_TF_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address_LB_Edit))
                .addGap(18, 18, 18)
                .addComponent(Update_BT_Edit)
                .addContainerGap(361, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Edit Client Details", Edit_Panel);

        StoreClerkName_LB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        StoreClerkName_LB.setText("Clerk Name");

        StoreClerk_LB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        StoreClerk_LB.setText("Store Clerk :");

        Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jokerRMI/JokerLogo1.png"))); // NOI18N

        Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jokerRMI/JokerLogo3.png"))); // NOI18N

        SelectedClient_LB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        SelectedClient_LB.setText("Selected Client  :");

        ClientName_LB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ClientName_LB.setText("Client Name");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Clerk View");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TabbedPane)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Logo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Logo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StoreClerk_LB)
                            .addComponent(SelectedClient_LB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StoreClerkName_LB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ClientName_LB, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(StoreClerkName_LB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(StoreClerk_LB))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ClientName_LB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SelectedClient_LB)))
                        .addComponent(Logo1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22)
                .addComponent(TabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Search_BT_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_BT_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_BT_HomeActionPerformed

    private void AddToShopping_BT_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToShopping_BT_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToShopping_BT_HomeActionPerformed

    private void Purchase_BT_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Purchase_BT_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Purchase_BT_HomeActionPerformed

    private void RemoveFromChart_BT_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveFromChart_BT_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveFromChart_BT_HomeActionPerformed

    private void Update_BT_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_BT_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Update_BT_EditActionPerformed

    private void Name_TF_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_TF_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name_TF_EditActionPerformed

    private void ChangeQuantity_BT_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeQuantity_BT_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangeQuantity_BT_HomeActionPerformed
public void showMsg(String text)
    {
        JOptionPane.showMessageDialog(null, text);
    }

    public ButtonGroup getAccssoresCategory_BG() {
        return AccssoresCategory_BG;
    }

    public JButton getAddToShopping_BT_Home() {
        return AddToShopping_BT_Home;
    }

    public JLabel getAddress_LB_Edit() {
        return Address_LB_Edit;
    }

    public JTextField getAddress_TF_Edit() {
        return Address_TF_Edit;
    }

    public JTable getAllIem_Table_Home() {
        return AllIem_Table_Home;
    }

    public JButton getChangeQuantity_BT_Home() {
        return ChangeQuantity_BT_Home;
    }

    public JLabel getClientName_LB() {
        return ClientName_LB;
    }

    public JPanel getEdit_Panel() {
        return Edit_Panel;
    }

    public JPanel getHome_Panel() {
        return Home_Panel;
    }

    public JLabel getItemIDShopping_LB_Home() {
        return ItemIDShopping_LB_Home;
    }

    public JTextField getQuantityShopping_TF_Home() {
        return QuantityShopping_TF_Home;
    }



    public JLabel getItemID_LB_Home() {
        return ItemID_LB_Home;
    }

    public JLabel getItems_LB_Home() {
        return Items_LB_Home;
    }

    public JTextField getItmeIDShopping_TF_Home() {
        return ItmeIDShopping_TF_Home;
    }


    public JTextField getItmeID_TF_Home() {
        return ItmeID_TF_Home;
    }

    public JLabel getLogo1() {
        return Logo1;
    }

    public JLabel getLogo2() {
        return Logo2;
    }

    public JLabel getName_LB_Edit() {
        return Name_LB_Edit;
    }

    public JTextField getName_TF_Edit() {
        return Name_TF_Edit;
    }

    public ButtonGroup getProductCategory_BG() {
        return ProductCategory_BG;
    }

    public JButton getPurchase_BT_Home() {
        return Purchase_BT_Home;
    }

    public JButton getRemoveFromChart_BT_Home() {
        return RemoveFromChart_BT_Home;
    }

    public JLabel getSearchItem_LB_Home() {
        return SearchItem_LB_Home;
    }

    public JTextField getSearchItem_TF_Home() {
        return SearchItem_TF_Home;
    }

    public JButton getSearch_BT_Home() {
        return Search_BT_Home;
    }

    public JLabel getSelectedClient_LB() {
        return SelectedClient_LB;
    }

    public JTable getShopingChart_Table_Home() {
        return ShopingChart_Table_Home;
    }

    public JLabel getStoreClerkName_LB() {
        return StoreClerkName_LB;
    }

    public JLabel getStoreClerk_LB() {
        return StoreClerk_LB;
    }

    public JTabbedPane getTabbedPane() {
        return TabbedPane;
    }

    public JButton getUpdate_BT_Edit() {
        return Update_BT_Edit;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AccssoresCategory_BG;
    private javax.swing.JButton AddToShopping_BT_Home;
    private javax.swing.JLabel Address_LB_Edit;
    private javax.swing.JTextField Address_TF_Edit;
    private javax.swing.JTable AllIem_Table_Home;
    private javax.swing.JButton ChangeQuantity_BT_Home;
    private javax.swing.JLabel ClientName_LB;
    private javax.swing.JPanel Edit_Panel;
    private javax.swing.JPanel Home_Panel;
    private javax.swing.JLabel ItemIDShopping_LB_Home;
    private javax.swing.JLabel ItemIDShopping_LB_Home1;
    private javax.swing.JLabel ItemID_LB_Home;
    private javax.swing.JLabel Items_LB_Home;
    private javax.swing.JTextField ItmeIDShopping_TF_Home;
    private javax.swing.JTextField ItmeID_TF_Home;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel Logo2;
    private javax.swing.JLabel Name_LB_Edit;
    private javax.swing.JTextField Name_TF_Edit;
    private javax.swing.ButtonGroup ProductCategory_BG;
    private javax.swing.JButton Purchase_BT_Home;
    private javax.swing.JTextField QuantityShopping_TF_Home;
    private javax.swing.JButton RemoveFromChart_BT_Home;
    private javax.swing.JLabel SearchItem_LB_Home;
    private javax.swing.JTextField SearchItem_TF_Home;
    private javax.swing.JButton Search_BT_Home;
    private javax.swing.JLabel SelectedClient_LB;
    private javax.swing.JTable ShopingChart_Table_Home;
    private javax.swing.JLabel StoreClerkName_LB;
    private javax.swing.JLabel StoreClerk_LB;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton Update_BT_Edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
