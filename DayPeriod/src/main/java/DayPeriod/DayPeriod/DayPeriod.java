package DayPeriod.DayPeriod;

import java.util.Date;

class DayPeriod
{
//    public function get_period( $t ) {
//        var $dt = date( "Y-m-d H:i
//:s
//        ", $t );
//        var $h = date( "H", $t );
//        var $period = "Night"; // night should be from 00:00:00 to 05:59:59
//        if ( $h >= 6 && $h < 12 ) {
//            $period = "Morning";
//        } elseif( $h >= 12 && $h < 18 ) {
//            $period = "Noon";
//        } else {
//            $period = "Evening";  // evening should be from 18:00:00 to 23:59:59
//        }
//        return $period;
//    }
    public String get_period( Date time){
        int H=time.getHours();
        String period="Night";
        if(H>=6&&H<12) period="Morning";
        else if (H >= 12 && H< 18)
        {
            period="Noon";
        } else {
            period = "Evening";
        }
        return period;
    }
}
