package Scheduler_UI;


import Scheduler_UI.GUI.SchedulerFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class Scheduler {

    public static void main(String[] args ) throws IOException {

//
        SchedulerFrame schedulerFrame = new SchedulerFrame("Scheduler");
        schedulerFrame.setPreferredSize(new Dimension(700, 480));
        schedulerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        schedulerFrame.pack();
        schedulerFrame.setLocationRelativeTo(null);
        schedulerFrame.setVisible(true);
    }

}
