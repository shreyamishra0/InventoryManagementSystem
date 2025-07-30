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
            /*
             * IMPORTANT: Uncomment and run the following SQL statements ONE TIME ONLY
             * to create the initial database tables and default admin user.
             * 
             * Steps:
             * 1. Uncomment all st.executeUpdate() lines below
             * 2. Run this Tables.java file once to create tables
             * 3. Comment out all st.executeUpdate() lines again to prevent duplicate table creation
             * 4. The database setup is now complete
             * 
             * Note: Running these statements multiple times will cause errors
             * as tables and admin user already exist.
             */

            //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key, userRole varchar(200), name varchar(200), mobileNumber varchar(200), email varchar(100), password varchar(200), address varchar(100), status varchar(200))");
            //st.executeUpdate("insert into appuser(userRole, name,mobileNumber, email, password, address, status) values('SuperAdmin', 'Super Admin', '12345', 'admin@example.com','your_password','your_address','Active')");
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
