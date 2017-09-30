package com.flat.odessa.level_5.task_1;

public class HumanReadableTime {

  public static String makeReadable(int seconds) {
    if (seconds > 359999) {
      return "99:59:59";
    }
    return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);

    //--another solution--//

//    int h = seconds / 3600;
//    seconds = seconds - h * 3600;
//    int m = seconds / 60;
//    int s = seconds - m * 60;
//
//    return MessageFormat.format("{0}:{1}:{2}",
//        h > 9 ? h : "0" + h,
//        m > 9 ? m : "0" + m,
//        s > 9 ? s : "0" + s);
  }
}
