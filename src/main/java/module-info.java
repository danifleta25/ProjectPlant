module org.projectplant.projectplant {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.projectplant.projectplant to javafx.fxml;
    exports org.projectplant.projectplant;
}