/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ecs
 */
public class Tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key, userRole varchar(200), name varchar(200), mobileNumber varchar(200), email varchar(100), password varchar(200), address varchar(100), status varchar(200))");
            //st.executeUpdate("insert into appuser(userRole, name,mobileNumber, email, password, address, status) values('SuperAdmin', 'Super Admin', '12345', 'testemail@gmail.com','test123','Nepal','Admin')");
            //st.executeUpdate("create table category(category_pk int AUTO_INCREMENT primary key, name varchar(200))");
            //st.executeUpdate("create table product(product_pk int AUTO_INCREMENT primary key, name varchar(200), quantity int, price int, description varchar(200), category_fk int)");
            //st.executeUpdate("create table customer(customer_pk int AUTO_INCREMENT primary key, name varchar(200), mobileNumber varchar(200), email varchar(200))");
            //st.executeUpdate("create table orderDetails(order_pk int AUTO_INCREMENT primary key, orderId varchar(200), customer_fk int, orderDate varchar(200), totalPaid int )");            
            JOptionPane.showMessageDialog(null,"Table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {

            }
        }
    }

}
