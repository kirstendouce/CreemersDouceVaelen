module be.inf1.creemersdoucevaelen {
    requires javafx.controls;
    requires javafx.fxml;

    opens be.inf1.creemersdoucevaelen to javafx.fxml;
    exports be.inf1.creemersdoucevaelen;
}
