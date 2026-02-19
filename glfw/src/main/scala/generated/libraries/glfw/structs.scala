package opengl.bindings.glfw

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * Custom heap memory allocator.
*/
opaque type GLFWallocator = CStruct4[GLFWallocatefun, GLFWreallocatefun, GLFWdeallocatefun, Ptr[Byte]]

object GLFWallocator:
  given _tag: Tag[GLFWallocator] = Tag.materializeCStruct4Tag[GLFWallocatefun, GLFWreallocatefun, GLFWdeallocatefun, Ptr[Byte]]
  
  // Allocates GLFWallocator on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GLFWallocator] = scala.scalanative.unsafe.alloc[GLFWallocator](1)
  def apply(allocate : GLFWallocatefun, reallocate : GLFWreallocatefun, deallocate : GLFWdeallocatefun, user : Ptr[Byte])(using Zone): Ptr[GLFWallocator] =
    val ____ptr = apply()
    (!____ptr).allocate = allocate
    (!____ptr).reallocate = reallocate
    (!____ptr).deallocate = deallocate
    (!____ptr).user = user
    ____ptr
  
  extension (struct: GLFWallocator)
    def allocate : GLFWallocatefun = struct._1
    def allocate_=(value: GLFWallocatefun): Unit = !struct.at1 = value
    def reallocate : GLFWreallocatefun = struct._2
    def reallocate_=(value: GLFWreallocatefun): Unit = !struct.at2 = value
    def deallocate : GLFWdeallocatefun = struct._3
    def deallocate_=(value: GLFWdeallocatefun): Unit = !struct.at3 = value
    def user : Ptr[Byte] = struct._4
    def user_=(value: Ptr[Byte]): Unit = !struct.at4 = value
  

opaque type GLFWcursor = CStruct0

object GLFWcursor:
  given _tag: Tag[GLFWcursor] = Tag.materializeCStruct0Tag
  

/**
 * Gamepad input state
*/
opaque type GLFWgamepadstate = CStruct2[CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._5]], CArray[Float, Nat._6]]

object GLFWgamepadstate:
  given _tag: Tag[GLFWgamepadstate] = Tag.materializeCStruct2Tag[CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._5]], CArray[Float, Nat._6]]
  
  // Allocates GLFWgamepadstate on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GLFWgamepadstate] = scala.scalanative.unsafe.alloc[GLFWgamepadstate](1)
  def apply(buttons : CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._5]], axes : CArray[Float, Nat._6])(using Zone): Ptr[GLFWgamepadstate] =
    val ____ptr = apply()
    (!____ptr).buttons = buttons
    (!____ptr).axes = axes
    ____ptr
  
  extension (struct: GLFWgamepadstate)
    def buttons : CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._5]] = struct._1
    def buttons_=(value: CArray[CUnsignedChar, Nat.Digit2[Nat._1, Nat._5]]): Unit = !struct.at1 = value
    def axes : CArray[Float, Nat._6] = struct._2
    def axes_=(value: CArray[Float, Nat._6]): Unit = !struct.at2 = value
  

/**
 * Gamma ramp.
*/
opaque type GLFWgammaramp = CStruct4[Ptr[CUnsignedShort], Ptr[CUnsignedShort], Ptr[CUnsignedShort], CUnsignedInt]

