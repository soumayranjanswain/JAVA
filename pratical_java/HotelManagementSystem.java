import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class HotelManagementSystem extends JFrame {
    private JTextField nameField;
    private JComboBox<String> roomTypeBox;
    private JTextArea statusArea;
    private static Map<Integer, String> roomBookings = new HashMap<>();

    public HotelManagementSystem() {
        setTitle("Hotel Management System");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Top Panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        inputPanel.add(new JLabel("Guest Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Room Type:"));
        roomTypeBox = new JComboBox<>(new String[]{"Single", "Double", "Suite"});
        inputPanel.add(roomTypeBox);

        JButton bookButton = new JButton("Book Room");
        bookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bookRoom();
            }
        });
        inputPanel.add(bookButton);

        JButton viewButton = new JButton("View Bookings");
        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewBookings();
            }
        });
        inputPanel.add(viewButton);

        add(inputPanel, BorderLayout.NORTH);

        // Bottom Panel
        statusArea = new JTextArea();
        add(new JScrollPane(statusArea), BorderLayout.CENTER);
    }

    private void bookRoom() {
        String name = nameField.getText();
        String roomType = (String) roomTypeBox.getSelectedItem();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a guest name.");
            return;
        }

        int roomNumber = new Random().nextInt(100) + 1;
        roomBookings.put(roomNumber, name + " (" + roomType + ")");
        statusArea.append("Room " + roomNumber + " booked for " + name + " [" + roomType + "]\n");
        nameField.setText("");
    }

    private void viewBookings() {
        statusArea.setText("=== Current Bookings ===\n");
        for (Map.Entry<Integer, String> entry : roomBookings.entrySet()) {
            statusArea.append("Room " + entry.getKey() + ": " + entry.getValue() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new HotelManagementSystem().setVisible(true);
        });
    }
}