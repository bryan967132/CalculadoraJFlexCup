package Interface;
public class Principal extends javax.swing.JPanel {
    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        editor = new javax.swing.JTextPane();
        compile = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        console1 = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(53, 53, 53));
        setMinimumSize(new java.awt.Dimension(934, 464));
        setPreferredSize(new java.awt.Dimension(934, 464));
        setLayout(null);

        console.setEditable(false);
        console.setBackground(new java.awt.Color(47, 47, 47));
        console.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        console.setForeground(new java.awt.Color(255, 255, 255));
        console.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(console);

        add(jScrollPane2);
        jScrollPane2.setBounds(700, 70, 420, 370);

        editor.setBackground(new java.awt.Color(47, 47, 47));
        editor.setFont(new java.awt.Font("Consolas", 0, 12));
        editor.setForeground(new java.awt.Color(255, 255, 255));
        editor.setCaretColor(new java.awt.Color(255, 255, 255));
        editor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        editor.setMinimumSize(new java.awt.Dimension(7, 21));
        editor.setPreferredSize(new java.awt.Dimension(7, 21));
        jScrollPane1.setViewportView(editor);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 330, 370);

        compile.setBackground(new java.awt.Color(153, 204, 0));
        compile.setText("Compilar");
        compile.setAutoscrolls(true);
        compile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compileActionPerformed(evt);
            }
        });
        add(compile);
        compile.setBounds(20, 20, 150, 32);

        console1.setEditable(false);
        console1.setBackground(new java.awt.Color(47, 47, 47));
        console1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        console1.setForeground(new java.awt.Color(255, 255, 255));
        console1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane3.setViewportView(console1);

        add(jScrollPane3);
        jScrollPane3.setBounds(360, 70, 330, 370);
    }// </editor-fold>//GEN-END:initComponents
    private void compileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compileActionPerformed
        new Analyze().analyze(editor,console1,console);
    }//GEN-LAST:event_compileActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compile;
    private javax.swing.JTextPane console;
    private javax.swing.JTextPane console1;
    private javax.swing.JTextPane editor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}