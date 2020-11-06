package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static JTextField FirstNameInput;
    private static JTextField LastNameInput;
    private static JTextField AgeInput;
    private static JTextArea AddressInput;
    private static JRadioButton maleButton;
    private static JRadioButton femaleButton;
    private static JCheckBox c;
    private static JButton SaveButton;


    public static void main(String[] args) {
	    JPanel jPanel = buildPanel();
        addActiontToButton(jPanel);
    }


    private static void addActiontToButton(JPanel jPanel) {
        SaveButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String FirstNameValue = FirstNameInput.getText();
                        String LastNameValue = LastNameInput.getText();
                        Integer AgeValue = Integer.parseInt(AgeInput.getText());
                        String AddressValue = AddressInput.getText();


                        String qual = " ";

                        // If condition to check if jRadioButton2 is selected.
                        if (maleButton.isSelected()) {
                            qual = "Male";
                        }

                        else if (femaleButton.isSelected()) {
                            qual = "Female";
                        }
                        else {
                            qual = "NO gender selected";
                        }

                        Boolean StatusValue = false;
                        if(c.isSelected()){
                            StatusValue = true;
                        }
                        String GenderValue = qual;
                        Form form = new Form(FirstNameValue, LastNameValue, AgeValue, GenderValue, StatusValue, AddressValue);

                        jPanel.updateUI();
                        jPanel.removeAll();

                        JLabel firstName = new JLabel("First Name: " + form.getFirstName());
                        firstName.setBounds(10,20,200,25);
                        jPanel.add(firstName);
                        JLabel lastName = new JLabel("Last Name: " + form.getLastNameirstName());
                        lastName.setBounds(10,60,200,25);
                        jPanel.add(lastName);
                        JLabel age = new JLabel("Age: " + form.getAge());
                        age.setBounds(10,100,200,25);
                        jPanel.add(age);
                        JLabel gender = new JLabel("Gender: " + form.getGender() );
                        gender.setBounds(10,140,200,25);
                        jPanel.add(gender);
                        JLabel married = new JLabel("Married: " + form.getStatus() );
                        married.setBounds(10,180,200,25);
                        jPanel.add(married);
                        JLabel address = new JLabel("Address: " + form.getAddress() );
                        address.setBounds(10,220,200,25);
                        jPanel.add(address);

                    }
                }
        );

    }


    private static JPanel buildPanel() {
        JFrame frame = new JFrame("Insert data: ");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
        return panel;
    }

    private static void placeComponents(JPanel panel){
        panel.setLayout(null);

        JLabel fnameLabel = new JLabel("First Name: ");
        fnameLabel.setBounds(10, 20, 80, 25);
        panel.add(fnameLabel);

        FirstNameInput = new JTextField(20);
        FirstNameInput.setBounds(100,20,165,25);
        panel.add(FirstNameInput);

        JLabel lnameLabel = new JLabel("Last Name: ");
        lnameLabel.setBounds(10, 60, 80, 25);
        panel.add(lnameLabel);

        LastNameInput = new JTextField(20);
        LastNameInput.setBounds(100, 60, 165, 25);
        panel.add(LastNameInput);

        JLabel ageLabel = new JLabel("Age: ");
        ageLabel.setBounds(10, 100, 80, 25);
        panel.add(ageLabel);

        AgeInput = new JTextField(20);
        AgeInput.setBounds(100, 100, 165, 25);
        panel.add(AgeInput);
        // RadioButton
        maleButton = new JRadioButton();
        femaleButton = new JRadioButton();
        ButtonGroup group = new ButtonGroup();
        JLabel label = new JLabel("Gender:");
        maleButton.setText("Male");
        femaleButton.setText("Female");
        maleButton.setBounds(100, 140, 80, 50);
        femaleButton.setBounds(200, 140, 80, 50);
        label.setBounds(10, 140, 140, 50);
        panel.add(maleButton);
        panel.add(femaleButton);
        panel.add(label);
        group.add(maleButton);
        group.add(femaleButton);
        //CheckBox
        c = new JCheckBox(" Married?");
        c.setBounds(10,180,80,50);
        panel.add(c);

        JLabel addressLabel = new JLabel("Address: ");
        addressLabel.setBounds(10, 240, 80, 25);
        panel.add(addressLabel);

        AddressInput = new JTextArea(20,20);
        AddressInput.setBounds(100,240,165,100);
        panel.add(AddressInput);

        SaveButton = new JButton("Save");
        SaveButton.setBounds(100,350,80,25);
        panel.add(SaveButton);


    }


}

