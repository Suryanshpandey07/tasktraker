package tasktracker;

import java.time.LocalDateTime;

public class manager {
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("No command given");
            return;
        }
        if (args[0].equals("add") && args.length < 2) {
            System.out.println("Please provide a task description");
            return;
        }
        String command = args[0];

        if(command.equals("add")){

            String description = args[1];

            int id = 1;

            String time = LocalDateTime.now().toString();

            task t = new task(
                id,
                description,
                "todo",
                time,
                time
            );

            System.out.println("Task added: " + description);
            System.out.println("ID: " + t.id);
            System.out.println("Status: " + t.status);
            System.out.println("Created: " + t.created);
            try{
                java.io.FileWriter fw = new java.io.FileWriter("Tasks.json", true);
                fw.write("{\"id\":" + t.id + ",\"description\":\"" + t.description + "\",\"status\":\"" + t.status + "\",\"created\":\"" + t.created + "\",\"updated\":\"" + t.updated + "\"},\n");
                fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else if(command.equals("list")) {

            try {
                java.io.BufferedReader br =
                    new java.io.BufferedReader(
                        new java.io.FileReader("Tasks.json"));

                String line;

                while((line = br.readLine()) != null) {
                    System.out.println(line);
                }

                br.close();

            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    
    
}
