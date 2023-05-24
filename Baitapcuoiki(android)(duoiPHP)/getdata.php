<?php
   $connect = mysqli_connect("localhost", "root", "", "dacs3");
   mysqli_query($connect, "SET NAMES 'utf8'");

   $query = "SELECT * FROM newspaper";

   $data = mysqli_query($connect, $query);

   $arrayCourse = array();

   while ($row = mysqli_fetch_assoc($data)){
      $course = array(
         'idnewpaper' => $row['idnewpaper'],
         'TieuDe' => $row['tieu_de'],
      );
      array_push($arrayCourse, $course);
   }

   echo json_encode($arrayCourse);
?>
