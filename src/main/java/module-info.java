module com.uqvirtual.edu.co.proyectop2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.uqvirtual.edu.co.proyectop2 to javafx.fxml;
    exports com.uqvirtual.edu.co.proyectop2;
}