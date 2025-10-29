package crudactivity.mobilefix.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "repair_order")
public class RepairOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    private User customerUser;

    @ManyToOne
    @JoinColumn(name = "id_device")
    private Device device;

    @Column(name = "issue_description")
    private String issueDescription;

    @ManyToOne
    @JoinColumn(name = "id_status")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "id_assigned_tech")
    private User assigneeTechUser;

    @Column(name = "created_at", updatable = false)
    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate updatedAt;

    @Column(name = "tech_notes")
    private String techNotes;
}
