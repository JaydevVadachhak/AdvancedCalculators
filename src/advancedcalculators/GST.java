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
public class GST extends JFrame implements ActionListener  {
    
    JLabel l1,l2;
    JButton b1,b2,b3;
    
    GST(){
        super("Pramukh Calculators");
        
        l1 = new JLabel("Pramukh Calculators - GST");
        l1.setFont(new Font("CALIBRI", Font.BOLD, 25));
        l1.setBounds(150,5,300,50);
        add(l1);
        
        l2 = new JLabel("Discount, Loan, Split, GST, Percentage");
        l2.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l2.setBounds(150,50,350,30);
        add(l2);
        
        b1 = new JButton("ADD GST");
        b1.setFont(new Font("CALIBRI",Font.PLAIN,16));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100,150,150,50);
        add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("REMOVE GST");
        b2.setFont(new Font("CALIBRI",Font.PLAIN,16));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300,150,150,50);
        add(b2);
        b2.addActionListener(this);
        
        b3 = new JButton("HOME");
        b3.setFont(new Font("CALIBRI",Font.PLAIN,16));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(200,300,150,50);
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
            new AddGST().setVisible(true);
            setVisible(false);
        }
        else if(e.getSource()==b2){
            new RemoveGST().setVisible(true);
            setVisible(false);
        }
        else if(e.getSource()==b3){
            new AdvancedCalculators().setVisible(true);
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new GST().setVisible(true);
    }
    
}
