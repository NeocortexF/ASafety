package software.neocortex.model;


import javax.persistence.*;

@Entity
@Table
public class DirectoryFlightPersonnel {

    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "ID")
    private String staffNumber;

    @Column(name = "AE")
    private String squadronNumber;

    @Column(name = "Position")
    private String position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getSquadronNumber() {
        return squadronNumber;
    }

    public void setSquadronNumber(String squadronNumber) {
        this.squadronNumber = squadronNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "DirectoryFlightPersonnel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", staffNumber='" + staffNumber + '\'' +
                ", squadronNumber='" + squadronNumber + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
