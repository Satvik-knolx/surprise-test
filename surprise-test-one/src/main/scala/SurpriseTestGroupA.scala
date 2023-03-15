package com.knoldus

object SurpriseTestGroupA extends App {
  def replaceInString(stringToBeReplaced: String,charToReplace: Char, charToBeReplaced: Char): Unit = {

    for (index <- 0 until stringToBeReplaced.length) {
      if (stringToBeReplaced.charAt(index) == charToReplace)
        print(charToBeReplaced)
      else
        print(stringToBeReplaced.charAt(index))
    }
  }
  replaceInString("Hello", 'e' , 'E')

}
//*find a specific character in a string and replace it with another character
// */