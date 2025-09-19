package models;
import java.sql.Timestamp;


import io.ebean.Model;
import jakarta.persistence.*;


@Entity
public class EventLog extends Model{
    @Id

    public Long id;
    public String eventType;
    public Timestamp timestamp;
}
