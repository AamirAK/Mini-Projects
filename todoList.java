import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class todoList{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<todoimp> td=new ArrayList<todoimp>();
        while(true){
            System.out.println("");
            System.out.println("1...add into list");
            System.out.println("2...remove from list");
            System.out.println("3... change status");
            int op=sc.nextInt();
            if(op==1){
                todoimp tdi=new todoimp();
                System.out.println("Enter id of the task");
                int idn=sc.nextInt();
                System.out.println("Enter Task");
                sc.nextLine();
                String todon=sc.nextLine();
                tdi.setId(idn);
                tdi.setTodo(todon);
                tdi.setStatus("todo");
                td.add(tdi);
            }else if(op==2){
                System.out.println("Enter id");
                int idr=sc.nextInt();
                for(todoimp i:td){
                    if(i.getId()==idr){
                        td.remove(i);
                        break;
                    }
                }
            }else if(op==3){
                System.out.println("Enter id");
                int ids=sc.nextInt();
                for(todoimp i:td){
                    if(i.getId()==ids){
                        System.out.println("enter status in progress or done");
                        sc.nextLine();
                        String s=sc.nextLine();
                        i.chnageStatus(s);
                    }
                }
            }else{
                System.out.println("Wrong input");
            }
            int c=1;
            for(todoimp i :td){
                System.out.println(c+" "+i.toString());
                c++;
            }
        }
    }
}