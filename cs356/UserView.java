package edu.cpp.cs356;

import javax.swing.DefaultListModel;

public class UserView extends javax.swing.JFrame {

    private User user;

    /**
     * Creates new form UserView
     */
    public UserView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userId = new javax.swing.JTextField();
        followUser = new javax.swing.JButton();
        tweetMsg = new javax.swing.JTextField();
        postTweet = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        following = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        newsFeed = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userId.setText("User ID");

        followUser.setText("Follow User");
        followUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followUserActionPerformed(evt);
            }
        });

        tweetMsg.setText("Tweet Message");

        postTweet.setText("Post Tweet");
        postTweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postTweetActionPerformed(evt);
            }
        });

        following.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "List View (Current Following)" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(following);

        newsFeed.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "List View (News Feed)" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(newsFeed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tweetMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postTweet, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userId, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(followUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(followUser, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(userId))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tweetMsg)
                    .addComponent(postTweet, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void followUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followUserActionPerformed
        DefaultListModel dlm = (DefaultListModel) newsFeed.getModel();
        if (!userId.getText().equals("")) {
            user.follow(userId.getText());
        }
    }//GEN-LAST:event_followUserActionPerformed

    private void postTweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postTweetActionPerformed
        DefaultListModel dlm = (DefaultListModel) newsFeed.getModel();
        if (!tweetMsg.getText().equals("")) {
            Tweet t = user.postTweet(tweetMsg.getText());
        }
    }//GEN-LAST:event_postTweetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton followUser;
    private javax.swing.JList following;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList newsFeed;
    private javax.swing.JButton postTweet;
    private javax.swing.JTextField tweetMsg;
    private javax.swing.JTextField userId;
    // End of variables declaration//GEN-END:variables

}
