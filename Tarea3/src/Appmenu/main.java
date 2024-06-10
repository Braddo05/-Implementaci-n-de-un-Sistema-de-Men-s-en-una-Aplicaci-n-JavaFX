package Appmenu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) {
        MenuBar menuBar = new MenuBar();
        
        //Archivo
        Menu archivoMenu = new Menu("   Archivo   ");
        MenuItem nuevoI = new MenuItem("Nuevo");
        MenuItem abrirI = new MenuItem("Abrir");
        MenuItem guardarI = new MenuItem("Guardar");
        MenuItem SalirI = new MenuItem("Salir");
        archivoMenu.getItems().addAll(nuevoI, abrirI, guardarI, new SeparatorMenuItem(), SalirI);
        
        //Editar 
        Menu editarM = new Menu("    Editar   ");
        MenuItem cortarI = new MenuItem("Cortar");
        MenuItem copiarI = new MenuItem("Copiar");
        MenuItem pegarI = new MenuItem("Pegar");
        editarM.getItems().addAll(cortarI, copiarI, pegarI);
        
        //Ayuda
        Menu ayudaM = new Menu("    Ayuda    ");
        MenuItem acercadeItem = new MenuItem("Acerca de");
        ayudaM.getItems().add(acercadeItem);
        
        menuBar.getMenus().addAll(archivoMenu, editarM, ayudaM);
        
        nuevoI.setOnAction(e -> System.out.println("Nuevo archivo creado"));
        abrirI.setOnAction(e -> System.out.println("Archivo abierto"));
        guardarI.setOnAction(e -> System.out.println("Archivo guardado"));
        SalirI.setOnAction(e -> { 
        	System.out.println("Saliste como ingeniero xd");  
        	System.exit(0);
        	});
        cortarI.setOnAction(e -> System.out.println("Texto cortado"));
        copiarI.setOnAction(e -> System.out.println("Texto copiado"));
        pegarI.setOnAction(e -> System.out.println("Texto pegado"));
        acercadeItem.setOnAction(e -> System.out.println("Acerca de la aplicación"));
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        
        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setTitle("Barra de Menú");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
