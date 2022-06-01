import java.util.regex.Pattern;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class Register_FX extends Application{
	private BorderPane bp;
	private Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	private PasswordField pf1,pf2;
	private TextField tf1,tf2;
	private RadioButton rb1,rb2;
	private ToggleGroup tg1;
	private TextArea ta1,ta2;
	private Button bt1,bt2;
	private ComboBox<String> cb1,cb2,cb3;
	private ObservableList<String> ol1,ol2,ol3;
	private CheckBox ch[];
	private String Gender;
	private String Birthday="1990/01/01";
	private String Hobby="No Hobby";
	private Boolean f1=false;
	private Boolean f2=false;
	private Boolean f3=false;
	private Boolean f4=false;

	public void start(Stage stage)throws Exception{
		//top
		l1=new Label("Register & Display");
		l1.setFont(Font.font("Century",FontWeight.BOLD,24));

		//center
		//label
		l2=new Label("Registration List");
		l2.setFont(Font.font("Century",FontWeight.BOLD,16));

		//Name
		l3=new Label("Name:");
		l3.setFont(Font.font("Century",FontWeight.BOLD,16));
		tf1=new TextField();
		tf1.setPrefHeight(30);
		tf1.setOnAction(new TextEventHandler());
		HBox hb1=new HBox();
		hb1.getChildren().add(l3);
		hb1.getChildren().add(tf1);
		hb1.setAlignment(Pos.CENTER_RIGHT);
		hb1.setPadding(new Insets(0,0,5,0));

		//Password
		l4=new Label("Password:");
		l4.setFont(Font.font("Century",FontWeight.BOLD,16));
		pf1=new PasswordField();
		pf1.setOnAction(new TextEventHandler());
		HBox hb2=new HBox();
		hb2.getChildren().add(l4);
		hb2.getChildren().add(pf1);
		hb2.setAlignment(Pos.CENTER_RIGHT);
		hb2.setPadding(new Insets(0,0,5,0));

		l5=new Label("Confirm:");
		l5.setFont(Font.font("Century",FontWeight.BOLD,16));
		pf2=new PasswordField();
		pf2.setOnAction(new TextEventHandler());
		HBox hb3=new HBox();
		hb3.getChildren().add(l5);
		hb3.getChildren().add(pf2);
		hb3.setAlignment(Pos.CENTER_RIGHT);
		hb3.setPadding(new Insets(0,0,5,0));

		//Email
		l6=new Label("Email:");
		l6.setFont(Font.font("Century",FontWeight.BOLD,16));
		tf2=new TextField();
		tf2.setOnAction(new TextEventHandler());
		HBox hb4=new HBox();
		hb4.getChildren().add(l6);
		hb4.getChildren().add(tf2);
		hb4.setAlignment(Pos.CENTER_RIGHT);
		hb4.setPadding(new Insets(0,0,5,0));

		//RadioButton
		rb1=new RadioButton("Male");
		rb2=new RadioButton("Female");
		tg1=new ToggleGroup();
		rb1.setToggleGroup(tg1);
		rb2.setToggleGroup(tg1);
		rb1.setOnAction(new RadioButtonEventHandler());
		rb2.setOnAction(new RadioButtonEventHandler());
		HBox hb5=new HBox();
		hb5.getChildren().add(rb1);
		hb5.getChildren().add(rb2);
		hb5.setAlignment(Pos.CENTER);
		hb5.setSpacing(30);
		hb5.setPadding(new Insets(0,0,5,0));

		//ComboBox
		l7=new Label("Birthday:");
		l7.setFont(Font.font("Century",FontWeight.BOLD,16));
		cb1=new ComboBox<String>();
		cb2=new ComboBox<String>();
		cb3=new ComboBox<String>();
		ol1=FXCollections.observableArrayList(
				"1990","1991","1992","1993","1994","1995","1996",
				"1997","1998","1999","2000","2001","2002","2003",
				"2004","2005","2006","2007","2008","2009");
		ol2=FXCollections.observableArrayList(
				"01","02","03","04","05","06","07","08","09",
				"10","11","12");
		ol3=FXCollections.observableArrayList(
				"01","02","03","04","05","06","07","08","09","10",
				"11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24","25","26","27","28","29","30",
				"31");

		cb1.setItems(ol1);
		cb2.setItems(ol2);
		cb3.setItems(ol3);
		cb1.setPromptText("1990");
		cb2.setPromptText("01");
		cb3.setPromptText("01");
		cb1.setOnAction(new ComboBoxEventHandler());
		cb2.setOnAction(new ComboBoxEventHandler());
		cb3.setOnAction(new ComboBoxEventHandler());
		HBox hb6=new HBox();
		hb6.getChildren().add(l7);
		hb6.getChildren().add(cb1);
		hb6.getChildren().add(cb2);
		hb6.getChildren().add(cb3);
		hb6.setAlignment(Pos.CENTER_RIGHT);
		hb6.setSpacing(5);
		hb6.setPadding(new Insets(0,0,5,0));

		//Hobby
		l8=new Label("Hobby:");
		l8.setFont(Font.font("Century",FontWeight.BOLD,16));
		ch=new CheckBox[3];
		ch[0]=new CheckBox("Sports");
		ch[1]=new CheckBox("Music");
		ch[2]=new CheckBox("Game");
		ch[0].setOnAction(new CheckBoxEventHandler());
		ch[1].setOnAction(new CheckBoxEventHandler());
		ch[2].setOnAction(new CheckBoxEventHandler());
		HBox hb7=new HBox();
		hb7.getChildren().add(l8);
		hb7.getChildren().add(ch[0]);
		hb7.getChildren().add(ch[1]);
		hb7.getChildren().add(ch[2]);
		hb7.setAlignment(Pos.CENTER_RIGHT);
		hb7.setSpacing(10);
		hb7.setPadding(new Insets(0,0,5,0));

		//Biography
		l9=new Label("Biography:");
		l9.setFont(Font.font("Century",FontWeight.BOLD,16));
		ta1=new TextArea();
		ta1.setPrefWidth(220);
		ta1.setPrefHeight(100);
		HBox hb8=new HBox();
		hb8.getChildren().add(l9);
		hb8.getChildren().add(ta1);
		hb8.setAlignment(Pos.CENTER_RIGHT);
		hb8.setPadding(new Insets(0,0,5,0));

		//Button
		bt1=new Button("Confirm");
		bt2=new Button("Clear");
		bt1.setOnAction(new ButtonEventHandler());
		bt2.setOnAction(new ButtonEventHandler());
		HBox hb9=new HBox();
		hb9.getChildren().add(bt1);
		hb9.getChildren().add(bt2);
		hb9.setAlignment(Pos.CENTER);
		hb9.setSpacing(30);
		hb9.setPadding(new Insets(0,0,5,0));

		//TextArea
		l10=new Label("Registration Result");
		l10.setFont(Font.font("Century",FontWeight.BOLD,16));
		ta2=new TextArea();
		ta2.setPrefWidth(220);
		ta2.setPrefHeight(290);
		VBox vb1=new VBox();
		vb1.getChildren().addAll(l10,ta2);
		vb1.setPadding(new Insets(10));

		//GUI Display
		bp=new BorderPane();
		VBox vb2=new VBox();
		vb2.setPadding(new Insets(10));
		vb2.getChildren().addAll(l2,hb1,hb2,hb3,hb4,hb5,hb6,hb7,hb8,hb9);

		bp.setTop(l1);
		bp.setAlignment(l1,Pos.CENTER);
		bp.setAlignment(vb2,Pos.CENTER_RIGHT);
		vb2.setAlignment(Pos.CENTER);
		bp.setLeft(vb2);bp.setCenter(vb1);


		Scene sc=new Scene(bp,650,400);
		stage.setScene(sc);
		stage.setTitle("Register_FXOption");
		stage.show();

	}
	public static void main(String args[]) {
		launch(args);
	}
	private class TextEventHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e) {
			String sentence="";
			if(e.getSource().equals(tf1)) {//name
				//name
				f1=false;
				if(tf1.getText().length()<4 || tf1.getText().length()>16) {
					sentence+="UserName is overlength or too short!\n";
				}
				//numeric
				Pattern pattern=Pattern.compile("[0-9]*");
				if(pattern.matcher(tf1.getText()).matches()) {
					sentence+="User Name can't be numeric!\n";
				}else {
					f1=true;//名前完了
				}
			}
			if(e.getSource().equals(pf1)) {//password
				String pass=new String(pf1.getText());
				if(pass.length()<4 || pass.length()>16) {
					sentence+="Password is overlength or too short!\n";
				}
			}
			if(e.getSource().equals(pf2)) {//confirm
				String password1=new String(pf1.getText());
				String password2=new String(pf2.getText());
				if(password1.equals(password2)) {
					sentence+="Pass checked!!\n";
					f2=true;//パスワード完了
				}else {
					sentence+="Password and confirmation are different!\n";
				}
			}

			if(e.getSource().equals(tf2)) {//mail
				Pattern pattern=
						Pattern.compile("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$");
				if(!pattern.matcher(tf2.getText()).matches()) {
					sentence+="Email does not meet the specification!\n";
				}else {
					f3=true;//メアド完了
				}
			}
			ta2.setText(sentence);
		}
	}
	private class RadioButtonEventHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e) {
			Gender="";
			RadioButton tmp=(RadioButton)e.getSource();
			if(tmp.getText()=="Male") {
				Gender=tmp.getText();
			}else if(tmp.getText()=="Female") {
				Gender=tmp.getText();
			}
			f4=true;//性別完了
		}
	}
	private class CheckBoxEventHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e) {
			CheckBox tmp = (CheckBox) e.getSource();
			Hobby="";
			for(int i=0;i<ch.length;i++) {
				if(ch[i].isSelected()==true) {
					Hobby=Hobby+ch[i].getText()+"  ";
				}
			}
		}
	}
	private class ComboBoxEventHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e) {
			if(!cb1.getSelectionModel().isEmpty()
					&&!cb2.getSelectionModel().isEmpty()) {
				if(Integer.parseInt(cb2.getValue().toString())%2==0) {
					if(Integer.parseInt(cb2.getValue().toString())==2) {//2月
						ol3=FXCollections.observableArrayList(
								"01","02","03","04","05","06","07","08","09","10",
								"11","12","13","14","15","16","17","18","19","20",
								"21","22","23","24","25","26","27","28");
						cb3.setItems(ol3);
					}else {//4,6,8,10,12月
						ol3=FXCollections.observableArrayList(
								"01","02","03","04","05","06","07","08","09","10",
								"11","12","13","14","15","16","17","18","19","20",
								"21","22","23","24","25","26","27","28","29","30");
						cb3.setItems(ol3);
					}
				}else {//1,3,5,7,9,11月
					ol3=FXCollections.observableArrayList(
							"01","02","03","04","05","06","07","08","09","10",
							"11","12","13","14","15","16","17","18","19","20",
							"21","22","23","24","25","26","27","28","29","30",
							"31");
					cb3.setItems(ol3);
				}
				//うるう年判定
				if(Integer.parseInt(cb1.getValue().toString())%4==0) {
					if(Integer.parseInt(cb1.getValue().toString())%100==0) {
						if(Integer.parseInt(cb1.getValue().toString())%400==0
								&& Integer.parseInt(cb2.getValue().toString())==2) {//うるう年
							ol3=FXCollections.observableArrayList(
									"01","02","03","04","05","06","07","08","09","10",
									"11","12","13","14","15","16","17","18","19","20",
									"21","22","23","24","25","26","27","28","29");
							cb3.setItems(ol3);
						}
					}
				}
			}
			if(!cb1.getSelectionModel().isEmpty()
					&&!cb2.getSelectionModel().isEmpty()
					&&!cb3.getSelectionModel().isEmpty()){
				Birthday=cb1.getValue().toString()+"/"
						+cb2.getValue().toString()+"/"
						+cb3.getValue().toString();
			}
		}
	}
	private class ButtonEventHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e) {
			String sentence="";
			if(e.getSource().equals(bt1)) {
				if(!f1||!f2||!f3||!f4) {
					if(!f1) {
						sentence+="No name entered!\n";
					}
					if(!f2) {
						sentence+="Password and confirmation are different!\n";
					}
					if(!f3) {
						sentence+="No Email entered!\n";
					}
					if(!f4) {
						sentence+="No Gender entered!\n";
					}
					ta2.setText(sentence);
				}
				if(f1&&f2&&f3&&f4) {
					ta2.setText("Registration Succeed!\n\n"
							+"Name : "+tf1.getText()
							+"\nEmail : "+tf2.getText()
							+"\nGender : "+Gender
							+"\nBirthday : "+Birthday
							+ "\nHobby : "+Hobby
							+"\n\n"
							+"Biography:\n"
							+ta1.getText());
				}
			}
			if(e.getSource().equals(bt2)) {
				tf1.setText("");
				tf2.setText("");
				pf1.setText("");
				pf2.setText("");
				ta1.setText("");
				ta2.setText("");
				cb1.setPromptText("1990");
				cb2.setPromptText("01");
				cb3.setPromptText("01");
				rb1.setSelected(false);
				rb2.setSelected(false);
				for(int i=0;i<ch.length;i++) {
					ch[i].setSelected(false);
				}
				f1=false;//名前
				f2=false;//パスワード
				f3=false;//メール
				f4=false;//性別の確認を未完了にする
			}
		}
	}
}