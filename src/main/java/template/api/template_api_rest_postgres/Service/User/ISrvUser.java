package template.api.template_api_rest_postgres.Service.User;

import java.util.List;

import template.api.template_api_rest_postgres.Dto.UserDto;

public interface ISrvUser {
    UserDto createUser(UserDto userDto);
    UserDto updateUser(UserDto userDto);
    UserDto getUser(Long id);
    List<UserDto> getAllUser();
    String deleteUser(Long id);
}

