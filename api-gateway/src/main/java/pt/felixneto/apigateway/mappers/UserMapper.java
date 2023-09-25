package pt.felixneto.apigateway.mappers;

import pt.felixneto.apigateway.data.entities.User;
import pt.felixneto.apigateway.data.v1.dtos.UserDTO;

public class UserMapper {
    public static User convertUserDTOToEntity(UserDTO user) {
        User u = new User(1L, "", "", "", "");
        return u;
    }

    public static UserDTO convertUserDTOToEntity(User user) {
        UserDTO u = new UserDTO( "", "", "", "");
        return u;
    }
}
