
CREATE TABLE if not EXISTS `payment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `serial` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;