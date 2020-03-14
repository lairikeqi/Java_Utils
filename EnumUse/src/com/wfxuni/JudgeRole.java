package com.wfxuni;

public class JudgeRole {

    public String judge(String roleName) {
        return RoleEnum.valueOf(roleName).operation();
    }
}
