package template.api.template_api_rest_postgres.Dto;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long Id;
    private String LastName;
    private String Email;
    private Boolean Active;
    private Date DateCreated;
    private Date DateModified;
    private String UserCreated;
    private String UserModified;
    private Long IdCompany;
}
