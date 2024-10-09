//import java.util.Timer;

import javax.swing.*;

public class MyClock {
    //talking clock
    Timer tt;
    public MyClock() {
        tt = new Timer(1000, new TaskPerformer());

    }
    void start(){
        tt.start();
    }


}
