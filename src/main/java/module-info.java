module com.example.dilog {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.dilog to javafx.fxml;
    exports com.example.dilog;
}