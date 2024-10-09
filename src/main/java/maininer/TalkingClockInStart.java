package maininer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

public class TalkingClockInStart {
    int interval;
    boolean beep;

    public TalkingClockInStart(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }
    void start(){
        class TaskPerformer implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date nulls=new Date();
                System.out.println("\"The Time is :\"\n" +
                        "\t\t"+ DateFormat.getTimeInstance(DateFormat.MEDIUM).format(nulls));
                if(beep) Toolkit.getDefaultToolkit().beep();
            }
        }
        Timer tt = new Timer(interval,new TaskPerformer());
        tt.start();
    }
}