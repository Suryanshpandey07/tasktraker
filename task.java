package tasktracker;

import java.time.LocalDateTime;

public class task {
    int id;
    String status;
    String description;
    String created;
    String updated;

    public task( int id, String description ,String status, String created,String updated){
        this.id=id;
        this.description=description;
        this.status=status;
        this.created=created;
        this.updated=updated;
    }


    
}
