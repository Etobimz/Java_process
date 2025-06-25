
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyFrame()  {

        JFrame frame = new JFrame(); // creates a frame
        
        this.setTitle("This is the frame header"); //  sets a title to the frame 

        this.setVisible(true); // make frame visible

        this.setSize(420,420); // sets the x-dimension  adn y-dimension of the frame

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // default is hide on close. i.e  what happens when you hit the red exit button
        
        this.setResizable(false); //  prevents the frame from being resizeable after been initially sized

        
        // to change the logo from java def icon to your own image 
            ImageIcon image = new ImageIcon("/Users/abimbolaolarinde/Downloads/Jva/MainClasses/salute.jpg"); // create image icon
            this.setIconImage(image.getImage());


        // to change the bacground color of the frame
            this.getContentPane().setBackground(Color.blue); 

            //OR "RGB"
            this.getContentPane().setBackground(new Color (123, 50, 251)); 

            //OR Hexadecimals
            this.getContentPane().setBackground(new Color(0xFFFFFF)); 


    }
    
    
}
