package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Media;
import javafx.fxml.FXML;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;

public class CartScreenController {
    private Cart cart;

    public CartScreenController(Cart cart){
        super();
        this.cart = cart;
    }
    @FXML
    private void initialize(){


    }
}