package org.sparta.hh_lv2.controller;

// 전체적인 흐름, 어떤 것을 할건지 왜 할건지

/*
* 컨트롤러 어노테이션, 매핑 어노테이션에 /api 적어주고
* 포스트매핑지정 RequestBody 로 받고 createUser
* 리턴 값으로 UserService
*
* userService 에는 name, gender, idNumber, phNumber, address입력 후
* UserRepository에 접근후 createUser로 저장.
* */

import org.sparta.hh_lv2.dto.user.UserRequestDto;
import org.sparta.hh_lv2.dto.user.UserResponseDto;
import org.sparta.hh_lv2.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* 전체적인 흐름
* 사용자가 입력한 값을 검증하고 이 요청을 컨트롤러가 응답해 서비스로 전달 후 서비스는 비즈니스 로직을 처리한 후 DB 저장을 위해서
* JpaRepository 를 이용할 것
*
* 상세
* 1. 요청 Dto 생성
* 2. 컨트롤러 주소 매핑
* 3. service 의존성 주입 DI
* 4. 요청 api 생성
* 5. 요청 값 서비스로 전달
* 6. 서비스에서 비즈니스 로직 처리
* 7. JpaRepo 를 활용해 DB 저장
*
* */
@RestController
@RequestMapping("/api")
public class UserController {
}
