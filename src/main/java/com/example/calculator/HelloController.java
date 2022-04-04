package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Button btnadd;
    @FXML
    private Button btnsub;
    @FXML
    private Button btnmul;
    @FXML
    private Button btndiv;
    @FXML
    private Button btnrem;
    @FXML
    private Button btnsqrt;
    @FXML
    private Button btnclear;
    @FXML
    private TextField txtnum1;
    @FXML
    private TextField txtnum2;
    @FXML
    private Label lblanswer;

    @FXML
    private void handleButtonAction(ActionEvent e){
        if (e.getSource()==btnclear){
            txtnum1.setText("");
            txtnum2.setText("");
            lblanswer.setText("");
            txtnum1.requestFocus();
            return;
        }
        //read numbers in from textfields
        try {
            double num1=Integer.parseInt(txtnum1.getText());
            double num2=Integer.parseInt(txtnum2.getText());
            double answer;
            char symbol;
            // Code that could throw an exception
            if(e.getSource()==btnadd) {
                symbol='+';
                answer=num1+num2;
                lblanswer.setText("" + num1 + symbol + num2 + "=" + answer);
            } else if(e.getSource()==btnsub) {
                symbol='-';
                answer=num1-num2;
                lblanswer.setText("" + num1 + symbol + num2 + "=" + answer);
            } else if(e.getSource()==btnmul) {
                symbol='x';
                answer=num1*num2;
                lblanswer.setText("" + num1 + symbol + num2 + "=" + answer);
            } else if(e.getSource()==btndiv) {
                symbol='/';
                answer=num1/num2;
                lblanswer.setText("" + num1 + symbol + num2 + "=" + answer);
            } else if(e.getSource()==btnrem){
                symbol='%';
                answer=num1%num2;
                lblanswer.setText("" + num1 + symbol + num2 + "=" + answer);
            } else {
                num2 = 0;
                answer=Math.sqrt(num1);
                lblanswer.setText("Sqrt(" + num1 + ")" +answer);
            }

            //display answer
        } catch (NumberFormatException exc) {
            // Code to run when an exception occurs
            lblanswer.setText("Idito");
        }





    }
}