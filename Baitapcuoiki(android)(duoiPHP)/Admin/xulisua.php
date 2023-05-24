<?php
//Kết nối sql
$connect= mysqli_connect("localhost", "root", "","dacs3");

if (isset($_POST["update_product"])) {
   $sothutu =$_POST["sothutu"];
   $name=$_POST["tieu_de"];
   $doc=$_POST["motasp"];
}
$sql = "UPDATE newspaper SET tieu_de = '$name', doc='$doc' WHERE idnewpaper = '$sothutu'";
if (mysqli_query($connect,$sql)) {
   echo '<script language="javascript">alert("Sửa bài báo thành công"); window.location="sanpham.php";</script>';
}
else {
   $result = "Lỗi" . mysqli_error($connect);
}
?>