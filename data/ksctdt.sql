-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1:3306
-- Thời gian đã tạo: Th6 13, 2021 lúc 01:38 PM
-- Phiên bản máy phục vụ: 8.0.21
-- Phiên bản PHP: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `ksctdt`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(3);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khao_sat`
--

DROP TABLE IF EXISTS `khao_sat`;
CREATE TABLE IF NOT EXISTS `khao_sat` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `khao_sat` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nam_hoc` bigint DEFAULT NULL,
  `khoa_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKk0m157ps7otaxr76wgoja1gr3` (`khoa_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khoasv`
--

DROP TABLE IF EXISTS `khoasv`;
CREATE TABLE IF NOT EXISTS `khoasv` (
  `khoa_id` bigint NOT NULL AUTO_INCREMENT,
  `tenkhoa` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`khoa_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `khoasv`
--

INSERT INTO `khoasv` (`khoa_id`, `tenkhoa`) VALUES
(1, 'CN Thông Tin'),
(2, 'Kế toán'),
(3, 'Quản trị Kinh doanh'),
(4, 'Tài chính ngân hàng'),
(5, 'ĐH Kinh tế'),
(6, 'ĐH Luật'),
(7, 'CN Thực phẩm'),
(8, 'Nuôi trồng Thủy sản'),
(9, 'Chăn nuôi'),
(10, 'Công nghệ Sinh học'),
(11, 'CN Kỹ thuật Xây dựng'),
(12, 'CN Kỹ thuật Cơ khí'),
(13, 'CN KT DK & TD Hóa'),
(14, 'CN kỹ thuật cơ điện tử'),
(15, 'Điện tử - Tin học công nghiệp'),
(16, 'Văn hóa học'),
(17, 'Du lịch'),
(18, 'Bảo vệ thực vật'),
(19, 'Giáo dục mầm non'),
(20, 'Giáo dục tiểu học'),
(21, 'Sư phạm Toán'),
(22, 'Sư phạm Ngữ văn');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lienhe`
--

DROP TABLE IF EXISTS `lienhe`;
CREATE TABLE IF NOT EXISTS `lienhe` (
  `khoa_id` bigint NOT NULL AUTO_INCREMENT,
  `tenkhoa` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id` bigint NOT NULL,
  `noidung` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sdt` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ten` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`khoa_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanxet`
--

DROP TABLE IF EXISTS `nhanxet`;
CREATE TABLE IF NOT EXISTS `nhanxet` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `donvicongtac` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hocvi` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ketluanchung` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nganhdaotao` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nx1` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nx2` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nx3` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ten` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ykienkhac` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieu_khao_sat`
--

DROP TABLE IF EXISTS `phieu_khao_sat`;
CREATE TABLE IF NOT EXISTS `phieu_khao_sat` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `survey_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `khoa_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKberep9unwuvj53irpqtym7u53` (`khoa_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `phieu_khao_sat`
--

INSERT INTO `phieu_khao_sat` (`id`, `created_at`, `updated_at`, `survey_name`, `title`, `khoa_id`) VALUES
(1, '2021-05-11 16:32:45', '0000-00-00 00:00:00', 'Khao Sat CNTT', 'doanh_nghiep', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `roles`
--

DROP TABLE IF EXISTS `roles`;
CREATE TABLE IF NOT EXISTS `roles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `roles`
--

INSERT INTO `roles` (`id`, `name`) VALUES
(4, 'ROLE_USER'),
(5, 'ROLE_ADMIN'),
(12, 'ROLE_MODERATOR');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tutorials`
--

DROP TABLE IF EXISTS `tutorials`;
CREATE TABLE IF NOT EXISTS `tutorials` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `files` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `khoa_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `survey_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `khoa_id` bigint NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tutorials`
--

INSERT INTO `tutorials` (`id`, `created_at`, `updated_at`, `files`, `khoa_name`, `title`, `survey_name`, `khoa_id`) VALUES
(1, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '3.DH QTKD TONG HOP.pdf', 'Quản Trị Kinh Doanh.', 'khoa_kt_luat', NULL, 0),
(2, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '13.DH TC-NH.pdf', 'Tài Chính-Ngân Hàng', 'khoa_kt_luat', NULL, 0),
(3, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '1.DH KE TOAN TONG HOP.pdf', 'Kế Toán', 'khoa_kt_luat', NULL, 0),
(4, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '9.DH Toan Kinh te.pdf', 'Toán Ứng Dụng', 'khoa_kt_luat', NULL, 0),
(5, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '16.DH CNTT.pdf', 'CN Thông Tin', 'khoa_ktcn', NULL, 0),
(6, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '17.DH HTTT.pdf', 'Hệ Thống Thông Tin', 'khoa_ktcn', NULL, 0),
(7, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '12.DH XDDD-CN.pdf', 'CNKT xây Dựng', 'khoa_ktcn', NULL, 0),
(8, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '5.DH CO KHI CHE TAO.pdf', 'CNKT Cơ Khí', 'khoa_ktcn', NULL, 0),
(9, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '15.DH CO DIEN TU.pdf', 'CNKT Cơ Điện Tử', 'khoa_ktcn', NULL, 0),
(10, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '8.DH TDH CONG NGHIEP.pdf', 'CNKT ĐK & TĐ Hóa', 'khoa_ktcn', NULL, 0),
(11, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '21.DH CNTP.pdf', 'CN Thực Phẩm', 'khoa_nn_cntp', NULL, 0),
(12, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '20.DH CNSH.pdf', 'CN Sinh Học', 'khoa_nn_cntp', NULL, 0),
(13, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '19.DH KHCT.pdf', 'KH Cây Trồng', 'khoa_nn_cntp', NULL, 0),
(14, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '18.DH NTTS.pdf', 'Nuôi Trồng Thủy Sản', 'khoa_nn_cntp', NULL, 0),
(15, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '22.CD MAMNON.pdf', 'GD Mầm Non', 'khoa_sp_khcb', NULL, 0),
(16, '2021-05-24 11:08:38', '2021-05-24 11:08:38', '14.DH VANHOC.pdf', 'Văn học', 'khoa_sp_khcb', NULL, 0),
(17, '2021-05-24 11:08:38', '2021-05-24 11:08:38', 'DH- GDTH.15 - HC.pdf', 'GD Tiểu Học', 'khoa_sp_khcb', NULL, 0),
(18, '2021-05-24 11:08:38', '2021-05-24 11:08:38', 'CTDT- DHSP TOAN HOC K21.pdf', 'SP Toán ', 'khoa_sp_khcb', NULL, 0),
(19, '2021-05-24 11:08:38', '2021-05-24 11:08:38', 'CTDT-DHSP NGU VAN K.21.pdf', 'SP Ngữ Văn', 'khoa_sp_khcb', NULL, 0),
(20, '2021-05-24 11:08:38', '2021-05-24 11:08:38', 'CTDT-DH LUAT K.21.pdf', 'Luật', 'khoa_kt_luat', NULL, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `doi_tuong` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ho_ten` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `username` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKr43af9ap4edm43mmtq01oddj6` (`username`),
  UNIQUE KEY `UK6dotkott2kjsp8vw4d0m25fb7` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `doi_tuong`, `email`, `ho_ten`, `password`, `username`) VALUES
(1, 'ADMIN', 'tranhuunghiem48@gmail.com', 'Trần Hữu Nghiêm', '$2a$10$z9tQ0z0dd3m4mncer3R4WOQIapR4BUVKQ8GyPWk4UpMhowNsXWRsC', 'admin'),
(2, 'MODE', 'dat@gmail.com', 'Dat', '$2a$10$gHhrC1nhdwDQTJTA9cCBUO.2M/6Tr.KJCBOvyTuuupgaApWhDiANq', 'dat'),
(3, 'MODE', 'trangiahien205@gmail.com', 'Trần Gia Hiển ', '$2a$10$PwfGcx8d3XmCKt2LRcK47.O.qNbXEhIVYxjAk/tYxZoLiy5LR55e6', 'hien');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
CREATE TABLE IF NOT EXISTS `user_roles` (
  `user_id` bigint NOT NULL,
  `role_id` int NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKh8ciramu9cc9q3qcqiv4ue8a6` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `user_roles`
--

INSERT INTO `user_roles` (`user_id`, `role_id`) VALUES
(2, 4),
(1, 5),
(3, 12);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `khao_sat`
--
ALTER TABLE `khao_sat`
  ADD CONSTRAINT `FKk0m157ps7otaxr76wgoja1gr3` FOREIGN KEY (`khoa_id`) REFERENCES `khoasv` (`khoa_id`) ON DELETE CASCADE;

--
-- Các ràng buộc cho bảng `phieu_khao_sat`
--
ALTER TABLE `phieu_khao_sat`
  ADD CONSTRAINT `FKberep9unwuvj53irpqtym7u53` FOREIGN KEY (`khoa_id`) REFERENCES `khoasv` (`khoa_id`) ON DELETE CASCADE;

--
-- Các ràng buộc cho bảng `user_roles`
--
ALTER TABLE `user_roles`
  ADD CONSTRAINT `FKh8ciramu9cc9q3qcqiv4ue8a6` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
  ADD CONSTRAINT `FKhfh9dx7w3ubf1co1vdev94g3f` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
