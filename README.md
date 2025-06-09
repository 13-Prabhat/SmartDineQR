# SmartDineQR
Smart Dine QR lets you scan, order, and pay at restaurants with ease—no waiters, no printed menus.
 Repository Address:https://github.com/13-Prabhat/SmartDineQR.git
 # SmartDineQR - QR-based Restaurant Ordering System

## 📌 Project Overview
SmartDineQR is a JavaFX-based GUI application that allows customers to view digital menus, place food orders, and generate bills by scanning a QR code on the restaurant table. It streamlines the traditional ordering process, reducing wait times and improving customer experience.

## 👨‍💻 Team Members
- Prabhat Kumar Choudhary
- Ravi Kumar Sharma
- Abhishek Kumar
- Nikhil Rauniyar

## 🛠 Technologies Used
- Java 21
- JavaFX (GUI)
- ZXing Library (QR Code)
- IntelliJ IDEA
- Git & GitHub

## 📂 Folder Structure
```
SmartDineQR/
├── src/smartdineqr/
│   ├── HelloApplication.java
│   ├── Menu.java
│   ├── Order.java
│   ├── QRCodeGenerator.java
│   └── Database.java (if used)
├── resources/
│   ├── images/
│   └── styles/
├── screenshots/
│   ├── main_screen.png
│   ├── menu_display.png
│   ├── qr_code_generated.png
│   ├── order_summary.png
├── README.md
├── SmartDineQR_Report.pdf
└── .gitignore
```

## 🚀 How to Run the Project
1. Clone the repository:
   ```bash
   git clone <your-repo-link>
   ```
2. Open the project in IntelliJ IDEA
3. Go to `Run > Edit Configurations`, and in VM options, add:
   ```
   --module-path "<path-to-javafx-lib>" --add-modules javafx.controls,javafx.fxml
   ```
4. Run the `HelloApplication.java` file.

## 💡 Features Implemented
- 📲 Scan QR to access menu
- 📋 Browse and select items
- 🧾 Place order and generate bill
- 🎨 Clean JavaFX GUI
- ✅ Input validation and error handling

## 🖼 Screenshots
| Main Screen | Menu View | QR Code | Order Summary |
|-------------|-----------|---------|----------------|
![image](https://github.com/user-attachments/assets/2beb32d0-8eb4-46ed-8126-a6c78c1ea570)
![image](https://github.com/user-attachments/assets/06fee0af-9513-457d-b307-ec79fae917ed)
![image](https://github.com/user-attachments/assets/bfd40f85-bd5c-4fdf-99c1-f670cd316643)
![image](https://github.com/user-attachments/assets/bfec806d-09ac-49bc-822d-052f44576b6f)


## 🧪 Testing & Validation
- Input fields checked for valid data
- Handled exceptions in file, QR, and UI
- All modules integrated and tested

## 📄 Documentation
Full documentation available in `SmartDineQR_Report.pdf`.

## 🔗 GitHub Repository
https://github.com/13-Prabhat/SmartDineQR.git




Feel free to fork or contribute to this project!
