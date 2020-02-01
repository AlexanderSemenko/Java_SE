package com.example.newyear;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class MyPanel extends JPanel{

    private String image = "resurses/1.jpg";
    private Image img = null;
    private Font myFont = new Font ("TimesRoman", Font.BOLD, 20);



    MyPanel(){

        try{
            img = ImageIO.read(new File(image));

        }catch(IOException exc){

            exc.printStackTrace();
        }

    }

    @Override
    public void paintComponent(Graphics g){

        g.drawImage(img, 0, 0, null);
        g.setFont (myFont);
        g.drawString("HAPPY NEW YEAR", 50, 330);

    }
}
