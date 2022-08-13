//package org.team2.domain;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.team2.domain.User;
//import org.team2.domain.UserDto;
//import org.springframework.data.domain.Page;
//
//public class UserMapper {
//
//    public static UserDto map(User user) {
//        UserDto dto = new UserDto();
//        dto.setId(user.getId());
//        dto.setUsername(user.getUsername());
//        dto.setPassword(user.getPassword());
//        dto.setAuthorized(user.getAuthorized());
//        dto.setRole(user.getRole().getRole());
//        return dto;
//    }
//
//    public static List<UserDto> map(Page<User> users) {
//        List<UserDto> dtos = new ArrayList<UserDto>();
//        for (User user: users) {
//            dtos.add(map(user));
//        }
//        return dtos;
//    }
//}