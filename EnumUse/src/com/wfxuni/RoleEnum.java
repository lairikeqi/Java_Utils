package com.wfxuni;

public enum RoleEnum implements RoleOperation {

    // 系统管理员
    ROLE_ROOT_ADMIN {
        @Override
        public String operation() {
            return "ROLE_ROOT_ADMIN: " + "has A permission";
        }
    },

    // 订单管理员
    ROLE_ORDER_ADMIN {
        @Override
        public String operation() {
            return "ROLE_ORDER_ADMIN: " + "has B permission";
        }
    },

    // 普通用户
    ROLE_NORMAL {
        @Override
        public String operation() {
            return "ROLE_NORMAL: " + "has C permission";
        }
    };
}
