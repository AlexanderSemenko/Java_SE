package com.example.newyear;

import java.util.Random;
import javax.swing.JFrame;


public class Flow implements Runnable{

    private JFrame window;
    private int i;
    private Random random;



    void mod(){

        random = new Random();

        int width = random.nextInt(1920) + 1;
        int height = random.nextInt(1080) + 1;
        MyPanel p = new MyPanel();
        window = new JFrame();

        window.add(p);

        window.setSize(300,390);
        window.setLocation(width, height);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true);

        p.setBounds(0, 0, 300, 300);

    }

    @Override
    public void run() {
        for(i = 0; i < 30; i++)
            try{
                mod();
                Thread.sleep(500);

            }catch(InterruptedException exc){
                System.out.println(exc.getMessage());
            }
    }



}