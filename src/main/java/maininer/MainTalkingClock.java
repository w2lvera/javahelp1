package maininer;

import javax.swing.*;

public class MainTalkingClock {
    public static void main(String[] s){
       // TalkingClock tt=new maininer.TalkingClock(1000,true);
        //TalkingClockInStart tt=new maininer.TalkingClockInStart(1000,true);
       // TalkingClockInAll tt=new maininer.TalkingClockInAll();
        TalkingClockAnonimus tt=new maininer.TalkingClockAnonimus();
        tt.start(1000,true);
        JOptionPane.showMessageDialog(null,"quit program");
        System.exit(0);
    }
}
