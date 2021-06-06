/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.*;
import Network.ClientSocket;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joshua
 */
public class Home extends javax.swing.JFrame {
    private ClientSocket socket;
    private User user;
    static int orgID;


    private ListModelScreen assetList;

    /**
     * Creates new form Home
     */
    public Home(User user) {
        this.user = user;
        orgID = this.user.getOrgID();

        socket = new ClientSocket();
        this.assetList =  new ListModelScreen(socket);
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        System.out.println("Admin: "+user.getAdmin());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JPanel();
        Side = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AssetsList = new javax.swing.JList(assetList.getModel());
        WalletBack = new javax.swing.JPanel();
        Wallet = new javax.swing.JPanel();
        WalletLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        TopBar = new javax.swing.JMenu();
        Settings = new javax.swing.JMenuItem();
        Profile = new javax.swing.JMenuItem();
        AdminControls = new javax.swing.JMenuItem();
        Signout = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        addNameListListener(new NameListListener());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asset Manager");
        setBackground(new java.awt.Color(48, 48, 56));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Back.setBackground(new java.awt.Color(48, 48, 56));

        Side.setBackground(new java.awt.Color(39, 39, 45));

        AssetsList.setBackground(new java.awt.Color(62, 62, 71));
        AssetsList.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setViewportView(AssetsList);

        WalletBack.setBackground(new java.awt.Color(48, 48, 56));

        Wallet.setBackground(new java.awt.Color(31, 31, 35));

        WalletLabel.setForeground(new java.awt.Color(255, 255, 255));
        WalletLabel.setText("Wallet");

        javax.swing.GroupLayout WalletLayout = new javax.swing.GroupLayout(Wallet);
        Wallet.setLayout(WalletLayout);
        WalletLayout.setHorizontalGroup(
            WalletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WalletLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WalletLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WalletLayout.setVerticalGroup(
            WalletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WalletLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(WalletLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout WalletBackLayout = new javax.swing.GroupLayout(WalletBack);
        WalletBack.setLayout(WalletBackLayout);
        WalletBackLayout.setHorizontalGroup(
            WalletBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Wallet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        WalletBackLayout.setVerticalGroup(
            WalletBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WalletBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Wallet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Assets");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(user.getUserName());

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Title");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Organisation");

        javax.swing.GroupLayout SideLayout = new javax.swing.GroupLayout(Side);
        Side.setLayout(SideLayout);
        SideLayout.setHorizontalGroup(
            SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WalletBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(94, 94, 94))
            .addGroup(SideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(SideLayout.createSequentialGroup()
                        .addGroup(SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SideLayout.setVerticalGroup(
            SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WalletBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel7.setBackground(new java.awt.Color(39, 39, 45));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Asset name");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Amount owned: ");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Stock History Overview");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");

        jTextField1.setBackground(new java.awt.Color(39, 39, 45));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("0");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cost");

        jTextField2.setBackground(new java.awt.Color(39, 39, 45));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("0");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(28, 120, 27));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BUY");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(150, 23, 32));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SELL");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(currentOrdersModel);
        currentOrdersModel.addColumn("Asset name");
        currentOrdersModel.addColumn("Price");
        currentOrdersModel.addColumn("Quantity");
        currentOrdersModel.addColumn("Order Type");
        currentOrdersModel.addColumn("Placed by");
        currentOrdersModel.addColumn("Date placed");


        jScrollPane2.setViewportView(jTable1);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Current Trades");

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(historyOrdersModel);
        historyOrdersModel.addColumn("Asset name");
        historyOrdersModel.addColumn("Price");
        historyOrdersModel.addColumn("Quantity");
        historyOrdersModel.addColumn("Order Type");
        historyOrdersModel.addColumn("Placed by");
        historyOrdersModel.addColumn("Date placed");
        historyOrdersModel.addColumn("Completed");

        jScrollPane3.setViewportView(jTable2);


        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Trade History");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 130, 35));
        jLabel36.setText("Success Message");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(200, 9, 0));
        jLabel13.setText("Fail Message");

        javax.swing.GroupLayout BackLayout = new javax.swing.GroupLayout(Back);
        Back.setLayout(BackLayout);
        BackLayout.setHorizontalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackLayout.createSequentialGroup()
                .addComponent(Side, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(BackLayout.createSequentialGroup()
                        .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addGroup(BackLayout.createSequentialGroup()
                                .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(113, 113, 113))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackLayout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(BackLayout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(BackLayout.createSequentialGroup()
                                                .addComponent(jLabel36)
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel13))
                                            .addGroup(BackLayout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jLabel11))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        BackLayout.setVerticalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Side, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackLayout.createSequentialGroup()
                .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(10, 10, 10)
                        .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel13)))
                    .addGroup(BackLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        MenuBar.setOpaque(true);
        MenuBar.setBackground(new java.awt.Color(31, 31, 35));
        MenuBar.setBorder(null);
        MenuBar.setForeground(new java.awt.Color(255, 255, 255));

        TopBar.setText("Menu");

        Settings.setText("Settings");
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });
        TopBar.add(Settings);

        Profile.setText("Profile");
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });
        TopBar.add(Profile);

        AdminControls.setText("Admin Controls");
        AdminControls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminControlsActionPerformed(evt);
            }
        });
        TopBar.add(AdminControls);

        Signout.setText("Account Signout");
        Signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignoutActionPerformed(evt);
            }
        });
        TopBar.add(Signout);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        TopBar.add(Exit);

        MenuBar.add(TopBar);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Adds a listener to the name list
     */
    private void addNameListListener(ListSelectionListener listener) {
        AssetsList.addListSelectionListener(listener);
    }

    /**
     * Implements a ListSelectionListener for making the UI respond when a
     * different name is selected from the list.
     */
    private class NameListListener implements ListSelectionListener {

        /**
         * @see javax.swing.event.ListSelectionListener#valueChanged(javax.swing.event.ListSelectionEvent)
         */
        public void valueChanged(ListSelectionEvent e) {
            if (AssetsList.getSelectedValue() != null
                    && !AssetsList.getSelectedValue().equals("")) {
                jLabel3.setText(AssetsList.getSelectedValue());
                UpdateHome();
                int assetID = -1;
                double amountOwn = 0;
                for(Asset asset : DatabaseStorage.getAssetList()){
                    if(asset.getAssetName().equals(jLabel3.getText())){
                        assetID = asset.getAssetID();
                        break;
                    }
                }
                for(OrgAssets orgAsset : DatabaseStorage.getOrgAssets()){
                    if(assetID == orgAsset.getAssetID()){
                        if(user.getOrgID() == orgAsset.getOrgID()){
                            amountOwn = orgAsset.getQuantity();
                        }
                    }
                    System.out.println(orgAsset.getAssetID() + orgAsset.getQuantity());
                }
                jLabel4.setText("Amount owned: " + amountOwn);
                //System.out.println(AssetsList.getSelectedValue());
            }
        }
    }

    public static void UpdateHome(){
        UpdateOrderHistory();
        UpdateOrders();
        for (OrgDetails details : DatabaseStorage.getOrgDetails()){
            if(details.getOrgID() == orgID){
                WalletLabel.setText("$ " + details.getCredits());
                jLabel10.setText(details.getOrgName());
            }
        }
    }

    public static void UpdateOrderHistory(){
        if(jLabel3 != null){
            Object[] arr = new Object[7];
            int assetID = -1;
            String userName = "";

            while(historyOrdersModel.getRowCount() > 0)
            {
                historyOrdersModel.removeRow(0);
            }
            for(Asset asset : DatabaseStorage.getAssetList()){
                if(asset.getAssetName().equals(jLabel3.getText())){
                    assetID = asset.getAssetID();
                }
            }
            for(Order order : DatabaseStorage.getOrderHistory()){
                for(User user : DatabaseStorage.getProfileList()){
                    if(order.getUserID() == user.getUserID()){
                        userName = user.getUserName();
                    }
                }
                if(order.getAssetID() == assetID) {
                    arr[0] = jLabel3.getText();
                    arr[1] = order.getPrice();
                    arr[2] = order.getQuantity();
                    arr[3] = order.getOrderType();
                    arr[4] = userName;
                    arr[5] = order.getDatePlaced();
                    arr[6] = order.getCompleted();
                    historyOrdersModel.addRow(arr);
                }
            }
        }

    }

    public static void UpdateOrders(){
        if(jLabel3 != null){
            Object[] arr = new Object[6];
            int assetID = -1;
            String userName = "";

            while(currentOrdersModel.getRowCount() > 0)
            {
                currentOrdersModel.removeRow(0);
            }
            for(Asset asset : DatabaseStorage.getAssetList()){
                if(asset.getAssetName().equals(jLabel3.getText())){
                    assetID = asset.getAssetID();
                }
            }
            for(Order order : DatabaseStorage.getOrders()){
                for(User user : DatabaseStorage.getProfileList()){
                    if(order.getUserID() == user.getUserID()){
                        userName = user.getUserName();
                    }
                }
                if(order.getAssetID() == assetID) {
                    arr[0] = jLabel3.getText();
                    arr[1] = order.getPrice();
                    arr[2] = order.getQuantity();
                    arr[3] = order.getOrderType();
                    arr[4] = userName;
                    arr[5] = order.getDatePlaced();
                    currentOrdersModel.addRow(arr);
                }
            }
        }

    }

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
        // TODO add your handling code here:
        new Settings(user).setVisible(true);
        
    }//GEN-LAST:event_SettingsActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        // TODO add your handling code here:
        new Profile(user).setVisible(true);
        
    }//GEN-LAST:event_ProfileActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void SignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignoutActionPerformed
        // TODO add your handling code here:
        new SignoutConfirmation(this).setVisible(true);
    }//GEN-LAST:event_SignoutActionPerformed

    private void AdminControlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminControlsActionPerformed
        // TODO add your handling code here:
        new AdminControls().setVisible(true);
    }//GEN-LAST:event_AdminControlsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ClientSocket socket = new ClientSocket();
        for(OrgAssets org : DatabaseStorage.getOrgAssets()){
            if(org.getOrgID() == user.getOrgID()){
                for(Asset list : DatabaseStorage.getAssetList()){
                    if(org.getAssetID() == list.getAssetID()){
                        if(Double.parseDouble(jTextField1.getText()) <= org.getQuantity()){
                            if(jLabel3.getText().equals(list.getAssetName())){
                                socket.sendOrder(new Order(list.getAssetID(),Double.parseDouble(jTextField2.getText()),"S",Double.parseDouble(jTextField1.getText()),user.getUserID()));
                                socket = new ClientSocket();
                                socket.removeOrgAsset(list.getAssetID(),Double.parseDouble(jTextField1.getText()),user);
                                return;
                            }
                        }
                    }

                }
            }

        }

    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ClientSocket socket = new ClientSocket();
        double totalCost = Double.parseDouble(jTextField2.getText()) * Double.parseDouble(jTextField1.getText());
        for(OrgDetails details : DatabaseStorage.getOrgDetails()){
            if(details.getOrgID() == user.getOrgID()){
                if(totalCost <= details.getCredits()){
                    for(Asset list : DatabaseStorage.getAssetList()){
                        if(jLabel3.getText().equals(list.getAssetName())){
                            socket.sendOrder(new Order(list.getAssetID(),Double.parseDouble(jTextField2.getText()),"B",Double.parseDouble(jTextField1.getText()),user.getUserID()));
                            socket = new ClientSocket();
                            socket.removeCredits(totalCost,user);
                            return;
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        User test = new User(1, "LeviStenton", "test", 01, true);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home(test).setVisible(true);
            }
        });
        
    }
    static DefaultTableModel currentOrdersModel = new DefaultTableModel();
    static DefaultTableModel historyOrdersModel = new DefaultTableModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdminControls;
    private javax.swing.JList<String> AssetsList;
    private javax.swing.JPanel Back;
    private javax.swing.JMenuItem Exit;
    javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem Profile;
    private javax.swing.JMenuItem Settings;
    private javax.swing.JPanel Side;
    private javax.swing.JMenuItem Signout;
    private javax.swing.JMenu TopBar;
    private javax.swing.JPanel Wallet;
    private javax.swing.JPanel WalletBack;
    private static javax.swing.JLabel WalletLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private static javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
