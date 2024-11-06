package template.api.template_api_rest_postgres.Dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String lastName;
    private String email;
    private Boolean active;
    private Date dateCreated;
    private Date dateModified;
    private String userCreated;
    private String userModified;
    private Long idCompany;
}
