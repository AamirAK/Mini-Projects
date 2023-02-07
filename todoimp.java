import java.util.List;

public class todoimp {
    int id;
    String todo;
    String status;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTodo() {
        return todo;
    }
    public void setTodo(String todo) {
        this.todo = todo;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String toString(){
        return (""+id+" "+todo+" "+status);
    }
    public void chnageStatus(String s){
        status=s;
        System.out.println(""+id+" "+todo+" "+status);
    }
}
