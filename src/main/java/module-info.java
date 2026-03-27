module org.projectplant.projectplant {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.projectplant.projectplant to javafx.fxml;
    exports org.projectplant.projectplant;
}