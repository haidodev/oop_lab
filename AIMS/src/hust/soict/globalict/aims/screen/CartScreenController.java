package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Objects;

public class CartScreenController {
    private Cart cart;
    @FXML
    private Label labelTotalCost;
    @FXML
    private Button btnPlay;
    @FXML
    private Button btnRemove;
    @FXML
    private TextField tfFilter;
    @FXML
    private RadioButton radioBtnFilterId;
    @FXML
    private RadioButton radioBtnFilterTitle;
    @FXML
    private TableView<Media> tblMedia;
    @FXML
    private TableColumn<Media, Float> colMediaCost;
    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;
    @FXML
    private void handleOrderProcess(ActionEvent event){

        cart.removeAllMedia();
        labelTotalCost.setText(String.format("%.2f$", this.cart.totalCost()));
        OrderProcessDialog orderDialog = new OrderProcessDialog();
        orderDialog.setVisible(true);

    }

    public CartScreenController(Cart cart){
        super();
        this.cart = cart;
    }
    @FXML
    private void btnRemovePressed(ActionEvent event){
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
        labelTotalCost.setText(String.format("%.2f$", this.cart.totalCost()));
    }
    @FXML
    private void btnPlayPressed(ActionEvent event){
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        PlayDialog dialog = new PlayDialog("Playing " + media.getTitle());
        dialog.setVisible(true);
    }
    @FXML
    private void initialize(){
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
        colMediacategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
        tblMedia.setItems(this.cart.getItemsOrdered());
        labelTotalCost.setText(String.format("%.2f$", this.cart.totalCost()));
        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>() {
                    @Override
                    public void changed(ObservableValue<? extends Media> observableValue, Media oldValue, Media newValue) {
                        if (newValue != null){
                            updateButtonBar(newValue);
                        }
                    }
                }
        );
        tfFilter.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(
                    ObservableValue<? extends String> observable, String oldValue, String newValue) {
                showFilterMedia(newValue);
            }
        });
    }

    private void showFilterMedia(String newValue) {
        FilteredList<Media> filteredCart = new FilteredList<>(cart.getItemsOrdered());
        if (radioBtnFilterId.selectedProperty().get()){
            if (!Objects.equals(newValue, "")) filteredCart.setPredicate(media -> media.getId() == Integer.parseInt(newValue));
        } else if (radioBtnFilterTitle.selectedProperty().get()){
            filteredCart.setPredicate(media -> media.getTitle().contains(newValue));
        }
        tblMedia.setItems(filteredCart);
    }

    private void updateButtonBar(Media media){
        btnRemove.setVisible(true);
        if (media instanceof Playable){
            btnPlay.setVisible(true);
        } else {
            btnPlay.setVisible(false);
        }
    }

}