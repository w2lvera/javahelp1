package maininer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

public class MyClock {
    public class TaskPerformer implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date nulls=new Date();
            System.out.println("\"The Time is :\"\n" +
                    "\t\t"+ DateFormat.getTimeInstance(DateFormat.MEDIUM).format(nulls));
        }
    }

    //talking clock
    Timer tt;
    public MyClock() {
        tt = new Timer(1000, new TaskPerformer());
        tt.start();
        JOptionPane.showMessageDialog(null,"quit program");
        System.exit(0);
    }


}
