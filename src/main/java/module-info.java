module org.projectplant.projectplant {

    requires javafx.controls;
    requires javafx.fxml;

    opens org.projectplant.projectplant.presentation.controller to javafx.fxml;

    exports org.projectplant.projectplant;
}