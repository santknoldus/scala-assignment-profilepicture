# Profile Picture
**Problem Statement:**

We want to change our profile picture on Facediary. Now Facediary has
some restriction over the dimension of picture that we can upload.



Minimum dimension of the picture can be L x L, where L is the length of the side of square. Now we have photos of various dimensions. Dimension of a photo is denoted as W x H where W - width of the photo and H - height of the photo.


When any photo is uploaded following events may occur:

    If any of the width or height is less than L, user is prompted to upload another one. Print  in this case.
    If width and height, both are large enough and if the photo is already square then it is accepted. Print  in this case.
    Else user is prompted to crop it. Print  in this case.

Given L, W and H as input, print appropriate text as output.

**CODE:**
```
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
```

**Output:**

![Screenshot from 2023-03-09 17-34-08](https://user-images.githubusercontent.com/125345690/224018013-607b2dda-50fb-42a5-b97a-c3d06c9c44c0.png)
