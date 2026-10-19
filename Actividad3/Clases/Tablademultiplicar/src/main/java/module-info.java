module com.karla.tablademultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.karla.tablademultiplicar to javafx.fxml;
    exports com.karla.tablademultiplicar;
}
