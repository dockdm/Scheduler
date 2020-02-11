package Scheduler_UI.GUI;


import java.awt.*;
import javax.swing.*;


public class SchedulerWeekDaysPanel extends JPanel {

    private static final String[] daysOfTheWeek = {"", "Segunda" , "Ter�a" , "Quarta" , "Quinta" , "Sexta" , "S�bado", "Domingo"};

    public static class WeekDaysPanel  extends JPanel {
    public static JLabel[] weekDaysLabels;

        public WeekDaysPanel(){
            super( new GridLayout(1 , 8 , 10, 0 )  );
            weekDaysLabels = new JLabel[daysOfTheWeek.length];
            for (int i = 0; i< daysOfTheWeek.length; i++){
                weekDaysLabels[i] = new JLabel(daysOfTheWeek[i]);
                weekDaysLabels[i].setSize(30,20);
                add(weekDaysLabels[i]);
            }

        }
    }

    public SchedulerWeekDaysPanel() {
        add(new WeekDaysPanel());
    }


}
