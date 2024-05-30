

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Admin1 extends JFrame implements ActionListener
{
    private Color clrBlue = new Color(0,102,204);
    private Color clrOrange = new Color(255,137,20);
    JButton btnEdit = new JButton("Edit");
    JButton btnDelete = new JButton("Delete");
    JButton btnLogout = new JButton("Logout");
    
    Admin1()
    {
        super("Black Bean Company");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        
        JLabel adminPanel = new JLabel(new ImageIcon("resources/adminPanelV.png"));
            adminPanel.setBounds(0,0,155,462);
            
        JLabel lblStaff = new JLabel("STAFF");
            lblStaff.setFont(new Font("Segoe UI", Font.BOLD, 18));
            lblStaff.setForeground(clrOrange);
            lblStaff.setBounds(180,5,60,40);
            
        JLabel lblCustomer = new JLabel("CUSTOMER");
            lblCustomer.setFont(new Font("Segoe UI", Font.BOLD, 18));
            lblCustomer.setForeground(clrOrange);
            lblCustomer.setBounds(180,105,100,40);
            
            btnEdit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            btnEdit.setForeground(Color.WHITE);
            btnEdit.setOpaque(false);
            btnEdit.setContentAreaFilled(false);
            btnEdit.setBorderPainted(false);
            btnEdit.setBounds(25,108,100,40);
            
            btnDelete.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            btnDelete.setForeground(Color.WHITE);
            btnDelete.setOpaque(false);
            btnDelete.setContentAreaFilled(false);
            btnDelete.setBorderPainted(false);
            btnDelete.setBounds(25,158,100,40);
            
            btnLogout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
            btnLogout.setForeground(Color.WHITE);
            btnLogout.setOpaque(false);
            btnLogout.setContentAreaFilled(false);
            btnLogout.setBorderPainted(false);
            btnLogout.setBounds(25,208,100,40);
            
        panel.add(lblStaff);
        panel.add(lblCustomer);
        panel.add(btnEdit);
        panel.add(btnDelete);
        panel.add(btnLogout);
        panel.add(adminPanel);
        
        btnEdit.addActionListener(this);
        btnDelete.addActionListener(this);
        btnLogout.addActionListener(this);
        
        add(panel);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnEdit) {
            AdminEdit adminEdit = new AdminEdit();
            adminEdit.setVisible(true);
            dispose();
        } else if (e.getSource()==btnDelete) {
            AdminDelete adminDelete = new AdminDelete();
            adminDelete.setVisible(true);
            dispose();
        }
    }

    public static void main(String[] args) {
        Admin window = new Admin();
    }
    
}