import javax.swing.JOptionPane;
public class inputanJOptionPane {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Masukkan Nama: ");
        JOptionPane.showMessageDialog(null, "Nama Anda : " + name);
    }
}
