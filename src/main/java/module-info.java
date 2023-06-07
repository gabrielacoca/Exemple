module com.example.exemple {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.exemple to javafx.fxml;
    exports com.example.exemple;
}