package org.example;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;


public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static final Gson gson = new Gson();

    public static void main(String[] args) {
        System.out.println("________________________________");
        System.out.println("WELCOME TO JAVA CLI TASK TRACKER");
        System.out.println("________________________________");


        while(true){
            System.out.println();
            System.out.print(options());
            System.out.print("Select an option between 1-5: ");
            int userOption = scanner.nextInt();
            scanner.nextLine();

            switch(userOption){
                case 1 -> viewTasks();
                case 2 -> addTasks();
                case 3 -> deleteTasks();
                case 4 -> updateTasks();
                case 5 -> System.exit(0);
            }
        }
    }

    public static String options(){
        return """
                1. View All Tasks
                2. Add Task
                3. Delete Task
                4. Update Task
                5. Exit task"
                """;
    }

    public static void viewTasks(){
        System.out.println("View Task");
        try(FileReader reader = new FileReader("C:\\Users\\kleom\\IdeaProjects\\CLI-Task-Tracker\\src\\main\\resources\\Tasks.json")){
            Type taskListType = new TypeToken<List<Task>>() {}.getType();
            List<Task> tasks = gson.fromJson(reader, taskListType);

            for(Task task : tasks){
                System.out.println("ID: " + task.getID() +
                        " | Task Name: " + task.getTaskName() +
                        " | Status: " + task.getStatus());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
        catch (IOException e) {
            System.out.println("Something Went Wrong");
        }

    }

    public static void addTasks(){
        System.out.println("add Task");

    }

    public static void updateTasks(){
        System.out.println("update Task");

    }

    public static void deleteTasks(){
        System.out.println("delete Task");
    }
}