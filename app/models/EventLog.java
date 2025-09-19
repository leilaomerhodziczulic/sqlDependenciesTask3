package models;
import java.sql.Timestamp;


import io.ebean.Model;
import jakarta.persistence.*;


@Entity
public class EventLog extends Model{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String eventType;
    public Timestamp timestamp;

    public EventLog(String eventType){
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.eventType = eventType;
    }
}
