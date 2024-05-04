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
import org.dargonrol.myanimelistmanager.framework.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("My Anime List Manager");

        ArrayList<AnimeList> animeList = new ArrayList<>();
        animeList.add(new SeriesListItem("Naruto", "", 1, new SeasonRecord(1, "", 24)));
        animeList.add(new SeriesListItem("That Time I reincarnated as a slime!", 2));
        AnimeList.getSeriesByNumber(animeList, 1).setSeasons(1, new SeasonRecord(
                        1,
                        "",
                        12,
                        2,
                        null,
                        null,
                        null,
                        0,
                        0,
                        new Song("Anime", "reona", "dadw"),
                        null ));


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}