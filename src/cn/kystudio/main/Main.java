package cn.kystudio.main;

import javax.swing.*;

/**
 * 界面类
 *
 * Created by ylf on 2016/1/27.
 */
public class Main extends JFrame {
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    public Main(String title){
        super(title);
        panel = new JPanel();
        button1=new JButton("commit");
        button2=new JButton("cancel");

        panel.add(button1);
        panel.add(button2);

        this.add(panel);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
