module com.example.projetojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetojavafx to javafx.fxml;
    exports com.example.projetojavafx;
    exports com.example.projetojavafx.application;
    opens com.example.projetojavafx.application to javafx.fxml;
    exports com.example.projetojavafx.model;
    opens com.example.projetojavafx.model to javafx.fxml;
    exports com.example.projetojavafx.gui;
    opens com.example.projetojavafx.gui to javafx.fxml;
}