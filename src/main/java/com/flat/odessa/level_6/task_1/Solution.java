package com.flat.odessa.level_6.task_1;

public class Solution {

  public static boolean isAlt(String word) {
    return word.matches("[^aeiou]?([aeiou][^aeiou])*[aeiou]?");
  }
  //---Another solution--//

//  private static final char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
//
//  public static boolean isAlt(String word) {
//    char[] chars = word.toLowerCase().toCharArray();
//    boolean vowel = isVowel(chars[0]) ? true : false;
//    for (int i = 1; i < chars.length; i++) {
//      if ((vowel && isVowel(chars[i])) || !vowel && !isVowel(chars[i])) {
//        return false;
//      }
//      vowel = !vowel;
//    }
//    return true;
//  }
//
//  private static boolean isVowel(char aChar) {
//    for (char vowel : vowels) {
//      if (vowel == aChar) {
//        return true;
//      }
//    }
//    return false;
//  }
}