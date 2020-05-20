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

 Date: 20/05/2020 14:25:56
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
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of aboutus
-- ----------------------------
INSERT INTO `aboutus` VALUES (18, '<section class=\"bg0 p-t-75 p-b-120\">\r\n<div class=\"container\">\r\n<div class=\"row p-b-148\">\r\n<div class=\"col-md-7 col-lg-8\">\r\n<div class=\"p-t-7 p-r-85 p-r-15-lg p-r-0-md\">\r\n<h3 class=\"mtext-111 cl2 p-b-16\">Our Story</h3>\r\n\r\n<p class=\"stext-113 cl6 p-b-26\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris consequat consequat enim, non auctor massa ultrices non. Morbi sed odio massa. Quisque at vehicula tellus, sed tincidunt augue. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Maecenas varius egestas diam, eu sodales metus scelerisque congue. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Maecenas gravida justo eu arcu egestas convallis. Nullam eu erat bibendum, tempus ipsum eget, dictum enim. Donec non neque ut enim dapibus tincidunt vitae nec augue. Suspendisse potenti. Proin ut est diam. Donec condimentum euismod tortor, eget facilisis diam faucibus et. Morbi a tempor elit.</p>\r\n\r\n<p class=\"stext-113 cl6 p-b-26\">Donec gravida lorem elit, quis condimentum ex semper sit amet. Fusce eget ligula magna. Aliquam aliquam imperdiet sodales. Ut fringilla turpis in vehicula vehicula. Pellentesque congue ac orci ut gravida. Aliquam erat volutpat. Donec iaculis lectus a arcu facilisis, eu sodales lectus sagittis. Etiam pellentesque, magna vel dictum rutrum, neque justo eleifend elit, vel tincidunt erat arcu ut sem. Sed rutrum, turpis ut commodo efficitur, quam velit convallis ipsum, et maximus enim ligula ac ligula.</p>\r\n\r\n<p class=\"stext-113 cl6 p-b-26\">Any questions? Let us know in store at 8th floor, 379 Hudson St, New York, NY 10018 or call us on (+1) 96 716 6879</p>\r\n</div>\r\n</div>\r\n\r\n<div class=\"col-11 col-md-5 col-lg-4 m-lr-auto\">\r\n<div class=\"how-bor1 \">\r\n<div class=\"hov-img0\"><img alt=\"IMG\" src=\"/coza/images/about-01.jpg\" /></div>\r\n</div>\r\n</div>\r\n</div>\r\n\r\n<div class=\"row\">\r\n<div class=\"order-md-2 col-md-7 col-lg-8 p-b-30\">\r\n<div class=\"p-t-7 p-l-85 p-l-15-lg p-l-0-md\">\r\n<h3 class=\"mtext-111 cl2 p-b-16\">Our Mission</h3>\r\n\r\n<p class=\"stext-113 cl6 p-b-26\">Mauris non lacinia magna. Sed nec lobortis dolor. Vestibulum rhoncus dignissim risus, sed consectetur erat. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nullam maximus mauris sit amet odio convallis, in pharetra magna gravida. Praesent sed nunc fermentum mi molestie tempor. Morbi vitae viverra odio. Pellentesque ac velit egestas, luctus arcu non, laoreet mauris. Sed in ipsum tempor, consequat odio in, porttitor ante. Ut mauris ligula, volutpat in sodales in, porta non odio. Pellentesque tempor urna vitae mi vestibulum, nec venenatis nulla lobortis. Proin at gravida ante. Mauris auctor purus at lacus maximus euismod. Pellentesque vulputate massa ut nisl hendrerit, eget elementum libero iaculis.</p>\r\n\r\n<div class=\"bor16 p-l-29 p-b-9 m-t-22\">\r\n<p class=\"stext-114 cl6 p-r-40 p-b-11\">Creativity is just connecting things. When you ask creative people how they did something, they feel a little guilty because they didn&#39;t really do it, they just saw something. It seemed obvious to them after a while.</p>\r\n<span class=\"stext-111 cl8\">- Steve Job&rsquo;s </span></div>\r\n</div>\r\n</div>\r\n\r\n<div class=\"order-md-1 col-11 col-md-5 col-lg-4 m-lr-auto p-b-30\">\r\n<div class=\"how-bor2\">\r\n<div class=\"hov-img0\"><img alt=\"IMG\" src=\"/coza/images/about-02.jpg\" /></div>\r\n</div>\r\n</div>\r\n</div>\r\n</div>\r\n</section>\r\n');
INSERT INTO `aboutus` VALUES (19, '<section class=\"bg0 p-t-75 p-b-120\">\r\n<div class=\"container\">\r\n<div class=\"row p-b-148\">\r\n<div class=\"col-md-7 col-lg-8\">\r\n<div class=\"p-t-7 p-r-85 p-r-15-lg p-r-0-md\">\r\n<h3 class=\"mtext-111 cl2 p-b-16\">Our Story</h3>\r\n\r\n<p>Chiếc &aacute;o d&agrave;i l&agrave; biểu tượng tuyệt đẹp của nền văn ho&aacute; d&acirc;n tộc, l&agrave; niềm tự h&agrave;o của con người Việt Nam ch&uacute;ng ta.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i ra đời từ rất l&acirc;u, n&oacute; đ&atilde; trải qua c&aacute;c thời k&igrave; cải biến để đạt đến độ thẩm mĩ như ng&agrave;y nay. Kiểu sơ khai l&agrave; &aacute;o giao l&agrave;nh, được người phụ nữ mặc phủ ngo&agrave;i yếm đ&agrave;o, v&aacute;y lụa đen, thắt lưng bu&ocirc;ng thả. Nhưng để tiện cho việc l&agrave;m ăn, việc đồng &aacute;ng, &aacute;o giao l&agrave;nh được thu gọn th&agrave;nh &aacute;o tứ th&acirc;n. Sau đ&oacute;, n&oacute; được biến th&agrave;nh &aacute;o ngũ th&acirc;n để c&aacute;c c&ocirc;, c&aacute;c b&agrave; mặc trong lễ hội m&ugrave;a xu&acirc;n.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;Đến thời ch&uacute;a Nguyễn xứ Đ&agrave;ng Trong, Vũ Vương Nguyền Ph&uacute;c Kho&aacute;t ban h&agrave;nh sắc dụ về y phục, th&igrave; chiếc &aacute;o d&agrave;i c&oacute; cổ đứng ngắn tay, cứa ống tay rộng hoặc hẹp, hai b&ecirc;n n&aacute;ch trở xuống kh&acirc;u k&iacute;n, kh&ocirc;ng xẻ t&agrave;. Từ đ&oacute;, &aacute;o d&agrave;i được cải tiến theo nhiều kiểu, ng&agrave;y một trở n&ecirc;n xinh đẹp, thướt tha.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i được may bằng nhiều chất liệu như gấm, nhung, lụa tơ tằm. Hiện nay, c&aacute;c nh&agrave; thiết kế y phục đ&atilde; s&aacute;ng tạo ra nhiều kiểu &aacute;o d&agrave;i t&acirc;n thời, cố &aacute;o c&agrave;i khuy. Khuy &aacute;o l&agrave; hạt cườm, hạt ngọc, c&uacute;c bấm. Tay &aacute;o d&agrave;i kh&ocirc;ng c&oacute; cầu vai, may liền với cổ &aacute;o giống như &aacute;o b&agrave; ba xẻ t&agrave;. Ch&iacute;nh đặc điểm n&agrave;y khiến việc sinh hoạt của ngực phụ nữ được dễ d&agrave;ng, đồng thời tạo d&aacute;ng thanh tho&aacute;t, yểu điệu, thướt tha.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i c&oacute; hai t&agrave; ch&iacute;nh: t&agrave; &aacute;o trước v&agrave; t&agrave; &aacute;o sau. Đ&acirc;y l&agrave; phần được c&aacute;c nh&agrave; thiết kế thời trang c&aacute;ch điệu nhiều nhất. Khi th&igrave; d&ugrave;ng chất liệu vải voan, khi th&igrave; được kết cườm, ngọc &oacute;ng &aacute;nh. &Aacute;o d&agrave;i thường đi đ&ocirc;i với quần thụng. Phụ nữ Việt Nam thường mặc &aacute;o d&agrave;i xẻ t&agrave; c&ugrave;ng với quần thụng trắng bởi n&oacute; tạo n&ecirc;n vẻ đ&agrave;i c&aacute;c trang nh&atilde;. Hiện nay, &aacute;o d&agrave;i c&oacute; nhiều hoa văn kh&aacute;c nhau, mang đậm bản sắc d&acirc;n tộc C&oacute; thể l&agrave; những đo&aacute; hoa như hoa hồng, hoa lan, b&uacute;p huệ. C&oacute; thể l&agrave; hoa thuỷ ti&ecirc;n. Cũng c&oacute; thể l&agrave; nhiều loại hoa rực rỡ, đủ m&agrave;u sắc gợi l&ecirc;n d&aacute;ng y&ecirc;u kiều, đ&agrave;i c&aacute;c, qu&yacute; ph&aacute;i của c&aacute;c c&ocirc; thiếu nữ, thanh nữ.</p>\r\n</div>\r\n</div>\r\n\r\n<div class=\"col-11 col-md-5 col-lg-4 m-lr-auto\">\r\n<div class=\"how-bor1 \">\r\n<div class=\"hov-img0\"><img alt=\"IMG\" src=\"/images/XswhGYbeJ6iDFrBzOJ7CBWdYrBKIAb4q7bgE41JlvslzL.jpg\" style=\"width: 370px; height: 658px;\" /></div>\r\n</div>\r\n</div>\r\n</div>\r\n\r\n<div class=\"row\">\r\n<div class=\"order-md-2 col-md-7 col-lg-8 p-b-30\">\r\n<div class=\"p-t-7 p-l-85 p-l-15-lg p-l-0-md\">\r\n<h3 class=\"mtext-111 cl2 p-b-16\">Our Mission</h3>\r\n\r\n<p>Gi&ecirc;ng hai, bước v&agrave;o hội xu&acirc;n, tr&ecirc;n mọi nẻo đường qu&ecirc; Kinh Bắc, xứ Đ&ocirc;ng xứ Đo&agrave;i... ta bắt gặp c&aacute;c b&agrave;, c&aacute;c cụ trong bộ &aacute;o quần d&agrave;i bằng lụa n&acirc;u, vai khoa; t&uacute;i đi đến ch&ugrave;a lễ Phật. Hội ch&ugrave;a Hương, hội Gi&oacute;ng, hội ch&ugrave;a D&acirc;u, hội Lim,... từng đo&agrave;n thiếu nữ, thanh nữ thướt tha trong bộ &aacute;o d&agrave;i tuyệt đẹp. Trong c&aacute;c lề ch&agrave;o cờ, c&aacute;c ng&agrave;y lễ được tổ chức ở s&acirc;n trường, nhất l&agrave; c&aacute;c trường Trung học phổ th&ocirc;ng h&agrave;ng ngh&igrave;n nữ sinh v&agrave; c&ocirc; gi&aacute;o trong chiếc &aacute;o d&agrave;i trắng, quần trắng gợi l&ecirc;n vẻ đẹp tinh kh&ocirc;i, trinh trắng của thế hệ tuổi xu&acirc;n.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;Chiếc &aacute;o d&agrave;i m&atilde;i m&atilde;i l&agrave; niềm tự h&agrave;o v&agrave; h&atilde;nh diện của mỗi con người Việt Nam ch&uacute;ng ta. Vẻ đẹp chiếc &aacute;o d&agrave;i gợi l&ecirc;n vẻ đẹp văn ho&aacute; truyền thống của đất nước v&agrave; con người Việt Nam. Tr&ecirc;n con đường hội nhập, c&oacute; thể y phục của mỗi con người Việt Nam trở n&ecirc;n phong ph&uacute;, đa dạng, hiện đại, nhưng chiếc &aacute;o d&agrave;i t&acirc;n thời sẽ m&atilde;i m&atilde;i gắn b&oacute; với t&acirc;m hồn người phụ nữ Việt Nam, l&agrave;m t&ocirc;n vẻ đẹp ki&ecirc;u sa, duy&ecirc;n d&aacute;ng của c&aacute;c thiếu nữ, thanh nữ trong lễ hội.</p>\r\n\r\n<div class=\"bor16 p-l-29 p-b-9 m-t-22\">\r\n<p class=\"stext-114 cl6 p-r-40 p-b-11\">Creativity is just connecting things. When you ask creative people how they did something, they feel a little guilty because they didn&#39;t really do it, they just saw something. It seemed obvious to them after a while.</p>\r\n<span class=\"stext-111 cl8\">- Steve Job&rsquo;s </span></div>\r\n</div>\r\n</div>\r\n\r\n<div class=\"order-md-1 col-11 col-md-5 col-lg-4 m-lr-auto p-b-30\">\r\n<div class=\"how-bor2\">\r\n<div class=\"hov-img0\"><img alt=\"IMG\" src=\"/images/6qnc3l0LtnAocq3UStivLLmaItaIbSm0PgF0bvOfue3Yf.jpg\" style=\"width: 370px; height: 555px;\" /></div>\r\n</div>\r\n</div>\r\n</div>\r\n</div>\r\n</section>\r\n');
INSERT INTO `aboutus` VALUES (20, '<section class=\"bg0 p-t-75 p-b-120\">\r\n<div class=\"container\">\r\n<div class=\"row p-b-148\">\r\n<div class=\"col-md-7 col-lg-8\">\r\n<div class=\"p-t-7 p-r-85 p-r-15-lg p-r-0-md\">\r\n<h3 class=\"mtext-111 cl2 p-b-16\">Về &Aacute;o D&agrave;i Việt Nam</h3>\r\n\r\n<p>Chiếc &aacute;o d&agrave;i l&agrave; biểu tượng tuyệt đẹp của nền văn ho&aacute; d&acirc;n tộc, l&agrave; niềm tự h&agrave;o của con người Việt Nam ch&uacute;ng ta.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i ra đời từ rất l&acirc;u, n&oacute; đ&atilde; trải qua c&aacute;c thời k&igrave; cải biến để đạt đến độ thẩm mĩ như ng&agrave;y nay. Kiểu sơ khai l&agrave; &aacute;o giao l&agrave;nh, được người phụ nữ mặc phủ ngo&agrave;i yếm đ&agrave;o, v&aacute;y lụa đen, thắt lưng bu&ocirc;ng thả. Nhưng để tiện cho việc l&agrave;m ăn, việc đồng &aacute;ng, &aacute;o giao l&agrave;nh được thu gọn th&agrave;nh &aacute;o tứ th&acirc;n. Sau đ&oacute;, n&oacute; được biến th&agrave;nh &aacute;o ngũ th&acirc;n để c&aacute;c c&ocirc;, c&aacute;c b&agrave; mặc trong lễ hội m&ugrave;a xu&acirc;n.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;Đến thời ch&uacute;a Nguyễn xứ Đ&agrave;ng Trong, Vũ Vương Nguyền Ph&uacute;c Kho&aacute;t ban h&agrave;nh sắc dụ về y phục, th&igrave; chiếc &aacute;o d&agrave;i c&oacute; cổ đứng ngắn tay, cứa ống tay rộng hoặc hẹp, hai b&ecirc;n n&aacute;ch trở xuống kh&acirc;u k&iacute;n, kh&ocirc;ng xẻ t&agrave;. Từ đ&oacute;, &aacute;o d&agrave;i được cải tiến theo nhiều kiểu, ng&agrave;y một trở n&ecirc;n xinh đẹp, thướt tha.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i được may bằng nhiều chất liệu như gấm, nhung, lụa tơ tằm. Hiện nay, c&aacute;c nh&agrave; thiết kế y phục đ&atilde; s&aacute;ng tạo ra nhiều kiểu &aacute;o d&agrave;i t&acirc;n thời, cố &aacute;o c&agrave;i khuy. Khuy &aacute;o l&agrave; hạt cườm, hạt ngọc, c&uacute;c bấm. Tay &aacute;o d&agrave;i kh&ocirc;ng c&oacute; cầu vai, may liền với cổ &aacute;o giống như &aacute;o b&agrave; ba xẻ t&agrave;. Ch&iacute;nh đặc điểm n&agrave;y khiến việc sinh hoạt của ngực phụ nữ được dễ d&agrave;ng, đồng thời tạo d&aacute;ng thanh tho&aacute;t, yểu điệu, thướt tha.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&Aacute;o d&agrave;i c&oacute; hai t&agrave; ch&iacute;nh: t&agrave; &aacute;o trước v&agrave; t&agrave; &aacute;o sau. Đ&acirc;y l&agrave; phần được c&aacute;c nh&agrave; thiết kế thời trang c&aacute;ch điệu nhiều nhất. Khi th&igrave; d&ugrave;ng chất liệu vải voan, khi th&igrave; được kết cườm, ngọc &oacute;ng &aacute;nh. &Aacute;o d&agrave;i thường đi đ&ocirc;i với quần thụng. Phụ nữ Việt Nam thường mặc &aacute;o d&agrave;i xẻ t&agrave; c&ugrave;ng với quần thụng trắng bởi n&oacute; tạo n&ecirc;n vẻ đ&agrave;i c&aacute;c trang nh&atilde;. Hiện nay, &aacute;o d&agrave;i c&oacute; nhiều hoa văn kh&aacute;c nhau, mang đậm bản sắc d&acirc;n tộc C&oacute; thể l&agrave; những đo&aacute; hoa như hoa hồng, hoa lan, b&uacute;p huệ. C&oacute; thể l&agrave; hoa thuỷ ti&ecirc;n. Cũng c&oacute; thể l&agrave; nhiều loại hoa rực rỡ, đủ m&agrave;u sắc gợi l&ecirc;n d&aacute;ng y&ecirc;u kiều, đ&agrave;i c&aacute;c, qu&yacute; ph&aacute;i của c&aacute;c c&ocirc; thiếu nữ, thanh nữ.</p>\r\n</div>\r\n</div>\r\n\r\n<div class=\"col-11 col-md-5 col-lg-4 m-lr-auto\">\r\n<div class=\"how-bor1 \">\r\n<div class=\"hov-img0\"><img alt=\"IMG\" src=\"/images/XswhGYbeJ6iDFrBzOJ7CBWdYrBKIAb4q7bgE41JlvslzL.jpg\" style=\"width: 370px; height: 658px;\" /></div>\r\n</div>\r\n</div>\r\n</div>\r\n\r\n<div class=\"row\">\r\n<div class=\"order-md-2 col-md-7 col-lg-8 p-b-30\">\r\n<div class=\"p-t-7 p-l-85 p-l-15-lg p-l-0-md\">\r\n<h3 class=\"mtext-111 cl2 p-b-16\">Niềm tự h&agrave;o của &aacute;o d&agrave;i Việt Nam</h3>\r\n\r\n<p>Gi&ecirc;ng hai, bước v&agrave;o hội xu&acirc;n, tr&ecirc;n mọi nẻo đường qu&ecirc; Kinh Bắc, xứ Đ&ocirc;ng xứ Đo&agrave;i... ta bắt gặp c&aacute;c b&agrave;, c&aacute;c cụ trong bộ &aacute;o quần d&agrave;i bằng lụa n&acirc;u, vai khoa; t&uacute;i đi đến ch&ugrave;a lễ Phật. Hội ch&ugrave;a Hương, hội Gi&oacute;ng, hội ch&ugrave;a D&acirc;u, hội Lim,... từng đo&agrave;n thiếu nữ, thanh nữ thướt tha trong bộ &aacute;o d&agrave;i tuyệt đẹp. Trong c&aacute;c lề ch&agrave;o cờ, c&aacute;c ng&agrave;y lễ được tổ chức ở s&acirc;n trường, nhất l&agrave; c&aacute;c trường Trung học phổ th&ocirc;ng h&agrave;ng ngh&igrave;n nữ sinh v&agrave; c&ocirc; gi&aacute;o trong chiếc &aacute;o d&agrave;i trắng, quần trắng gợi l&ecirc;n vẻ đẹp tinh kh&ocirc;i, trinh trắng của thế hệ tuổi xu&acirc;n.</p>\r\n\r\n<p>&nbsp;</p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;Chiếc &aacute;o d&agrave;i m&atilde;i m&atilde;i l&agrave; niềm tự h&agrave;o v&agrave; h&atilde;nh diện của mỗi con người Việt Nam ch&uacute;ng ta. Vẻ đẹp chiếc &aacute;o d&agrave;i gợi l&ecirc;n vẻ đẹp văn ho&aacute; truyền thống của đất nước v&agrave; con người Việt Nam. Tr&ecirc;n con đường hội nhập, c&oacute; thể y phục của mỗi con người Việt Nam trở n&ecirc;n phong ph&uacute;, đa dạng, hiện đại, nhưng chiếc &aacute;o d&agrave;i t&acirc;n thời sẽ m&atilde;i m&atilde;i gắn b&oacute; với t&acirc;m hồn người phụ nữ Việt Nam, l&agrave;m t&ocirc;n vẻ đẹp ki&ecirc;u sa, duy&ecirc;n d&aacute;ng của c&aacute;c thiếu nữ, thanh nữ trong lễ hội.</p>\r\n\r\n<div class=\"bor16 p-l-29 p-b-9 m-t-22\">\r\n<p class=\"stext-114 cl6 p-r-40 p-b-11\">Creativity is just connecting things. When you ask creative people how they did something, they feel a little guilty because they didn&#39;t really do it, they just saw something. It seemed obvious to them after a while.</p>\r\n<span class=\"stext-111 cl8\">- Steve Job&rsquo;s </span></div>\r\n</div>\r\n</div>\r\n\r\n<div class=\"order-md-1 col-11 col-md-5 col-lg-4 m-lr-auto p-b-30\">\r\n<div class=\"how-bor2\">\r\n<div class=\"hov-img0\"><img alt=\"IMG\" src=\"/images/6qnc3l0LtnAocq3UStivLLmaItaIbSm0PgF0bvOfue3Yf.jpg\" style=\"width: 370px; height: 555px;\" /></div>\r\n</div>\r\n</div>\r\n</div>\r\n</div>\r\n</section>\r\n');

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
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of contact
-- ----------------------------
INSERT INTO `contact` VALUES (1, '342/9B Thoại Ngọc Hầu', '0706076517', 'tanks.museum98@gmail.com', 'https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1878.2274028447575!2d105.861337459616!3d20.825923456734177!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135b3f738a5bdfb%3A0x5787ab5b17f91b5b!2zxJDDrG5oIEPhu5UgQ2jhuqV0LCBExaluZyBUaeG6v24sIFRoxrDhu51uZyBUw61uLCBIw6AgTuG7mWksIFZp4buHdCBOYW0!5e1!3m2!1svi!2s!4v1589917084738!5m2!1svi!2s');

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `order_date` datetime(0) NULL DEFAULT NULL,
  `comment` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for product_color
