package Scheduler_UI.GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SchedulerMainPanel extends JPanel {


    public static Dimension SCHEDULER_DIM =  new Dimension( 200, 400 );

    public static class MainPanel extends JPanel {
//        private JLabel workingHours;
        private SchedulerWorkingHoursPanel.WorkingHoursPanel workingHours;
        private SchedulerWeekDaysPanel.WeekDaysPanel weekDays;


        public MainPanel(){
            super( new BorderLayout()  );
//            weekDays = new JLabel("Dias de semana");
            weekDays = new SchedulerWeekDaysPanel.WeekDaysPanel();
            workingHours = new SchedulerWorkingHoursPanel.WorkingHoursPanel();
//            workingHours = new JLabel("Horas de trabalho");
            add(weekDays, BorderLayout.NORTH);
            add(workingHours, BorderLayout.SOUTH);

        }
    }

    public SchedulerMainPanel(){
        add( new MainPanel());
    }
}
