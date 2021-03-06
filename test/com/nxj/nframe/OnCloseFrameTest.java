package com.nxj.nframe;

import com.nxj.application.NFrame;

/**
 *
 * @author Felix
 */
public class OnCloseFrameTest extends NFrame {

        
    @Override
    protected void init() {
        initComponents();
    }

    @Override
    protected void onClose() {
        System.out.println("Called before you close window");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    // Variables declaration - do not modify
    // End of variables declaration
}
