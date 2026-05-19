package src;

public class Task {
    int id;
    String title;
    String status;
    String createdAt;


   public Task(int id , String title){
    this.id = id;
    this.title = title;
    this.status = "TODO";
    this.createdAt = java.time.LocalDate.now().toString();

    }



    @Override
    public String toString(){
        return "["+ id +"]" + title + " | " + status + " | " + createdAt; 
    }

}
