module mazmorras {
    requires javafx.controls;
    requires javafx.fxml;

    opens mazmorras to javafx.fxml;
    exports mazmorras;
}
