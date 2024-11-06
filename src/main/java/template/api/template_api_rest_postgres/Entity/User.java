package template.api.template_api_rest_postgres.Entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TbUsers")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "LastName")
    private String LastName;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Active")
    private Boolean Active;

    @Column(name = "DateCreated")
    private Date DateCreated;

    @Column(name = "DateModified")
    private Date DateModified;

    @Column(name = "UserCreated")
    private String UserCreated;

    @Column(name = "UserModified")
    private String UserModified;

    @Column(name = "IdCompany")
    private Long IdCompany;
}
