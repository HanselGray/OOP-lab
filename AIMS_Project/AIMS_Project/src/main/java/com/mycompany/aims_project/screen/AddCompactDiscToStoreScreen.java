package com.mycompany.aims_project.screen;

import com.mycompany.aims_project.Store.Store;
import javax.swing.JFrame;
import com.mycompany.aims_project.screen.controller.AddCDScreenController;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class AddCompactDiscToStoreScreen extends JFrame{

    private static Store store;
    
    public static void main(String[] args) {
		new AddCompactDiscToStoreScreen(store);
	}

    public AddCompactDiscToStoreScreen(Store store) {

        super();

        AddCompactDiscToStoreScreen.store = store;

        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Add DVD");
        this.setSize(1024, 768);
        this.setVisible(true);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/addCD.fxml"));
                    
                    AddCDScreenController controller = new AddCDScreenController(store);
                    loader.setController(controller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
    
}
