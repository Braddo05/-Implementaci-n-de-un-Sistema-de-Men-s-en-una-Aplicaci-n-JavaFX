module Tarea3 {
	requires javafx.controls;
	requires java.desktop;
	requires javafx.base;
	
	opens Appmenu to javafx.graphics, javafx.fxml;
}