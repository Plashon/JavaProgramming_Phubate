  import javax.swing.JOptionPane;
public class Doraemon {
      public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, " Doraemon : Hello, who are you");
        String name = JOptionPane.showInputDialog(null,  " Me : Hello,my name is : " );
        JOptionPane.showMessageDialog(null, "Doraemon : Oh! hi, " + name);
        JOptionPane.showMessageDialog(null, "Doraemon : Wha can I do for you?");
        JOptionPane.showMessageDialog(null, name + " : I want to go the future ");
        JOptionPane.showMessageDialog(null, "Doraemon : of course, what is the present year?");
        String thisyear = JOptionPane.showInputDialog(null, name + " : It is " );
        JOptionPane.showMessageDialog(null, "Doraemon : Ok. How many years do you want to travel?");
        String foryear = JOptionPane.showInputDialog(null, name + " : I want to go for : " );
        JOptionPane.showMessageDialog(null, "Doraemon : Ok. Lets gooooooooo!");
        JOptionPane.showMessageDialog(null, ".........................................");
        int future = Integer.parseInt(thisyear) + Integer.parseInt(foryear);
        JOptionPane.showMessageDialog(null, "Doraemon : Hello, welcome to " + future);
    }
}

