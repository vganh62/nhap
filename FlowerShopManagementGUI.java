package FlowerShopManagement;

import java.awt.Component;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FlowerShopManagementGUI {

    private FlowerShop flower;

    public FlowerShopManagementGUI() {
        flower = new FlowerShop();
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Flower management system");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        // Create buttons
        JButton addFlowerButton = new JButton("Add flower");
        JButton addNewCustomerButton = new JButton("Add new customer");
        JButton buyFlowerButton = new JButton("Buy flower");
        JButton listFlowerButton = new JButton("List all flower");
        JButton listSoldOutFlowersButton = new JButton("List sold out flower");
        JButton listAvailableFlowerButton = new JButton("List availble flower");
        JButton totalFlowerButton = new JButton("Total flower");

        //bang dieu khien (Panel)
        JPanel pn = new JPanel();
        pn.add(addFlowerButton);
        pn.add(addNewCustomerButton);
        pn.add(buyFlowerButton);
        pn.add(listFlowerButton);
        pn.add(listSoldOutFlowersButton);
        pn.add(listAvailableFlowerButton);
        pn.add(totalFlowerButton);

        frame.getContentPane().add(pn);
        frame.setVisible(true);

        //hanh dong (Button actions)
        addFlowerButton.addActionListener((ActionEvent e) -> {
            String name = JOptionPane.showInputDialog("Enter name flower:");
            String origin = JOptionPane.showInputDialog("Enter flower origin:");
            flower.addFlower(new Flower(name, origin));
            JOptionPane.showMessageDialog(frame, "Flower added successfully.");
        });

        addNewCustomerButton.addActionListener((ActionEvent e) -> {
            String name2 = JOptionPane.showInputDialog("Enter customer name:");
            String phone = JOptionPane.showInputDialog("Enter phone:");
            flower.addCustomer(new Customer(name2, phone));
            JOptionPane.showMessageDialog(frame, "Customer added successfully.");
        });
        buyFlowerButton.addActionListener((ActionEvent e) -> {
            String name = JOptionPane.showInputDialog("Enter name flower:");
            String origin = JOptionPane.showInputDialog("Enter flower origin:");
            flower.addFlower(new Flower(name, origin));
            JOptionPane.showMessageDialog(frame, "added to cart!");
        });

        listFlowerButton.addActionListener(new ActionListener() {
            private Component fr;

            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Flower> flowers = flower.listFlowers();
                StringBuilder message = new StringBuilder("Flower in the flowershop: \n");
                for (Flower flower : flowers) {
                    message.append(flower.getName()).append(" by ").append(flower.getOrigin()).append(")\n");
                }
                JOptionPane.showMessageDialog(fr, message.toString());
            }

        });
        listSoldOutFlowersButton.addActionListener((ActionEvent e) -> {
            ArrayList<Flower> soldOutfl = flower.listSoldOutFlowers();
            StringBuilder message = new StringBuilder("Sold out flower:\n");
            for (Flower flower1 : soldOutfl) {
                message.append(flower1.getName()).append(" by ").append(flower1.getOrigin()).append(")\n");
            }
            JOptionPane.showMessageDialog(frame, message.toString());
        });
        listAvailableFlowerButton.addActionListener((ActionEvent e) -> {
            ArrayList<Flower> availableFlowers = flower.listAvailableFlower();
            StringBuilder message = new StringBuilder("Available flower:\n");
            for (Flower flower1 : availableFlowers) {
                message.append(flower1.getName()).append(" by ").append(flower1.getOrigin()).append(")\n");
            }
            JOptionPane.showMessageDialog(frame, message.toString());
        });
        totalFlowerButton.addActionListener((ActionEvent e) -> {
            int totalFlowers = flower.gettotalFlower();
            JOptionPane.showMessageDialog(frame, "Quantity flowers in the flowershop: " + totalFlowers);
        });
    }

    public static void main(String[] args) {
        new FlowerShopManagementGUI();
    }
}
