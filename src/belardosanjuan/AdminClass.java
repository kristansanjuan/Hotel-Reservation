package belardosanjuan;

import belardosanjuan.LoginFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class AdminClass extends JFrame implements ActionListener {

    private JButton reservationSettingsButton;
    private ArrayList<String[]> users;
    private JButton modifyPasswordButton, findUsernameButton, deleteAccountButton, logoutButton, modifyRoleButton, listUsersWithRolesButton;

    public AdminClass(ArrayList<String[]> users) {
        super("Admin Panel");
        setSize(400, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.users = users;

        JPanel panel = new JPanel(new GridLayout(7, 1));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        modifyPasswordButton = new JButton("Modify Password");
        findUsernameButton = new JButton("Find Username");
        deleteAccountButton = new JButton("Delete Account");
        modifyRoleButton = new JButton("Modify User Role");
        listUsersWithRolesButton = new JButton("List Users with Roles");
        logoutButton = new JButton("Logout");
        reservationSettingsButton = new JButton("Reservation Settings");
        
        reservationSettingsButton.addActionListener(this);
        modifyPasswordButton.addActionListener(this);
        modifyRoleButton.addActionListener(this);
        findUsernameButton.addActionListener(this);
        deleteAccountButton.addActionListener(this);
        listUsersWithRolesButton.addActionListener(this);
        logoutButton.addActionListener(this);
        
        panel.add(reservationSettingsButton);
        panel.add(modifyPasswordButton);
        panel.add(findUsernameButton);
        panel.add(deleteAccountButton);
        panel.add(modifyRoleButton);
        panel.add(listUsersWithRolesButton);
        panel.add(logoutButton);

        add(panel);
    }

    public void showUsersWithRoles() {
        if (users.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No users to display.", "List of Users with Roles", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < users.size(); i++) {
            String[] user = users.get(i);
            if (user.length >= 3) {
                sb.append(i + 1).append(". ").append(user[0]).append(": ").append(user[1]).append(" (Role: ").append(user[2]).append(")\n");
            } else {
                sb.append(i + 1).append(". ").append(user[0]).append(": ").append(user[1]).append(" (Role: Unknown)\n");
            }
        }

        JOptionPane.showMessageDialog(this, sb.toString(), "List of Users with Roles", JOptionPane.INFORMATION_MESSAGE);
    }

    public void modifyPassword(String username, String newPassword) {
        if (username.trim().isEmpty() || newPassword.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username and password cannot be empty");
            return;
        }

        for (String[] user : users) { 
            if (user[0].equals(username)) {
                user[1] = newPassword;
                JOptionPane.showMessageDialog(this, "Password modified successfully");
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Username not found");
    }

    public void findUser(String username) {
        if (username == null) {
            return;
        } else if (username.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username cannot be empty");
        } else {
            boolean found = false;

            for (String[] user : users) {
                if (user[0].trim().equals(username.trim())) {
                    JOptionPane.showMessageDialog(this, "Username found. Password is: " + user[1]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                    JOptionPane.showMessageDialog(this, "Username not found");
                }
            }
        }
    public void deleteUser(String username) {
        Iterator<String[]> iterator = users.iterator();

        while (iterator.hasNext()) {
            String[] user = iterator.next();

            if (user[0].equals(username)) {
                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete account: " + username + "?");
                if (confirm == JOptionPane.YES_OPTION) {
                    iterator.remove();
                    JOptionPane.showMessageDialog(this, "Account deleted successfully");
                    return;
                } else {
                    return;
                }
            }
        }

        if (username == null) {
            return;
        } else if (username.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username cannot be empty");
        } else {
            JOptionPane.showMessageDialog(this, "Username not found");
        }
    }

    public void modifyUserRole(String username, String role) {
        if (username.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username cannot be empty");
            return;
        }

        boolean userFound = false;

        for (String[] user : users) {
            if (user[0].equals(username)) {
                String confirmationMessage = "Are you sure you want to make " + username + " a " + role + "?";
                int confirm = JOptionPane.showConfirmDialog(this, confirmationMessage, "Confirm Role Change", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    user[2] = role;
                    userFound = true;
                    JOptionPane.showMessageDialog(this, "User role modified successfully");
                }
                break;
            }
        }

        if (!userFound) {
            JOptionPane.showMessageDialog(this, "Username not found");
        }
    }
    
    private void openReservationSettings() {
    JFrame reservationSettingsFrame = new JFrame("Reservation Settings");
    reservationSettingsFrame.setSize(400, 300);
    reservationSettingsFrame.setLocationRelativeTo(null);
    // Set up the frame components, such as labels, text fields, buttons, etc.
    // Add functionality to modify checkout date, add items, etc.
    // You can create separate methods or classes to handle different functionalities.

    // Display the reservation settings frame
    reservationSettingsFrame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == modifyPasswordButton) {
            if (users.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No users to display.", "Change Pass", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            while (true) {
                String username = JOptionPane.showInputDialog(this, "Enter username:");

                if (username == null) {
                    return; // User clicked cancel, exit method
                } else if (username.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Username cannot be empty");
                    continue;
                }

                boolean userExists = false;
                String oldPassword = "";
                for (String[] user : users) {
                    if (user[0].equals(username)) {
                        userExists = true;
                        oldPassword = user[1];
                        break;
                    }
                }

                if (!userExists) {
                    JOptionPane.showMessageDialog(this, "User not found");
                    return;
                }

                String newPassword = JOptionPane.showInputDialog(this, "Enter new password:");
                if (newPassword == null) {
                    return;
                } else if (newPassword.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Password cannot be empty");
                    continue;
                }

                if (newPassword.equals(oldPassword)) {
                    JOptionPane.showMessageDialog(this, "New password cannot be the same as the old password");
                    continue;
                }

                modifyPassword(username, newPassword);
                return;
            }
        } else if (e.getSource() == reservationSettingsButton) {
            // Handle reservation settings button click
            openReservationSettings();
            
        } else if (e.getSource() == findUsernameButton) {
            if (users.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No users to display.", "Find User", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String username = JOptionPane.showInputDialog(this, "Enter username:");
            findUser(username);
        } else if (e.getSource() == deleteAccountButton) {
            if (users.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No users to display.", "Delete User", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String username = JOptionPane.showInputDialog(this, "Enter username:");
            deleteUser(username);
        }  else if (e.getSource() == modifyRoleButton) {
            String username = JOptionPane.showInputDialog(this, "Enter username:");
            if (username != null) {
                String[] roles = {"Staff", "Normal"};
                String role = (String) JOptionPane.showInputDialog(this, "Select new role for the user:", "Modify User Role", JOptionPane.QUESTION_MESSAGE, null, roles, roles[0]);
                if (role != null) {
                    modifyUserRole(username, role);
                }
            }
        } else if (e.getSource() == listUsersWithRolesButton) {
            showUsersWithRoles();
        } else if (e.getSource() == logoutButton) {
            LoginFrame loginFrame = new LoginFrame(users);
            loginFrame.setVisible(true);
            setVisible(false);
            dispose();
            }
        }
    }