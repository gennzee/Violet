/*
 Navicat Premium Data Transfer

 Source Server         : Local instance MySQL80
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : tranhtheuvietnam2

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 24/06/2020 16:32:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for aboutus
-- ----------------------------
DROP TABLE IF EXISTS `aboutus`;
CREATE TABLE `aboutus`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of aboutus
-- ----------------------------
INSERT INTO `aboutus` VALUES (18, '<section class=\"bg0 p-t-75 p-b-120\">\r\n<div class=\"container\">\r\n<div class=\"row p-b-148\">\r\n<div class=\"col-md-7 col-lg-8\">\r\n<div class=\"p-t-7 p-r-85 p-r-15-lg p-r-0-md\">\r\n<h3 class=\"mtext-111 cl2 p-b-16\">Our Story</h3>\r\n\r\n<p class=\"stext-113 cl6 p-b-26\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris consequat consequat enim, non auctor massa ultrices non. Morbi sed odio massa. Quisque at vehicula tellus, sed tincidunt augue. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Maecenas varius egestas diam, eu sodales metus scelerisque congue. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Maecenas gravida justo eu arcu egestas convallis. Nullam eu erat bibendum, tempus ipsum eget, dictum enim. Donec non neque ut enim dapibus tincidunt vitae nec augue. Suspendisse potenti. Proin ut est diam. Donec condimentum euismod tortor, eget facilisis diam faucibus et. Morbi a tempor elit.</p>\r\n\r\n<p class=\"stext-113 cl6 p-b-26\">Donec gravida lorem elit, quis condimentum ex semper sit amet. Fusce eget ligula magna. Aliquam aliquam imperdiet sodales. Ut fringilla turpis in vehicula vehicula. Pellentesque congue ac orci ut gravida. Aliquam erat volutpat. Donec iaculis lectus a arcu facilisis, eu sodales lectus sagittis. Etiam pellentesque, magna vel dictum rutrum, neque justo eleifend elit, vel tincidunt erat arcu ut sem. Sed rutrum, turpis ut commodo efficitur, quam velit convallis ipsum, et maximus enim ligula ac ligula.</p>\r\n\r\n<p class=\"stext-113 cl6 p-b-26\">Any questions? Let us know in store at 8th floor, 379 Hudson St, New York, NY 10018 or call us on (+1) 96 716 6879</p>\r\n</div>\r\n</div>\r\n\r\n<div class=\"col-11 col-md-5 col-lg-4 m-lr-auto\">\r\n<div class=\"how-bor1 \">\r\n<div class=\"hov-img0\"><img alt=\"IMG\" src=\"/coza/images/about-01.jpg\" /></div>\r\n</div>\r\n</div>\r\n</div>\r\n\r\n<div class=\"row\">\r\n<div class=\"order-md-2 col-md-7 col-lg-8 p-b-30\">\r\n<div class=\"p-t-7 p-l-85 p-l-15-lg p-l-0-md\">\r\n<h3 class=\"mtext-111 cl2 p-b-16\">Our Mission</h3>\r\n\r\n<p class=\"stext-113 cl6 p-b-26\">Mauris non lacinia magna. Sed nec lobortis dolor. Vestibulum rhoncus dignissim risus, sed consectetur erat. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nullam maximus mauris sit amet odio convallis, in pharetra magna gravida. Praesent sed nunc fermentum mi molestie tempor. Morbi vitae viverra odio. Pellentesque ac velit egestas, luctus arcu non, laoreet mauris. Sed in ipsum tempor, consequat odio in, porttitor ante. Ut mauris ligula, volutpat in sodales in, porta non odio. Pellentesque tempor urna vitae mi vestibulum, nec venenatis nulla lobortis. Proin at gravida ante. Mauris auctor purus at lacus maximus euismod. Pellentesque vulputate massa ut nisl hendrerit, eget elementum libero iaculis.</p>\r\n\r\n<div class=\"bor16 p-l-29 p-b-9 m-t-22\">\r\n<p class=\"stext-114 cl6 p-r-40 p-b-11\">Creativity is just connecting things. When you ask creative people how they did something, they feel a little guilty because they didn&#39;t really do it, they just saw something. It seemed obvious to them after a while.</p>\r\n<span class=\"stext-111 cl8\">- Steve Job&rsquo;s </span></div>\r\n</div>\r\n</div>\r\n\r\n<div class=\"order-md-1 col-11 col-md-5 col-lg-4 m-lr-auto p-b-30\">\r\n<div class=\"how-bor2\">\r\n<div class=\"hov-img0\"><img alt=\"IMG\" src=\"/coza/images/about-02.jpg\" /></div>\r\n</div>\r\n</div>\r\n</div>\r\n</div>\r\n</section>\r\n');
INSERT INTO `aboutus` VALUES (19, '<section class=\"bg0 p-t-75 p-b-120\">\r\n<div class=\"container\">\r\n<div class=\"row p-b-148\">\r\n<div class=\"col-md-7 col-lg-8\">\r\n<div class=\"p-t-7 p-r-85 p-r-15-lg p-r-0-md\">\r\n<h3 class=\"mtext-111 cl2 p-b-16\">Our Story</h3>\r\n\r\n<p>Chiếc &aacute;o d&agrave;i l&agrave; biểu tượng tuyệt đẹp của nền văn ho&aacute; d&acirc;n tộc, l&agrave; niềm tự h&agrave;o của con người Việt Nam ch&uacute;ng ta.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i ra đời từ rất l&acirc;u, n&oacute; đ&atilde; trải qua c&aacute;c thời k&igrave; cải biến để đạt đến độ thẩm mĩ như ng&agrave;y nay. Kiểu sơ khai l&agrave; &aacute;o giao l&agrave;nh, được người phụ nữ mặc phủ ngo&agrave;i yếm đ&agrave;o, v&aacute;y lụa đen, thắt lưng bu&ocirc;ng thả. Nhưng để tiện cho việc l&agrave;m ăn, việc đồng &aacute;ng, &aacute;o giao l&agrave;nh được thu gọn th&agrave;nh &aacute;o tứ th&acirc;n. Sau đ&oacute;, n&oacute; được biến th&agrave;nh &aacute;o ngũ th&acirc;n để c&aacute;c c&ocirc;, c&aacute;c b&agrave; mặc trong lễ hội m&ugrave;a xu&acirc;n.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;Đến thời ch&uacute;a Nguyễn xứ Đ&agrave;ng Trong, Vũ Vương Nguyền Ph&uacute;c Kho&aacute;t ban h&agrave;nh sắc dụ về y phục, th&igrave; chiếc &aacute;o d&agrave;i c&oacute; cổ đứng ngắn tay, cứa ống tay rộng hoặc hẹp, hai b&ecirc;n n&aacute;ch trở xuống kh&acirc;u k&iacute;n, kh&ocirc;ng xẻ t&agrave;. Từ đ&oacute;, &aacute;o d&agrave;i được cải tiến theo nhiều kiểu, ng&agrave;y một trở n&ecirc;n xinh đẹp, thướt tha.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i được may bằng nhiều chất liệu như gấm, nhung, lụa tơ tằm. Hiện nay, c&aacute;c nh&agrave; thiết kế y phục đ&atilde; s&aacute;ng tạo ra nhiều kiểu &aacute;o d&agrave;i t&acirc;n thời, cố &aacute;o c&agrave;i khuy. Khuy &aacute;o l&agrave; hạt cườm, hạt ngọc, c&uacute;c bấm. Tay &aacute;o d&agrave;i kh&ocirc;ng c&oacute; cầu vai, may liền với cổ &aacute;o giống như &aacute;o b&agrave; ba xẻ t&agrave;. Ch&iacute;nh đặc điểm n&agrave;y khiến việc sinh hoạt của ngực phụ nữ được dễ d&agrave;ng, đồng thời tạo d&aacute;ng thanh tho&aacute;t, yểu điệu, thướt tha.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i c&oacute; hai t&agrave; ch&iacute;nh: t&agrave; &aacute;o trước v&agrave; t&agrave; &aacute;o sau. Đ&acirc;y l&agrave; phần được c&aacute;c nh&agrave; thiết kế thời trang c&aacute;ch điệu nhiều nhất. Khi th&igrave; d&ugrave;ng chất liệu vải voan, khi th&igrave; được kết cườm, ngọc &oacute;ng &aacute;nh. &Aacute;o d&agrave;i thường đi đ&ocirc;i với quần thụng. Phụ nữ Việt Nam thường mặc &aacute;o d&agrave;i xẻ t&agrave; c&ugrave;ng với quần thụng trắng bởi n&oacute; tạo n&ecirc;n vẻ đ&agrave;i c&aacute;c trang nh&atilde;. Hiện nay, &aacute;o d&agrave;i c&oacute; nhiều hoa văn kh&aacute;c nhau, mang đậm bản sắc d&acirc;n tộc C&oacute; thể l&agrave; những đo&aacute; hoa như hoa hồng, hoa lan, b&uacute;p huệ. C&oacute; thể l&agrave; hoa thuỷ ti&ecirc;n. Cũng c&oacute; thể l&agrave; nhiều loại hoa rực rỡ, đủ m&agrave;u sắc gợi l&ecirc;n d&aacute;ng y&ecirc;u kiều, đ&agrave;i c&aacute;c, qu&yacute; ph&aacute;i của c&aacute;c c&ocirc; thiếu nữ, thanh nữ.</p>\r\n</div>\r\n</div>\r\n\r\n<div class=\"col-11 col-md-5 col-lg-4 m-lr-auto\">\r\n<div class=\"how-bor1 \">\r\n<div class=\"hov-img0\"><img alt=\"IMG\" src=\"/images/XswhGYbeJ6iDFrBzOJ7CBWdYrBKIAb4q7bgE41JlvslzL.jpg\" style=\"width: 370px; height: 658px;\" /></div>\r\n</div>\r\n</div>\r\n</div>\r\n\r\n<div class=\"row\">\r\n<div class=\"order-md-2 col-md-7 col-lg-8 p-b-30\">\r\n<div class=\"p-t-7 p-l-85 p-l-15-lg p-l-0-md\">\r\n<h3 class=\"mtext-111 cl2 p-b-16\">Our Mission</h3>\r\n\r\n<p>Gi&ecirc;ng hai, bước v&agrave;o hội xu&acirc;n, tr&ecirc;n mọi nẻo đường qu&ecirc; Kinh Bắc, xứ Đ&ocirc;ng xứ Đo&agrave;i... ta bắt gặp c&aacute;c b&agrave;, c&aacute;c cụ trong bộ &aacute;o quần d&agrave;i bằng lụa n&acirc;u, vai khoa; t&uacute;i đi đến ch&ugrave;a lễ Phật. Hội ch&ugrave;a Hương, hội Gi&oacute;ng, hội ch&ugrave;a D&acirc;u, hội Lim,... từng đo&agrave;n thiếu nữ, thanh nữ thướt tha trong bộ &aacute;o d&agrave;i tuyệt đẹp. Trong c&aacute;c lề ch&agrave;o cờ, c&aacute;c ng&agrave;y lễ được tổ chức ở s&acirc;n trường, nhất l&agrave; c&aacute;c trường Trung học phổ th&ocirc;ng h&agrave;ng ngh&igrave;n nữ sinh v&agrave; c&ocirc; gi&aacute;o trong chiếc &aacute;o d&agrave;i trắng, quần trắng gợi l&ecirc;n vẻ đẹp tinh kh&ocirc;i, trinh trắng của thế hệ tuổi xu&acirc;n.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;Chiếc &aacute;o d&agrave;i m&atilde;i m&atilde;i l&agrave; niềm tự h&agrave;o v&agrave; h&atilde;nh diện của mỗi con người Việt Nam ch&uacute;ng ta. Vẻ đẹp chiếc &aacute;o d&agrave;i gợi l&ecirc;n vẻ đẹp văn ho&aacute; truyền thống của đất nước v&agrave; con người Việt Nam. Tr&ecirc;n con đường hội nhập, c&oacute; thể y phục của mỗi con người Việt Nam trở n&ecirc;n phong ph&uacute;, đa dạng, hiện đại, nhưng chiếc &aacute;o d&agrave;i t&acirc;n thời sẽ m&atilde;i m&atilde;i gắn b&oacute; với t&acirc;m hồn người phụ nữ Việt Nam, l&agrave;m t&ocirc;n vẻ đẹp ki&ecirc;u sa, duy&ecirc;n d&aacute;ng của c&aacute;c thiếu nữ, thanh nữ trong lễ hội.</p>\r\n\r\n<div class=\"bor16 p-l-29 p-b-9 m-t-22\">\r\n<p class=\"stext-114 cl6 p-r-40 p-b-11\">Creativity is just connecting things. When you ask creative people how they did something, they feel a little guilty because they didn&#39;t really do it, they just saw something. It seemed obvious to them after a while.</p>\r\n<span class=\"stext-111 cl8\">- Steve Job&rsquo;s </span></div>\r\n</div>\r\n</div>\r\n\r\n<div class=\"order-md-1 col-11 col-md-5 col-lg-4 m-lr-auto p-b-30\">\r\n<div class=\"how-bor2\">\r\n<div class=\"hov-img0\"><img alt=\"IMG\" src=\"/images/6qnc3l0LtnAocq3UStivLLmaItaIbSm0PgF0bvOfue3Yf.jpg\" style=\"width: 370px; height: 555px;\" /></div>\r\n</div>\r\n</div>\r\n</div>\r\n</div>\r\n</section>\r\n');
INSERT INTO `aboutus` VALUES (20, '<section class=\"bg0 p-t-75 p-b-120\">\r\n<div class=\"container\">\r\n<div class=\"row p-b-148\">\r\n<div class=\"col-md-7 col-lg-8\">\r\n<div class=\"p-t-7 p-r-85 p-r-15-lg p-r-0-md\">\r\n<h3 class=\"mtext-111 cl2 p-b-16\">Về &Aacute;o D&agrave;i Việt Nam</h3>\r\n\r\n<p>Chiếc &aacute;o d&agrave;i l&agrave; biểu tượng tuyệt đẹp của nền văn ho&aacute; d&acirc;n tộc, l&agrave; niềm tự h&agrave;o của con người Việt Nam ch&uacute;ng ta.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i ra đời từ rất l&acirc;u, n&oacute; đ&atilde; trải qua c&aacute;c thời k&igrave; cải biến để đạt đến độ thẩm mĩ như ng&agrave;y nay. Kiểu sơ khai l&agrave; &aacute;o giao l&agrave;nh, được người phụ nữ mặc phủ ngo&agrave;i yếm đ&agrave;o, v&aacute;y lụa đen, thắt lưng bu&ocirc;ng thả. Nhưng để tiện cho việc l&agrave;m ăn, việc đồng &aacute;ng, &aacute;o giao l&agrave;nh được thu gọn th&agrave;nh &aacute;o tứ th&acirc;n. Sau đ&oacute;, n&oacute; được biến th&agrave;nh &aacute;o ngũ th&acirc;n để c&aacute;c c&ocirc;, c&aacute;c b&agrave; mặc trong lễ hội m&ugrave;a xu&acirc;n.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;Đến thời ch&uacute;a Nguyễn xứ Đ&agrave;ng Trong, Vũ Vương Nguyền Ph&uacute;c Kho&aacute;t ban h&agrave;nh sắc dụ về y phục, th&igrave; chiếc &aacute;o d&agrave;i c&oacute; cổ đứng ngắn tay, cứa ống tay rộng hoặc hẹp, hai b&ecirc;n n&aacute;ch trở xuống kh&acirc;u k&iacute;n, kh&ocirc;ng xẻ t&agrave;. Từ đ&oacute;, &aacute;o d&agrave;i được cải tiến theo nhiều kiểu, ng&agrave;y một trở n&ecirc;n xinh đẹp, thướt tha.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i được may bằng nhiều chất liệu như gấm, nhung, lụa tơ tằm. Hiện nay, c&aacute;c nh&agrave; thiết kế y phục đ&atilde; s&aacute;ng tạo ra nhiều kiểu &aacute;o d&agrave;i t&acirc;n thời, cố &aacute;o c&agrave;i khuy. Khuy &aacute;o l&agrave; hạt cườm, hạt ngọc, c&uacute;c bấm. Tay &aacute;o d&agrave;i kh&ocirc;ng c&oacute; cầu vai, may liền với cổ &aacute;o giống như &aacute;o b&agrave; ba xẻ t&agrave;. Ch&iacute;nh đặc điểm n&agrave;y khiến việc sinh hoạt của ngực phụ nữ được dễ d&agrave;ng, đồng thời tạo d&aacute;ng thanh tho&aacute;t, yểu điệu, thướt tha.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i c&oacute; hai t&agrave; ch&iacute;nh: t&agrave; &aacute;o trước v&agrave; t&agrave; &aacute;o sau. Đ&acirc;y l&agrave; phần được c&aacute;c nh&agrave; thiết kế thời trang c&aacute;ch điệu nhiều nhất. Khi th&igrave; d&ugrave;ng chất liệu vải voan, khi th&igrave; được kết cườm, ngọc &oacute;ng &aacute;nh. &Aacute;o d&agrave;i thường đi đ&ocirc;i với quần thụng. Phụ nữ Việt Nam thường mặc &aacute;o d&agrave;i xẻ t&agrave; c&ugrave;ng với quần thụng trắng bởi n&oacute; tạo n&ecirc;n vẻ đ&agrave;i c&aacute;c trang nh&atilde;. Hiện nay, &aacute;o d&agrave;i c&oacute; nhiều hoa văn kh&aacute;c nhau, mang đậm bản sắc d&acirc;n tộc C&oacute; thể l&agrave; những đo&aacute; hoa như hoa hồng, hoa lan, b&uacute;p huệ. C&oacute; thể l&agrave; hoa thuỷ ti&ecirc;n. Cũng c&oacute; thể l&agrave; nhiều loại hoa rực rỡ, đủ m&agrave;u sắc gợi l&ecirc;n d&aacute;ng y&ecirc;u kiều, đ&agrave;i c&aacute;c, qu&yacute; ph&aacute;i của c&aacute;c c&ocirc; thiếu nữ, thanh nữ.</p>\r\n</div>\r\n</div>\r\n\r\n<div class=\"col-11 col-md-5 col-lg-4 m-lr-auto\">\r\n<div class=\"how-bor1 \">\r\n<div class=\"hov-img0\"><img alt=\"IMG\" src=\"/images/XswhGYbeJ6iDFrBzOJ7CBWdYrBKIAb4q7bgE41JlvslzL.jpg\" style=\"width: 370px; height: 658px;\" /></div>\r\n</div>\r\n</div>\r\n</div>\r\n\r\n<div class=\"row\">\r\n<div class=\"order-md-2 col-md-7 col-lg-8 p-b-30\">\r\n<div class=\"p-t-7 p-l-85 p-l-15-lg p-l-0-md\">\r\n<h3 class=\"mtext-111 cl2 p-b-16\">Niềm tự h&agrave;o của &aacute;o d&agrave;i Việt Nam</h3>\r\n\r\n<p>Gi&ecirc;ng hai, bước v&agrave;o hội xu&acirc;n, tr&ecirc;n mọi nẻo đường qu&ecirc; Kinh Bắc, xứ Đ&ocirc;ng xứ Đo&agrave;i... ta bắt gặp c&aacute;c b&agrave;, c&aacute;c cụ trong bộ &aacute;o quần d&agrave;i bằng lụa n&acirc;u, vai khoa; t&uacute;i đi đến ch&ugrave;a lễ Phật. Hội ch&ugrave;a Hương, hội Gi&oacute;ng, hội ch&ugrave;a D&acirc;u, hội Lim,... từng đo&agrave;n thiếu nữ, thanh nữ thướt tha trong bộ &aacute;o d&agrave;i tuyệt đẹp. Trong c&aacute;c lề ch&agrave;o cờ, c&aacute;c ng&agrave;y lễ được tổ chức ở s&acirc;n trường, nhất l&agrave; c&aacute;c trường Trung học phổ th&ocirc;ng h&agrave;ng ngh&igrave;n nữ sinh v&agrave; c&ocirc; gi&aacute;o trong chiếc &aacute;o d&agrave;i trắng, quần trắng gợi l&ecirc;n vẻ đẹp tinh kh&ocirc;i, trinh trắng của thế hệ tuổi xu&acirc;n.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;Chiếc &aacute;o d&agrave;i m&atilde;i m&atilde;i l&agrave; niềm tự h&agrave;o v&agrave; h&atilde;nh diện của mỗi con người Việt Nam ch&uacute;ng ta. Vẻ đẹp chiếc &aacute;o d&agrave;i gợi l&ecirc;n vẻ đẹp văn ho&aacute; truyền thống của đất nước v&agrave; con người Việt Nam. Tr&ecirc;n con đường hội nhập, c&oacute; thể y phục của mỗi con người Việt Nam trở n&ecirc;n phong ph&uacute;, đa dạng, hiện đại, nhưng chiếc &aacute;o d&agrave;i t&acirc;n thời sẽ m&atilde;i m&atilde;i gắn b&oacute; với t&acirc;m hồn người phụ nữ Việt Nam, l&agrave;m t&ocirc;n vẻ đẹp ki&ecirc;u sa, duy&ecirc;n d&aacute;ng của c&aacute;c thiếu nữ, thanh nữ trong lễ hội.</p>\r\n\r\n<div class=\"bor16 p-l-29 p-b-9 m-t-22\">\r\n<p class=\"stext-114 cl6 p-r-40 p-b-11\">Creativity is just connecting things. When you ask creative people how they did something, they feel a little guilty because they didn&#39;t really do it, they just saw something. It seemed obvious to them after a while.</p>\r\n<span class=\"stext-111 cl8\">- Steve Job&rsquo;s </span></div>\r\n</div>\r\n</div>\r\n\r\n<div class=\"order-md-1 col-11 col-md-5 col-lg-4 m-lr-auto p-b-30\">\r\n<div class=\"how-bor2\">\r\n<div class=\"hov-img0\"><img alt=\"IMG\" src=\"/images/6qnc3l0LtnAocq3UStivLLmaItaIbSm0PgF0bvOfue3Yf.jpg\" style=\"width: 370px; height: 555px;\" /></div>\r\n</div>\r\n</div>\r\n</div>\r\n</div>\r\n</section>\r\n');
INSERT INTO `aboutus` VALUES (21, '<section class=\"bg0 p-t-75 p-b-120\">\r\n<div class=\"container\">\r\n<div class=\"row p-b-148\">\r\n<div class=\"col-md-7 col-lg-8\">\r\n<div class=\"p-t-7 p-r-85 p-r-15-lg p-r-0-md\">\r\n<h3 class=\"mtext-111 cl2 p-b-16\">Về &Aacute;o D&agrave;i Việt Nam</h3>\r\n\r\n<p>Chiếc &aacute;o d&agrave;i l&agrave; biểu tượng tuyệt đẹp của nền văn ho&aacute; d&acirc;n tộc, l&agrave; niềm tự h&agrave;o của con người Việt Nam ch&uacute;ng ta.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i ra đời từ rất l&acirc;u, n&oacute; đ&atilde; trải qua c&aacute;c thời k&igrave; cải biến để đạt đến độ thẩm mĩ như ng&agrave;y nay. Kiểu sơ khai l&agrave; &aacute;o giao l&agrave;nh, được người phụ nữ mặc phủ ngo&agrave;i yếm đ&agrave;o, v&aacute;y lụa đen, thắt lưng bu&ocirc;ng thả. Nhưng để tiện cho việc l&agrave;m ăn, việc đồng &aacute;ng, &aacute;o giao l&agrave;nh được thu gọn th&agrave;nh &aacute;o tứ th&acirc;n. Sau đ&oacute;, n&oacute; được biến th&agrave;nh &aacute;o ngũ th&acirc;n để c&aacute;c c&ocirc;, c&aacute;c b&agrave; mặc trong lễ hội m&ugrave;a xu&acirc;n.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;Đến thời ch&uacute;a Nguyễn xứ Đ&agrave;ng Trong, Vũ Vương Nguyền Ph&uacute;c Kho&aacute;t ban h&agrave;nh sắc dụ về y phục, th&igrave; chiếc &aacute;o d&agrave;i c&oacute; cổ đứng ngắn tay, cứa ống tay rộng hoặc hẹp, hai b&ecirc;n n&aacute;ch trở xuống kh&acirc;u k&iacute;n, kh&ocirc;ng xẻ t&agrave;. Từ đ&oacute;, &aacute;o d&agrave;i được cải tiến theo nhiều kiểu, ng&agrave;y một trở n&ecirc;n xinh đẹp, thướt tha.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i được may bằng nhiều chất liệu như gấm, nhung, lụa tơ tằm. Hiện nay, c&aacute;c nh&agrave; thiết kế y phục đ&atilde; s&aacute;ng tạo ra nhiều kiểu &aacute;o d&agrave;i t&acirc;n thời, cố &aacute;o c&agrave;i khuy. Khuy &aacute;o l&agrave; hạt cườm, hạt ngọc, c&uacute;c bấm. Tay &aacute;o d&agrave;i kh&ocirc;ng c&oacute; cầu vai, may liền với cổ &aacute;o giống như &aacute;o b&agrave; ba xẻ t&agrave;. Ch&iacute;nh đặc điểm n&agrave;y khiến việc sinh hoạt của ngực phụ nữ được dễ d&agrave;ng, đồng thời tạo d&aacute;ng thanh tho&aacute;t, yểu điệu, thướt tha.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i c&oacute; hai t&agrave; ch&iacute;nh: t&agrave; &aacute;o trước v&agrave; t&agrave; &aacute;o sau. Đ&acirc;y l&agrave; phần được c&aacute;c nh&agrave; thiết kế thời trang c&aacute;ch điệu nhiều nhất. Khi th&igrave; d&ugrave;ng chất liệu vải voan, khi th&igrave; được kết cườm, ngọc &oacute;ng &aacute;nh. &Aacute;o d&agrave;i thường đi đ&ocirc;i với quần thụng. Phụ nữ Việt Nam thường mặc &aacute;o d&agrave;i xẻ t&agrave; c&ugrave;ng với quần thụng trắng bởi n&oacute; tạo n&ecirc;n vẻ đ&agrave;i c&aacute;c trang nh&atilde;. Hiện nay, &aacute;o d&agrave;i c&oacute; nhiều hoa văn kh&aacute;c nhau, mang đậm bản sắc d&acirc;n tộc C&oacute; thể l&agrave; những đo&aacute; hoa như hoa hồng, hoa lan, b&uacute;p huệ. C&oacute; thể l&agrave; hoa thuỷ ti&ecirc;n. Cũng c&oacute; thể l&agrave; nhiều loại hoa rực rỡ, đủ m&agrave;u sắc gợi l&ecirc;n d&aacute;ng y&ecirc;u kiều, đ&agrave;i c&aacute;c, qu&yacute; ph&aacute;i của c&aacute;c c&ocirc; thiếu nữ, thanh nữ.</p>\r\n</div>\r\n</div>\r\n\r\n<div class=\"col-11 col-md-5 col-lg-4 m-lr-auto\">\r\n<div class=\"how-bor1 \">\r\n<div class=\"hov-img0\"><img alt=\"Lịch sử áo dài Việt Nam | Vải áo dài D&amp;D\" src=\"https://toiyeu.com.vn/vaidep/wp-content/uploads/2019/05/%C3%A1o-d%C3%A0i-hi%E1%BB%87n-%C4%91%E1%BA%A1i.jpg\" /></div>\r\n</div>\r\n</div>\r\n</div>\r\n\r\n<div class=\"row\">\r\n<div class=\"order-md-2 col-md-7 col-lg-8 p-b-30\">\r\n<div class=\"p-t-7 p-l-85 p-l-15-lg p-l-0-md\">\r\n<h3 class=\"mtext-111 cl2 p-b-16\">Niềm tự h&agrave;o của &aacute;o d&agrave;i Việt Nam</h3>\r\n\r\n<p>Gi&ecirc;ng hai, bước v&agrave;o hội xu&acirc;n, tr&ecirc;n mọi nẻo đường qu&ecirc; Kinh Bắc, xứ Đ&ocirc;ng xứ Đo&agrave;i... ta bắt gặp c&aacute;c b&agrave;, c&aacute;c cụ trong bộ &aacute;o quần d&agrave;i bằng lụa n&acirc;u, vai khoa; t&uacute;i đi đến ch&ugrave;a lễ Phật. Hội ch&ugrave;a Hương, hội Gi&oacute;ng, hội ch&ugrave;a D&acirc;u, hội Lim,... từng đo&agrave;n thiếu nữ, thanh nữ thướt tha trong bộ &aacute;o d&agrave;i tuyệt đẹp. Trong c&aacute;c lề ch&agrave;o cờ, c&aacute;c ng&agrave;y lễ được tổ chức ở s&acirc;n trường, nhất l&agrave; c&aacute;c trường Trung học phổ th&ocirc;ng h&agrave;ng ngh&igrave;n nữ sinh v&agrave; c&ocirc; gi&aacute;o trong chiếc &aacute;o d&agrave;i trắng, quần trắng gợi l&ecirc;n vẻ đẹp tinh kh&ocirc;i, trinh trắng của thế hệ tuổi xu&acirc;n.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;Chiếc &aacute;o d&agrave;i m&atilde;i m&atilde;i l&agrave; niềm tự h&agrave;o v&agrave; h&atilde;nh diện của mỗi con người Việt Nam ch&uacute;ng ta. Vẻ đẹp chiếc &aacute;o d&agrave;i gợi l&ecirc;n vẻ đẹp văn ho&aacute; truyền thống của đất nước v&agrave; con người Việt Nam. Tr&ecirc;n con đường hội nhập, c&oacute; thể y phục của mỗi con người Việt Nam trở n&ecirc;n phong ph&uacute;, đa dạng, hiện đại, nhưng chiếc &aacute;o d&agrave;i t&acirc;n thời sẽ m&atilde;i m&atilde;i gắn b&oacute; với t&acirc;m hồn người phụ nữ Việt Nam, l&agrave;m t&ocirc;n vẻ đẹp ki&ecirc;u sa, duy&ecirc;n d&aacute;ng của c&aacute;c thiếu nữ, thanh nữ trong lễ hội.</p>\r\n\r\n<div class=\"bor16 p-l-29 p-b-9 m-t-22\">\r\n<p class=\"stext-114 cl6 p-r-40 p-b-11\">Creativity is just connecting things. When you ask creative people how they did something, they feel a little guilty because they didn&#39;t really do it, they just saw something. It seemed obvious to them after a while.</p>\r\n<span class=\"stext-111 cl8\">- Steve Job&rsquo;s </span></div>\r\n</div>\r\n</div>\r\n\r\n<div class=\"order-md-1 col-11 col-md-5 col-lg-4 m-lr-auto p-b-30\">\r\n<div class=\"how-bor2\">\r\n<div class=\"hov-img0\"><img alt=\"IMG\" src=\"/images/6qnc3l0LtnAocq3UStivLLmaItaIbSm0PgF0bvOfue3Yf.jpg\" style=\"width: 370px; height: 555px;\" /></div>\r\n</div>\r\n</div>\r\n</div>\r\n</div>\r\n</section>\r\n');

-- ----------------------------
-- Table structure for categories
-- ----------------------------
DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `removed_flag` bit(1) NULL DEFAULT NULL,
  `created_date` datetime(0) NULL DEFAULT NULL,
  `updated_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of categories
-- ----------------------------
INSERT INTO `categories` VALUES (1, 'Áo dài', b'0', NULL, NULL);
INSERT INTO `categories` VALUES (2, 'Tranh thêu', b'0', NULL, NULL);

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `new_id` int(11) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mobile_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `comment` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `created_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 55 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comments
-- ----------------------------
INSERT INTO `comments` VALUES (49, 48, 'xuân anh', 'tanks.museum98@gmail.com', '0706076517', 'test', '2020-06-24 00:00:00');
INSERT INTO `comments` VALUES (50, 48, 'xuân anh 2', 'tanks.museum98@gmail.com', '07 06 076 517', 'test phát nữa', '2020-06-24 00:00:00');
INSERT INTO `comments` VALUES (51, 48, 'xuân anh', 'tanks.museum98@gmail.com', '0706076517', 'test lấy cái date', '2020-06-24 00:00:00');
INSERT INTO `comments` VALUES (54, 52, 'xuân anh', 'test@gmail.com', '0706076517', 'test bình luận', '2020-06-24 00:00:00');

-- ----------------------------
-- Table structure for contact
-- ----------------------------
DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mobile_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `google_map` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of contact
-- ----------------------------
INSERT INTO `contact` VALUES (1, '342/9B Thoại Ngọc Hầu', '0706076517', 'tanks.museum98@gmail.com', 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1878.2274028447575!2d105.861337459616!3d20.825923456734177!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135b3f738a5bdfb%3A0x5787ab5b17f91b5b!2zxJDDrG5oIEPhu5UgQ2jhuqV0LCBExaluZyBUaeG6v24sIFRoxrDhu51uZyBUw61uLCBIw6AgTuG7mWksIFZp4buHdCBOYW0!5e1!3m2!1svi!2s!4v1589917084738!5m2!1svi!2s');
INSERT INTO `contact` VALUES (5, '342/111B Thoại Ngọc Hầu, Tân Phú, TP. Hồ Chí Minh', '07 06 076 517', 'tanks.museum98@gmail.com', 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1878.2274028447575!2d105.861337459616!3d20.825923456734177!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135b3f738a5bdfb%3A0x5787ab5b17f91b5b!2zxJDDrG5oIEPhu5UgQ2jhuqV0LCBExaluZyBUaeG6v24sIFRoxrDhu51uZyBUw61uLCBIw6AgTuG7mWksIFZp4buHdCBOYW0!5e1!3m2!1svi!2s!4v1589917084738!5m2!1svi!2s');

-- ----------------------------
-- Table structure for favorite
-- ----------------------------
DROP TABLE IF EXISTS `favorite`;
CREATE TABLE `favorite`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NULL DEFAULT NULL,
  `product_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKrd09pqm0vasylahjcnagd0c7o`(`product_id`) USING BTREE,
  INDEX `FKa2lwa7bjrnbti5v12mga2et1y`(`user_id`) USING BTREE,
  CONSTRAINT `FKa2lwa7bjrnbti5v12mga2et1y` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKrd09pqm0vasylahjcnagd0c7o` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 55 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of favorite
-- ----------------------------
INSERT INTO `favorite` VALUES (50, 2, 3);
INSERT INTO `favorite` VALUES (51, 2, 3);
INSERT INTO `favorite` VALUES (52, 1, 2);
INSERT INTO `favorite` VALUES (53, 1, 3);
INSERT INTO `favorite` VALUES (54, 1, 3);

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence`  (
  `next_val` bigint(20) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES (55);
INSERT INTO `hibernate_sequence` VALUES (55);
INSERT INTO `hibernate_sequence` VALUES (55);
INSERT INTO `hibernate_sequence` VALUES (55);
INSERT INTO `hibernate_sequence` VALUES (55);
INSERT INTO `hibernate_sequence` VALUES (55);
INSERT INTO `hibernate_sequence` VALUES (55);
INSERT INTO `hibernate_sequence` VALUES (55);

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_id` int(11) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `thumb_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `created_date` datetime(0) NULL DEFAULT NULL,
  `updated_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 54 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (48, 1, 'Dịch vụ cho thuê áo dài chụp hình Tết', 'HQFzFgwQh1w96RDwgmMxPp1YkWgtMzLL7RJFC379OO1c3.jpg', 'XqRszDFHPc9GpRZ5X283o21MxAg6HFZKECfYqPjvwjvWy.jpg', '<p>Tại TPHCM để t&igrave;m một cửa h&agrave;ng &aacute;o d&agrave;i kh&ocirc;ng kh&oacute;, nhưng để t&igrave;m một cửa h&agrave;ng uy t&iacute;n top 1 chuy&ecirc;n cho thu&ecirc; &aacute;o d&agrave;i Tết tại TPHCM thỏa m&atilde;n nhiều ti&ecirc;u ch&iacute; như: Nhiều mẫu &aacute;o d&agrave;i cho thu&ecirc;, C&oacute; nhiều chi nh&aacute;nh cửa h&agrave;ng tại TPHCM, Dịch vụ chuy&ecirc;n nghiệp, Gi&aacute; cả từ b&igrave;nh d&acirc;n đến cao cấp th&igrave; chỉ c&oacute; 1&hellip; &Aacute;o d&agrave;i Hạnh tự tin l&agrave; shop &aacute;o d&agrave;i top 1 về dịch vụ cho thu&ecirc; &aacute;o d&agrave;i Tết tại TPHCM.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>Tết 2020 n&agrave;y bạn dự định chụp &aacute;o d&agrave;i Tết để &ldquo;Khoe&rdquo; với bạn b&egrave; chưa. Nếu chưa c&oacute; th&igrave; h&atilde;y nhanh ch&acirc;n đến &aacute;o d&agrave;i Hạnh để chọn cho m&igrave;nh một bộ &aacute;o d&agrave;i Tết ưng &yacute; nhất nh&eacute;.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>H&atilde;y c&ugrave;ng &Aacute;o D&agrave;i Hạnh điểm qua một số mẫu &aacute;o d&agrave;i Tết 2020 nh&eacute;</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p style=\"text-align: center;\"><img alt=\"Áo dài chụp hình Tết\" src=\"https://aodaihanh.com/wp-content/uploads/2018/12/ao-dai-tet.jpg\" /></p>\r\n', 1, '2020-06-24 00:00:00', '2020-06-24 00:00:00');
INSERT INTO `news` VALUES (52, 1, 'Dịch vụ cho thuê áo dài chụp hình Tết cực đẹp cực rẻ', 'FfumGIyM2JlqYf8xbTlsBthTsOROsQZWqYPEIme7k3UoY.jpg', '4WFUI0OdDlSzPgKt1cCpWBxtxuBbO7WPHtypkiLGJAEVW.jpg', '<p>Mặc &aacute;o d&agrave;i để chụp h&igrave;nh v&agrave;o ng&agrave;y Tết từ l&acirc;u đ&atilde; l&agrave; &ldquo;Mốt&rdquo;&nbsp;của c&aacute;c bạn trẻ ở&nbsp;TPHCM. Những địa điểm quen thuộc được c&aacute;c bạn trẻ thường lui tới như đường hoa Nguyễn Huệ, đường Đồng Khởi, Trung t&acirc;m thương mại Vincom, nh&agrave; thờ Đức B&agrave;, Chợ Hoa hay Ch&ugrave;a&hellip; lại nhộn nhịp kh&ocirc;ng kh&iacute; Tết bởi h&igrave;nh ảnh c&aacute;c bạn trẻ mặc &aacute;o d&agrave;i tr&agrave;n ngập xuống phố tạo n&ecirc;n một bức tranh mu&ocirc;n m&agrave;u về vẻ đẹp của S&agrave;i G&ograve;n.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p style=\"text-align: center;\"><img alt=\"Áo dài chụp hình Tết 1\" src=\"https://aodaihanh.com/wp-content/uploads/2018/12/ao-dai-chup-hinh-tet-1.jpg\" /></p>\r\n', 1, '2020-06-24 00:00:00', '2020-06-24 00:00:00');
INSERT INTO `news` VALUES (53, 1, 'Các kiểu áo dài học sinh cấp 3 đẹp', 'g5sLIotE1Jyn9gDIb3FL5Bbmg9kD6gEzk25PEzE7ecKRq.png', 'Dw311g8s4kRjdVVufghTEEsMMOVyMqxd4rCoAA9K4gLWL.png', '<p>&Aacute;o d&agrave;i l&agrave; một biểu tượng tượng trưng cho n&eacute;t đẹp truyền thống của người con g&aacute;i Việt Nam, &aacute;o d&agrave;i thường được sử dụng l&agrave;m trang phục cho những buổi tiệc sang trọng, bữa tiệc cưới v&agrave; l&agrave; đồng phục của những nữ sinh trung học phổ th&ocirc;ng. B&agrave;i viết dưới đ&acirc;y sẽ đề cập một số mẫu&nbsp;<b>&aacute;o d&agrave;i nữ sinh cấp 3&nbsp;</b>đẹp cho c&aacute;c bạn đọc tham khảo.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<h2>&Aacute;o d&agrave;i học sinh cổ tr&ograve;n</h2>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&Aacute;o d&agrave;i cổ tr&ograve;n rất được c&aacute;c chị em ưa chuộng bởi n&oacute; ph&ugrave; hợp với rất nhiều d&aacute;ng người. D&ugrave; gầy hay mập th&igrave; cổ tr&ograve;n đều l&agrave; sự chọn lựa ho&agrave;n hảo nhất d&agrave;nh cho bạn. Nếu c&aacute;c n&agrave;ng c&oacute; chiếc cổ ngắn th&igrave; &aacute;o d&agrave;i cổ tr&ograve;n sẽ gi&uacute;p bạn che đi khuyết điểm tốt nhất. Hoặc c&aacute;c chị em c&oacute; v&oacute;c d&aacute;ng đầy đặn th&igrave; việc chọn một chiếc &aacute;o d&agrave;i cổ tr&ograve;n rộng, phần n&agrave;o đ&oacute; cũng t&ocirc;n vinh v&oacute;c d&aacute;ng v&agrave; gi&uacute;p th&acirc;n h&igrave;nh thanh tho&aacute;t hơn.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>Cũng ch&iacute;nh v&igrave; thế m&agrave; những thiết kế &aacute;o d&agrave;i học sinh được kết hợp với cổ tr&ograve;n để c&oacute; thể l&agrave;m bật l&ecirc;n sự dịu d&agrave;ng, dễ thương của mỗi nữ sinh.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p style=\"text-align: center;\"><img alt=\"Áo dài cổ tròn tôn lên nét đẹp của các nữ sinh\" src=\"https://aodaihanh.com/wp-content/uploads/2018/08/ao-dai-nu-sinh-dep-co-tron.png\" /></p>\r\n', 1, '2020-06-24 00:00:00', '2020-06-24 00:00:00');

-- ----------------------------
-- Table structure for order_product
-- ----------------------------
DROP TABLE IF EXISTS `order_product`;
CREATE TABLE `order_product`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) NULL DEFAULT NULL,
  `product_storage_id` int(11) NULL DEFAULT NULL,
  `quantity` int(11) NULL DEFAULT NULL,
  `price` float(11, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 103 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_product
-- ----------------------------
INSERT INTO `order_product` VALUES (8, 83, 3, 1, 1000000);
INSERT INTO `order_product` VALUES (9, 84, 1, 1, 100000);
INSERT INTO `order_product` VALUES (10, 84, 5, 1, 1000);
INSERT INTO `order_product` VALUES (11, 85, 1, 1, 100000);
INSERT INTO `order_product` VALUES (12, 85, 5, 1, 1000);
INSERT INTO `order_product` VALUES (13, 86, 1, 1, 100000);
INSERT INTO `order_product` VALUES (14, 86, 5, 1, 1000);
INSERT INTO `order_product` VALUES (15, 87, 1, 1, 100000);
INSERT INTO `order_product` VALUES (16, 87, 5, 1, 1000);
INSERT INTO `order_product` VALUES (17, 88, 1, 1, 100000);
INSERT INTO `order_product` VALUES (18, 88, 5, 1, 1000);
INSERT INTO `order_product` VALUES (19, 89, 1, 1, 100000);
INSERT INTO `order_product` VALUES (20, 89, 5, 1, 1000);
INSERT INTO `order_product` VALUES (21, 90, 1, 1, 100000);
INSERT INTO `order_product` VALUES (22, 90, 5, 1, 1000);
INSERT INTO `order_product` VALUES (23, 91, 1, 1, 100000);
INSERT INTO `order_product` VALUES (24, 91, 5, 1, 1000);
INSERT INTO `order_product` VALUES (25, 92, 1, 1, 100000);
INSERT INTO `order_product` VALUES (26, 92, 5, 1, 1000);
INSERT INTO `order_product` VALUES (27, 93, 1, 1, 100000);
INSERT INTO `order_product` VALUES (28, 93, 5, 1, 1000);
INSERT INTO `order_product` VALUES (29, 94, 1, 1, 100000);
INSERT INTO `order_product` VALUES (30, 94, 5, 1, 1000);
INSERT INTO `order_product` VALUES (31, 95, 1, 1, 100000);
INSERT INTO `order_product` VALUES (32, 95, 5, 1, 1000);
INSERT INTO `order_product` VALUES (33, 96, 1, 1, 100000);
INSERT INTO `order_product` VALUES (34, 96, 5, 1, 1000);
INSERT INTO `order_product` VALUES (35, 97, 1, 1, 100000);
INSERT INTO `order_product` VALUES (36, 97, 5, 1, 1000);
INSERT INTO `order_product` VALUES (37, 98, 1, 1, 100000);
INSERT INTO `order_product` VALUES (38, 99, 1, 1, 100000);
INSERT INTO `order_product` VALUES (39, 98, 5, 1, 1000);
INSERT INTO `order_product` VALUES (40, 99, 5, 1, 1000);
INSERT INTO `order_product` VALUES (41, 100, 1, 5, 100000);
INSERT INTO `order_product` VALUES (42, 100, 5, 5, 1000);
INSERT INTO `order_product` VALUES (102, 82, 5, 1, 1000);

-- ----------------------------
-- Table structure for orderr
-- ----------------------------
DROP TABLE IF EXISTS `orderr`;
CREATE TABLE `orderr`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NULL DEFAULT NULL,
  `order_date` datetime(0) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `comment` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `total` float(11, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 101 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orderr
-- ----------------------------
INSERT INTO `orderr` VALUES (82, 2, '2020-06-15 00:00:00', 'nghiemx xuan anh', '342/11B Thoại Ngọc Hầu, Tân Phú, TP. Hồ Chí Minh', 'Hồ Chí Minh', 'tanks.museum98@gmail.com', '123131313', '12313131', 1000);
INSERT INTO `orderr` VALUES (83, 2, '2020-06-15 00:00:00', 'nghiem xuan anh anh', '342/11B Thoại Ngọc Hầu, Tân Phú, TP. Hồ Chí Minh', 'Hồ Chí Minh', 'tanks.museum98@gmail.com', '0706076517', '1231313', 1000000);
INSERT INTO `orderr` VALUES (84, 1, '2020-06-15 00:00:00', 'nghiem xuan anh anh', '練馬区早宮３丁目', 'Hồ Chí Minh', 'tanks.museum98@gmail.com', '12332', '131313', 101000);
INSERT INTO `orderr` VALUES (85, 1, '2020-06-15 00:00:00', 'nghiem xuan anh anh', '川崎市高津区', 'Hồ Chí Minh', 'tanks.museum98@gmail.com', '12323213', '13131', 101000);
INSERT INTO `orderr` VALUES (86, 1, '2020-06-15 00:00:00', '12312 3131', '練馬区早宮３丁目', 'Hồ Chí Minh', 'tanks.museum98@gmail.com', '123123', '131313', 101000);
INSERT INTO `orderr` VALUES (87, 2, '2020-06-15 00:00:00', 'nghiem xuan anh', '342/111B Thoại Ngọc Hầu, Tân Phú, TP. Hồ Chí Minh', 'Hồ Chí Minh', 'tanks.museum98@gmail.com', '0706076517', '1231313', 101000);
INSERT INTO `orderr` VALUES (88, 2, '2020-06-15 00:00:00', 'nghiem xuan anh', '342/111B Thoại Ngọc Hầu, Tân Phú, TP. Hồ Chí Minh', 'Hồ Chí Minh', 'tanks.museum98@gmail.com', '0706076517', '1231313', 101000);
INSERT INTO `orderr` VALUES (89, 2, '2020-06-15 00:00:00', '123123 12313', '342/11B Thoại Ngọc Hầu, Tân Phú, TP. Hồ Chí Minh', 'Hồ Chí Minh', 'tanks.museum98@gmail.com', '0706076517', '123123213', 101000);
INSERT INTO `orderr` VALUES (90, 2, '2020-06-15 00:00:00', '123 1313', '1313', 'Hồ Chí Minh', '131', '331', '31313', 101000);
INSERT INTO `orderr` VALUES (91, 2, '2020-06-15 00:00:00', '123 1231', '3131', 'Hồ Chí Minh', '313', '131', '313', 101000);
INSERT INTO `orderr` VALUES (92, 2, '2020-06-15 00:00:00', '123123 1232131', '3131', 'Hồ Chí Minh', '3131', '313', '1313', 101000);
INSERT INTO `orderr` VALUES (93, 2, '2020-06-15 00:00:00', '123 1231', '313', 'Hồ Chí Minh', '131', '13', '1313', 101000);
INSERT INTO `orderr` VALUES (94, 2, '2020-06-15 00:00:00', '123 123', '1313', 'Hồ Chí Minh', '31', '313', '1313', 101000);
INSERT INTO `orderr` VALUES (95, 2, '2020-06-15 00:00:00', '123 1313', '131', 'Hồ Chí Minh', '313', '133', '1313', 101000);
INSERT INTO `orderr` VALUES (96, 2, '2020-06-15 00:00:00', '123 123', '131', 'Hồ Chí Minh', '131', '313', '13', 101000);
INSERT INTO `orderr` VALUES (97, 2, '2020-06-15 00:00:00', '123 213', '1313', 'Hà Nội', '13', '1313', '131313', 101000);
INSERT INTO `orderr` VALUES (98, 2, '2020-06-18 00:00:00', '121212 12121212', '121212', 'Hồ Chí Minh', '121212', '121212', '1212121212', 101000);
INSERT INTO `orderr` VALUES (99, 2, '2020-06-18 00:00:00', '121212 12121212', '121212', 'Hồ Chí Minh', '121212', '121212', '1212121212', 101000);
INSERT INTO `orderr` VALUES (100, 1, '2020-06-20 00:00:00', '121212 12121212', '123213', 'Hồ Chí Minh', '123123@g', '123123', '12312321313', 505000);

-- ----------------------------
-- Table structure for product_color
-- ----------------------------
DROP TABLE IF EXISTS `product_color`;
CREATE TABLE `product_color`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `hex` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `removed_flag` bit(1) NULL DEFAULT NULL,
  `created_date` datetime(0) NULL DEFAULT NULL,
  `updated_date` datetime(0) NULL DEFAULT NULL,
  `category_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_color
-- ----------------------------
INSERT INTO `product_color` VALUES (1, 'Trắng', '#FFFFFF', b'0', NULL, NULL, 1);
INSERT INTO `product_color` VALUES (2, 'Đen', '#000000', b'0', NULL, NULL, 1);
INSERT INTO `product_color` VALUES (3, 'Nâu', '#A52A2A', b'0', NULL, NULL, 1);

-- ----------------------------
-- Table structure for product_image
-- ----------------------------
DROP TABLE IF EXISTS `product_image`;
CREATE TABLE `product_image`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uploaded_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_image
-- ----------------------------
INSERT INTO `product_image` VALUES (1, 1, 'XswhGYbeJ6iDFrBzOJ7CBWdYrBKIAb4q7bgE41JlvslzL.jpg', NULL);
INSERT INTO `product_image` VALUES (2, 1, 'XswhGYbeJ6iDFrBzOJ7CBWdYrBKIAb4q7bgE41JlvslzL.jpg', NULL);
INSERT INTO `product_image` VALUES (3, 1, 'XswhGYbeJ6iDFrBzOJ7CBWdYrBKIAb4q7bgE41JlvslzL.jpg', NULL);
INSERT INTO `product_image` VALUES (4, 1, 'm53ZGnyGwqUTv4Inb7qJQrkEa0VFxQZYYbsT1R0q99jYS.jpg', NULL);
INSERT INTO `product_image` VALUES (5, 1, 'm53ZGnyGwqUTv4Inb7qJQrkEa0VFxQZYYbsT1R0q99jYS.jpg', NULL);
INSERT INTO `product_image` VALUES (6, 2, 'd5PpHgGhrWHFRrRK2QxP8YEhQXY4oW1svllVbMyWrVxN9.jpg', NULL);
INSERT INTO `product_image` VALUES (7, 2, 'd5PpHgGhrWHFRrRK2QxP8YEhQXY4oW1svllVbMyWrVxN9.jpg', NULL);
INSERT INTO `product_image` VALUES (8, 2, 'd5PpHgGhrWHFRrRK2QxP8YEhQXY4oW1svllVbMyWrVxN9.jpg', NULL);
INSERT INTO `product_image` VALUES (9, 3, 'd5PpHgGhrWHFRrRK2QxP8YEhQXY4oW1svllVbMyWrVxN9.jpg', NULL);
INSERT INTO `product_image` VALUES (10, 4, 'd5PpHgGhrWHFRrRK2QxP8YEhQXY4oW1svllVbMyWrVxN9.jpg', NULL);
INSERT INTO `product_image` VALUES (11, 8, 'TafHQVdebc7Y60TTpMkuxgSjciXdRZFEJwO2kF1Aoqbn9.jpg', '2020-05-19 00:00:00');
INSERT INTO `product_image` VALUES (12, 8, 'itT2NWv0MdIIifozDehzRVG5HfcFaSkg1DnHIpTBIcX4i.jpg', '2020-05-19 00:00:00');
INSERT INTO `product_image` VALUES (13, 8, '8Q2M0OBm6dol302QEYzL32mSOxj5rgrJCbtUQIojSAQNL.PNG', '2020-05-19 00:00:00');
INSERT INTO `product_image` VALUES (14, 8, 'U0XjlF4J3i4C1cdAsSJVdlXHux7lk9vlpZqJvODw5zhuC.PNG', '2020-05-19 00:00:00');
INSERT INTO `product_image` VALUES (15, 9, 'gICMvQ3vlxoVAudV5za4rSxGCavZaJ1ejO6GrfkUvjDgc.jpg', '2020-05-19 00:00:00');
INSERT INTO `product_image` VALUES (16, 9, 'Kv3eErMfd7wbbKnb7xvccPXkpbr3esqV8cnAwG4bkY4kI.jpg', '2020-05-19 00:00:00');
INSERT INTO `product_image` VALUES (17, 9, 'N4wruIQa56ViHygjqRqIUc6owg4V4Rxxg7KMF3KM9YEPV.PNG', '2020-05-19 00:00:00');
INSERT INTO `product_image` VALUES (18, 9, 'vnlMMMGtyxppI1FscDyHAapXPG5pBL42JjSSgWd8AYfEY.PNG', '2020-05-19 00:00:00');
INSERT INTO `product_image` VALUES (19, 9, 'bZKVqEwHb1Nmnzz2aLBifGt3NAfzx3DsVreK2ooODpedg.PNG', '2020-05-19 00:00:00');
INSERT INTO `product_image` VALUES (20, 10, 'HHYQGd306H0VFp4z79beE41v6YXFBQNYdq05NSURTfhKA.jpg', '2020-05-19 00:00:00');
INSERT INTO `product_image` VALUES (21, 10, 'BJNtMKdzgfpGsipqyclEgOsQEZcQWkMdXPxlu93pq9P1B.jpg', '2020-05-19 00:00:00');
INSERT INTO `product_image` VALUES (22, 10, 'j4lcKo2v1gtyVs7vUSiURj73gONuJ7095XB4TiQIl4nnN.PNG', '2020-05-19 00:00:00');
INSERT INTO `product_image` VALUES (23, 10, 'IU43IlAZ84tWmFSVapwJsBb2vQwVnwGyr8manSL6eI4wJ.PNG', '2020-05-19 00:00:00');
INSERT INTO `product_image` VALUES (24, 11, 'mhEoraZENEkuabUQ9mMaJbnBvncXR4NtpvIn3jjrkU3va.jpg', '2020-05-19 00:00:00');
INSERT INTO `product_image` VALUES (25, 11, 'iyov5wZZe21wID0KSvsqM4BJcFxTRvw7jqdlqf1V6bIvF.jpg', '2020-05-19 00:00:00');

-- ----------------------------
-- Table structure for product_size
-- ----------------------------
DROP TABLE IF EXISTS `product_size`;
CREATE TABLE `product_size`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `removed_flag` bit(1) NULL DEFAULT NULL,
  `created_date` datetime(0) NULL DEFAULT NULL,
  `updated_date` datetime(0) NULL DEFAULT NULL,
  `category_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_size
-- ----------------------------
INSERT INTO `product_size` VALUES (1, 'S', b'0', NULL, NULL, 1);
INSERT INTO `product_size` VALUES (2, 'M', b'0', NULL, NULL, 1);
INSERT INTO `product_size` VALUES (3, 'L', b'0', NULL, NULL, 1);
INSERT INTO `product_size` VALUES (4, 'XL', b'0', NULL, NULL, 1);
INSERT INTO `product_size` VALUES (5, 'XXL', b'0', NULL, NULL, 1);

-- ----------------------------
-- Table structure for product_storage
-- ----------------------------
DROP TABLE IF EXISTS `product_storage`;
CREATE TABLE `product_storage`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) NULL DEFAULT NULL,
  `price` float(11, 0) NULL DEFAULT NULL,
  `discount` float(11, 0) NULL DEFAULT NULL,
  `color_id` int(11) NULL DEFAULT NULL,
  `size_id` int(11) NULL DEFAULT NULL,
  `quantity` int(11) NULL DEFAULT NULL,
  `sold` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKf7j08rvmvhxqmjlg6o78xv09n`(`color_id`) USING BTREE,
  INDEX `FKo4u4ed7f5ko15oj1sfu2s435x`(`size_id`) USING BTREE,
  INDEX `FKr9q9ev01c37jihsx2a287jsbt`(`product_id`) USING BTREE,
  CONSTRAINT `FKf7j08rvmvhxqmjlg6o78xv09n` FOREIGN KEY (`color_id`) REFERENCES `product_color` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKo4u4ed7f5ko15oj1sfu2s435x` FOREIGN KEY (`size_id`) REFERENCES `product_size` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKr9q9ev01c37jihsx2a287jsbt` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_storage
-- ----------------------------
INSERT INTO `product_storage` VALUES (1, 1, 100000, 50000, 1, 1, 100, 0);
INSERT INTO `product_storage` VALUES (2, 1, 200000, 0, 2, 2, 20, 0);
INSERT INTO `product_storage` VALUES (3, 2, 1000000, 0, 1, 1, 10, 0);
INSERT INTO `product_storage` VALUES (4, 2, 1500000, 0, 2, 2, 15, 0);
INSERT INTO `product_storage` VALUES (5, 3, 1000, 1000, 2, 1, 1, 0);
INSERT INTO `product_storage` VALUES (6, 3, 1500, 1000, 2, 2, 1, 0);
INSERT INTO `product_storage` VALUES (7, 3, 2000, 1000, 2, 3, 1, 0);
INSERT INTO `product_storage` VALUES (8, 3, 2500, 1000, 2, 4, 1, 0);
INSERT INTO `product_storage` VALUES (9, 3, 3000, 1000, 2, 5, 1, 0);

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `category_id` int(11) NULL DEFAULT NULL,
  `removed_flag` bit(1) NULL DEFAULT NULL,
  `created_date` datetime(0) NULL DEFAULT NULL,
  `updated_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKog2rp4qthbtt2lfyhfo32lsw9`(`category_id`) USING BTREE,
  CONSTRAINT `FKog2rp4qthbtt2lfyhfo32lsw9` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of products
-- ----------------------------
INSERT INTO `products` VALUES (1, 'Áo dài', 'ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ok chưa.. được chưa ? ', 1, b'0', '2020-06-19 00:00:00', '2020-06-19 00:00:00');
INSERT INTO `products` VALUES (2, 'Tranh hoa anh đào', 'ổn áp chưa :))', 2, b'0', '2020-06-19 00:00:00', '2020-06-19 00:00:00');
INSERT INTO `products` VALUES (3, 'Tranh hoa anh đào', 'ổn áp chưa :)) Áo Dài', 1, b'0', '2020-06-19 00:00:00', '2020-06-19 00:00:00');
INSERT INTO `products` VALUES (4, 'Tranh hoa anh đào', 'ổn áp chưa :)) Áo Dài', 2, b'0', '2020-06-19 00:00:00', '2020-06-19 00:00:00');

-- ----------------------------
-- Table structure for reviews
-- ----------------------------
DROP TABLE IF EXISTS `reviews`;
CREATE TABLE `reviews`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) NULL DEFAULT NULL,
  `rating` float(11, 0) NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 46 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reviews
-- ----------------------------
INSERT INTO `reviews` VALUES (43, 3, 4, '123123', '123213', '123123');
INSERT INTO `reviews` VALUES (44, 3, 5, 'duoc phet day', 'xuananh@gmail.com', 'xuan anh');
INSERT INTO `reviews` VALUES (45, 1, 3, 'tét nhẹ cho thái coi', 'test@gmail.com', 'xuân anh');

-- ----------------------------
-- Table structure for roles
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `created_date` datetime(0) NULL DEFAULT NULL,
  `updated_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of roles
-- ----------------------------
INSERT INTO `roles` VALUES (1, 'user', NULL, NULL);
INSERT INTO `roles` VALUES (2, 'admin', NULL, NULL);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` bit(1) NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `image` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `role_id` int(11) NULL DEFAULT NULL,
  `created_date` datetime(0) NULL DEFAULT NULL,
  `updated_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKp56c1712k691lhsyewcssf40f`(`role_id`) USING BTREE,
  CONSTRAINT `FKp56c1712k691lhsyewcssf40f` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'admin', 'admin', 'Xuân Anh', '342/9B Thoại Ngọc Hầu', b'0', 22, NULL, 2, NULL, NULL);
INSERT INTO `users` VALUES (2, 'user', '123', 'Xuann Anhh', '342/9B Thoại Ngọc Hầu', b'0', 22, NULL, 1, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
