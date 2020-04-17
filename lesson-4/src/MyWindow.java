import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 400);
        setLayout(null);
        JPanel[] jp = new JPanel[2];

        jp[0] = new JPanel();
        add(jp[0]);
        jp[0].setBounds(0,0,getWidth(),getHeight()-100);
        jp[0].setBackground(Color.LIGHT_GRAY);
        jp[0].setLayout(new BorderLayout());
        JTextArea jta = new JTextArea();
        jta.setEditable(false);
        JScrollPane jsp = new JScrollPane(jta);
        jp[0].add(jsp);

        jp[1] = new JPanel();
        add(jp[1]);
        jp[1].setBounds(0,getHeight()-100,getWidth()- 100,80);
        jp[1].setLayout(new BorderLayout());

        JTextField field = new JTextField();
        add(field);
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.append(field.getText() + "\n");
                field.setText("");
            }
        });

        jp[1].add(field);


        JButton enter = new JButton("Отправить");
        add(enter);
        enter.setLayout(new BorderLayout());
        enter.setBounds(getWidth()-100, getHeight()- 100,100,80);
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.append(field.getText() + "\n");
                field.setText("");
            }
        });
        setVisible(true);
    }
}
