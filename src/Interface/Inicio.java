package Interface;
import javax.swing.JFrame;
public class Inicio extends JFrame {
    public Inicio() {
        initComponents();
        Principal p = new Principal();
        p.setBounds(0,0,getWidth(),getHeight());
        getContentPane().add(p);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalculateIDE");
        setBackground(new java.awt.Color(51, 51, 51));
        setLocation(50,50);
        setMinimumSize(new java.awt.Dimension(934, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(934, 500));
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}