package Bank.Management.System;

import jdk.jfr.Experimental;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {

    JComboBox comboBox , comboBox2 , comboBox3 , comboBox4 , comboBox5;

    JTextField textPan , textAadhar;

    JRadioButton r1,r2 ,e1 ,e2;
    JButton next;

    String formno;

    signup2(String formno){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100 , 100 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("page 2:");
        l1.setFont(new Font("Raleway",Font.BOLD,18));
        l1.setBounds(300,20,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details:");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,50,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion: ");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        l3.setBounds(100,130,200,30);
        add(l3);

        String religion[] = {"Hindu" , "Muslim" , "Sikh" ,"Christian" , "Others"};
        comboBox = new JComboBox((religion));
        comboBox.setBackground((new Color(252,208,76)));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,130,320,30);
        comboBox.setBorder(null);
        add(comboBox);

        JLabel l4 = new JLabel("Category: ");
        l4.setFont(new Font("Raleway",Font.BOLD,22));
        l4.setBounds(100,180,200,30);
        add(l4);

        String Category[] = {"General" , "OBC" , "SC" ,"ST" , "Others"};
        comboBox2 = new JComboBox((Category));
        comboBox2.setBackground((new Color(252,208,76)));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,180,320,30);
        comboBox2.setBorder(null);
        add(comboBox2);

        JLabel l5 = new JLabel("Income: ");
        l5.setFont(new Font("Raleway",Font.BOLD,22));
        l5.setBounds(100,235,200,30);
        add(l5);

        String Income[] = {"null" , "< 1,50,000" , "< 2,50,000" ,"< 5,00,000" , "Upto 10,00,000" ,"Above 10,00,000"};
        comboBox3 = new JComboBox((Income));
        comboBox3.setBackground((new Color(252,208,76)));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,235,320,30);
        comboBox3.setBorder(null);
        add(comboBox3);

        JLabel l6 = new JLabel("Education: ");
        l6.setFont(new Font("Raleway",Font.BOLD,22));
        l6.setBounds(100,290,200,30);
        add(l6);

        String educational[] = {"Non-Graduate" , "Graduate" , "Post-Graduate" ,"Doctrate"};
        comboBox4 = new JComboBox((educational));
        comboBox4.setBackground((new Color(252,208,76)));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,290,320,30);
        comboBox4.setBorder(null);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation: ");
        l7.setFont(new Font("Raleway",Font.BOLD,22));
        l7.setBounds(100,345,200,30);
        add(l7);

        String occupation[] = {"Salaried" , "Self-Employed" , "Business" ,"Student" ,"Retired" , "Others"};
        comboBox5 = new JComboBox((occupation));
        comboBox5.setBackground((new Color(252,208,76)));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,345,320,30);
        comboBox5.setBorder(null);
        add(comboBox5);

        JLabel l8 = new JLabel("Pan Number: ");
        l8.setFont(new Font("Raleway",Font.BOLD,22));
        l8.setBounds(100,405,200,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,16));
        textPan.setBounds(350,405,200,30);
        textPan.setBorder(null);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number: ");
        l9.setFont(new Font("Raleway",Font.BOLD,22));
        l9.setBounds(100,460,200,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,16));
        textAadhar.setBounds(350,460,200,30);
        textAadhar.setBorder(null);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen: ");
        l10.setFont(new Font("Raleway",Font.BOLD,22));
        l10.setBounds(100,515,200,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,515,60,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(450,515,60,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account: ");
        l11.setFont(new Font("Raleway",Font.BOLD,22));
        l11.setBounds(100,560,200,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,16));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,560,60,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,16));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(450,560,60,30);
        add(e2);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(e1);
        buttonGroup2.add(e2);

        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(650,20,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(730,20,100,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Ralway" , Font.BOLD , 14));
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setBounds(680,630,70,30);
        next.setBorder(null);
        next.addActionListener(this);
        add(next);

        setSize(850,740);
        setLocation(450,70);
        setLayout(null);
        getContentPane().setBackground(new Color(252,208,76));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String addhar = textAadhar.getText();

        String scitizen = " ";
        if ((r1.isSelected())){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen ="No";
        }

        String eAccount = " ";
        if (e1.isSelected()) {
            eAccount = "Yes";
        } else if (e2.isSelected()) {
            eAccount = "No";
        }

        try{
            if (textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                con c1 = new con();
                String q = "insert into signuptwo values('"+formno+"', '"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signup2("");
    }
}
