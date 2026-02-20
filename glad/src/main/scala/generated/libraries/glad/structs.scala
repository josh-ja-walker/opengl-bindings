package opengl.bindings.glad

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type __GLsync = CStruct0

object __GLsync:
  given _tag: Tag[__GLsync] = Tag.materializeCStruct0Tag
  

opaque type _cl_context = CStruct0

object _cl_context:
  given _tag: Tag[_cl_context] = Tag.materializeCStruct0Tag
  

opaque type _cl_event = CStruct0

object _cl_event:
  given _tag: Tag[_cl_event] = Tag.materializeCStruct0Tag