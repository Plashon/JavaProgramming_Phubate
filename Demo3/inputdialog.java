import javax.swing.JOptionPane;
public class inputdialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, " Doraemon : Hello, who are you");
        JOptionPane.showMessageDialog(null, " Me : Hello,my name is : " + name);
    }
}
