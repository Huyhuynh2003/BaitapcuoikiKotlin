<?php
// Kết nối tới cơ sở dữ liệu
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "dacs3";

$conn = new mysqli($servername, $username, $password, $dbname);

// Kiểm tra kết nối
if ($conn->connect_error) {
    die("Kết nối tới cơ sở dữ liệu thất bại: " . $conn->connect_error);
}

// Lấy dữ liệu từ tham số truyền vào (comment)
$comment = $_GET['comment'];

// Chuẩn bị câu truy vấn INSERT
$sql = "INSERT INTO comment (cmt) VALUES ('$comment')";

if ($conn->query($sql) === TRUE) {
    echo "Bình luận đã được thêm thành công";
} else {
    echo "Lỗi: " . $sql . "<br>" . $conn->error;
}

// Đóng kết nối
$conn->close();
?>
