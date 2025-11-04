module lk.ijse.groupchatapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens lk.ijse.groupchatapp.controller to javafx.fxml;
    exports lk.ijse.groupchatapp.controller;
    exports lk.ijse.groupchatapp;
}