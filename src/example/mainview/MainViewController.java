package example.mainview;

import com.sun.tools.javac.Main;
import example.items.ItemController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MainViewController {

    @FXML
    public VBox itemVBox;


    public MainViewController() {

    }

    public void onButtonPress(ActionEvent actionEvent) {


        itemVBox.getChildren().add(loadItem());

    }

    private int itemCount;
    private Pane loadItem() {
        Pane content = new Pane();
        try {
            System.out.println(getClass().getResource("../items/Item.fxml"));
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../items/Item.fxml"));
            Pane pane  =  loader.load();
            ItemController controller = loader.getController();

            itemCount++;
            controller.init("Item #" + itemCount, "Item #" + itemCount ,"Item #" + itemCount);
            content = pane;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }


}
