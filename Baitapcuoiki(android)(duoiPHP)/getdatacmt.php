<?php
   $connect = mysqli_connect("localhost", "root", "", "dacs3");
   mysqli_query($connect, "SET NAMES 'utf8'");

   $query = "SELECT * FROM comment";

   $data = mysqli_query($connect, $query);

   $arrayCourse = array();

   while ($row = mysqli_fetch_assoc($data)){
      if (isset($row['cmt'])) {
         $course = array(
            'comment' => $row['cmt']
         );
         array_push($arrayCourse, $course);
      }
   }

   echo json_encode($arrayCourse);
