package com.example.projetojavafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class DepartmentListController implements Initializable {
    @FXML
    private TableView<Department> tableViewDepartment;

    @FXML
    private TableColumn<Department, Integer> tableColumnId;

    @FXML
    private TableColumn<Department, String> tableColumnNamme;

    @FXML
    private Button btnNew;

    @FXML
    public void onBtNewAction(){
        System.out.println("Teste");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
