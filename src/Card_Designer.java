import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


public class Card_Designer extends JFrame implements ActionListener {

    private JMenuBar mainBar = new JMenuBar();

    private JMenu menu1 = new JMenu("File");
    private JMenu menu2 = new JMenu("Select");
    private JMenu menu3 = new JMenu("Colors");
    private JMenu menu4 = new JMenu("Font");

    private JMenuItem exitItem = new JMenuItem("Exit");

    private JMenuItem home = new JMenuItem("Home");
    private JMenuItem congratsCard = new JMenuItem("Congratulations Card");
    private JMenuItem birthdayCard = new JMenuItem("Birthday Card");

    private JMenuItem yellow = new JMenuItem("Yellow");
    private JMenuItem blue = new JMenuItem("Blue");
    private JMenuItem red = new JMenuItem("Red");
    private JMenuItem green = new JMenuItem("Green");
    private JMenuItem cyan = new JMenuItem("Cyan");

    private JMenuItem arial = new JMenuItem("Arial");
    private JMenuItem timesNew = new JMenuItem("Times New Roman");


    private JPanel card1 = new JPanel(new GridLayout(3,1,5,5));
    private JPanel bPanel = new JPanel(new GridLayout(2,1,5,5));
    private JPanel hPanel = new JPanel(new GridLayout(2,1,5,5));

    private JLabel header = new JLabel("Card Designer Application");
    private JTextField nameOfBirthday = new JTextField("\"Please Enter the Recipient's Name\"");
    private JLabel initialMessage = new JLabel("Then Get Started By Making Selections From the Menu.");

    //Cards
    private JLabel enteredMessage = new JLabel();
    private JTextArea message = new JTextArea("Enter your message here");

    private String name_ = "";
    private String myFont = "";



    CardLayout myCardLayout = new CardLayout();

    public Card_Designer(){
        super("Pimp my JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(675,375);


        setLayout(myCardLayout);

        //Initalizes main menu bar onto the screen
        //Wont show if it isnt populated
        setJMenuBar(mainBar);

        header.setFont(new Font("Arial", Font.BOLD, 22));
        nameOfBirthday.setFont(new Font("Arial", Font.ITALIC, 22));
        mainBar.add(menu1);
        mainBar.add(menu2);
        mainBar.add(menu3);
        mainBar.add(menu4);

        menu1.add(exitItem);
        menu2.add(home);
        menu2.add(congratsCard);
        menu2.add(birthdayCard);
        menu3.add(yellow);
        menu3.add(blue);
        menu3.add(red);
        menu3.add(green);
        menu3.add(cyan);
        menu4.add(arial);
        menu4.add(timesNew);

        card1.add(header);
        card1.add(nameOfBirthday);
        card1.add(initialMessage);
        add(card1, "Initial Card");

        hPanel.add(enteredMessage);
        hPanel.add(message);
        add(hPanel, "Happy Birthday Card");

        bPanel.add(enteredMessage);
        bPanel.add(message);
        add(bPanel, "Congrats Card");

        exitItem.addActionListener(this);
        home.addActionListener(this);
        congratsCard.addActionListener(this);
        birthdayCard.addActionListener(this);

        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);
        cyan.addActionListener(this);
        yellow.addActionListener(this);

        arial.addActionListener(this);
        timesNew.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        name_ = nameOfBirthday.getText();

        if (source == exitItem)
            super.dispose();
        if( source == congratsCard){
            myCardLayout.show(getContentPane(), "Congrats Card");
            enteredMessage.setFont(new Font(myFont, Font.ITALIC, 24));
            enteredMessage.setText("Congratulations " + name_);
        }
        if( source == birthdayCard){
            myCardLayout.show(getContentPane(), "Happy Birthday Card");
            enteredMessage.setText("Happy Birthday " + name_);
            enteredMessage.setFont(new Font(myFont, Font.ITALIC, 24));
        }
        if(source == home){
            myCardLayout.show(getContentPane(), "Initial Card");
        }

        if(source == arial)
            myFont = "Arial";
        if(source == timesNew)
            myFont = "Times New Roman";

        //Color Options
        if (source == yellow){
            hPanel.setBackground(Color.YELLOW);
            card1.setBackground(Color.YELLOW);
            bPanel.setBackground(Color.YELLOW);
            nameOfBirthday.setBackground(Color.YELLOW);
            message.setBackground(Color.YELLOW);

        }
        if (source == green){
            hPanel.setBackground(Color.GREEN);
            card1.setBackground(Color.GREEN);
            bPanel.setBackground(Color.GREEN);
            nameOfBirthday.setBackground(Color.GREEN);
            message.setBackground(Color.GREEN);
        }
        if (source == blue){
            hPanel.setBackground(Color.BLUE);
            card1.setBackground(Color.BLUE);
            bPanel.setBackground(Color.BLUE);
            nameOfBirthday.setBackground(Color.BLUE);
            message.setBackground(Color.BLUE);

        }
        if (source == red){
            hPanel.setBackground(Color.RED);
            card1.setBackground(Color.RED);
            bPanel.setBackground(Color.RED);
            nameOfBirthday.setBackground(Color.RED);
            message.setBackground(Color.RED);
        }
        if (source == cyan){
            hPanel.setBackground(Color.CYAN);
            card1.setBackground(Color.CYAN);
            bPanel.setBackground(Color.CYAN);
            nameOfBirthday.setBackground(Color.CYAN);
            message.setBackground(Color.CYAN);

        }
    }

}
