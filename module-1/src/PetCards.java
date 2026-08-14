/*
	* Author: Sheridan Dela Cruz
	* Date: August 12, 2026
	* Module 1.3
	* Desciption: A simple JavaFX program that displays four randomly selected pet images
    * from the "cards" folder. Clicking the Refresh button loads four new
    * random images. Demonstrates image loading, layout, and lambda expressions.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PetCards extends Application {

    /**
     * Builds the main window with an image display area and a Refresh button.
     */
    @Override
    public void start(Stage stage) {

        HBox cardBox = new HBox(10); // Holds the four images
        Button refreshButton = new Button("Refresh");

        displayRandomPets(cardBox); // Show images at startup

        refreshButton.setOnAction(e -> // Lambda expression
        displayRandomPets(cardBox));

        VBox root = new VBox(20, cardBox, refreshButton);

        Scene scene = new Scene(root, 600, 300);
        stage.setScene(scene);
        stage.setTitle("Random Pet Images");
        stage.show();
    }

    /**
     * Loads four random pet images (pet1–pet4.jpeg) into the HBox.
     */
    private void displayRandomPets(HBox cardBox) {
        cardBox.getChildren().clear();

        for (int i = 0; i < 4; i++) {
            int num = (int) (Math.random() * 4) + 1;
            Image img = new Image("file:/C:/csd/csd-420/module-1/cards/pet" + num + ".jpeg");
            ImageView iv = new ImageView(img);

            iv.setFitWidth(120);
            iv.setPreserveRatio(true);

            cardBox.getChildren().add(iv);
        }
    }

    /**
     * Launches the JavaFX application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}