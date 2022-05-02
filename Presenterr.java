import java.awt.*;
import javax.swing.*;
import javax.swing.JComponent;


public abstract class Presenterr extends JPanel {

    public abstract JComponent createCenterComponent();

    public abstract void northButtonPressed();
    public abstract void eastButtonPressed();
    public abstract void southButtonPressed();
    public abstract void westButtonPressed();

    public Presenterr() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setPreferredSize(new Dimension(1000, 1000));
        frame.setLayout(new BorderLayout());


        //panel.setPreferredSize(new Dimension(100,100));

        // setup layout manager for frame
//		frame.setPreferredSize(new Dimension(600,600));
        //frame.setSize(400,400);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		//this.setLayout(null);
//		frame.pack();


        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");

        JButton eastButton = new JButton("East");
//		eastButton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				eastButtonPressed();
//			}
//		});

        JButton westButton = new JButton("West");
//		westButton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				westButtonPressed();
//			}
//		});

        // add northButton to a JPanel, add that panel to frame(done later)
        panel.setLayout(new BorderLayout());
        panel.add(northButton, BorderLayout.NORTH);
        panel.add(southButton, BorderLayout.SOUTH);
        panel.add(westButton, BorderLayout.WEST);
        panel.add(eastButton, BorderLayout.EAST);

        JComponent centerComponent = createCenterComponent();

        // add centerComponent to frame
        frame.add(centerComponent);

        // create other components (text component, e.g.), add them to frame
        JTextArea jta = new JTextArea(100, 20);
        jta.append("Welcome back.\n");


        //add panel to frame
        frame.add(panel);
        frame.add(jta);
        frame.pack();
        // show frame
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void showText(String text) {
        // update the text component

    }
}