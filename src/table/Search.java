/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mo3tamed
 */
public class Search {
    
    TextField monthT;
    TextField dayT;

    public Search() {
        Stage window = new Stage();

        TableView<Item> t;
        ObservableList<Item> items = FXCollections.observableArrayList();

        //table
        TableColumn<Item, String> mon = new TableColumn<>("Month");
        mon.setMinWidth(100);
        mon.setCellValueFactory(new PropertyValueFactory<>("month"));

        TableColumn<Item, String> day = new TableColumn<>("Day");
        day.setMinWidth(100);
        day.setCellValueFactory(new PropertyValueFactory<>("day"));

        TableColumn<Item, String> type = new TableColumn<>("Type");
        type.setMinWidth(200);
        type.setCellValueFactory(new PropertyValueFactory<>("type"));

        TableColumn<Item, String> cost = new TableColumn<>("Cost");
        cost.setMinWidth(100);
        cost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        
        
        monthT=new TextField();
        monthT.setPromptText("month to search ");
        Button s = new Button ("search");
        
        

        t = new TableView<>();
        t.setItems(items);
        t.getColumns().addAll(mon, day, type, cost);

        
        
        
        
        VBox root = new VBox();

        HBox h = new HBox();
        h.setSpacing(10);
        h.setPadding(new Insets(10));
        h.getChildren().addAll(monthT , s);
        root.getChildren().addAll(h , t);
        
        Scene sce = new Scene (root , 800 , 150);
        
        window.setScene(sce);
        window.setTitle("search in Log ");
        window.showAndWait();
                
        
    }

}




