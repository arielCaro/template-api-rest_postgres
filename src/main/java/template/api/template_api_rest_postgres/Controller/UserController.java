package template.api.template_api_rest_postgres.Controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import template.api.template_api_rest_postgres.Dto.UserDto;
import template.api.template_api_rest_postgres.Service.User.ISrvUser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@AllArgsConstructor
@RestController
@RequestMapping("/api/User")
public class UserController {

    ISrvUser iSrvUser;

    @PostMapping("/Create")
    public ResponseEntity<UserDto> create(@RequestBody UserDto userDto) {
        UserDto savedUserDto = iSrvUser.createUser(userDto);
        return new ResponseEntity<>(savedUserDto, HttpStatus.CREATED);

    }

    @PutMapping("/Update")
    public ResponseEntity<UserDto> update(@RequestBody UserDto userDto) {
        UserDto updatedUserDto = iSrvUser.updateUser(userDto);
        return new ResponseEntity<>(updatedUserDto, HttpStatus.OK);

    }

    @GetMapping("/GetAll")
    public ResponseEntity<List<UserDto>> getAll() {
        List<UserDto> getAllUserDto = iSrvUser.getAllUser();
        return new ResponseEntity<>(getAllUserDto, HttpStatus.OK);

    }

    @GetMapping("/Get/{id}")
    public ResponseEntity<UserDto> get(@PathVariable("id") Long id) {
        UserDto getUserDto = iSrvUser.getUser(id);
        return new ResponseEntity<>(getUserDto, HttpStatus.OK);

    }

    @GetMapping("/Delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        var deleteUserDto = iSrvUser.deleteUser(id);
        return new ResponseEntity<>(deleteUserDto, HttpStatus.OK);
    }

}
