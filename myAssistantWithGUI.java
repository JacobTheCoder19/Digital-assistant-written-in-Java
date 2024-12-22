/*
Filename: myAssistantWithGUI.java
Author: J. Graham
Date: December 06, 2023
Purpose: To have a GUI that will allow easier acces to run applications or go to specific websites with a key word and a click of a button.
*/
/**IMPORTS */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;

public class myAssistantWithGUI extends Application {

   Stage window;

   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage primaryStage) {
      window = primaryStage;
      window.setTitle("Digital Assistant");
   
      GridPane grid = new GridPane();
      grid.setPadding(new Insets(10, 10, 10, 10));
      grid.setVgap(8);
      grid.setHgap(10);
   
      // Prompt for action
      Label actionLabel = new Label("How may I assist you?:");
      GridPane.setConstraints(actionLabel, 0, 0);
   
      // Action input
      TextField actionInput = new TextField("try 'help'");
      GridPane.setConstraints(actionInput, 1, 0);
      // Submit Button
      Button submitButton = new Button("Submit");
      submitButton.setOnAction(
         e -> {
            try {
                // Calls method using the entered keyword the parameter
               completeRequest(actionInput.getText());
            } catch (IOException ex) {
               ex.printStackTrace();
            }
         });
      GridPane.setConstraints(submitButton, 1, 2);
   
      grid.getChildren().addAll(actionLabel, actionInput, submitButton);
   
      Scene scene = new Scene(grid, 300, 200);
      window.setScene(scene);
   
      window.show();
   }
 
   // Method that checks the entered in keyword with the list of predefined keywords and there corrisponding actions
   public static void completeRequest(String request) throws IOException {
      Runtime runtime = Runtime.getRuntime();
   
      switch (request.toLowerCase()) {
        /**APPLICATIONS */

        /**NOTE:: ALL LINKS AND PATHS ARE CHANGED TO HIDE SENSITIVE INFO. (../)
         * LINKS WILL NEED TO BE CHANGED FOR EACHER USER'S COMPUTER SPECIFICALLY AS EVERY PERSONS FILE PATH IS NOT THE SAME!!!
         * FOR MY CODE WHEN CREATED DOES NOT USE ANY "../" BUT INSTEAD USES MY FILE PATHS DIRECTLY
         */

         case "notepad":
            runtime.exec("notepad.exe");
            break;
         case "calculator":
            runtime.exec("calc.exe");
            break;
         case "arduino":
            runtime.exec("../arduino.exe");
            break;
         case "help":
            runtime.exec("notepad.exe ../HelpList.txt");
            break;
         case "vs code":
            runtime.exec("../Code.exe");
            break;
         case "discord":
            runtime.exec("../Discord.exe");
            break;
        /**WEBSITES */
         case "youtube":
            try {
               Desktop.getDesktop().browse(new URI("https://www.youtube.com")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "web":
            try {
               Desktop.getDesktop().browse(new URI("https://www.google.com")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "classes":
            try {
               Desktop.getDesktop().browse(new URI("https://brightspace.uakron.edu")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "my akron":
            try {
               Desktop.getDesktop().browse(new URI("https://my.uakron.edu")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "chat gpt":
            try {
               Desktop.getDesktop().browse(new URI("https://chat.openai.com")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "email":
            try {
               Desktop.getDesktop().browse(new URI("https://outlook.office.com")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "disney":
            try {
               Desktop.getDesktop().browse(new URI("https://www.disneyplus.com")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "google docs":
            try {
               Desktop.getDesktop().browse(new URI("https://docs.google.com")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "spotify":
            try {
               Desktop.getDesktop().browse(new URI("https://open.spotify.com")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "github":
            try {
               Desktop.getDesktop().browse(new URI("https://github.com")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "pdf converter":
            try {
               Desktop.getDesktop().browse(new URI("https://www.pdf2go.com")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "graphing calculator":
            try {
               Desktop.getDesktop().browse(new URI("https://www.desmos.com//calculator")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "google drive":
            try {
               Desktop.getDesktop().browse(new URI("https://drive.google.com")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "lego league":
            try {
               Desktop.getDesktop().browse(new URI("https://my.firstinspires.org")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "spike":
            try {
               Desktop.getDesktop().browse(new URI("https://spike.legoeducation.com")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "instagram":
            try {
               Desktop.getDesktop().browse(new URI("https://www.instagram.com")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "tiktok":
            try {
               Desktop.getDesktop().browse(new URI("https://www.tiktok.com")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         case "arduino simulator":
            try {
               Desktop.getDesktop().browse(new URI("https://wokwi.com")); 
            } catch (IOException | URISyntaxException e) {
               e.printStackTrace();
            }
            break;
         default:
            // Only prints if the entered in keyword does not match any predefined ones
            System.out.println("Application not supported or invalid request");
            break;
      }
   } 
}