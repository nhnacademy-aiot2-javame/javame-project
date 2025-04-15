package com.nhnacademy.exam.javamememberapi.member.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;


public class MemberUpdateRequest {

    @NotBlank(message = "이름은 필수 입력 항목입니다.")
    @Size(min = 2, max = 4, message = "이름은 2자 이상 4자 이하로 입력해 주세요.")
    private final String memberName;

    @NotBlank(message = "비밀번호는 필수 입력 항목입니다.")
    private final String memberPassword;

    @Email(message = "유효한 이메일 주소를 입력해 주세요")
    @NotBlank(message = "이메일은 필수 입력 항목입니다.")
    private final String memberEmail;

    @NotBlank(message = "생년월일은 필수 입력 항목입니다.")
    private final LocalDate memberBirth;

    @NotBlank(message = "전화번호는 필수 입력 항목입니다.")
    @Pattern(
            regexp = "^01[0-9]-\\d{3,4}-\\d{4}$",
            message = "모바일 연락처는 01X-XXXX-XXXX 형식으로 입력해주세요."
    )
    private final String memberMobile;

    public MemberUpdateRequest(String memberName, String memberPassword, String memberEmail, LocalDate memberBirth, String memberMobile) {
        this.memberName = memberName;
        this.memberPassword = memberPassword;
        this.memberEmail = memberEmail;
        this.memberBirth = memberBirth;
        this.memberMobile = memberMobile;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public LocalDate getMemberBirth() {
        return memberBirth;
    }

    public String getMemberMobile() {
        return memberMobile;
    }
}