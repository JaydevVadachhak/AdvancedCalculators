/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedcalculators;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author PREMIUM
 */
public class Discount extends JFrame implements ActionListener {
    
    JLabel l1,l2;
    JLabel l3,l4,l5,l6,l7;
    JTextField t3,t4,t5,t6,t7;
    JButton b1,b2,b3;
    
    Discount(){
        super("Pramukh Calculators");
        
        l1 = new JLabel("Pramukh Calculators - Discount");
        l1.setFont(new Font("CALIBRI", Font.BOLD, 25));
        l1.setBounds(130,5,400,50);
        add(l1);
        
        l2 = new JLabel("Discount, Loan, Split, GST, Percentage");
        l2.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l2.setBounds(150,50,350,30);
        add(l2);
        
        l3 = new JLabel("Original Price:");
        l3.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l3.setBounds(30,100,200,30);
        add(l3);
        
        l4 = new JLabel("Discount%:");
        l4.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l4.setBounds(30,150,200,30);
        add(l4);
        
        l5 = new JLabel("Discounted Amount:");
        l5.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l5.setBounds(30,250,200,30);
        add(l5);
        
        l6 = new JLabel("Final Price:");
        l6.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l6.setBounds(30,300,200,30);
        add(l6);
        
        t3 = new JTextField();
        t3.setBounds(240,100,300,30);
        add(t3);
        
        t4 = new JTextField();
        t4.setBounds(240,150,300,30);
        add(t4);
        
        t5 = new JTextField();
        t5.setBounds(240,250,300,30);
        t5.setEditable(false);
        add(t5);
        
        t6 = new JTextField();
        t6.setBounds(240,300,300,30);
        t6.setEditable(false);
        add(t6);
        
        t3.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar()=='.' || ke.getKeyCode()==8) {
               t3.setEditable(true);
            } else{
                t3.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t3.setText("");
            }
         }
      });
        
        t4.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar()=='.' || ke.getKeyCode()==8) {
               t4.setEditable(true);
            } else{
                t4.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t4.setText("");
            }
         }
      });
        
     
        
        b1 = new JButton("Calculate");
        b1.setFont(new Font("CALIBRI",Font.PLAIN,16));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(240,200,150,30);
        add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("Back");
        b2.setFont(new Font("CALIBRI",Font.PLAIN,16));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(240,350,150,30);
        add(b2);
        b2.addActionListener(this);
        
        b3 = new JButton("RESET");
        b3.setFont(new Font("CALIBRI",Font.PLAIN,16));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(400,350,150,30);
        add(b3);
        b3.addActionListener(this);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            if(t3.getText().equals("")||t4.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the required fields");
            }
            else{
                float OriginalPrice = Float.parseFloat(t3.getText());
                float Discount = Float.parseFloat(t4.getText());
                float DiscountPrice = (OriginalPrice*Discount)/100;
                float FinalPrice = OriginalPrice - DiscountPrice;
                t5.setText(String.valueOf(DiscountPrice));
                t6.setText(String.valueOf(FinalPrice));
            }
        }
        else if(e.getSource()==b2){
            new AdvancedCalculators().setVisible(true);
            setVisible(false);
        }
        else if(e.getSource()==b3){
            t4.setText("");
            t3.setText("");
            t5.setText("");
            t6.setText("");
        }
 
    }

    public static void main(String[] args){
        new Discount().setVisible(true);
    }
}
