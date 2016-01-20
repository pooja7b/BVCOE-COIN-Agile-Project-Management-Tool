package com.csc.Login;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LoginLayout extends Application{
    TextField name_input, pswd_input;
    Label user_name, user_pswd;
    HBox hb,hb1;
    public static void main(String[] args){
    	launch(args);
    }
	@Override
	public void start(Stage myStage) throws Exception {
		// TODO Auto-generated method stub
		myStage.setTitle("Login Page");
		FlowPane fp= new FlowPane(10, 10);
		fp.setAlignment(Pos.CENTER);
		Scene myscene= new Scene(fp, 250, 250);
		myStage.setScene(myscene);
		user_name=new Label("User Name");
		user_pswd= new Label("Password");
		name_input= new TextField();
		pswd_input= new TextField();
		name_input.setPromptText("Enter User Name");
		pswd_input.setPromptText("Enter password");
		name_input.setPrefColumnCount(25);
		pswd_input.setPrefColumnCount(20);
		hb= new HBox();
		hb1= new HBox();
		hb.getChildren().addAll(user_name,name_input);
		hb1.getChildren().addAll(user_pswd,pswd_input);
		hb.setSpacing(10);
	}
	

}
