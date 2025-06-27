
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;





/*

 
// JLabel = a GUI display area for a string of text, an image, or both


public class main3 {

    public static void main(String[] args) {

        JLabel label = new JLabel(); // create a label
        label.setText("Bro, whatsup"); // set text of label 


        MyFrame myFrame = new MyFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // myFrame.setSize(700, 700);
        myFrame.setVisible(true);


        // To add an image in our frame
        ImageIcon image = new ImageIcon("/Users/abimbolaolarinde/Downloads/Jva/MainClasses/salute.png");
        label.setIcon(image);
        // myFrame.add(label); below makes it add the picture the frame,


        //  To adjust the labels text position on the frame
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        // To adjust the  labels text/font "color" on the frame
        label.setForeground(new Color(10,255,10));

        // To adjust the labels font on the frame
        label.setFont(new Font("MV Boli", Font.PLAIN,50));

        // To adjust how far away the text is from the image
        label.setIconTextGap(-25); // - infinty to infintiy 

        // To set the background color; it by default takes the whole screen size but it is resizeable
        label.setBackground(Color.BLACK); 
        label.setOpaque(true);


        //  To add a border for our label
        Border border = BorderFactory.createLineBorder(Color.green);
        label.setBorder(border);


        //  To set the aliignment of the contents{Image, text} of the label on the frame
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        


        // changing our layout manager  and settign our label to contain a particular spot in our frame 
        // as opposed to taking the whole frame size 
        
        //myFrame.setLayout(null);
        //label.setBounds(0, 0, 400, 500); // {x,y}  {0,0} makes it top left corner






        // To link/add the label to frame
        myFrame.add(label);



        // automatically adjust the frame to fit the size of the labels / components we have on our frame.
        // can make setreziable to false if we dont want people to resize it
        // Always make sure you add the components first before doing the below  ".pack()"
       
        myFrame.pack();




        
    }



}


        


     */
        
         
       







        /*
 
// JPanel = a GUI component that functions as a container to hold other components

public class main3 {

    public static void main(String[] args) { 


         // create the panel
         JPanel redpanel = new JPanel();
         redpanel.setBackground(Color.red);
         redpanel.setBounds(0,0,250,250);


          // create blue panel
        JPanel  bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);
        bluepanel.setLayout(null);


         // create green panel
         JPanel  greenpanel = new JPanel();
         greenpanel.setBackground(Color.green);
         greenpanel.setBounds(0,250,500,250);
         greenpanel.setLayout(new BorderLayout());



         // create a label
         JLabel label = new JLabel();
         label.setText("Hi there");

         ImageIcon image = new ImageIcon("/Users/abimbolaolarinde/Downloads/Jva/MainClasses/salute.png");
         label.setIcon(image);

         label.setVerticalAlignment(JLabel.BOTTOM);
         label.setHorizontalAlignment(JLabel.RIGHT);

 
        // add the label picture to  the red panel 
        greenpanel.add(label);  






 

        MyFrame myFrame = new MyFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        myFrame.setSize(750, 750);
        myFrame.setVisible(true);
        myFrame.add(redpanel);
        myFrame.add(bluepanel);
        myFrame.add(greenpanel);







       






   
   
   
   
    }





}


 */



