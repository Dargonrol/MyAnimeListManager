package org.dargonrol.myanimelistmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("My Anime List Manager");

        GridPane mainPlane = new GridPane();

        // #############
        // top section
        // #############
        VBox leftSide = new VBox();
        VBox rightSide = new VBox();
        GridPane topSection = new GridPane();

        // search bar
        TextField searchBar = new TextField();
        topSection.add(searchBar, 1, 0);

        // save and load buttons
        Button saveButton = new Button("Save");
        Button loadButton = new Button("Load");
        leftSide.getChildren().addAll(saveButton, loadButton);

        // search and filter button
        Button searchButton = new Button("Search");
        Button filterButton = new Button("Filter");
        rightSide.getChildren().addAll(searchButton, filterButton);

        topSection.add(leftSide, 0, 0);
        topSection.add(rightSide, 2, 0);
        mainPlane.add(topSection, 0, 0);


        // #############
        // middle section
        // #############
        ScrollPane animeList = new ScrollPane();
        mainPlane.add(animeList, 0, 1);


        // #############
        // bottom section
        // #############
        // new entry Button
        VBox bottomSection = new VBox();
        Button newEntryButton = new Button("New Entry");
        bottomSection.getChildren().add(newEntryButton);
        mainPlane.add(bottomSection, 0, 2);


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}