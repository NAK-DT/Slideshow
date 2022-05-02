import java.awt.*;
import javax.swing.*;
import javax.swing.JComponent;

public class fml extends Presenterr {

    private JComponent createCenterComponents;

    @Override
    public JComponent createCenterComponent() {

        ImageIcon image = new ImageIcon("C:\\Users\\David\\IdeaProjects\\AOOPLABS\\Slideshow\\src\\WHOPPER.png");
        ImageIcon image2 = new ImageIcon("C:\\Users\\David\\IdeaProjects\\AOOPLABS\\Slideshow\\src\\WHOPPER.png");
        ImageIcon image3 = new ImageIcon("C:\\Users\\David\\IdeaProjects\\AOOPLABS\\Slideshow\\src\\BREW.jpg");

        ImageIcon [] ye = {image,image2,image3};
        return createCenterComponents;
    }

    @Override
    public void northButtonPressed() {

    }

    @Override
    public void southButtonPressed() {

    }


    @Override
    public void eastButtonPressed() {

    }

    @Override
    public void westButtonPressed() {

    }

}

