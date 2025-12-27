module be.inf1.creemersdoucevaelen {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens be.inf1.creemersdoucevaelen to javafx.fxml;
    exports be.inf1.creemersdoucevaelen;
}
