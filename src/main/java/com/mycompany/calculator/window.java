/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.script.*;

/**
 *
 * @author School work
 */
public class window extends JFrame implements ActionListener {
    JButton button0 = new  JButton("0");
    JButton button1 = new  JButton("1");
    JButton button2 = new  JButton("2");
    JButton button3 = new  JButton("3");
    JButton button4 = new  JButton("4");
    JButton button5 = new  JButton("5");
    JButton button6 = new  JButton("6");
    JButton button7 = new  JButton("7");
    JButton button8 = new  JButton("8");
    JButton button9 = new  JButton("9");
    JButton buttonp = new  JButton("+");
    JButton buttonm = new  JButton("-");
    JButton buttond = new  JButton("/");
    JButton buttonmm = new  JButton("*");
    JButton buttone = new  JButton("=");
    JButton buttonac = new  JButton("ac");
    JTextField texts = new JTextField();
    String currentText = texts.getText() ;
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
    String alltext = "";
    String shownText = "";
    window(){
    button0.addActionListener(this);
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);
    button5.addActionListener(this);
    button6.addActionListener(this);
    button7.addActionListener(this);
    button8.addActionListener(this);
    button9.addActionListener(this);
    buttonm.addActionListener(this);
    buttonmm.addActionListener(this);
    buttonp.addActionListener(this);
    buttond.addActionListener(this);
    buttonac.addActionListener(this);
    buttone.addActionListener(this);
    
    texts.setEditable(false);
    
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //this.setSize(500,500);
    this.setLayout(new FlowLayout());
    
    
    JPanel textPanel = new JPanel();
    textPanel.setLayout(new GridLayout(2,1));
    texts.setPreferredSize(new Dimension(100,10));
    textPanel.add(texts);
    
    
    JPanel buttonPanel = new JPanel();
    buttonPanel.setPreferredSize(new Dimension(300,200));
    buttonPanel.setLayout(new GridLayout(4,1));
    buttonPanel.add(button0);
    buttonPanel.add(button1);
    buttonPanel.add(button2);
    buttonPanel.add(button3);
    buttonPanel.add(button4);
    buttonPanel.add(button5);
    buttonPanel.add(button6);
    buttonPanel.add(button7);
    buttonPanel.add(button8);
    buttonPanel.add(button9);
    buttonPanel.add(buttonp);
    buttonPanel.add(buttonm);
    buttonPanel.add(buttond);
    buttonPanel.add(buttonmm);
    buttonPanel.add(buttone);
    buttonPanel.add(buttonac);
    textPanel.add(buttonPanel);
    this.add(textPanel);
    //this.add(buttonPanel);
    this.pack();
    this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == button0){
       alltext +="0";
       shownText +="0";
       texts.setText(shownText);
           System.out.println("Clicked");
     
       }
       
       else if(e.getSource() == button1){
       alltext +="1";
       shownText +="1";
       texts.setText(shownText);
           System.out.println("Clicked");
       }
       
      else if(e.getSource() == button2){
       alltext +="2";
       shownText +="2";
       texts.setText(shownText);
           System.out.println("Clicked");
       }else if(e.getSource() == button3){
       alltext +="3";
       shownText +="3";
       texts.setText(shownText);
           System.out.println("Clicked");
       }
       
       else if(e.getSource() == button4){
       alltext +="4";
       shownText +="4";
       texts.setText(shownText);
           System.out.println("Clicked");
       }
       
       else if(e.getSource() == button5){
       alltext +="5";
       shownText +="5";
       texts.setText(shownText);
           System.out.println("Clicked");
       }
       
       else if(e.getSource() == button6){
       alltext +="6";
       shownText +="6";
       texts.setText(shownText);
           System.out.println("Clicked");
       }
       
       else if(e.getSource() == button7){
       alltext +="7";
       shownText +="7";
       texts.setText(shownText);
           System.out.println("Clicked");
       }
       
       else if(e.getSource() == button8){
       alltext +="8";
       shownText +="8";
       texts.setText(shownText);
           System.out.println("Clicked");
       }
       
       else if(e.getSource() == button9){
       alltext +="9";
       shownText +="9";
       texts.setText(shownText);
           System.out.println("Clicked");
       }
       
       else if(e.getSource() == buttonp){
       alltext +="+";
       shownText ="";
       texts.setText(shownText);
           System.out.println("Clicked");
       }
       
       else if(e.getSource() == buttonm){
       alltext +="-";
       shownText ="";
       texts.setText(shownText);
       
           System.out.println("Clicked");
       }
       
       else if(e.getSource() == buttond){
        alltext +="/";
        shownText ="";
       texts.setText(shownText);
           System.out.println("Clicked");
       }
       
       else if(e.getSource() == buttonmm){
       alltext +="*";
       shownText ="";
       texts.setText(shownText);
           System.out.println("Clicked");
       }
       
       else if(e.getSource() == buttonac){
       alltext ="";
       shownText ="";
       texts.setText(alltext);
           System.out.println("Clicked");
       }
       
       else if(e.getSource() == buttone){
           if(alltext.contains("-")){
           String[] nums = alltext.split("-");
          
           
           
         double number1 = Double.parseDouble(nums[0]);
         double number2 = Double.parseDouble(nums[1]);
         double answer = number1 - number2;
          
          texts.setText((String.valueOf(answer)));
          alltext = String.valueOf(answer);
          shownText = String.valueOf(answer);
           }
           
           else  if(alltext.contains("+")){
           String[] nums = alltext.split("\\+");
           
         double number1 = Double.parseDouble(nums[0]);
         double number2 = Double.parseDouble(nums[1]);
         double answer = number1 + number2;
          
          texts.setText((String.valueOf(answer)));
          alltext = String.valueOf(answer);
          shownText = String.valueOf(answer);
           }
           
           else if(alltext.contains("/")){
           String[] nums = alltext.split("/");
          
         double number1 = Double.parseDouble(nums[0]);
         double number2 = Double.parseDouble(nums[1]);
         double answer = number1 / number2;
          
          texts.setText((String.valueOf(answer)));
          alltext = String.valueOf(answer);
          shownText = String.valueOf(answer);
           } 
          
           else if(alltext.contains("*")){
           String[] nums = alltext.split("\\*");
          
         double number1 = Double.parseDouble(nums[0]);
         double number2 = Double.parseDouble(nums[1]);
         double answer = number1 * number2;
          
          texts.setText((String.valueOf(answer)));
          alltext = String.valueOf(answer);
          shownText = String.valueOf(answer);
           }
           
           System.out.println("Clicked");
       }
    }
}
