package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("===Task Tracker CLI===");
         System.out.println("Type 'Help' to see the commands . Type 'Exit' to quit. \n");

         TaskManager manager = new TaskManager();
         manager.loadTask();
         while (true) {
            System.out.print(">");
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                continue;
            }

            if (input.equalsIgnoreCase("Exit")) {
                System.out.println("Good Bye");
                break;

            }else if(input.equalsIgnoreCase("Help")){
                printHelp();
            }else if (input.toLowerCase().startsWith("add")) {
                String title = input.substring(4);
                manager.addTask(title);
                manager.saveTasks();
            }else if (input.startsWith("list")) {
                manager.listTasks();

                
            }else if (input.toLowerCase().startsWith("delete")) {
                int id = Integer.parseInt(input.substring(7));
                manager.deleteTask(id);
                manager.saveTasks();
            }else{
                System.out.println("Unknown Command. Type 'Help' .");
            }
            
         }

         


    }

    static void printHelp(){
        System.out.println("\nadd<title> - Add your task");
        System.out.println("List - View all your tasks");
        System.out.println("Done<id> - Completed Task");
        System.out.println("Delete<id> - Delete your task");
        System.out.println("exit - Close Taks");
    }
 


}
