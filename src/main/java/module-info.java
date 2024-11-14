module dev.lpa.udemy425controls {
  requires javafx.controls;
  requires javafx.fxml;


  opens dev.lpa.udemy425controls to javafx.fxml;
  exports dev.lpa.udemy425controls;
}