package com.example.newyear;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Window extends JFrame implements ActionListener{

    private final JLabel jlab = new JLabel("Press a buttom");
    private final JPanel p;


    Window(){
        setSize(250,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        p = new JPanel();
        JButton button = new JButton("BUTTON");
        setLayout(new BorderLayout());
        p.add(button);
        add (p, BorderLayout.SOUTH);
        button.addActionListener(this);
        p.add(jlab);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getActionCommand().equals("BUTTON")){
            Flow f = new Flow();
            Thread Thrd = new Thread(f);
            Thrd.start();

        }
    }
}
