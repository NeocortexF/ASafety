package software.neocortex.model;

import javax.persistence.*;

@Entity
@Table(name = "fleet")
public class DirectoryFleetModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tail")
    private String tailNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    @Override
    public String toString() {
        return "DirectoryFleetModel{" +
                "id=" + id +
                ", tailNumber='" + tailNumber + '\'' +
                '}';
    }
}