-- ----------------------------
DROP TABLE IF EXISTS `product_color`;
CREATE TABLE `product_color`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `removed_flag` bit(1) NULL DEFAULT NULL,
  `created_date` datetime(0) NULL DEFAULT NULL,
  `updated_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_color
-- ----------------------------
INSERT INTO `product_color` VALUES (1, 'Trắng', b'0', NULL, NULL);
INSERT INTO `product_color` VALUES (2, 'Đen', b'0', NULL, NULL);
INSERT INTO `product_color` VALUES (3, 'Nâu', b'0', NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

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
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_size
-- ----------------------------
INSERT INTO `product_size` VALUES (1, 'S', b'0', NULL, NULL);
INSERT INTO `product_size` VALUES (2, 'M', b'0', NULL, NULL);
INSERT INTO `product_size` VALUES (3, 'L', b'0', NULL, NULL);
INSERT INTO `product_size` VALUES (4, 'XL', b'0', NULL, NULL);
INSERT INTO `product_size` VALUES (5, 'XXL', b'0', NULL, NULL);

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
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

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
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `category_id` int(11) NULL DEFAULT NULL,
  `removed_flag` bit(1) NULL DEFAULT NULL,
  `created_date` datetime(0) NULL DEFAULT NULL,
  `updated_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of products
-- ----------------------------
INSERT INTO `products` VALUES (1, 'Áo dài', 'ok chưa.. được chưa ? :)', 1, b'0', NULL, NULL);
INSERT INTO `products` VALUES (2, 'Tranh hoa anh đào', 'ổn áp chưa :))', 2, b'0', NULL, NULL);
INSERT INTO `products` VALUES (3, 'Tranh hoa anh đào', 'ổn áp chưa :)) Áo Dài', 1, b'0', NULL, NULL);
INSERT INTO `products` VALUES (4, 'Tranh hoa anh đào', 'ổn áp chưa :)) Áo Dài', 2, b'0', NULL, NULL);

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
  `age` int(255) NULL DEFAULT NULL,
  `image` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `role_id` int(11) NULL DEFAULT NULL,
  `created_date` datetime(0) NULL DEFAULT NULL,
  `updated_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'admin', 'admin', 'Xuân Anh', '342/9B Thoại Ngọc Hầu', b'1', 22, NULL, 2, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
