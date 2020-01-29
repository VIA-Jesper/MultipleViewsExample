package example.items;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ItemController {

    @FXML
    public Label label1;
    @FXML
    public Label label2;
    @FXML
    public Label label3;


    public void init(String label1, String label2, String label3) {
        this.label1.setText(label1);
        this.label2.setText(label2);
        this.label3.setText(label3);
    }


}
