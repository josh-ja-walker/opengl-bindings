package glad

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

@extern def gladLoadGL(load : GLADloadfunc): CInt = extern

@extern def gladLoadGLUserPtr(load : GLADuserptrloadfunc, userptr : Ptr[Byte]): CInt = extern

@extern def gladLoaderLoadGL(): CInt = extern

@extern def gladLoaderUnloadGL(): Unit = extern