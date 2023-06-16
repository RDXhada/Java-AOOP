module exam_view {
    requires javafx.controls;
    requires exam_logic;
    requires javafx.fxml;

    opens exam.view to javafx.fxml;
    exports exam.view to javafx.graphics;
}