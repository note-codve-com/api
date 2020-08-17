DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    `user_id` BIGINT UNSIGNED NOT NULL auto_increment COMMENT '用户编号',
    `mobile` VARCHAR ( 20 ) NOT NULL DEFAULT '' COMMENT '手机号码',
    `password` VARCHAR ( 256 ) NOT NULL DEFAULT '' COMMENT '密码',
    `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY `pk_user_id` ( `user_id` ),
    UNIQUE KEY `uk_mobile` ( `mobile` )
) ENGINE = INNODB DEFAULT charset = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户表'