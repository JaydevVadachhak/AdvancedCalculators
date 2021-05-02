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
public class AdvancedCalculators extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3;
    JButton b1,b2,b3,b4,b5,b6;
    
    AdvancedCalculators(){
        super("Pramukh Calculators");

        l1 = new JLabel("Pramukh Calculators");
        l1.setFont(new Font("CALIBRI", Font.BOLD, 25));
        l1.setBounds(180,5,300,50);
        add(l1);
        
        l2 = new JLabel("Discount, Loan, Split, GST, Percentage");
        l2.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l2.setBounds(150,50,350,30);
        add(l2);
        
        b1 = new JButton("GST");
        b1.setFont(new Font("CALIBRI",Font.PLAIN,16));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(30,150,150,50);
        add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("DISCOUNT");
        b2.setFont(new Font("CALIBRI",Font.PLAIN,16));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(215,150,150,50);
        add(b2);
        b2.addActionListener(this);
        
        b3 = new JButton("SPLIT BILL");
        b3.setFont(new Font("CALIBRI",Font.PLAIN,16));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(400,150,150,50);
        add(b3);
        b3.addActionListener(this);
        
        b6 = new JButton("PERCENTAGE");
        b6.setFont(new Font("CALIBRI",Font.PLAIN,16));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(400,300,150,50);
        add(b6);
        b6.addActionListener(this);
        
        b5 = new JButton("LOAN");
        b5.setFont(new Font("CALIBRI",Font.PLAIN,16));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(215,300,150,50);
        add(b5);
        b5.addActionListener(this);
        
        b4 = new JButton("BASIC");
        b4.setFont(new Font("CALIBRI",Font.PLAIN,16));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(30,300,150,50);
        add(b4);
        b4.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b4){
            new MyCalculator("Pramukh Basic Calculator").setVisible(true);
            setVisible(false);
        }
        else if(e.getSource()==b1){
            new GST().setVisible(true);
            setVisible(false);
        }
        else if(e.getSource()==b2){
            new Discount().setVisible(true);
            setVisible(false);
        }
        else if(e.getSource()==b3){
            new SplitBill().setVisible(true);
            setVisible(false);
        }
        else if(e.getSource()==b5){
            new Loan().setVisible(true);
            setVisible(false);
        }
        else if(e.getSource()==b6){
            new Percentage().setVisible(true);
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new AdvancedCalculators().setVisible(true);  
    }
}
