module hust.soict.dsai {
    requires javafx.controls;
    requires javafx.fxml;

    opens hust.soict.dsai to javafx.fxml;
    exports hust.soict.dsai;
}
