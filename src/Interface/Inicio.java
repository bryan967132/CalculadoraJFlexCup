package Interface;
import javax.swing.JFrame;
public class Inicio extends JFrame {
    public Inicio() {
        initComponents();
        Principal p = new Principal();
        p.setBounds(0,0,getWidth(),getHeight());
        getContentPane().add(p);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalculateIDE");
        setBackground(new java.awt.Color(51, 51, 51));
        setLocation(50,50);
        setMinimumSize(new java.awt.Dimension(1140, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(1140, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}