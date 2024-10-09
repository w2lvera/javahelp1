import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

public class TaskPerformer implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Date nulls=new Date();
        System.out.println("\"The Time is :\"\n" +
                "\t\t"+ DateFormat.getTimeInstance(DateFormat.MEDIUM).format(nulls));
    }
}
