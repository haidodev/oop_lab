package hust.soict.globalict.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {
    private boolean isPainter;
    private boolean isEraser;
    @FXML
    private Pane drawingAreaPane;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if (event.getX() <= 0 || event.getY() <= 0) return;
        Circle newCircle = null;
        if (isPainter){
            newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
        } else if (isEraser){
            newCircle = new Circle(event.getX(), event.getY(), 8, Color.WHITE);
        }
        if (newCircle != null) drawingAreaPane.getChildren().add(newCircle);
    }

    public void setToolEraser(ActionEvent actionEvent) {
        isEraser = true;
        isPainter = false;
    }

    public void setToolPainter(ActionEvent actionEvent) {
        isEraser = false;
        isPainter = true;
    }
}
