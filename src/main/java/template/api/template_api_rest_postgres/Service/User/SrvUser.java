package template.api.template_api_rest_postgres.Service.User;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import template.api.template_api_rest_postgres.Dto.UserDto;
import template.api.template_api_rest_postgres.Entity.User;

import template.api.template_api_rest_postgres.Mapper.UserMapper;
import template.api.template_api_rest_postgres.Repository.UserRepository;

/**
 * 
 */
@Service
@AllArgsConstructor
public class SrvUser implements ISrvUser {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        User user = userRepository.findById(userDto.getId()).orElseThrow();
        user = UserMapper.mapToUser(userDto);
        User updatedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(updatedUser);
    }

    @Override
    public UserDto getUser(Long id) {
        User user = userRepository.findById(id).orElseThrow();
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> users = userRepository.findAll();
        return users.stream().map((user) -> UserMapper.mapToUserDto(user)).collect(Collectors.toList());
    }

    @Override
    public String deleteUser(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

}
