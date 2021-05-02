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
public class Loan extends JFrame implements ActionListener {
    
    JLabel l1,l2;
    JLabel l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField t3,t4,t8,t9,t10;
    JComboBox c6,c7;
    JButton b1,b2,b3;
    
    Loan(){
        
        super("Pramukh Calculators");
        
        l1 = new JLabel("Pramukh Calculators - Loan");
        l1.setFont(new Font("CALIBRI", Font.BOLD, 25));
        l1.setBounds(130,5,350,50);
        add(l1);
        
        l2 = new JLabel("Discount, Loan, Split, GST, Percentage");
        l2.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l2.setBounds(150,50,350,30);
        add(l2);
        
        l3 = new JLabel("Principal:");
        l3.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l3.setBounds(30,100,200,30);
        add(l3);
        
        t3 = new JTextField();
        t3.setBounds(240,100,325,30);
        add(t3);
        
        l4 = new JLabel("Interest:");
        l4.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l4.setBounds(30,150,200,30);
        add(l4);
        
        t4 = new JTextField();
        t4.setBounds(240,150,325,30);
        add(t4);
        
        l5 = new JLabel("Tenure In Y/M:");
        l5.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l5.setBounds(30,200,200,30);
        add(l5);
        
        l6 = new JLabel("Years:");
        l6.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l6.setBounds(240,200,100,30);
        add(l6);
        
        
        String Years[] = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        c6 = new JComboBox(Years);
        c6.setBackground(Color.WHITE);
        c6.setBounds(290,200,100,30);
        add(c6);
       
        
        l7 = new JLabel("Months:");
        l7.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l7.setBounds(400,200,100,30);
        add(l7);
        
        String Months[] = {"0","1","2","3","4","5","6","7","8","9","10","11"};
        c7 = new JComboBox(Months);
        c7.setBackground(Color.WHITE);
        c7.setBounds(465,200,100,30);
        add(c7);
        
        l8 = new JLabel("EMI:");
        l8.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l8.setBounds(30,300,200,30);
        add(l8);
        
        t8 = new JTextField();
        t8.setBounds(240,300,325,30);
        t8.setEditable(false);
        add(t8);
        
        l9 = new JLabel("Total Interest:");
        l9.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l9.setBounds(30,350,200,30);
        add(l9);
        
        t9 = new JTextField();
        t9.setBounds(240,350,325,30);
        t9.setEditable(false);
        add(t9);
        
        l10 = new JLabel("Total Amount:");
        l10.setFont(new Font("CALIBRI", Font.PLAIN, 18));
        l10.setBounds(30,400,200,30);
        add(l10);
        
        t10 = new JTextField();
        t10.setBounds(240,400,325,30);
        t10.setEditable(false);
        add(t10);
        
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
            }
            else{
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
        b1.setBounds(240,250,150,30);
        add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("Back");
        b2.setFont(new Font("CALIBRI",Font.PLAIN,16));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(240,450,150,30);
        add(b2);
        b2.addActionListener(this);
        
        b3 = new JButton("RESET");
        b3.setFont(new Font("CALIBRI",Font.PLAIN,16));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(400,450,150,30);
        add(b3);
        b3.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setSize(600,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1){
           if(t3.getText().equals("")||t4.getText().equals("")){
               JOptionPane.showMessageDialog(null,"Fill all the required fields");
           }
           else if(t4.getText().equals("0")||t4.getText().equals("00")||t4.getText().equals("000")){
               JOptionPane.showMessageDialog(null,"Interest Can not be zero");
               t4.setText("");
           }
           else if(t4.getText().length()>3 || Float.valueOf(t4.getText())>100){
               JOptionPane.showMessageDialog(null,"Interest Can not be more than 100");
           }
           else if(c6.getSelectedItem().equals("0")&& c7.getSelectedItem().equals("0")){
               JOptionPane.showMessageDialog(null,"Tenure Can not be zero");
           }
           else{
               double P = Double.parseDouble(t3.getText());
               double Interest = Double.parseDouble(t4.getText());
               Object O1 = c6.getSelectedItem();
               double TenureYears = Double.valueOf(O1.toString());
               Object O2 = c7.getSelectedItem();
               double TenureMonths = Double.valueOf(O2.toString());
               double Tenure;
               double EMI;
               double TotalAmount;
               double TotalInterest;
               double R = Interest/1200;

               if(TenureYears==0){
                   Tenure = (double)((0*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==1){
                   Tenure = (double)((1*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==2){
                   Tenure = (double)((2*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==3){
                   Tenure = (double)((3*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==4){
                   Tenure = (double)((4*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==5){
                   Tenure = (double)((5*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==6){
                   Tenure = (double)((6*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==7){
                   Tenure = (double)((7*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==8){
                   Tenure = (double)((8*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==9){
                   Tenure = (double)((9*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==10){
                   Tenure = (double)((10*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==11){
                   Tenure = (double)((11*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==12){
                   Tenure = (double)((12*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==13){
                   Tenure = (double)((13*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==14){
                   Tenure = (double)((14*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==15){
                   Tenure = (double)((15*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==16){
                   Tenure = (double)((16*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==17){
                   Tenure = (double)((17*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==18){
                   Tenure = (double)((18*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==19){
                   Tenure = (double)((19*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==20){
                   Tenure = (double)((20*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==21){
                   Tenure = (double)((21*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==22){
                   Tenure = (double)((22*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==23){
                   Tenure = (double)((23*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==24){
                   Tenure = (double)((24*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==25){
                   Tenure = (double)((25*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==26){
                   Tenure = (double)((26*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==27){
                   Tenure = (double)((27*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==28){
                   Tenure = (double)((28*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==29){
                   Tenure = (double)((29*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
               }
               else if(TenureYears==30){
                   Tenure = (double)((30*12) + TenureMonths);
                   double Cal = (Math.pow((1+R),Tenure)/(Math.pow((1+R),Tenure)-1));
                   EMI = (double)(P*R*Cal);
                   double Cal1 = (double)(EMI*Tenure);
                   TotalInterest = (double)(Cal1 - P);
                   TotalAmount = (double)(P+TotalInterest);
                   t8.setText(String.valueOf(EMI));
                   t9.setText(String.valueOf(TotalInterest));
                   t10.setText(String.valueOf(TotalAmount));
                   
               }
           }
       }
       else if(e.getSource()==b2){
           new AdvancedCalculators().setVisible(true);
           setVisible(false);
       }
       else if(e.getSource()==b3){
           t4.setText("");
           t3.setText("");
           t8.setText("");
           t9.setText("");
           t10.setText("");
       }
    }
    
    public static void main(String[] args){
        new Loan().setVisible(true);
    }
    
}
