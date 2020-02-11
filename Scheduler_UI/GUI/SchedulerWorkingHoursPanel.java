package Scheduler_UI.GUI;



import java.awt.*;
import javax.swing.*;


public class SchedulerWorkingHoursPanel extends JPanel{

    private static final String[] workingHoursOfTheWeek = {"8:00" , "9:00" , "10:00" , "11:00" , "12:00" , "13:00" , "14:00" , "15:00" ,"16:00" ,"17:00" , "18:00" , "19:00" , "20:00"  };
//    private static final Integer[]

    public static class WorkingHoursPanel extends JPanel{
        public static JLabel[] workingHoursLabels;
        public static JTextArea[] tasksInput;


        public WorkingHoursPanel(){
            super( new GridLayout(12 , 8 , 10, 2 )  );
            workingHoursLabels = new JLabel[workingHoursOfTheWeek.length];
            tasksInput = new JTextArea[12*7];
            for (int i = 0, j = 0 , k = 0; i< 12*8 ; i++){
                if( (i)%8 == 0) {
                    workingHoursLabels[j] = new JLabel(workingHoursOfTheWeek[j]);
                    workingHoursLabels[j].setSize(30 ,20);
                    add(workingHoursLabels[j]);
                    j++;

                } else{
                    tasksInput[k] = new JTextArea();
                    tasksInput[k].setSize(30,20);
                    add(tasksInput[k]);
                    k++;
                }


            }
        }

    }

    public SchedulerWorkingHoursPanel(){
        add(new WorkingHoursPanel());
    }



}
