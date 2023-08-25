# DayPeriod

viết Unit Test cho hàm sau (hoặc hàm tương đương trong ngôn ngữ bạn yêu thích). Chú ý : trong đoạn code sau kỳ vọng 4 buổi trong ngày bao gồm : sáng từ 6h đến 12h, chiều từ 12h đến 18h, tối từ 18h đến 23h59, khuya từ 0h đến 6h.

<?php
// assume PHP version >= 7.3
class DayPeriods
{
    public function get_period( $t ) {
   	 var $dt = date( "Y-m-d H:i:s", $t );
   	 var $h = date( "H", $t );
   	 var $period = "Night"; // night should be from 00:00:00 to 05:59:59
   	 if ( $h >= 6 && $h < 12 ) {
   		 $period = "Morning";
   	 } elseif( $h >= 12 && $h < 18 ) {
   		 $period = "Noon";
   	 } else {
   		 $period = "Evening";  // evening should be from 18:00:00 to 23:59:59
   	 }
   	 return $period;
    }
}

// $p = DayPeriod::get_period( time( ) + 2 * 60 );

?>
