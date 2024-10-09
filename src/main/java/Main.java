import javax.swing.*;

public class Main {
    public static void main(String[] s){
        MyClock c=new MyClock();
        c.start();

        JOptionPane.showMessageDialog(null,"quit program");
        System.exit(0);
    }
}
