package org.sparta.hh_lv2.service;

import org.sparta.hh_lv2.dto.user.UserRequestDto;
import org.sparta.hh_lv2.dto.user.UserResponseDto;
import org.sparta.hh_lv2.entity.User;
import org.sparta.hh_lv2.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDto createUser(UserRequestDto requestDto) {
        User user = new User(requestDto);

        User saveUser = userRepository.save(user);

        UserResponseDto userResponseDto = new UserResponseDto(user);

        return userResponseDto;
    }
}
