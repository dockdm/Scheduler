package Scheduler_UI.GUI;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





public class SchedulerFrame extends JFrame {

    protected SchedulerMainPanel mainPanel;

    public SchedulerFrame(String title){

        super( title );
        Container container = getContentPane();
        mainPanel = new SchedulerMainPanel();
        container.add(mainPanel, BorderLayout.CENTER);

        pack();
    }
}
