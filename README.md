# Hệ Thống Đặt Sân Bóng Đá (Backend)

Một ứng dụng Spring Boot để quản lý việc đặt sân, cho thuê sân bóng dá trực tuyến, dễ dàng.

## Tính Năng
- Đăng ký và đăng nhập người dùng (dựa trên JWT)
- Với người dùng(Người đặt sân):
  + Đặt sân bóng đá
  + Tìm kiếm sân
  + Thêm sân yêu thích
  + Xem lịch sử đặt sân
  + Quản lý thông báo
  + Thay đổi thông tin cá nhân
- Với chủ sân(Người cho thuê sân):
  + Quản lý sân cho thuê(Thêm, sửa, xóa)
  + Xem lịch sử các yêu cầu đặt sân từ người dùng
  + Quản lý thông báo
  + Thay đổi thông tin cá nhân

## Công Nghệ Sử Dụng
- Java 17 trở lên
- Spring Boot
- Spring Security (JWT)
- Maven
- JPA/Hibernate
- PostgreSQL (hoặc hệ quản trị cơ sở dữ liệu khác)

### Yêu Cầu Cài Đặt
- Java 17 hoặc cao hơn
- Maven
- PostgreSQL (hoặc cập nhật datasource trong `application.properties`)

### Cài Đặt
1. **Clone repository:**
   ```bash
   git clone https://github.com/vinhdangtapcode/FootballBooking.git
   cd football-booking
   ```
2. **Cấu hình cơ sở dữ liệu:**
   - Cập nhật `src/main/resources/application.properties` với thông tin DB và JWT secret của bạn.
3. **Build project:**
   ```bash
   mvn clean install
   ```
4. **Chạy ứng dụng:**
   ```bash
   mvn spring-boot:run
   ```

### Các API chính
- Xác thực: `/api/auth/login`, `/api/auth/register`
- Đặt sân: `/api/bookings`
- Quản lý sân: `/api/fields`
- Yêu thích: `/api/favorites`
- Đánh giá: `/api/ratings`
(Xem các lớp controller để biết chi tiết đầy đủ.)

## Cấu Hình
- `application.properties` chứa tất cả các thiết lập riêng cho môi trường.