object GLFWgammaramp:
  given _tag: Tag[GLFWgammaramp] = Tag.materializeCStruct4Tag[Ptr[CUnsignedShort], Ptr[CUnsignedShort], Ptr[CUnsignedShort], CUnsignedInt]
  
  // Allocates GLFWgammaramp on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GLFWgammaramp] = scala.scalanative.unsafe.alloc[GLFWgammaramp](1)
  def apply(red : Ptr[CUnsignedShort], green : Ptr[CUnsignedShort], blue : Ptr[CUnsignedShort], size : CUnsignedInt)(using Zone): Ptr[GLFWgammaramp] =
    val ____ptr = apply()
    (!____ptr).red = red
    (!____ptr).green = green
    (!____ptr).blue = blue
    (!____ptr).size = size
    ____ptr
  
  extension (struct: GLFWgammaramp)
    def red : Ptr[CUnsignedShort] = struct._1
    def red_=(value: Ptr[CUnsignedShort]): Unit = !struct.at1 = value
    def green : Ptr[CUnsignedShort] = struct._2
    def green_=(value: Ptr[CUnsignedShort]): Unit = !struct.at2 = value
    def blue : Ptr[CUnsignedShort] = struct._3
    def blue_=(value: Ptr[CUnsignedShort]): Unit = !struct.at3 = value
    def size : CUnsignedInt = struct._4
    def size_=(value: CUnsignedInt): Unit = !struct.at4 = value
  

/**
 * Image data.
*/
opaque type GLFWimage = CStruct3[CInt, CInt, Ptr[CUnsignedChar]]

object GLFWimage:
  given _tag: Tag[GLFWimage] = Tag.materializeCStruct3Tag[CInt, CInt, Ptr[CUnsignedChar]]
  
  // Allocates GLFWimage on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GLFWimage] = scala.scalanative.unsafe.alloc[GLFWimage](1)
  def apply(width : CInt, height : CInt, pixels : Ptr[CUnsignedChar])(using Zone): Ptr[GLFWimage] =
    val ____ptr = apply()
    (!____ptr).width = width
    (!____ptr).height = height
    (!____ptr).pixels = pixels
    ____ptr
  
  extension (struct: GLFWimage)
    def width : CInt = struct._1
    def width_=(value: CInt): Unit = !struct.at1 = value
    def height : CInt = struct._2
    def height_=(value: CInt): Unit = !struct.at2 = value
    def pixels : Ptr[CUnsignedChar] = struct._3
    def pixels_=(value: Ptr[CUnsignedChar]): Unit = !struct.at3 = value
  

opaque type GLFWmonitor = CStruct0

object GLFWmonitor:
  given _tag: Tag[GLFWmonitor] = Tag.materializeCStruct0Tag
  

/**
 * Video mode type.
*/
opaque type GLFWvidmode = CStruct6[CInt, CInt, CInt, CInt, CInt, CInt]

object GLFWvidmode:
  given _tag: Tag[GLFWvidmode] = Tag.materializeCStruct6Tag[CInt, CInt, CInt, CInt, CInt, CInt]
  
  // Allocates GLFWvidmode on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GLFWvidmode] = scala.scalanative.unsafe.alloc[GLFWvidmode](1)
  def apply(width : CInt, height : CInt, redBits : CInt, greenBits : CInt, blueBits : CInt, refreshRate : CInt)(using Zone): Ptr[GLFWvidmode] =
    val ____ptr = apply()
    (!____ptr).width = width
    (!____ptr).height = height
    (!____ptr).redBits = redBits
    (!____ptr).greenBits = greenBits
    (!____ptr).blueBits = blueBits
    (!____ptr).refreshRate = refreshRate
    ____ptr
  
  extension (struct: GLFWvidmode)
    def width : CInt = struct._1
    def width_=(value: CInt): Unit = !struct.at1 = value
    def height : CInt = struct._2
    def height_=(value: CInt): Unit = !struct.at2 = value
    def redBits : CInt = struct._3
    def redBits_=(value: CInt): Unit = !struct.at3 = value
    def greenBits : CInt = struct._4
    def greenBits_=(value: CInt): Unit = !struct.at4 = value
    def blueBits : CInt = struct._5
    def blueBits_=(value: CInt): Unit = !struct.at5 = value
    def refreshRate : CInt = struct._6
    def refreshRate_=(value: CInt): Unit = !struct.at6 = value
  

opaque type GLFWwindow = CStruct0

object GLFWwindow:
  given _tag: Tag[GLFWwindow] = Tag.materializeCStruct0Tag