import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dell Laptop on 11.09.2016.
 */
public class Question {
    JFrame frame;
    JButton yes, no;
    JPanel panel, buttons;
    JLabel question;
    public void Ask(){
        panel=new JPanel();
        Font f=new Font("Castella", Font.CENTER_BASELINE,14 );
        question=new JLabel(" Are you ready give job for this guy???    ");
        question.setFont(f);
        yes=new JButton("YES");
        yes.addActionListener(new ButtonListener());
        no=new JButton("NO");
        no.addActionListener(new ButtonListener());
        FlowLayout f1=new FlowLayout();
        panel.setLayout(f1);
        panel.add(question);
        panel.add(yes);
        panel.add(no);



        frame=new JFrame("I'm just  want ask");
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        frame.setContentPane(panel);
        frame.setSize(300,100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
    public class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String s=e.getActionCommand();
            if("NO".equals(s)){
                no.setVisible(false);
            }
            if("YES".equals(s)){
                JOptionPane.showMessageDialog(null,"Thank's a lot!!!","Answer",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new Question().Ask();

    }

}
