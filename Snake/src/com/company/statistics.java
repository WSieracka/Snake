package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.*;
import java.util.Objects;

public class statistics {
    private int score = 10;
    private String hightscore=" ";
    public String HScore(){
        if (hightscore.equals(" ")){
            hightscore = this.GetHightscore();
        }
        if(score > Integer.parseInt((hightscore.split(" from the results ")[1]))){
            String name = JOptionPane.showInputDialog("What is your name?");
            hightscore =name + " from the results " + score;
            File score = new File("hightscore.dat");
            if(!score.exists()){
                try{
                    score.createNewFile();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            FileWriter write = null;
            BufferedWriter writer = null;
            try{
                write = new FileWriter(score);
                writer = new BufferedWriter(write);
                writer.write(this.hightscore);


            }catch(IOException e){
                e.printStackTrace();
            }
            finally{
                try{
                    if(writer != null){
                        writer.close();
                    }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }

        }
        return hightscore;
    }



    public String GetHightscore(){
        BufferedReader reader = null;
        FileReader file = null;
        try{
            file = new FileReader("hightscore.dat");
            reader = new BufferedReader(file);
            return reader.readLine();
        }
        catch(Exception e){
            return "NN:0";
        }
        finally{
            try{
                if(reader != null){
                    reader.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }

        }

    }
    public JPanel Paint(){
        JPanel panel = new JPanel();

        LayoutManager overlay = new OverlayLayout(panel);
        panel.setLayout(overlay);
        String napis = new statistics().HScore();
        //String napis = this.GetHightscore();
        JLabel label1 = new JLabel(napis);
        label1.setForeground(Color.RED);
        label1.setFont(new Font("SansSerif", Font.BOLD, 16));
        label1.setAlignmentX(0.5f);
        label1.setAlignmentY(0.5f);
        panel.add(label1);
        JLabel label2 = new JLabel(new ImageIcon(Objects.requireNonNull(this.getClass().getResource("resources/images/sta.png"))));
        label2.setAlignmentX(0.5f);
        label2.setAlignmentY(0.5f);
        panel.add(label2);



        
        return panel;
    }
    public static void main(String[] args){
        new statistics().HScore();
    }

}
