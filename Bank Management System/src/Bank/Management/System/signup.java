package Bank.Management.System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.chrono.JapaneseDate;
import java.util.Random;

public class signup extends JFrame implements ActionListener {

    JButton next;

    JRadioButton r1 , r2 , r3;

    JTextField textName , textfName , DOB , textEmail , textAdd , textCity , textPin , textState;
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100 , 100 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Ralway" , Font.BOLD , 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2 .setFont(new Font("Ralway" , Font.BOLD , 22));
        label2.setBounds(390,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3 .setFont(new Font("Ralway" , Font.BOLD , 22));
        label3.setBounds(345,100,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name: ");
        labelName .setFont(new Font("Ralway" , Font.BOLD , 22));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName .setFont(new Font("Ralway" , Font.BOLD , 14));
        textName.setBounds(300,190,400,30);
        textName.setBorder(null);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name: ");
        labelfName .setFont(new Font("Ralway" , Font.BOLD , 22));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textfName = new JTextField();
        textfName .setFont(new Font("Ralway" , Font.BOLD , 14));
        textfName.setBounds(300,240,400,30);
        textfName.setBorder(null);
        add(textfName);

        JLabel DOB = new JLabel("Date of Birth: ");
        DOB .setFont(new Font("Ralway" , Font.BOLD , 22));
        DOB.setBounds(100,290,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        dateChooser.setBorder(null);
        JTextField editor = (JTextField) dateChooser.getDateEditor().getUiComponent();
        editor.setBorder(null);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender: ");
        labelG .setFont(new Font("Ralway" , Font.BOLD , 22));
        labelG.setBounds(100,340,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Ralway" , Font.BOLD , 14));
        r1.setBounds(300,340,100,30);
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Ralway" , Font.BOLD , 14));
        r2.setBounds(450,340,100,30);
        r2.setBackground(new Color(222,255,228));
        add(r2);

        r3 = new JRadioButton("Other's");
        r3.setFont(new Font("Ralway" , Font.BOLD , 14));
        r3.setBounds(600,340,100,30);
        r3.setBackground(new Color(222,255,228));
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail = new JLabel("Email Add: ");
        labelEmail .setFont(new Font("Ralway" , Font.BOLD , 22));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail .setFont(new Font("Ralway" , Font.BOLD , 14));
        textEmail.setBounds(300,390,400,30);
        textEmail.setBorder(null);
        add(textEmail);

        JLabel labelAdd = new JLabel("Address: ");
        labelAdd .setFont(new Font("Ralway" , Font.BOLD , 22));
        labelAdd.setBounds(100,440,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd .setFont(new Font("Ralway" , Font.BOLD , 14));
        textAdd.setBounds(300,440,400,30);
        textAdd.setBorder(null);
        add(textAdd);

        JLabel labelCity = new JLabel("City: ");
        labelCity .setFont(new Font("Ralway" , Font.BOLD , 22));
        labelCity.setBounds(100,490,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity .setFont(new Font("Ralway" , Font.BOLD , 14));
        textCity.setBounds(300,490,400,30);
        textCity.setBorder(null);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code: ");
        labelPin .setFont(new Font("Ralway" , Font.BOLD , 22));
        labelPin.setBounds(100,540,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin .setFont(new Font("Ralway" , Font.BOLD , 14));
        textPin.setBounds(300,540,400,30);
        textPin.setBorder(null);
        add(textPin);

        JLabel labelState = new JLabel("State: ");
        labelState .setFont(new Font("Ralway" , Font.BOLD , 22));
        labelState.setBounds(100,590,200,30);
        add(labelState);

        textState = new JTextField();
        textState .setFont(new Font("Ralway" , Font.BOLD , 14));
        textState.setBounds(300,590,400,30);
        textState.setBorder(null);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Ralway" , Font.BOLD , 14));
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setBounds(630,660,70,30);
        next.setBorder(null);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,770);
        setLocation(360,40);
        getContentPane().setBackground(new Color(222,255,228));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textfName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }else{
            gender = "Others";
        }
        String email = textEmail.getText();
        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textName.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fiels");
            }else{
                con con1 = new con();
                String q = "insert into signup values('"+formno+"' , '"+name+"' , '"+fname+"','"+dob+"' ,'"+gender+"' , '"+email+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signup();
    }
}