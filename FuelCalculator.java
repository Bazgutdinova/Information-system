/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelcalculator;

/**
 *
 * @author 
 */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class FuelCalculator {
    private JTextField wayField;
    private JLabel wayLabel;
    private JLabel kmLabel;
    private JTextField averageField;
    private JLabel averageLabel;
    private JLabel litersLabel;
    private JTextField priceField;
    private JLabel priceLabel;
    private JLabel rurLabel;
    private JButton calcButton;
    private JLabel resultLabel;
    private JFrame mainFrame;
    
    FuelCalculator() {
        wayLabel = new JLabel("Расстояние");
        wayField = new JTextField("0");
        wayField.setHorizontalAlignment(JTextField.RIGHT);
        kmLabel = new JLabel("км");
        averageLabel = new JLabel("Средний расход топлива на 100 км");
        averageField = new JTextField("0");
        averageField.setHorizontalAlignment(JTextField.RIGHT);
        litersLabel = new JLabel("л.");
        priceLabel = new JLabel("Цена за литр горючего");
        priceField = new JTextField("0");
        priceField.setHorizontalAlignment(JTextField.RIGHT);
        rurLabel = new JLabel("Руб.");
        calcButton = new JButton("Рассчитать");
        calcButton.addActionListener(new ActionListener() {
            @Override
           