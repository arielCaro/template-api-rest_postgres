package template.api.template_api_rest_postgres.Mapper;

import template.api.template_api_rest_postgres.Entity.User;
import jakarta.persistence.Id;
import template.api.template_api_rest_postgres.Dto.UserDto;

public class UserMapper {

    /**
     * 
     * @param user
     * @return
     */
    public static UserDto mapToUserDto(User user) {

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setIdCompany(user.getIdCompany());
        userDto.setActive(user.getActive());
        userDto.setDateCreated(user.getDateCreated());
        userDto.setDateModified(user.getDateModified());
        userDto.setEmail(user.getEmail());
        userDto.setLastName(user.getLastName());
        userDto.setUserCreated(user.getUserCreated());
        userDto.setUserModified(user.getUserModified());
        return userDto;
    }

    /**
     * 
     * @param userDto
     * @return
     */
    public static User mapToUser(UserDto userDto) {

        User user = new User();
        user.setId(userDto.getId());
        user.setIdCompany(userDto.getIdCompany());
        user.setActive(userDto.getActive());
        user.setDateCreated(userDto.getDateCreated());
        user.setDateModified(userDto.getDateModified());
        user.setEmail(userDto.getEmail());
        user.setLastName(userDto.getLastName());
        user.setUserCreated(userDto.getUserCreated());
        user.setUserModified(userDto.getUserModified());
        return user;
    }
}
