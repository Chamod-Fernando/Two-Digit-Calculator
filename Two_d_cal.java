import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Two_d_cal {
    private JTextArea n1;
    private JTextArea n2;
    private JButton calbButton;
    private JTextField add;
    private JTextField sub;
    private JTextField mul;
    private JTextField div;
    private JPanel Main;

    public static void main(String[] args){
        JFrame frame = new JFrame("Two_d_cal");
        frame.setContentPane(new Two_d_cal().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Two_d_cal() {
        calbButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double m1,m2,ad,su,mu,di;

                m1 = Integer.parseInt(n1.getText());
                m2 = Integer.parseInt(n2.getText());

                ad = m1+m2;
                add.setText(String.valueOf(ad));

                su = m1-m2;
                sub.setText(String.valueOf(su));

                mu = m1*m2;
                mul.setText(String.valueOf(mu));

                di = m1/m2;
                div.setText(String.valueOf(di));
            }


        });
    }
}
