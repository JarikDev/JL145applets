package com;

import javax.swing.*;

public class AppletLesson extends JApplet{
    @Override
    public void init() {
        add(new JButton(getParameter("buttonName")));
    }
}
