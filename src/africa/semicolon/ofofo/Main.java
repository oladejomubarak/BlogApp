package africa.semicolon.ofofo;

import africa.semicolon.ofofo.controllers.PostController;
import africa.semicolon.ofofo.dtos.requests.CreatePostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import javax.swing.*;
@SpringBootApplication
@EnableMongoRepositories
public class Main {
    @Autowired
    private static PostController postController;


    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
        //displayMainMenu();
    }

    private static void displayMainMenu() {
        String mainMenu = """
                press 1 for create post
                press 2 for view post
                press 3 to exit from App
                """;
        String userInput = input(mainMenu);
        switch (Integer.parseInt(String.valueOf(userInput.charAt(0)))){
            case 1 ->createPost();
            case 2 -> viewPost();
            case 3 ->exitFromApp();
        }
    }

    private static void createPost() {
        String title = input("Enter post title");
        String body = input("Enter post body");
        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setTitle(title);
        createPostRequest.setBody(body);
        print(postController.createPost(createPostRequest));
        displayMainMenu();
    }
    private static void viewPost(){
        String userInput = input("Enter post id");
        print(postController.viewPost((String.valueOf(userInput))).toString());
        displayMainMenu();
    }
    private static void exitFromApp() {
        print("Thank you for using our app");
        System.exit(0);
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
    private static void print(String prompt){
        JOptionPane.showInputDialog(null, prompt);
    }
}
