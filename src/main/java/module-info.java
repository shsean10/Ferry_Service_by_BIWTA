module com.example.ferry_service_by_biwta {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ferry_service_by_biwta to javafx.fxml;
    exports com.example.ferry_service_by_biwta;
}