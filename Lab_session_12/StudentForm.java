import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentForm extends Application {

    private final ObservableList<Student> studentList = FXCollections.observableArrayList();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Student Record System");

        // Inputs
        TextField txtId = new TextField();     txtId.setPromptText("Enter ID");
        TextField txtName = new TextField();   txtName.setPromptText("Enter Name");
        TextField txtCourse = new TextField(); txtCourse.setPromptText("Enter Course");

        // Labels
        Label lblId = new Label("Student ID:");
        Label lblName = new Label("Student Name:");
        Label lblCourse = new Label("Course:");

        // Buttons
        Button btnAdd = new Button("Add Student");
        Button btnClear = new Button("Clear");

        // ListView
        ListView<Student> listView = new ListView<>(studentList);
        listView.setPrefHeight(180);

        // Events
        btnAdd.setOnAction(e -> {
            String id = txtId.getText().trim();
            String name = txtName.getText().trim();
            String course = txtCourse.getText().trim();

            if (id.isEmpty() || name.isEmpty() || course.isEmpty()) {
                showAlert(Alert.AlertType.WARNING, "Input Error", "Please fill all fields.");
            } else {
                studentList.add(new Student(id, name, course));
                showAlert(Alert.AlertType.INFORMATION, "Success", "Student added successfully!");
                txtId.clear(); txtName.clear(); txtCourse.clear();
            }
        });

        btnClear.setOnAction(e -> {
            txtId.clear(); txtName.clear(); txtCourse.clear();
            studentList.clear();
        });

        // Layout
        GridPane form = new GridPane();
        form.setHgap(10);
        form.setVgap(10);
        form.setPadding(new Insets(20));
        form.add(lblId, 0, 0);     form.add(txtId, 1, 0);
        form.add(lblName, 0, 1);   form.add(txtName, 1, 1);
        form.add(lblCourse, 0, 2); form.add(txtCourse, 1, 2);
        form.add(btnAdd, 0, 3);    form.add(btnClear, 1, 3);

        VBox root = new VBox(15, form, new Label("Student Records:"), listView);
        root.setPadding(new Insets(20));

        stage.setScene(new Scene(root, 400, 450));
        stage.show();
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) { launch(args); }
}
