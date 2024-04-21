package com.core.Day1;

import java.util.Optional;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        // Sample Input : 07:05:45PM
        System.out.println("Input ::"+time);

        convertTime(time);
    }

    private static void convertTime(String time) {
        String[] str = time.split(":");
        int hour = Integer.parseInt(str[0]);
        String min = str[1];
        String secPeriod = str[2];
        String sec = str[2].substring(0,secPeriod.length()-2);
        String period = str[2].substring(secPeriod.length()-2, secPeriod.length());

        System.out.println("Hour : "+hour+" min = "+min+" sec= "+sec+" period="+period);

        String new24HrStr = String.valueOf(Optional.empty());

        if((0 <= hour && hour <12) && (period.equalsIgnoreCase("AM"))){
            new24HrStr = String.format("%02d", hour)+":"+min+":"+sec;
        }else if((0 <= hour && hour <12) && (period.equalsIgnoreCase("PM"))){
            new24HrStr = (hour+12)+":"+min+":"+sec;
        }else if((hour == 12) && (period.equalsIgnoreCase("AM"))){
            new24HrStr = "00:"+min+":"+sec;
        }else if((hour == 12) && (period.equalsIgnoreCase("PM"))){
            new24HrStr = hour+":"+min+":"+sec;
        }

        System.out.println("newTime24Hr ::"+new24HrStr);


    }
}
