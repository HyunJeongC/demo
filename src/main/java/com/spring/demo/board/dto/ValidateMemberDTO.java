package com.spring.demo.board.dto;

import com.spring.demo.member.domain.Auth;
import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class ValidateMemberDTO {

    private String account;
    private Auth auth;
}