import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.JTextComponent;

public abstract class Presenter extends JPanel {

    public abstract JComponent createCenterComponent();

    public abstract void northButtonPressed();
    public abstract void eastButtonPressed();
    public abstract void southButtonPressed();
    public abstract void westButtonPressed();
    JTextArea TextComponent;
    public Presenter() {
        JFrame frame = new JFrame();
        JPanel Holder = new JPanel();
        Holder.setLayout(new BorderLayout());
        // setup layout manager for frame
        frame.setTitle("Presenter framework");
        frame.setPreferredSize(new Dimension(1000, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JButton northButton = new JButton("North");
        //northButton.setBounds(50, 50, 100, 50);
        JButton southButton = new JButton("South");
        //southButton.setBounds(50, 100, 100, 50);
        JButton westButton = new JButton("West");
        //westButton.setBounds(50, 150, 100, 50);
        JButton eastButton = new JButton("East");
        //eastButton.setBounds(50, 200, 100, 50);
        northButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == northButton) {
                    northButtonPressed();
                }
            }
        }
        );

        westButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == westButton) {
                    westButtonPressed();
                }
            }
        }
        );

        eastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == eastButton) {
                    eastButtonPressed();
                }
            }
        }
        );

        southButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == southButton) {
                    southButtonPressed();
                }
            }
        }
        );

        // add northButton to a JPanel, add that panel to frame

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        //panel.setBounds(0, 370, 300, 300);
        panel.add(northButton, BorderLayout.NORTH);
        panel.add(southButton, BorderLayout.SOUTH);
        panel.add(westButton, BorderLayout.WEST);
        panel.add(eastButton, BorderLayout.EAST);


        Holder.add(panel, BorderLayout.WEST);
        JComponent centerComponent = createCenterComponent();
        TextComponent = new JTextArea();
        TextComponent.setText("sheesh");

        frame.add(centerComponent, BorderLayout.CENTER);

        Holder.add(TextComponent,BorderLayout.CENTER);
        frame.add(Holder, BorderLayout.SOUTH);
        // create other components (text component, e.g.), add them to frame
        // show frame
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        panel.setVisible(true);
        Holder.setVisible(true);
    }

    public void showText(String text) {
        TextComponent.setText(text);
    }

}