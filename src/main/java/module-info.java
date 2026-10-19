module com.example.demo123calculadora {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires java.desktop;
    requires jdk.jfr;

    opens com.example.demo123calculadora to javafx.fxml;
    exports com.example.demo123calculadora;
}