package com.knoldus.profilepicture


object ProfilePicture {

  def main(args: Array[String]): Unit = {
    val length = scala.io.StdIn.readInt()
    val width = scala.io.StdIn.readInt()
    val height = scala.io.StdIn.readInt()

    try {
      val message: String = dimensionIdentifier(length, width, height)
      println(message)
    } catch {
      case exception: Exception =>
        println("Error occurred: " + exception.getMessage)
    }
  }

  def dimensionIdentifier(length: Int, width: Int, height: Int): String = {
    if (width >= length && height >= length && width == height) {
      "ACCEPTED"
    } else {
      if (width < length || height < length) {
        "UPLOAD ANOTHER"
      } else {
        "CROP IT"
      }
    }
  }
}
