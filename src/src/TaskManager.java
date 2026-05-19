package src;
import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task> tasks = new ArrayList<>();
    int nextId = 1;


    public void addTask(String title){
        Task t = new Task(nextId, title);
        tasks.add(t);
        nextId++;
        System.out.println("Task added:" + t);
    }

    public void listTasks(){
        if(tasks.isEmpty()){
            System.out.println("No task available");
            return;
        }

        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void deleteTask(int id){
        /*for (int i = 0; i < tasks.size(); i++) {
    if (tasks.get(i).id == id) {
        tasks.remove(i);
        break;
    } */
        tasks.removeIf(t -> t.id == id); // lambda expression
        System.out.println("Taks deleted");
    }


    public void saveTasks(){
        try{
            java.io.FileWriter writer = new java.io.FileWriter("tasks.txt");
            for (Task t : tasks) {
                writer.write(t.id + ", " + t.title + ", " + t.status + "," + t.createdAt + "\n");

            }
            writer.close();
        }catch(Exception e){
            System.out.println("Save error: " + e.getMessage());

        }
    }

    public void loadTask(){
        try{
            java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader("tasks.txt"));
            String line;
            while ((line = reader.readLine()) != null)  {
                String[] parts = line.split(",");
                Task t = new Task(Integer.parseInt(parts[0]) , parts[1]);
                t.status = parts[2];
                t.createdAt = parts[3];
                tasks.add(t);
                nextId = t.id + 1;
            }
            reader.close();
        }catch(Exception e){
            System.out.println("No saved tasks found");
        }
    }
}

