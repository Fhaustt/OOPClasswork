module com.example.tuitioncenter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fhaustt.tuitioncenter to javafx.fxml;
    exports com.fhaustt.tuitioncenter;
}