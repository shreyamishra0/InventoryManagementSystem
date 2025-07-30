# Inventory Management System

A Java-based desktop application for managing inventory, customers, orders, and generating reports.

## 📋 Features

- **User Management**: Login system with user authentication
- **Category Management**: Add, edit, and manage product categories
- **Product Management**: Complete CRUD operations for products
- **Customer Management**: Manage customer information and profiles
- **Order Management**: Create, view, and manage customer orders
- **PDF Reports**: Generate PDF reports for inventory, orders, and sales
- **Database Integration**: MySQL database connectivity for data persistence

## 🏗️ Project Structure

```
src/
├── dao/                    # Data Access Objects
│   ├── ConnectionProvider.java
│   ├── InventoryUtils.java
│   └── Tables.java
├── common/                 # Common utilities
│   └── OpenPdf.java       # PDF generation utility
├── images/                 # UI images and icons
│   ├── home_page.png
│   ├── login.png
│   ├── orders.png
│   └── ...
├── Home.java              # Main dashboard
├── Login.java             # User authentication
├── ManageCategory.java    # Category management
├── ManageCustomer.java    # Customer management
├── ManageOrder.java       # Order management
├── ManageProduct.java     # Product management
├── ManageUser.java        # User management
└── ViewOrders.java        # Order viewing interface
```

## 🛠️ Technologies Used

- **Language**: Java
- **IDE**: NetBeans
- **Database**: MySQL
- **PDF Library**: OpenPDF/iText
- **GUI Framework**: Java Swing

## 📦 Dependencies

- MySQL Connector for Java
- PDF generation library (OpenPDF/iText)
- Java Swing (built-in)

## ⚙️ Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/InventoryManagementSystem.git
   ```

2. **Database Setup**
   - Install MySQL Server
   - Create a new database (e.g., `inventory_db`)
   - Update database connection details in `ConnectionProvider.java`

3. **Import Project**
   - Open NetBeans IDE
   - Import the project folder
   - Add required JAR files to the project libraries

4. **Run the Application**
   - Compile and run `Home.java` or the main class
   - Use the login system to access the application

## 🗄️ Database Configuration

Update the database connection settings in `src/dao/ConnectionProvider.java`:

```java
// Update these values according to your MySQL setup
String url = "jdbc:mysql://localhost:3306/inventory_db";
String username = "your_username";
String password = "your_password";
```

## 📊 Key Modules

- **Authentication**: Secure login system
- **Inventory Management**: Track stock levels and product information
- **Customer Relations**: Manage customer data and order history
- **Reporting**: Generate PDF reports for business insights
- **User Administration**: Multi-user support with role management

## 🚀 Usage

1. Start the application and log in with valid credentials
2. Navigate through different modules using the main dashboard
3. Add/Edit products, categories, and customers as needed
4. Create and manage orders
5. Generate PDF reports for analysis

## 📄 License

This project is for educational/portfolio purposes.

## 👨‍💻 Developer

Developed by Shreya Mishra - shreyamishra902@gmail.com

## 🤝 Contributing

This is a personal project, but suggestions and improvements are welcome!

---

*Built with Java and MySQL for efficient inventory management*
