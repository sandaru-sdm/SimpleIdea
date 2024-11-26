# SimpleIdea - Invoicing Application (POS System)

SimpleIdea is a Java Swing-based invoicing application designed for Simple Idea Advertising. This application helps manage invoices, generate PDF reports, and log errors efficiently. It is built with NetBeans and uses MySQL for data management and JasperSoft Community Edition for reporting.

---

## Features

- **Invoice Management**: Create and save invoices as PDFs.
- **Graphical User Interfaces (GUIs)**:
  - **Add New Customer**: GUI to add customer details to the database.
  - **Home**: Central dashboard for accessing all features.
  - **Invoice**: GUI for creating, editing, and viewing invoices.
  - **Other Services**: Manage additional services offered by the business.
  - **Services**: GUI to handle predefined services like PVC Sticker Print and Digital Print.
  - **Payment Type**: Manage different payment types available in the system.
  - **Profit**: View and analyze profit details.
  - **Sales**: GUI for monitoring sales data.
  - **Splash**: Welcome screen shown at application startup.
- **Database Configuration**: Easily configurable database settings via a `variables.txt` file.
- **Error Logging**: Automatically logs errors to a file for troubleshooting.
- **Pre-packaged Libraries**: Includes all necessary libraries in the `lib` folder.
- **Customizable**: Contains SQL files and launch4j configuration for further development.

---

## Getting Started

### Prerequisites
- **Java Runtime Environment (JRE)**
- **MySQL Server**
- **NetBeans IDE (optional, for development)**

### Running the Application

1. **Download and Extract Files**:
   - Clone or download the repository to your local machine.
   - Extract the `dist` folder and navigate to it.

2. **Execute the Application**:
   - Run the `.exe` file located in the `dist` folder to start the application.

3. **First-Time Setup**:
   - After the first run, a splash screen will appear. Close the splash screen.
   - Navigate to the following directory on your system:
     ```
     C:\Users\YOUR_USER_NAME\SimpleIdea
     ```
   - Open the `variables.txt` file in this directory and provide the following database details:
     - **DB Username**: Your MySQL username.
     - **DB Password**: Your MySQL password.
     - **DB Name**: The name of the MySQL database.
     - **DB Port**: The port number for the MySQL server.

4. **Database Initialization**:
   - Import the provided SQL file (`simpleidea.sql`) into your MySQL database using MySQL Workbench or any MySQL editor.
   - Add the following entries into the `service` table manually:
     - `PVC Sticker Print`
     - `Digital Print`
   - Create the first user manually in the database to start using the application.

5. **Invoicing and Logs**:
   - When an invoice is created, its PDF is saved in the `invoice` directory within the application folder:
     ```
     C:\Users\YOUR_USER_NAME\SimpleIdea\invoice
     ```
   - In case of errors, refer to the `log.txt` file in the same folder for troubleshooting.

---

## Graphical User Interfaces (GUIs)

### Key GUIs in the Application:
- **Add New Customer**: Add new customers to the database with ease.
- **Home**: A central dashboard providing quick access to all modules.
- **Invoice**: Create, edit, and manage invoices.
- **Other Services**: Handle additional services offered by the company.
- **Services**: Manage primary services like PVC Sticker Print and Digital Print.
- **Payment Type**: Configure and manage available payment options.
- **Profit**: Analyze profit data over various time frames.
- **Sales**: Monitor sales and revenue trends.
- **Splash**: An introductory splash screen on startup.

---

## Development

### Tools and Technologies
- **NetBeans IDE**: Used for application development.
- **MySQL**: Database for storing application data.
- **JasperSoft Community Edition**: Used for generating invoice reports.

### Files and Configuration
- **`lib` Folder**: Contains all the necessary libraries.
- **`launch4j` Configuration File**: Preconfigured for building `.exe` files.
- **SQL File**: For database initialization and setup.

---

## Troubleshooting

- Ensure the `variables.txt` file has accurate database credentials.
- Verify that the database is running, and the required entries are present in the `service` table.
- Check the `log.txt` file in case of errors or unexpected behavior.

---

## Contributing

To contribute to the project:
1. Fork the repository.
2. Make your changes and test thoroughly.
3. Submit a pull request with detailed information about your updates.

---

## License

This project is licensed under the MIT License. See the LICENSE file for details.

---

## Contact

For inquiries or issues, please reach out to maduhansadilshan@gmail.com

