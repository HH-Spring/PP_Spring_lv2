package org.sparta.hh_lv2.dto.user;

import lombok.Getter;
import org.sparta.hh_lv2.entity.User;

@Getter
public class UserResponseDto {
    private String name;
    private String gender;
    private String phNumber;
    private String address;

    public UserResponseDto(User user) {
        this.name = user.getName();
        this.gender = user.getGender();
        this.phNumber = user.getPhNumber();
        this.address = user.getAddress();
    }

}
