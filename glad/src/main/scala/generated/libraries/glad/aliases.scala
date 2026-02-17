package glad

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type GLADapiproc = CFuncPtr0[Unit]
object GLADapiproc:
  given _tag: Tag[GLADapiproc] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLADapiproc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): GLADapiproc = o
  extension (v: GLADapiproc)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type GLADloadfunc = CFuncPtr1[CString, GLADapiproc]
object GLADloadfunc:
  given _tag: Tag[GLADloadfunc] = Tag.materializeCFuncPtr1[CString, GLADapiproc]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLADloadfunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[CString, GLADapiproc]): GLADloadfunc = o
  extension (v: GLADloadfunc)
    inline def value: CFuncPtr1[CString, GLADapiproc] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type GLADpostcallback = CFuncPtr4[Ptr[Byte], CString, GLADapiproc, CInt, Unit]
object GLADpostcallback:
  given _tag: Tag[GLADpostcallback] = Tag.materializeCFuncPtr4[Ptr[Byte], CString, GLADapiproc, CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLADpostcallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[Byte], CString, GLADapiproc, CInt, Unit]): GLADpostcallback = o
  extension (v: GLADpostcallback)
    inline def value: CFuncPtr4[Ptr[Byte], CString, GLADapiproc, CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type GLADprecallback = CFuncPtr3[CString, GLADapiproc, CInt, Unit]
object GLADprecallback:
  given _tag: Tag[GLADprecallback] = Tag.materializeCFuncPtr3[CString, GLADapiproc, CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLADprecallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[CString, GLADapiproc, CInt, Unit]): GLADprecallback = o
  extension (v: GLADprecallback)
    inline def value: CFuncPtr3[CString, GLADapiproc, CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type GLADuserptrloadfunc = CFuncPtr2[Ptr[Byte], CString, GLADapiproc]
object GLADuserptrloadfunc:
  given _tag: Tag[GLADuserptrloadfunc] = Tag.materializeCFuncPtr2[Ptr[Byte], CString, GLADapiproc]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLADuserptrloadfunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[Byte], CString, GLADapiproc]): GLADuserptrloadfunc = o
  extension (v: GLADuserptrloadfunc)
    inline def value: CFuncPtr2[Ptr[Byte], CString, GLADapiproc] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type GLDEBUGPROC = CFuncPtr7[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit]
object GLDEBUGPROC:
  given _tag: Tag[GLDEBUGPROC] = Tag.materializeCFuncPtr7[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLDEBUGPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit]): GLDEBUGPROC = o
  extension (v: GLDEBUGPROC)
    inline def value: CFuncPtr7[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type GLDEBUGPROCAMD = CFuncPtr6[GLuint, GLenum, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit]
object GLDEBUGPROCAMD:
  given _tag: Tag[GLDEBUGPROCAMD] = Tag.materializeCFuncPtr6[GLuint, GLenum, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLDEBUGPROCAMD = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLenum, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit]): GLDEBUGPROCAMD = o
  extension (v: GLDEBUGPROCAMD)
    inline def value: CFuncPtr6[GLuint, GLenum, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type GLDEBUGPROCARB = CFuncPtr7[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit]
object GLDEBUGPROCARB:
  given _tag: Tag[GLDEBUGPROCARB] = Tag.materializeCFuncPtr7[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLDEBUGPROCARB = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit]): GLDEBUGPROCARB = o
  extension (v: GLDEBUGPROCARB)
    inline def value: CFuncPtr7[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type GLDEBUGPROCKHR = CFuncPtr7[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit]
object GLDEBUGPROCKHR:
  given _tag: Tag[GLDEBUGPROCKHR] = Tag.materializeCFuncPtr7[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLDEBUGPROCKHR = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit]): GLDEBUGPROCKHR = o
  extension (v: GLDEBUGPROCKHR)
    inline def value: CFuncPtr7[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type GLVULKANPROCNV = CFuncPtr0[Unit]
object GLVULKANPROCNV:
  given _tag: Tag[GLVULKANPROCNV] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLVULKANPROCNV = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): GLVULKANPROCNV = o
  extension (v: GLVULKANPROCNV)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type GLbitfield = CUnsignedInt
object GLbitfield:
  given _tag: Tag[GLbitfield] = Tag.UInt
  inline def apply(inline o: CUnsignedInt): GLbitfield = o
  extension (v: GLbitfield)
    inline def value: CUnsignedInt = v

type GLboolean = CUnsignedChar
object GLboolean:
  given _tag: Tag[GLboolean] = Tag.UByte
  inline def apply(inline o: CUnsignedChar): GLboolean = o
  extension (v: GLboolean)
    inline def value: CUnsignedChar = v

type GLbyte = khronos_int8_t
object GLbyte:
  given _tag: Tag[GLbyte] = khronos_int8_t._tag
  inline def apply(inline o: khronos_int8_t): GLbyte = o
  extension (v: GLbyte)
    inline def value: khronos_int8_t = v

type GLchar = CChar
object GLchar:
  given _tag: Tag[GLchar] = Tag.Byte
  inline def apply(inline o: CChar): GLchar = o
  extension (v: GLchar)
    inline def value: CChar = v

type GLcharARB = CChar
object GLcharARB:
  given _tag: Tag[GLcharARB] = Tag.Byte
  inline def apply(inline o: CChar): GLcharARB = o
  extension (v: GLcharARB)
    inline def value: CChar = v

type GLclampd = Double
object GLclampd:
  given _tag: Tag[GLclampd] = Tag.Double
  inline def apply(inline o: Double): GLclampd = o
  extension (v: GLclampd)
    inline def value: Double = v

type GLclampf = khronos_float_t
object GLclampf:
  given _tag: Tag[GLclampf] = khronos_float_t._tag
  inline def apply(inline o: khronos_float_t): GLclampf = o
  extension (v: GLclampf)
    inline def value: khronos_float_t = v

type GLclampx = khronos_int32_t
object GLclampx:
  given _tag: Tag[GLclampx] = khronos_int32_t._tag
  inline def apply(inline o: khronos_int32_t): GLclampx = o
  extension (v: GLclampx)
    inline def value: khronos_int32_t = v

type GLdouble = Double
object GLdouble:
  given _tag: Tag[GLdouble] = Tag.Double
  inline def apply(inline o: Double): GLdouble = o
  extension (v: GLdouble)
    inline def value: Double = v

type GLeglClientBufferEXT = Ptr[Byte]
object GLeglClientBufferEXT:
  given _tag: Tag[GLeglClientBufferEXT] = Tag.Ptr(Tag.Byte)
  inline def apply(inline o: Ptr[Byte]): GLeglClientBufferEXT = o
  extension (v: GLeglClientBufferEXT)
    inline def value: Ptr[Byte] = v

type GLeglImageOES = Ptr[Byte]
object GLeglImageOES:
  given _tag: Tag[GLeglImageOES] = Tag.Ptr(Tag.Byte)
  inline def apply(inline o: Ptr[Byte]): GLeglImageOES = o
  extension (v: GLeglImageOES)
    inline def value: Ptr[Byte] = v

type GLenum = CUnsignedInt
object GLenum:
  given _tag: Tag[GLenum] = Tag.UInt
  inline def apply(inline o: CUnsignedInt): GLenum = o
  extension (v: GLenum)
    inline def value: CUnsignedInt = v

type GLfixed = khronos_int32_t
object GLfixed:
  given _tag: Tag[GLfixed] = khronos_int32_t._tag
  inline def apply(inline o: khronos_int32_t): GLfixed = o
  extension (v: GLfixed)
    inline def value: khronos_int32_t = v

type GLfloat = khronos_float_t
object GLfloat:
  given _tag: Tag[GLfloat] = khronos_float_t._tag
  inline def apply(inline o: khronos_float_t): GLfloat = o
  extension (v: GLfloat)
    inline def value: khronos_float_t = v

type GLhalf = khronos_uint16_t
object GLhalf:
  given _tag: Tag[GLhalf] = khronos_uint16_t._tag
  inline def apply(inline o: khronos_uint16_t): GLhalf = o
  extension (v: GLhalf)
    inline def value: khronos_uint16_t = v

type GLhalfARB = khronos_uint16_t
object GLhalfARB:
  given _tag: Tag[GLhalfARB] = khronos_uint16_t._tag
  inline def apply(inline o: khronos_uint16_t): GLhalfARB = o
  extension (v: GLhalfARB)
    inline def value: khronos_uint16_t = v

type GLhalfNV = CUnsignedShort
object GLhalfNV:
  given _tag: Tag[GLhalfNV] = Tag.UShort
  inline def apply(inline o: CUnsignedShort): GLhalfNV = o
  extension (v: GLhalfNV)
    inline def value: CUnsignedShort = v

type GLhandleARB = CUnsignedInt
object GLhandleARB:
  given _tag: Tag[GLhandleARB] = Tag.UInt
  inline def apply(inline o: CUnsignedInt): GLhandleARB = o
  extension (v: GLhandleARB)
    inline def value: CUnsignedInt = v

type GLint = CInt
object GLint:
  given _tag: Tag[GLint] = Tag.Int
  inline def apply(inline o: CInt): GLint = o
  extension (v: GLint)
    inline def value: CInt = v

type GLint64 = khronos_int64_t
object GLint64:
  given _tag: Tag[GLint64] = khronos_int64_t._tag
  inline def apply(inline o: khronos_int64_t): GLint64 = o
  extension (v: GLint64)
    inline def value: khronos_int64_t = v

type GLint64EXT = khronos_int64_t
object GLint64EXT:
  given _tag: Tag[GLint64EXT] = khronos_int64_t._tag
  inline def apply(inline o: khronos_int64_t): GLint64EXT = o
  extension (v: GLint64EXT)
    inline def value: khronos_int64_t = v

type GLintptr = khronos_intptr_t
object GLintptr:
  given _tag: Tag[GLintptr] = khronos_intptr_t._tag
  inline def apply(inline o: khronos_intptr_t): GLintptr = o
  extension (v: GLintptr)
    inline def value: khronos_intptr_t = v

type GLintptrARB = khronos_intptr_t
object GLintptrARB:
  given _tag: Tag[GLintptrARB] = khronos_intptr_t._tag
  inline def apply(inline o: khronos_intptr_t): GLintptrARB = o
  extension (v: GLintptrARB)
    inline def value: khronos_intptr_t = v

type GLshort = khronos_int16_t
object GLshort:
  given _tag: Tag[GLshort] = khronos_int16_t._tag
  inline def apply(inline o: khronos_int16_t): GLshort = o
  extension (v: GLshort)
    inline def value: khronos_int16_t = v

type GLsizei = CInt
object GLsizei:
  given _tag: Tag[GLsizei] = Tag.Int
  inline def apply(inline o: CInt): GLsizei = o
  extension (v: GLsizei)
    inline def value: CInt = v

type GLsizeiptr = khronos_ssize_t
object GLsizeiptr:
  given _tag: Tag[GLsizeiptr] = khronos_ssize_t._tag
  inline def apply(inline o: khronos_ssize_t): GLsizeiptr = o
  extension (v: GLsizeiptr)
    inline def value: khronos_ssize_t = v

type GLsizeiptrARB = khronos_ssize_t
object GLsizeiptrARB:
  given _tag: Tag[GLsizeiptrARB] = khronos_ssize_t._tag
  inline def apply(inline o: khronos_ssize_t): GLsizeiptrARB = o
  extension (v: GLsizeiptrARB)
    inline def value: khronos_ssize_t = v

type GLsync = Ptr[__GLsync]
object GLsync:
  given _tag: Tag[GLsync] = Tag.Ptr[__GLsync](__GLsync._tag)
  inline def apply(inline o: Ptr[__GLsync]): GLsync = o
  extension (v: GLsync)
    inline def value: Ptr[__GLsync] = v

type GLubyte = khronos_uint8_t
object GLubyte:
  given _tag: Tag[GLubyte] = khronos_uint8_t._tag
  inline def apply(inline o: khronos_uint8_t): GLubyte = o
  extension (v: GLubyte)
    inline def value: khronos_uint8_t = v

type GLuint = CUnsignedInt
object GLuint:
  given _tag: Tag[GLuint] = Tag.UInt
  inline def apply(inline o: CUnsignedInt): GLuint = o
  extension (v: GLuint)
    inline def value: CUnsignedInt = v

type GLuint64 = khronos_uint64_t
object GLuint64:
  given _tag: Tag[GLuint64] = khronos_uint64_t._tag
  inline def apply(inline o: khronos_uint64_t): GLuint64 = o
  extension (v: GLuint64)
    inline def value: khronos_uint64_t = v

type GLuint64EXT = khronos_uint64_t
object GLuint64EXT:
  given _tag: Tag[GLuint64EXT] = khronos_uint64_t._tag
  inline def apply(inline o: khronos_uint64_t): GLuint64EXT = o
  extension (v: GLuint64EXT)
    inline def value: khronos_uint64_t = v

type GLushort = khronos_uint16_t
object GLushort:
  given _tag: Tag[GLushort] = khronos_uint16_t._tag
  inline def apply(inline o: khronos_uint16_t): GLushort = o
  extension (v: GLushort)
    inline def value: khronos_uint16_t = v

type GLvdpauSurfaceNV = GLintptr
object GLvdpauSurfaceNV:
  given _tag: Tag[GLvdpauSurfaceNV] = GLintptr._tag
  inline def apply(inline o: GLintptr): GLvdpauSurfaceNV = o
  extension (v: GLvdpauSurfaceNV)
    inline def value: GLintptr = v

type GLvoid = Unit
object GLvoid:
  given _tag: Tag[GLvoid] = Tag.Unit
  inline def apply(inline o: Unit): GLvoid = o
  extension (v: GLvoid)
    inline def value: Unit = v

type PFNGLACCUMPROC = CFuncPtr2[GLenum, GLfloat, Unit]
object PFNGLACCUMPROC:
  given _tag: Tag[PFNGLACCUMPROC] = Tag.materializeCFuncPtr2[GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLACCUMPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLfloat, Unit]): PFNGLACCUMPROC = o
  extension (v: PFNGLACCUMPROC)
    inline def value: CFuncPtr2[GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLACTIVESHADERPROGRAMPROC = CFuncPtr2[GLuint, GLuint, Unit]
object PFNGLACTIVESHADERPROGRAMPROC:
  given _tag: Tag[PFNGLACTIVESHADERPROGRAMPROC] = Tag.materializeCFuncPtr2[GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLACTIVESHADERPROGRAMPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLuint, Unit]): PFNGLACTIVESHADERPROGRAMPROC = o
  extension (v: PFNGLACTIVESHADERPROGRAMPROC)
    inline def value: CFuncPtr2[GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLACTIVETEXTUREPROC = CFuncPtr1[GLenum, Unit]
object PFNGLACTIVETEXTUREPROC:
  given _tag: Tag[PFNGLACTIVETEXTUREPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLACTIVETEXTUREPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLACTIVETEXTUREPROC = o
  extension (v: PFNGLACTIVETEXTUREPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLALPHAFUNCPROC = CFuncPtr2[GLenum, GLfloat, Unit]
object PFNGLALPHAFUNCPROC:
  given _tag: Tag[PFNGLALPHAFUNCPROC] = Tag.materializeCFuncPtr2[GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLALPHAFUNCPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLfloat, Unit]): PFNGLALPHAFUNCPROC = o
  extension (v: PFNGLALPHAFUNCPROC)
    inline def value: CFuncPtr2[GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLARETEXTURESRESIDENTPROC = CFuncPtr3[GLsizei, Ptr[GLuint], Ptr[GLboolean], GLboolean]
object PFNGLARETEXTURESRESIDENTPROC:
  given _tag: Tag[PFNGLARETEXTURESRESIDENTPROC] = Tag.materializeCFuncPtr3[GLsizei, Ptr[GLuint], Ptr[GLboolean], GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLARETEXTURESRESIDENTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLsizei, Ptr[GLuint], Ptr[GLboolean], GLboolean]): PFNGLARETEXTURESRESIDENTPROC = o
  extension (v: PFNGLARETEXTURESRESIDENTPROC)
    inline def value: CFuncPtr3[GLsizei, Ptr[GLuint], Ptr[GLboolean], GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLARRAYELEMENTPROC = CFuncPtr1[GLint, Unit]
object PFNGLARRAYELEMENTPROC:
  given _tag: Tag[PFNGLARRAYELEMENTPROC] = Tag.materializeCFuncPtr1[GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLARRAYELEMENTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLint, Unit]): PFNGLARRAYELEMENTPROC = o
  extension (v: PFNGLARRAYELEMENTPROC)
    inline def value: CFuncPtr1[GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLATTACHSHADERPROC = CFuncPtr2[GLuint, GLuint, Unit]
object PFNGLATTACHSHADERPROC:
  given _tag: Tag[PFNGLATTACHSHADERPROC] = Tag.materializeCFuncPtr2[GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLATTACHSHADERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLuint, Unit]): PFNGLATTACHSHADERPROC = o
  extension (v: PFNGLATTACHSHADERPROC)
    inline def value: CFuncPtr2[GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBEGINCONDITIONALRENDERPROC = CFuncPtr2[GLuint, GLenum, Unit]
object PFNGLBEGINCONDITIONALRENDERPROC:
  given _tag: Tag[PFNGLBEGINCONDITIONALRENDERPROC] = Tag.materializeCFuncPtr2[GLuint, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBEGINCONDITIONALRENDERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLenum, Unit]): PFNGLBEGINCONDITIONALRENDERPROC = o
  extension (v: PFNGLBEGINCONDITIONALRENDERPROC)
    inline def value: CFuncPtr2[GLuint, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBEGINPROC = CFuncPtr1[GLenum, Unit]
object PFNGLBEGINPROC:
  given _tag: Tag[PFNGLBEGINPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBEGINPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLBEGINPROC = o
  extension (v: PFNGLBEGINPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBEGINQUERYINDEXEDPROC = CFuncPtr3[GLenum, GLuint, GLuint, Unit]
object PFNGLBEGINQUERYINDEXEDPROC:
  given _tag: Tag[PFNGLBEGINQUERYINDEXEDPROC] = Tag.materializeCFuncPtr3[GLenum, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBEGINQUERYINDEXEDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLuint, GLuint, Unit]): PFNGLBEGINQUERYINDEXEDPROC = o
  extension (v: PFNGLBEGINQUERYINDEXEDPROC)
    inline def value: CFuncPtr3[GLenum, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBEGINQUERYPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLBEGINQUERYPROC:
  given _tag: Tag[PFNGLBEGINQUERYPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBEGINQUERYPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLBEGINQUERYPROC = o
  extension (v: PFNGLBEGINQUERYPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBEGINTRANSFORMFEEDBACKPROC = CFuncPtr1[GLenum, Unit]
object PFNGLBEGINTRANSFORMFEEDBACKPROC:
  given _tag: Tag[PFNGLBEGINTRANSFORMFEEDBACKPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBEGINTRANSFORMFEEDBACKPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLBEGINTRANSFORMFEEDBACKPROC = o
  extension (v: PFNGLBEGINTRANSFORMFEEDBACKPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDATTRIBLOCATIONPROC = CFuncPtr3[GLuint, GLuint, Ptr[GLchar], Unit]
object PFNGLBINDATTRIBLOCATIONPROC:
  given _tag: Tag[PFNGLBINDATTRIBLOCATIONPROC] = Tag.materializeCFuncPtr3[GLuint, GLuint, Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDATTRIBLOCATIONPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLuint, Ptr[GLchar], Unit]): PFNGLBINDATTRIBLOCATIONPROC = o
  extension (v: PFNGLBINDATTRIBLOCATIONPROC)
    inline def value: CFuncPtr3[GLuint, GLuint, Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDBUFFERBASEPROC = CFuncPtr3[GLenum, GLuint, GLuint, Unit]
object PFNGLBINDBUFFERBASEPROC:
  given _tag: Tag[PFNGLBINDBUFFERBASEPROC] = Tag.materializeCFuncPtr3[GLenum, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDBUFFERBASEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLuint, GLuint, Unit]): PFNGLBINDBUFFERBASEPROC = o
  extension (v: PFNGLBINDBUFFERBASEPROC)
    inline def value: CFuncPtr3[GLenum, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDBUFFERPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLBINDBUFFERPROC:
  given _tag: Tag[PFNGLBINDBUFFERPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLBINDBUFFERPROC = o
  extension (v: PFNGLBINDBUFFERPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDBUFFERRANGEPROC = CFuncPtr5[GLenum, GLuint, GLuint, GLintptr, GLsizeiptr, Unit]
object PFNGLBINDBUFFERRANGEPROC:
  given _tag: Tag[PFNGLBINDBUFFERRANGEPROC] = Tag.materializeCFuncPtr5[GLenum, GLuint, GLuint, GLintptr, GLsizeiptr, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDBUFFERRANGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLuint, GLuint, GLintptr, GLsizeiptr, Unit]): PFNGLBINDBUFFERRANGEPROC = o
  extension (v: PFNGLBINDBUFFERRANGEPROC)
    inline def value: CFuncPtr5[GLenum, GLuint, GLuint, GLintptr, GLsizeiptr, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDBUFFERSBASEPROC = CFuncPtr4[GLenum, GLuint, GLsizei, Ptr[GLuint], Unit]
object PFNGLBINDBUFFERSBASEPROC:
  given _tag: Tag[PFNGLBINDBUFFERSBASEPROC] = Tag.materializeCFuncPtr4[GLenum, GLuint, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDBUFFERSBASEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLuint, GLsizei, Ptr[GLuint], Unit]): PFNGLBINDBUFFERSBASEPROC = o
  extension (v: PFNGLBINDBUFFERSBASEPROC)
    inline def value: CFuncPtr4[GLenum, GLuint, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDBUFFERSRANGEPROC = CFuncPtr6[GLenum, GLuint, GLsizei, Ptr[GLuint], Ptr[GLintptr], Ptr[GLsizeiptr], Unit]
object PFNGLBINDBUFFERSRANGEPROC:
  given _tag: Tag[PFNGLBINDBUFFERSRANGEPROC] = Tag.materializeCFuncPtr6[GLenum, GLuint, GLsizei, Ptr[GLuint], Ptr[GLintptr], Ptr[GLsizeiptr], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDBUFFERSRANGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLuint, GLsizei, Ptr[GLuint], Ptr[GLintptr], Ptr[GLsizeiptr], Unit]): PFNGLBINDBUFFERSRANGEPROC = o
  extension (v: PFNGLBINDBUFFERSRANGEPROC)
    inline def value: CFuncPtr6[GLenum, GLuint, GLsizei, Ptr[GLuint], Ptr[GLintptr], Ptr[GLsizeiptr], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDFRAGDATALOCATIONINDEXEDPROC = CFuncPtr4[GLuint, GLuint, GLuint, Ptr[GLchar], Unit]
object PFNGLBINDFRAGDATALOCATIONINDEXEDPROC:
  given _tag: Tag[PFNGLBINDFRAGDATALOCATIONINDEXEDPROC] = Tag.materializeCFuncPtr4[GLuint, GLuint, GLuint, Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDFRAGDATALOCATIONINDEXEDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLuint, GLuint, Ptr[GLchar], Unit]): PFNGLBINDFRAGDATALOCATIONINDEXEDPROC = o
  extension (v: PFNGLBINDFRAGDATALOCATIONINDEXEDPROC)
    inline def value: CFuncPtr4[GLuint, GLuint, GLuint, Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDFRAGDATALOCATIONPROC = CFuncPtr3[GLuint, GLuint, Ptr[GLchar], Unit]
object PFNGLBINDFRAGDATALOCATIONPROC:
  given _tag: Tag[PFNGLBINDFRAGDATALOCATIONPROC] = Tag.materializeCFuncPtr3[GLuint, GLuint, Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDFRAGDATALOCATIONPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLuint, Ptr[GLchar], Unit]): PFNGLBINDFRAGDATALOCATIONPROC = o
  extension (v: PFNGLBINDFRAGDATALOCATIONPROC)
    inline def value: CFuncPtr3[GLuint, GLuint, Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDFRAMEBUFFERPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLBINDFRAMEBUFFERPROC:
  given _tag: Tag[PFNGLBINDFRAMEBUFFERPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDFRAMEBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLBINDFRAMEBUFFERPROC = o
  extension (v: PFNGLBINDFRAMEBUFFERPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDIMAGETEXTUREPROC = CFuncPtr7[GLuint, GLuint, GLint, GLboolean, GLint, GLenum, GLenum, Unit]
object PFNGLBINDIMAGETEXTUREPROC:
  given _tag: Tag[PFNGLBINDIMAGETEXTUREPROC] = Tag.materializeCFuncPtr7[GLuint, GLuint, GLint, GLboolean, GLint, GLenum, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDIMAGETEXTUREPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLuint, GLuint, GLint, GLboolean, GLint, GLenum, GLenum, Unit]): PFNGLBINDIMAGETEXTUREPROC = o
  extension (v: PFNGLBINDIMAGETEXTUREPROC)
    inline def value: CFuncPtr7[GLuint, GLuint, GLint, GLboolean, GLint, GLenum, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDIMAGETEXTURESPROC = CFuncPtr3[GLuint, GLsizei, Ptr[GLuint], Unit]
object PFNGLBINDIMAGETEXTURESPROC:
  given _tag: Tag[PFNGLBINDIMAGETEXTURESPROC] = Tag.materializeCFuncPtr3[GLuint, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDIMAGETEXTURESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLsizei, Ptr[GLuint], Unit]): PFNGLBINDIMAGETEXTURESPROC = o
  extension (v: PFNGLBINDIMAGETEXTURESPROC)
    inline def value: CFuncPtr3[GLuint, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDPROGRAMPIPELINEPROC = CFuncPtr1[GLuint, Unit]
object PFNGLBINDPROGRAMPIPELINEPROC:
  given _tag: Tag[PFNGLBINDPROGRAMPIPELINEPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDPROGRAMPIPELINEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLBINDPROGRAMPIPELINEPROC = o
  extension (v: PFNGLBINDPROGRAMPIPELINEPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDRENDERBUFFERPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLBINDRENDERBUFFERPROC:
  given _tag: Tag[PFNGLBINDRENDERBUFFERPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDRENDERBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLBINDRENDERBUFFERPROC = o
  extension (v: PFNGLBINDRENDERBUFFERPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDSAMPLERPROC = CFuncPtr2[GLuint, GLuint, Unit]
object PFNGLBINDSAMPLERPROC:
  given _tag: Tag[PFNGLBINDSAMPLERPROC] = Tag.materializeCFuncPtr2[GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDSAMPLERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLuint, Unit]): PFNGLBINDSAMPLERPROC = o
  extension (v: PFNGLBINDSAMPLERPROC)
    inline def value: CFuncPtr2[GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDSAMPLERSPROC = CFuncPtr3[GLuint, GLsizei, Ptr[GLuint], Unit]
object PFNGLBINDSAMPLERSPROC:
  given _tag: Tag[PFNGLBINDSAMPLERSPROC] = Tag.materializeCFuncPtr3[GLuint, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDSAMPLERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLsizei, Ptr[GLuint], Unit]): PFNGLBINDSAMPLERSPROC = o
  extension (v: PFNGLBINDSAMPLERSPROC)
    inline def value: CFuncPtr3[GLuint, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDTEXTUREPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLBINDTEXTUREPROC:
  given _tag: Tag[PFNGLBINDTEXTUREPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDTEXTUREPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLBINDTEXTUREPROC = o
  extension (v: PFNGLBINDTEXTUREPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDTEXTURESPROC = CFuncPtr3[GLuint, GLsizei, Ptr[GLuint], Unit]
object PFNGLBINDTEXTURESPROC:
  given _tag: Tag[PFNGLBINDTEXTURESPROC] = Tag.materializeCFuncPtr3[GLuint, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDTEXTURESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLsizei, Ptr[GLuint], Unit]): PFNGLBINDTEXTURESPROC = o
  extension (v: PFNGLBINDTEXTURESPROC)
    inline def value: CFuncPtr3[GLuint, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDTEXTUREUNITPROC = CFuncPtr2[GLuint, GLuint, Unit]
object PFNGLBINDTEXTUREUNITPROC:
  given _tag: Tag[PFNGLBINDTEXTUREUNITPROC] = Tag.materializeCFuncPtr2[GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDTEXTUREUNITPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLuint, Unit]): PFNGLBINDTEXTUREUNITPROC = o
  extension (v: PFNGLBINDTEXTUREUNITPROC)
    inline def value: CFuncPtr2[GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDTRANSFORMFEEDBACKPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLBINDTRANSFORMFEEDBACKPROC:
  given _tag: Tag[PFNGLBINDTRANSFORMFEEDBACKPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDTRANSFORMFEEDBACKPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLBINDTRANSFORMFEEDBACKPROC = o
  extension (v: PFNGLBINDTRANSFORMFEEDBACKPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDVERTEXARRAYPROC = CFuncPtr1[GLuint, Unit]
object PFNGLBINDVERTEXARRAYPROC:
  given _tag: Tag[PFNGLBINDVERTEXARRAYPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDVERTEXARRAYPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLBINDVERTEXARRAYPROC = o
  extension (v: PFNGLBINDVERTEXARRAYPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDVERTEXBUFFERPROC = CFuncPtr4[GLuint, GLuint, GLintptr, GLsizei, Unit]
object PFNGLBINDVERTEXBUFFERPROC:
  given _tag: Tag[PFNGLBINDVERTEXBUFFERPROC] = Tag.materializeCFuncPtr4[GLuint, GLuint, GLintptr, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDVERTEXBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLuint, GLintptr, GLsizei, Unit]): PFNGLBINDVERTEXBUFFERPROC = o
  extension (v: PFNGLBINDVERTEXBUFFERPROC)
    inline def value: CFuncPtr4[GLuint, GLuint, GLintptr, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBINDVERTEXBUFFERSPROC = CFuncPtr5[GLuint, GLsizei, Ptr[GLuint], Ptr[GLintptr], Ptr[GLsizei], Unit]
object PFNGLBINDVERTEXBUFFERSPROC:
  given _tag: Tag[PFNGLBINDVERTEXBUFFERSPROC] = Tag.materializeCFuncPtr5[GLuint, GLsizei, Ptr[GLuint], Ptr[GLintptr], Ptr[GLsizei], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBINDVERTEXBUFFERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLsizei, Ptr[GLuint], Ptr[GLintptr], Ptr[GLsizei], Unit]): PFNGLBINDVERTEXBUFFERSPROC = o
  extension (v: PFNGLBINDVERTEXBUFFERSPROC)
    inline def value: CFuncPtr5[GLuint, GLsizei, Ptr[GLuint], Ptr[GLintptr], Ptr[GLsizei], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBITMAPPROC = CFuncPtr7[GLsizei, GLsizei, GLfloat, GLfloat, GLfloat, GLfloat, Ptr[GLubyte], Unit]
object PFNGLBITMAPPROC:
  given _tag: Tag[PFNGLBITMAPPROC] = Tag.materializeCFuncPtr7[GLsizei, GLsizei, GLfloat, GLfloat, GLfloat, GLfloat, Ptr[GLubyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBITMAPPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLsizei, GLsizei, GLfloat, GLfloat, GLfloat, GLfloat, Ptr[GLubyte], Unit]): PFNGLBITMAPPROC = o
  extension (v: PFNGLBITMAPPROC)
    inline def value: CFuncPtr7[GLsizei, GLsizei, GLfloat, GLfloat, GLfloat, GLfloat, Ptr[GLubyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBLENDCOLORPROC = CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLBLENDCOLORPROC:
  given _tag: Tag[PFNGLBLENDCOLORPROC] = Tag.materializeCFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBLENDCOLORPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]): PFNGLBLENDCOLORPROC = o
  extension (v: PFNGLBLENDCOLORPROC)
    inline def value: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBLENDEQUATIONIPROC = CFuncPtr2[GLuint, GLenum, Unit]
object PFNGLBLENDEQUATIONIPROC:
  given _tag: Tag[PFNGLBLENDEQUATIONIPROC] = Tag.materializeCFuncPtr2[GLuint, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBLENDEQUATIONIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLenum, Unit]): PFNGLBLENDEQUATIONIPROC = o
  extension (v: PFNGLBLENDEQUATIONIPROC)
    inline def value: CFuncPtr2[GLuint, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBLENDEQUATIONPROC = CFuncPtr1[GLenum, Unit]
object PFNGLBLENDEQUATIONPROC:
  given _tag: Tag[PFNGLBLENDEQUATIONPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBLENDEQUATIONPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLBLENDEQUATIONPROC = o
  extension (v: PFNGLBLENDEQUATIONPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBLENDEQUATIONSEPARATEIPROC = CFuncPtr3[GLuint, GLenum, GLenum, Unit]
object PFNGLBLENDEQUATIONSEPARATEIPROC:
  given _tag: Tag[PFNGLBLENDEQUATIONSEPARATEIPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBLENDEQUATIONSEPARATEIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, GLenum, Unit]): PFNGLBLENDEQUATIONSEPARATEIPROC = o
  extension (v: PFNGLBLENDEQUATIONSEPARATEIPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBLENDEQUATIONSEPARATEPROC = CFuncPtr2[GLenum, GLenum, Unit]
object PFNGLBLENDEQUATIONSEPARATEPROC:
  given _tag: Tag[PFNGLBLENDEQUATIONSEPARATEPROC] = Tag.materializeCFuncPtr2[GLenum, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBLENDEQUATIONSEPARATEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLenum, Unit]): PFNGLBLENDEQUATIONSEPARATEPROC = o
  extension (v: PFNGLBLENDEQUATIONSEPARATEPROC)
    inline def value: CFuncPtr2[GLenum, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBLENDFUNCIPROC = CFuncPtr3[GLuint, GLenum, GLenum, Unit]
object PFNGLBLENDFUNCIPROC:
  given _tag: Tag[PFNGLBLENDFUNCIPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBLENDFUNCIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, GLenum, Unit]): PFNGLBLENDFUNCIPROC = o
  extension (v: PFNGLBLENDFUNCIPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBLENDFUNCPROC = CFuncPtr2[GLenum, GLenum, Unit]
object PFNGLBLENDFUNCPROC:
  given _tag: Tag[PFNGLBLENDFUNCPROC] = Tag.materializeCFuncPtr2[GLenum, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBLENDFUNCPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLenum, Unit]): PFNGLBLENDFUNCPROC = o
  extension (v: PFNGLBLENDFUNCPROC)
    inline def value: CFuncPtr2[GLenum, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBLENDFUNCSEPARATEIPROC = CFuncPtr5[GLuint, GLenum, GLenum, GLenum, GLenum, Unit]
object PFNGLBLENDFUNCSEPARATEIPROC:
  given _tag: Tag[PFNGLBLENDFUNCSEPARATEIPROC] = Tag.materializeCFuncPtr5[GLuint, GLenum, GLenum, GLenum, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBLENDFUNCSEPARATEIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLenum, GLenum, GLenum, GLenum, Unit]): PFNGLBLENDFUNCSEPARATEIPROC = o
  extension (v: PFNGLBLENDFUNCSEPARATEIPROC)
    inline def value: CFuncPtr5[GLuint, GLenum, GLenum, GLenum, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBLENDFUNCSEPARATEPROC = CFuncPtr4[GLenum, GLenum, GLenum, GLenum, Unit]
object PFNGLBLENDFUNCSEPARATEPROC:
  given _tag: Tag[PFNGLBLENDFUNCSEPARATEPROC] = Tag.materializeCFuncPtr4[GLenum, GLenum, GLenum, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBLENDFUNCSEPARATEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLenum, GLenum, GLenum, Unit]): PFNGLBLENDFUNCSEPARATEPROC = o
  extension (v: PFNGLBLENDFUNCSEPARATEPROC)
    inline def value: CFuncPtr4[GLenum, GLenum, GLenum, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBLITFRAMEBUFFERPROC = CFuncPtr10[GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum, Unit]
object PFNGLBLITFRAMEBUFFERPROC:
  given _tag: Tag[PFNGLBLITFRAMEBUFFERPROC] = Tag.materializeCFuncPtr10[GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBLITFRAMEBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr10[GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum, Unit]): PFNGLBLITFRAMEBUFFERPROC = o
  extension (v: PFNGLBLITFRAMEBUFFERPROC)
    inline def value: CFuncPtr10[GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBLITNAMEDFRAMEBUFFERPROC = CFuncPtr12[GLuint, GLuint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum, Unit]
object PFNGLBLITNAMEDFRAMEBUFFERPROC:
  given _tag: Tag[PFNGLBLITNAMEDFRAMEBUFFERPROC] = Tag.materializeCFuncPtr12[GLuint, GLuint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBLITNAMEDFRAMEBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr12[GLuint, GLuint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum, Unit]): PFNGLBLITNAMEDFRAMEBUFFERPROC = o
  extension (v: PFNGLBLITNAMEDFRAMEBUFFERPROC)
    inline def value: CFuncPtr12[GLuint, GLuint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLint, GLbitfield, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBUFFERDATAPROC = CFuncPtr4[GLenum, GLsizeiptr, Ptr[Byte], GLenum, Unit]
object PFNGLBUFFERDATAPROC:
  given _tag: Tag[PFNGLBUFFERDATAPROC] = Tag.materializeCFuncPtr4[GLenum, GLsizeiptr, Ptr[Byte], GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBUFFERDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLsizeiptr, Ptr[Byte], GLenum, Unit]): PFNGLBUFFERDATAPROC = o
  extension (v: PFNGLBUFFERDATAPROC)
    inline def value: CFuncPtr4[GLenum, GLsizeiptr, Ptr[Byte], GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBUFFERSTORAGEPROC = CFuncPtr4[GLenum, GLsizeiptr, Ptr[Byte], GLbitfield, Unit]
object PFNGLBUFFERSTORAGEPROC:
  given _tag: Tag[PFNGLBUFFERSTORAGEPROC] = Tag.materializeCFuncPtr4[GLenum, GLsizeiptr, Ptr[Byte], GLbitfield, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBUFFERSTORAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLsizeiptr, Ptr[Byte], GLbitfield, Unit]): PFNGLBUFFERSTORAGEPROC = o
  extension (v: PFNGLBUFFERSTORAGEPROC)
    inline def value: CFuncPtr4[GLenum, GLsizeiptr, Ptr[Byte], GLbitfield, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLBUFFERSUBDATAPROC = CFuncPtr4[GLenum, GLintptr, GLsizeiptr, Ptr[Byte], Unit]
object PFNGLBUFFERSUBDATAPROC:
  given _tag: Tag[PFNGLBUFFERSUBDATAPROC] = Tag.materializeCFuncPtr4[GLenum, GLintptr, GLsizeiptr, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLBUFFERSUBDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLintptr, GLsizeiptr, Ptr[Byte], Unit]): PFNGLBUFFERSUBDATAPROC = o
  extension (v: PFNGLBUFFERSUBDATAPROC)
    inline def value: CFuncPtr4[GLenum, GLintptr, GLsizeiptr, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCALLLISTPROC = CFuncPtr1[GLuint, Unit]
object PFNGLCALLLISTPROC:
  given _tag: Tag[PFNGLCALLLISTPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCALLLISTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLCALLLISTPROC = o
  extension (v: PFNGLCALLLISTPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCALLLISTSPROC = CFuncPtr3[GLsizei, GLenum, Ptr[Byte], Unit]
object PFNGLCALLLISTSPROC:
  given _tag: Tag[PFNGLCALLLISTSPROC] = Tag.materializeCFuncPtr3[GLsizei, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCALLLISTSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLsizei, GLenum, Ptr[Byte], Unit]): PFNGLCALLLISTSPROC = o
  extension (v: PFNGLCALLLISTSPROC)
    inline def value: CFuncPtr3[GLsizei, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCHECKFRAMEBUFFERSTATUSPROC = CFuncPtr1[GLenum, GLenum]
object PFNGLCHECKFRAMEBUFFERSTATUSPROC:
  given _tag: Tag[PFNGLCHECKFRAMEBUFFERSTATUSPROC] = Tag.materializeCFuncPtr1[GLenum, GLenum]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCHECKFRAMEBUFFERSTATUSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, GLenum]): PFNGLCHECKFRAMEBUFFERSTATUSPROC = o
  extension (v: PFNGLCHECKFRAMEBUFFERSTATUSPROC)
    inline def value: CFuncPtr1[GLenum, GLenum] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC = CFuncPtr2[GLuint, GLenum, GLenum]
object PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC:
  given _tag: Tag[PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC] = Tag.materializeCFuncPtr2[GLuint, GLenum, GLenum]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLenum, GLenum]): PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC = o
  extension (v: PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC)
    inline def value: CFuncPtr2[GLuint, GLenum, GLenum] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLAMPCOLORPROC = CFuncPtr2[GLenum, GLenum, Unit]
object PFNGLCLAMPCOLORPROC:
  given _tag: Tag[PFNGLCLAMPCOLORPROC] = Tag.materializeCFuncPtr2[GLenum, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLAMPCOLORPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLenum, Unit]): PFNGLCLAMPCOLORPROC = o
  extension (v: PFNGLCLAMPCOLORPROC)
    inline def value: CFuncPtr2[GLenum, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARACCUMPROC = CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLCLEARACCUMPROC:
  given _tag: Tag[PFNGLCLEARACCUMPROC] = Tag.materializeCFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARACCUMPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]): PFNGLCLEARACCUMPROC = o
  extension (v: PFNGLCLEARACCUMPROC)
    inline def value: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARBUFFERDATAPROC = CFuncPtr5[GLenum, GLenum, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLCLEARBUFFERDATAPROC:
  given _tag: Tag[PFNGLCLEARBUFFERDATAPROC] = Tag.materializeCFuncPtr5[GLenum, GLenum, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARBUFFERDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLenum, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLCLEARBUFFERDATAPROC = o
  extension (v: PFNGLCLEARBUFFERDATAPROC)
    inline def value: CFuncPtr5[GLenum, GLenum, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARBUFFERFIPROC = CFuncPtr4[GLenum, GLint, GLfloat, GLint, Unit]
object PFNGLCLEARBUFFERFIPROC:
  given _tag: Tag[PFNGLCLEARBUFFERFIPROC] = Tag.materializeCFuncPtr4[GLenum, GLint, GLfloat, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARBUFFERFIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLint, GLfloat, GLint, Unit]): PFNGLCLEARBUFFERFIPROC = o
  extension (v: PFNGLCLEARBUFFERFIPROC)
    inline def value: CFuncPtr4[GLenum, GLint, GLfloat, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARBUFFERFVPROC = CFuncPtr3[GLenum, GLint, Ptr[GLfloat], Unit]
object PFNGLCLEARBUFFERFVPROC:
  given _tag: Tag[PFNGLCLEARBUFFERFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLint, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARBUFFERFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLint, Ptr[GLfloat], Unit]): PFNGLCLEARBUFFERFVPROC = o
  extension (v: PFNGLCLEARBUFFERFVPROC)
    inline def value: CFuncPtr3[GLenum, GLint, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARBUFFERIVPROC = CFuncPtr3[GLenum, GLint, Ptr[GLint], Unit]
object PFNGLCLEARBUFFERIVPROC:
  given _tag: Tag[PFNGLCLEARBUFFERIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLint, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARBUFFERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLint, Ptr[GLint], Unit]): PFNGLCLEARBUFFERIVPROC = o
  extension (v: PFNGLCLEARBUFFERIVPROC)
    inline def value: CFuncPtr3[GLenum, GLint, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARBUFFERSUBDATAPROC = CFuncPtr7[GLenum, GLenum, GLintptr, GLsizeiptr, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLCLEARBUFFERSUBDATAPROC:
  given _tag: Tag[PFNGLCLEARBUFFERSUBDATAPROC] = Tag.materializeCFuncPtr7[GLenum, GLenum, GLintptr, GLsizeiptr, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARBUFFERSUBDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLenum, GLenum, GLintptr, GLsizeiptr, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLCLEARBUFFERSUBDATAPROC = o
  extension (v: PFNGLCLEARBUFFERSUBDATAPROC)
    inline def value: CFuncPtr7[GLenum, GLenum, GLintptr, GLsizeiptr, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARBUFFERUIVPROC = CFuncPtr3[GLenum, GLint, Ptr[GLuint], Unit]
object PFNGLCLEARBUFFERUIVPROC:
  given _tag: Tag[PFNGLCLEARBUFFERUIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLint, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARBUFFERUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLint, Ptr[GLuint], Unit]): PFNGLCLEARBUFFERUIVPROC = o
  extension (v: PFNGLCLEARBUFFERUIVPROC)
    inline def value: CFuncPtr3[GLenum, GLint, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARCOLORPROC = CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLCLEARCOLORPROC:
  given _tag: Tag[PFNGLCLEARCOLORPROC] = Tag.materializeCFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARCOLORPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]): PFNGLCLEARCOLORPROC = o
  extension (v: PFNGLCLEARCOLORPROC)
    inline def value: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARDEPTHFPROC = CFuncPtr1[GLfloat, Unit]
object PFNGLCLEARDEPTHFPROC:
  given _tag: Tag[PFNGLCLEARDEPTHFPROC] = Tag.materializeCFuncPtr1[GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARDEPTHFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLfloat, Unit]): PFNGLCLEARDEPTHFPROC = o
  extension (v: PFNGLCLEARDEPTHFPROC)
    inline def value: CFuncPtr1[GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARDEPTHPROC = CFuncPtr1[GLdouble, Unit]
object PFNGLCLEARDEPTHPROC:
  given _tag: Tag[PFNGLCLEARDEPTHPROC] = Tag.materializeCFuncPtr1[GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARDEPTHPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLdouble, Unit]): PFNGLCLEARDEPTHPROC = o
  extension (v: PFNGLCLEARDEPTHPROC)
    inline def value: CFuncPtr1[GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARINDEXPROC = CFuncPtr1[GLfloat, Unit]
object PFNGLCLEARINDEXPROC:
  given _tag: Tag[PFNGLCLEARINDEXPROC] = Tag.materializeCFuncPtr1[GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARINDEXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLfloat, Unit]): PFNGLCLEARINDEXPROC = o
  extension (v: PFNGLCLEARINDEXPROC)
    inline def value: CFuncPtr1[GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARNAMEDBUFFERDATAPROC = CFuncPtr5[GLuint, GLenum, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLCLEARNAMEDBUFFERDATAPROC:
  given _tag: Tag[PFNGLCLEARNAMEDBUFFERDATAPROC] = Tag.materializeCFuncPtr5[GLuint, GLenum, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARNAMEDBUFFERDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLenum, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLCLEARNAMEDBUFFERDATAPROC = o
  extension (v: PFNGLCLEARNAMEDBUFFERDATAPROC)
    inline def value: CFuncPtr5[GLuint, GLenum, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARNAMEDBUFFERSUBDATAPROC = CFuncPtr7[GLuint, GLenum, GLintptr, GLsizeiptr, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLCLEARNAMEDBUFFERSUBDATAPROC:
  given _tag: Tag[PFNGLCLEARNAMEDBUFFERSUBDATAPROC] = Tag.materializeCFuncPtr7[GLuint, GLenum, GLintptr, GLsizeiptr, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARNAMEDBUFFERSUBDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLuint, GLenum, GLintptr, GLsizeiptr, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLCLEARNAMEDBUFFERSUBDATAPROC = o
  extension (v: PFNGLCLEARNAMEDBUFFERSUBDATAPROC)
    inline def value: CFuncPtr7[GLuint, GLenum, GLintptr, GLsizeiptr, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARNAMEDFRAMEBUFFERFIPROC = CFuncPtr5[GLuint, GLenum, GLint, GLfloat, GLint, Unit]
object PFNGLCLEARNAMEDFRAMEBUFFERFIPROC:
  given _tag: Tag[PFNGLCLEARNAMEDFRAMEBUFFERFIPROC] = Tag.materializeCFuncPtr5[GLuint, GLenum, GLint, GLfloat, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARNAMEDFRAMEBUFFERFIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLenum, GLint, GLfloat, GLint, Unit]): PFNGLCLEARNAMEDFRAMEBUFFERFIPROC = o
  extension (v: PFNGLCLEARNAMEDFRAMEBUFFERFIPROC)
    inline def value: CFuncPtr5[GLuint, GLenum, GLint, GLfloat, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARNAMEDFRAMEBUFFERFVPROC = CFuncPtr4[GLuint, GLenum, GLint, Ptr[GLfloat], Unit]
object PFNGLCLEARNAMEDFRAMEBUFFERFVPROC:
  given _tag: Tag[PFNGLCLEARNAMEDFRAMEBUFFERFVPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLint, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARNAMEDFRAMEBUFFERFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLint, Ptr[GLfloat], Unit]): PFNGLCLEARNAMEDFRAMEBUFFERFVPROC = o
  extension (v: PFNGLCLEARNAMEDFRAMEBUFFERFVPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLint, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARNAMEDFRAMEBUFFERIVPROC = CFuncPtr4[GLuint, GLenum, GLint, Ptr[GLint], Unit]
object PFNGLCLEARNAMEDFRAMEBUFFERIVPROC:
  given _tag: Tag[PFNGLCLEARNAMEDFRAMEBUFFERIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLint, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARNAMEDFRAMEBUFFERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLint, Ptr[GLint], Unit]): PFNGLCLEARNAMEDFRAMEBUFFERIVPROC = o
  extension (v: PFNGLCLEARNAMEDFRAMEBUFFERIVPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLint, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC = CFuncPtr4[GLuint, GLenum, GLint, Ptr[GLuint], Unit]
object PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC:
  given _tag: Tag[PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLint, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLint, Ptr[GLuint], Unit]): PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC = o
  extension (v: PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLint, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARPROC = CFuncPtr1[GLbitfield, Unit]
object PFNGLCLEARPROC:
  given _tag: Tag[PFNGLCLEARPROC] = Tag.materializeCFuncPtr1[GLbitfield, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLbitfield, Unit]): PFNGLCLEARPROC = o
  extension (v: PFNGLCLEARPROC)
    inline def value: CFuncPtr1[GLbitfield, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARSTENCILPROC = CFuncPtr1[GLint, Unit]
object PFNGLCLEARSTENCILPROC:
  given _tag: Tag[PFNGLCLEARSTENCILPROC] = Tag.materializeCFuncPtr1[GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARSTENCILPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLint, Unit]): PFNGLCLEARSTENCILPROC = o
  extension (v: PFNGLCLEARSTENCILPROC)
    inline def value: CFuncPtr1[GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARTEXIMAGEPROC = CFuncPtr5[GLuint, GLint, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLCLEARTEXIMAGEPROC:
  given _tag: Tag[PFNGLCLEARTEXIMAGEPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARTEXIMAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLCLEARTEXIMAGEPROC = o
  extension (v: PFNGLCLEARTEXIMAGEPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLEARTEXSUBIMAGEPROC = CFuncPtr11[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLCLEARTEXSUBIMAGEPROC:
  given _tag: Tag[PFNGLCLEARTEXSUBIMAGEPROC] = Tag.materializeCFuncPtr11[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLEARTEXSUBIMAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr11[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLCLEARTEXSUBIMAGEPROC = o
  extension (v: PFNGLCLEARTEXSUBIMAGEPROC)
    inline def value: CFuncPtr11[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLIENTACTIVETEXTUREPROC = CFuncPtr1[GLenum, Unit]
object PFNGLCLIENTACTIVETEXTUREPROC:
  given _tag: Tag[PFNGLCLIENTACTIVETEXTUREPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLIENTACTIVETEXTUREPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLCLIENTACTIVETEXTUREPROC = o
  extension (v: PFNGLCLIENTACTIVETEXTUREPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLIENTWAITSYNCPROC = CFuncPtr3[GLsync, GLbitfield, GLuint64, GLenum]
object PFNGLCLIENTWAITSYNCPROC:
  given _tag: Tag[PFNGLCLIENTWAITSYNCPROC] = Tag.materializeCFuncPtr3[GLsync, GLbitfield, GLuint64, GLenum]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLIENTWAITSYNCPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLsync, GLbitfield, GLuint64, GLenum]): PFNGLCLIENTWAITSYNCPROC = o
  extension (v: PFNGLCLIENTWAITSYNCPROC)
    inline def value: CFuncPtr3[GLsync, GLbitfield, GLuint64, GLenum] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLIPCONTROLPROC = CFuncPtr2[GLenum, GLenum, Unit]
object PFNGLCLIPCONTROLPROC:
  given _tag: Tag[PFNGLCLIPCONTROLPROC] = Tag.materializeCFuncPtr2[GLenum, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLIPCONTROLPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLenum, Unit]): PFNGLCLIPCONTROLPROC = o
  extension (v: PFNGLCLIPCONTROLPROC)
    inline def value: CFuncPtr2[GLenum, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCLIPPLANEPROC = CFuncPtr2[GLenum, Ptr[GLdouble], Unit]
object PFNGLCLIPPLANEPROC:
  given _tag: Tag[PFNGLCLIPPLANEPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCLIPPLANEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLdouble], Unit]): PFNGLCLIPPLANEPROC = o
  extension (v: PFNGLCLIPPLANEPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3BPROC = CFuncPtr3[GLbyte, GLbyte, GLbyte, Unit]
object PFNGLCOLOR3BPROC:
  given _tag: Tag[PFNGLCOLOR3BPROC] = Tag.materializeCFuncPtr3[GLbyte, GLbyte, GLbyte, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3BPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLbyte, GLbyte, GLbyte, Unit]): PFNGLCOLOR3BPROC = o
  extension (v: PFNGLCOLOR3BPROC)
    inline def value: CFuncPtr3[GLbyte, GLbyte, GLbyte, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3BVPROC = CFuncPtr1[Ptr[GLbyte], Unit]
object PFNGLCOLOR3BVPROC:
  given _tag: Tag[PFNGLCOLOR3BVPROC] = Tag.materializeCFuncPtr1[Ptr[GLbyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3BVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLbyte], Unit]): PFNGLCOLOR3BVPROC = o
  extension (v: PFNGLCOLOR3BVPROC)
    inline def value: CFuncPtr1[Ptr[GLbyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3DPROC = CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
object PFNGLCOLOR3DPROC:
  given _tag: Tag[PFNGLCOLOR3DPROC] = Tag.materializeCFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]): PFNGLCOLOR3DPROC = o
  extension (v: PFNGLCOLOR3DPROC)
    inline def value: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLCOLOR3DVPROC:
  given _tag: Tag[PFNGLCOLOR3DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLCOLOR3DVPROC = o
  extension (v: PFNGLCOLOR3DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3FPROC = CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
object PFNGLCOLOR3FPROC:
  given _tag: Tag[PFNGLCOLOR3FPROC] = Tag.materializeCFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]): PFNGLCOLOR3FPROC = o
  extension (v: PFNGLCOLOR3FPROC)
    inline def value: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLCOLOR3FVPROC:
  given _tag: Tag[PFNGLCOLOR3FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLCOLOR3FVPROC = o
  extension (v: PFNGLCOLOR3FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3IPROC = CFuncPtr3[GLint, GLint, GLint, Unit]
object PFNGLCOLOR3IPROC:
  given _tag: Tag[PFNGLCOLOR3IPROC] = Tag.materializeCFuncPtr3[GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLint, GLint, Unit]): PFNGLCOLOR3IPROC = o
  extension (v: PFNGLCOLOR3IPROC)
    inline def value: CFuncPtr3[GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLCOLOR3IVPROC:
  given _tag: Tag[PFNGLCOLOR3IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLCOLOR3IVPROC = o
  extension (v: PFNGLCOLOR3IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3SPROC = CFuncPtr3[GLshort, GLshort, GLshort, Unit]
object PFNGLCOLOR3SPROC:
  given _tag: Tag[PFNGLCOLOR3SPROC] = Tag.materializeCFuncPtr3[GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLshort, GLshort, GLshort, Unit]): PFNGLCOLOR3SPROC = o
  extension (v: PFNGLCOLOR3SPROC)
    inline def value: CFuncPtr3[GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLCOLOR3SVPROC:
  given _tag: Tag[PFNGLCOLOR3SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLCOLOR3SVPROC = o
  extension (v: PFNGLCOLOR3SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3UBPROC = CFuncPtr3[GLubyte, GLubyte, GLubyte, Unit]
object PFNGLCOLOR3UBPROC:
  given _tag: Tag[PFNGLCOLOR3UBPROC] = Tag.materializeCFuncPtr3[GLubyte, GLubyte, GLubyte, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3UBPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLubyte, GLubyte, GLubyte, Unit]): PFNGLCOLOR3UBPROC = o
  extension (v: PFNGLCOLOR3UBPROC)
    inline def value: CFuncPtr3[GLubyte, GLubyte, GLubyte, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3UBVPROC = CFuncPtr1[Ptr[GLubyte], Unit]
object PFNGLCOLOR3UBVPROC:
  given _tag: Tag[PFNGLCOLOR3UBVPROC] = Tag.materializeCFuncPtr1[Ptr[GLubyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3UBVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLubyte], Unit]): PFNGLCOLOR3UBVPROC = o
  extension (v: PFNGLCOLOR3UBVPROC)
    inline def value: CFuncPtr1[Ptr[GLubyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3UIPROC = CFuncPtr3[GLuint, GLuint, GLuint, Unit]
object PFNGLCOLOR3UIPROC:
  given _tag: Tag[PFNGLCOLOR3UIPROC] = Tag.materializeCFuncPtr3[GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLuint, GLuint, Unit]): PFNGLCOLOR3UIPROC = o
  extension (v: PFNGLCOLOR3UIPROC)
    inline def value: CFuncPtr3[GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3UIVPROC = CFuncPtr1[Ptr[GLuint], Unit]
object PFNGLCOLOR3UIVPROC:
  given _tag: Tag[PFNGLCOLOR3UIVPROC] = Tag.materializeCFuncPtr1[Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLuint], Unit]): PFNGLCOLOR3UIVPROC = o
  extension (v: PFNGLCOLOR3UIVPROC)
    inline def value: CFuncPtr1[Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3USPROC = CFuncPtr3[GLushort, GLushort, GLushort, Unit]
object PFNGLCOLOR3USPROC:
  given _tag: Tag[PFNGLCOLOR3USPROC] = Tag.materializeCFuncPtr3[GLushort, GLushort, GLushort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3USPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLushort, GLushort, GLushort, Unit]): PFNGLCOLOR3USPROC = o
  extension (v: PFNGLCOLOR3USPROC)
    inline def value: CFuncPtr3[GLushort, GLushort, GLushort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR3USVPROC = CFuncPtr1[Ptr[GLushort], Unit]
object PFNGLCOLOR3USVPROC:
  given _tag: Tag[PFNGLCOLOR3USVPROC] = Tag.materializeCFuncPtr1[Ptr[GLushort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR3USVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLushort], Unit]): PFNGLCOLOR3USVPROC = o
  extension (v: PFNGLCOLOR3USVPROC)
    inline def value: CFuncPtr1[Ptr[GLushort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4BPROC = CFuncPtr4[GLbyte, GLbyte, GLbyte, GLbyte, Unit]
object PFNGLCOLOR4BPROC:
  given _tag: Tag[PFNGLCOLOR4BPROC] = Tag.materializeCFuncPtr4[GLbyte, GLbyte, GLbyte, GLbyte, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4BPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLbyte, GLbyte, GLbyte, GLbyte, Unit]): PFNGLCOLOR4BPROC = o
  extension (v: PFNGLCOLOR4BPROC)
    inline def value: CFuncPtr4[GLbyte, GLbyte, GLbyte, GLbyte, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4BVPROC = CFuncPtr1[Ptr[GLbyte], Unit]
object PFNGLCOLOR4BVPROC:
  given _tag: Tag[PFNGLCOLOR4BVPROC] = Tag.materializeCFuncPtr1[Ptr[GLbyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4BVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLbyte], Unit]): PFNGLCOLOR4BVPROC = o
  extension (v: PFNGLCOLOR4BVPROC)
    inline def value: CFuncPtr1[Ptr[GLbyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4DPROC = CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLCOLOR4DPROC:
  given _tag: Tag[PFNGLCOLOR4DPROC] = Tag.materializeCFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]): PFNGLCOLOR4DPROC = o
  extension (v: PFNGLCOLOR4DPROC)
    inline def value: CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLCOLOR4DVPROC:
  given _tag: Tag[PFNGLCOLOR4DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLCOLOR4DVPROC = o
  extension (v: PFNGLCOLOR4DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4FPROC = CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLCOLOR4FPROC:
  given _tag: Tag[PFNGLCOLOR4FPROC] = Tag.materializeCFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]): PFNGLCOLOR4FPROC = o
  extension (v: PFNGLCOLOR4FPROC)
    inline def value: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLCOLOR4FVPROC:
  given _tag: Tag[PFNGLCOLOR4FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLCOLOR4FVPROC = o
  extension (v: PFNGLCOLOR4FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4IPROC = CFuncPtr4[GLint, GLint, GLint, GLint, Unit]
object PFNGLCOLOR4IPROC:
  given _tag: Tag[PFNGLCOLOR4IPROC] = Tag.materializeCFuncPtr4[GLint, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLint, GLint, GLint, Unit]): PFNGLCOLOR4IPROC = o
  extension (v: PFNGLCOLOR4IPROC)
    inline def value: CFuncPtr4[GLint, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLCOLOR4IVPROC:
  given _tag: Tag[PFNGLCOLOR4IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLCOLOR4IVPROC = o
  extension (v: PFNGLCOLOR4IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4SPROC = CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]
object PFNGLCOLOR4SPROC:
  given _tag: Tag[PFNGLCOLOR4SPROC] = Tag.materializeCFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]): PFNGLCOLOR4SPROC = o
  extension (v: PFNGLCOLOR4SPROC)
    inline def value: CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLCOLOR4SVPROC:
  given _tag: Tag[PFNGLCOLOR4SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLCOLOR4SVPROC = o
  extension (v: PFNGLCOLOR4SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4UBPROC = CFuncPtr4[GLubyte, GLubyte, GLubyte, GLubyte, Unit]
object PFNGLCOLOR4UBPROC:
  given _tag: Tag[PFNGLCOLOR4UBPROC] = Tag.materializeCFuncPtr4[GLubyte, GLubyte, GLubyte, GLubyte, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4UBPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLubyte, GLubyte, GLubyte, GLubyte, Unit]): PFNGLCOLOR4UBPROC = o
  extension (v: PFNGLCOLOR4UBPROC)
    inline def value: CFuncPtr4[GLubyte, GLubyte, GLubyte, GLubyte, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4UBVPROC = CFuncPtr1[Ptr[GLubyte], Unit]
object PFNGLCOLOR4UBVPROC:
  given _tag: Tag[PFNGLCOLOR4UBVPROC] = Tag.materializeCFuncPtr1[Ptr[GLubyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4UBVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLubyte], Unit]): PFNGLCOLOR4UBVPROC = o
  extension (v: PFNGLCOLOR4UBVPROC)
    inline def value: CFuncPtr1[Ptr[GLubyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4UIPROC = CFuncPtr4[GLuint, GLuint, GLuint, GLuint, Unit]
object PFNGLCOLOR4UIPROC:
  given _tag: Tag[PFNGLCOLOR4UIPROC] = Tag.materializeCFuncPtr4[GLuint, GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLuint, GLuint, GLuint, Unit]): PFNGLCOLOR4UIPROC = o
  extension (v: PFNGLCOLOR4UIPROC)
    inline def value: CFuncPtr4[GLuint, GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4UIVPROC = CFuncPtr1[Ptr[GLuint], Unit]
object PFNGLCOLOR4UIVPROC:
  given _tag: Tag[PFNGLCOLOR4UIVPROC] = Tag.materializeCFuncPtr1[Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLuint], Unit]): PFNGLCOLOR4UIVPROC = o
  extension (v: PFNGLCOLOR4UIVPROC)
    inline def value: CFuncPtr1[Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4USPROC = CFuncPtr4[GLushort, GLushort, GLushort, GLushort, Unit]
object PFNGLCOLOR4USPROC:
  given _tag: Tag[PFNGLCOLOR4USPROC] = Tag.materializeCFuncPtr4[GLushort, GLushort, GLushort, GLushort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4USPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLushort, GLushort, GLushort, GLushort, Unit]): PFNGLCOLOR4USPROC = o
  extension (v: PFNGLCOLOR4USPROC)
    inline def value: CFuncPtr4[GLushort, GLushort, GLushort, GLushort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLOR4USVPROC = CFuncPtr1[Ptr[GLushort], Unit]
object PFNGLCOLOR4USVPROC:
  given _tag: Tag[PFNGLCOLOR4USVPROC] = Tag.materializeCFuncPtr1[Ptr[GLushort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLOR4USVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLushort], Unit]): PFNGLCOLOR4USVPROC = o
  extension (v: PFNGLCOLOR4USVPROC)
    inline def value: CFuncPtr1[Ptr[GLushort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLORMASKIPROC = CFuncPtr5[GLuint, GLboolean, GLboolean, GLboolean, GLboolean, Unit]
object PFNGLCOLORMASKIPROC:
  given _tag: Tag[PFNGLCOLORMASKIPROC] = Tag.materializeCFuncPtr5[GLuint, GLboolean, GLboolean, GLboolean, GLboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLORMASKIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLboolean, GLboolean, GLboolean, GLboolean, Unit]): PFNGLCOLORMASKIPROC = o
  extension (v: PFNGLCOLORMASKIPROC)
    inline def value: CFuncPtr5[GLuint, GLboolean, GLboolean, GLboolean, GLboolean, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLORMASKPROC = CFuncPtr4[GLboolean, GLboolean, GLboolean, GLboolean, Unit]
object PFNGLCOLORMASKPROC:
  given _tag: Tag[PFNGLCOLORMASKPROC] = Tag.materializeCFuncPtr4[GLboolean, GLboolean, GLboolean, GLboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLORMASKPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLboolean, GLboolean, GLboolean, GLboolean, Unit]): PFNGLCOLORMASKPROC = o
  extension (v: PFNGLCOLORMASKPROC)
    inline def value: CFuncPtr4[GLboolean, GLboolean, GLboolean, GLboolean, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLORMATERIALPROC = CFuncPtr2[GLenum, GLenum, Unit]
object PFNGLCOLORMATERIALPROC:
  given _tag: Tag[PFNGLCOLORMATERIALPROC] = Tag.materializeCFuncPtr2[GLenum, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLORMATERIALPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLenum, Unit]): PFNGLCOLORMATERIALPROC = o
  extension (v: PFNGLCOLORMATERIALPROC)
    inline def value: CFuncPtr2[GLenum, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLORP3UIPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLCOLORP3UIPROC:
  given _tag: Tag[PFNGLCOLORP3UIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLORP3UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLCOLORP3UIPROC = o
  extension (v: PFNGLCOLORP3UIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLORP3UIVPROC = CFuncPtr2[GLenum, Ptr[GLuint], Unit]
object PFNGLCOLORP3UIVPROC:
  given _tag: Tag[PFNGLCOLORP3UIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLORP3UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLuint], Unit]): PFNGLCOLORP3UIVPROC = o
  extension (v: PFNGLCOLORP3UIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLORP4UIPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLCOLORP4UIPROC:
  given _tag: Tag[PFNGLCOLORP4UIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLORP4UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLCOLORP4UIPROC = o
  extension (v: PFNGLCOLORP4UIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLORP4UIVPROC = CFuncPtr2[GLenum, Ptr[GLuint], Unit]
object PFNGLCOLORP4UIVPROC:
  given _tag: Tag[PFNGLCOLORP4UIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLORP4UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLuint], Unit]): PFNGLCOLORP4UIVPROC = o
  extension (v: PFNGLCOLORP4UIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOLORPOINTERPROC = CFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLCOLORPOINTERPROC:
  given _tag: Tag[PFNGLCOLORPOINTERPROC] = Tag.materializeCFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOLORPOINTERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLCOLORPOINTERPROC = o
  extension (v: PFNGLCOLORPOINTERPROC)
    inline def value: CFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOMPILESHADERPROC = CFuncPtr1[GLuint, Unit]
object PFNGLCOMPILESHADERPROC:
  given _tag: Tag[PFNGLCOMPILESHADERPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOMPILESHADERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLCOMPILESHADERPROC = o
  extension (v: PFNGLCOMPILESHADERPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOMPRESSEDTEXIMAGE1DPROC = CFuncPtr7[GLenum, GLint, GLenum, GLsizei, GLint, GLsizei, Ptr[Byte], Unit]
object PFNGLCOMPRESSEDTEXIMAGE1DPROC:
  given _tag: Tag[PFNGLCOMPRESSEDTEXIMAGE1DPROC] = Tag.materializeCFuncPtr7[GLenum, GLint, GLenum, GLsizei, GLint, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOMPRESSEDTEXIMAGE1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLenum, GLint, GLenum, GLsizei, GLint, GLsizei, Ptr[Byte], Unit]): PFNGLCOMPRESSEDTEXIMAGE1DPROC = o
  extension (v: PFNGLCOMPRESSEDTEXIMAGE1DPROC)
    inline def value: CFuncPtr7[GLenum, GLint, GLenum, GLsizei, GLint, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOMPRESSEDTEXIMAGE2DPROC = CFuncPtr8[GLenum, GLint, GLenum, GLsizei, GLsizei, GLint, GLsizei, Ptr[Byte], Unit]
object PFNGLCOMPRESSEDTEXIMAGE2DPROC:
  given _tag: Tag[PFNGLCOMPRESSEDTEXIMAGE2DPROC] = Tag.materializeCFuncPtr8[GLenum, GLint, GLenum, GLsizei, GLsizei, GLint, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOMPRESSEDTEXIMAGE2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[GLenum, GLint, GLenum, GLsizei, GLsizei, GLint, GLsizei, Ptr[Byte], Unit]): PFNGLCOMPRESSEDTEXIMAGE2DPROC = o
  extension (v: PFNGLCOMPRESSEDTEXIMAGE2DPROC)
    inline def value: CFuncPtr8[GLenum, GLint, GLenum, GLsizei, GLsizei, GLint, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOMPRESSEDTEXIMAGE3DPROC = CFuncPtr9[GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, Ptr[Byte], Unit]
object PFNGLCOMPRESSEDTEXIMAGE3DPROC:
  given _tag: Tag[PFNGLCOMPRESSEDTEXIMAGE3DPROC] = Tag.materializeCFuncPtr9[GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOMPRESSEDTEXIMAGE3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr9[GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, Ptr[Byte], Unit]): PFNGLCOMPRESSEDTEXIMAGE3DPROC = o
  extension (v: PFNGLCOMPRESSEDTEXIMAGE3DPROC)
    inline def value: CFuncPtr9[GLenum, GLint, GLenum, GLsizei, GLsizei, GLsizei, GLint, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOMPRESSEDTEXSUBIMAGE1DPROC = CFuncPtr7[GLenum, GLint, GLint, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLCOMPRESSEDTEXSUBIMAGE1DPROC:
  given _tag: Tag[PFNGLCOMPRESSEDTEXSUBIMAGE1DPROC] = Tag.materializeCFuncPtr7[GLenum, GLint, GLint, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOMPRESSEDTEXSUBIMAGE1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLenum, GLint, GLint, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLCOMPRESSEDTEXSUBIMAGE1DPROC = o
  extension (v: PFNGLCOMPRESSEDTEXSUBIMAGE1DPROC)
    inline def value: CFuncPtr7[GLenum, GLint, GLint, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC = CFuncPtr9[GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC:
  given _tag: Tag[PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC] = Tag.materializeCFuncPtr9[GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr9[GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC = o
  extension (v: PFNGLCOMPRESSEDTEXSUBIMAGE2DPROC)
    inline def value: CFuncPtr9[GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC = CFuncPtr11[GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC:
  given _tag: Tag[PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC] = Tag.materializeCFuncPtr11[GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr11[GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC = o
  extension (v: PFNGLCOMPRESSEDTEXSUBIMAGE3DPROC)
    inline def value: CFuncPtr11[GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOMPRESSEDTEXTURESUBIMAGE1DPROC = CFuncPtr7[GLuint, GLint, GLint, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLCOMPRESSEDTEXTURESUBIMAGE1DPROC:
  given _tag: Tag[PFNGLCOMPRESSEDTEXTURESUBIMAGE1DPROC] = Tag.materializeCFuncPtr7[GLuint, GLint, GLint, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOMPRESSEDTEXTURESUBIMAGE1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLuint, GLint, GLint, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLCOMPRESSEDTEXTURESUBIMAGE1DPROC = o
  extension (v: PFNGLCOMPRESSEDTEXTURESUBIMAGE1DPROC)
    inline def value: CFuncPtr7[GLuint, GLint, GLint, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC = CFuncPtr9[GLuint, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC:
  given _tag: Tag[PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC] = Tag.materializeCFuncPtr9[GLuint, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr9[GLuint, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC = o
  extension (v: PFNGLCOMPRESSEDTEXTURESUBIMAGE2DPROC)
    inline def value: CFuncPtr9[GLuint, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC = CFuncPtr11[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC:
  given _tag: Tag[PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC] = Tag.materializeCFuncPtr11[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr11[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC = o
  extension (v: PFNGLCOMPRESSEDTEXTURESUBIMAGE3DPROC)
    inline def value: CFuncPtr11[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOPYBUFFERSUBDATAPROC = CFuncPtr5[GLenum, GLenum, GLintptr, GLintptr, GLsizeiptr, Unit]
object PFNGLCOPYBUFFERSUBDATAPROC:
  given _tag: Tag[PFNGLCOPYBUFFERSUBDATAPROC] = Tag.materializeCFuncPtr5[GLenum, GLenum, GLintptr, GLintptr, GLsizeiptr, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOPYBUFFERSUBDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLenum, GLintptr, GLintptr, GLsizeiptr, Unit]): PFNGLCOPYBUFFERSUBDATAPROC = o
  extension (v: PFNGLCOPYBUFFERSUBDATAPROC)
    inline def value: CFuncPtr5[GLenum, GLenum, GLintptr, GLintptr, GLsizeiptr, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOPYIMAGESUBDATAPROC = CFuncPtr15[GLuint, GLenum, GLint, GLint, GLint, GLint, GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, Unit]
object PFNGLCOPYIMAGESUBDATAPROC:
  given _tag: Tag[PFNGLCOPYIMAGESUBDATAPROC] = Tag.materializeCFuncPtr15[GLuint, GLenum, GLint, GLint, GLint, GLint, GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOPYIMAGESUBDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr15[GLuint, GLenum, GLint, GLint, GLint, GLint, GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, Unit]): PFNGLCOPYIMAGESUBDATAPROC = o
  extension (v: PFNGLCOPYIMAGESUBDATAPROC)
    inline def value: CFuncPtr15[GLuint, GLenum, GLint, GLint, GLint, GLint, GLuint, GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOPYNAMEDBUFFERSUBDATAPROC = CFuncPtr5[GLuint, GLuint, GLintptr, GLintptr, GLsizeiptr, Unit]
object PFNGLCOPYNAMEDBUFFERSUBDATAPROC:
  given _tag: Tag[PFNGLCOPYNAMEDBUFFERSUBDATAPROC] = Tag.materializeCFuncPtr5[GLuint, GLuint, GLintptr, GLintptr, GLsizeiptr, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOPYNAMEDBUFFERSUBDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLuint, GLintptr, GLintptr, GLsizeiptr, Unit]): PFNGLCOPYNAMEDBUFFERSUBDATAPROC = o
  extension (v: PFNGLCOPYNAMEDBUFFERSUBDATAPROC)
    inline def value: CFuncPtr5[GLuint, GLuint, GLintptr, GLintptr, GLsizeiptr, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOPYPIXELSPROC = CFuncPtr5[GLint, GLint, GLsizei, GLsizei, GLenum, Unit]
object PFNGLCOPYPIXELSPROC:
  given _tag: Tag[PFNGLCOPYPIXELSPROC] = Tag.materializeCFuncPtr5[GLint, GLint, GLsizei, GLsizei, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOPYPIXELSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLint, GLint, GLsizei, GLsizei, GLenum, Unit]): PFNGLCOPYPIXELSPROC = o
  extension (v: PFNGLCOPYPIXELSPROC)
    inline def value: CFuncPtr5[GLint, GLint, GLsizei, GLsizei, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOPYTEXIMAGE1DPROC = CFuncPtr7[GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLint, Unit]
object PFNGLCOPYTEXIMAGE1DPROC:
  given _tag: Tag[PFNGLCOPYTEXIMAGE1DPROC] = Tag.materializeCFuncPtr7[GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOPYTEXIMAGE1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLint, Unit]): PFNGLCOPYTEXIMAGE1DPROC = o
  extension (v: PFNGLCOPYTEXIMAGE1DPROC)
    inline def value: CFuncPtr7[GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOPYTEXIMAGE2DPROC = CFuncPtr8[GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLsizei, GLint, Unit]
object PFNGLCOPYTEXIMAGE2DPROC:
  given _tag: Tag[PFNGLCOPYTEXIMAGE2DPROC] = Tag.materializeCFuncPtr8[GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLsizei, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOPYTEXIMAGE2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLsizei, GLint, Unit]): PFNGLCOPYTEXIMAGE2DPROC = o
  extension (v: PFNGLCOPYTEXIMAGE2DPROC)
    inline def value: CFuncPtr8[GLenum, GLint, GLenum, GLint, GLint, GLsizei, GLsizei, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOPYTEXSUBIMAGE1DPROC = CFuncPtr6[GLenum, GLint, GLint, GLint, GLint, GLsizei, Unit]
object PFNGLCOPYTEXSUBIMAGE1DPROC:
  given _tag: Tag[PFNGLCOPYTEXSUBIMAGE1DPROC] = Tag.materializeCFuncPtr6[GLenum, GLint, GLint, GLint, GLint, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOPYTEXSUBIMAGE1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLint, GLint, GLint, GLint, GLsizei, Unit]): PFNGLCOPYTEXSUBIMAGE1DPROC = o
  extension (v: PFNGLCOPYTEXSUBIMAGE1DPROC)
    inline def value: CFuncPtr6[GLenum, GLint, GLint, GLint, GLint, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOPYTEXSUBIMAGE2DPROC = CFuncPtr8[GLenum, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit]
object PFNGLCOPYTEXSUBIMAGE2DPROC:
  given _tag: Tag[PFNGLCOPYTEXSUBIMAGE2DPROC] = Tag.materializeCFuncPtr8[GLenum, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOPYTEXSUBIMAGE2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[GLenum, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit]): PFNGLCOPYTEXSUBIMAGE2DPROC = o
  extension (v: PFNGLCOPYTEXSUBIMAGE2DPROC)
    inline def value: CFuncPtr8[GLenum, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOPYTEXSUBIMAGE3DPROC = CFuncPtr9[GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit]
object PFNGLCOPYTEXSUBIMAGE3DPROC:
  given _tag: Tag[PFNGLCOPYTEXSUBIMAGE3DPROC] = Tag.materializeCFuncPtr9[GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOPYTEXSUBIMAGE3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr9[GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit]): PFNGLCOPYTEXSUBIMAGE3DPROC = o
  extension (v: PFNGLCOPYTEXSUBIMAGE3DPROC)
    inline def value: CFuncPtr9[GLenum, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOPYTEXTURESUBIMAGE1DPROC = CFuncPtr6[GLuint, GLint, GLint, GLint, GLint, GLsizei, Unit]
object PFNGLCOPYTEXTURESUBIMAGE1DPROC:
  given _tag: Tag[PFNGLCOPYTEXTURESUBIMAGE1DPROC] = Tag.materializeCFuncPtr6[GLuint, GLint, GLint, GLint, GLint, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOPYTEXTURESUBIMAGE1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLint, GLint, GLint, GLint, GLsizei, Unit]): PFNGLCOPYTEXTURESUBIMAGE1DPROC = o
  extension (v: PFNGLCOPYTEXTURESUBIMAGE1DPROC)
    inline def value: CFuncPtr6[GLuint, GLint, GLint, GLint, GLint, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOPYTEXTURESUBIMAGE2DPROC = CFuncPtr8[GLuint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit]
object PFNGLCOPYTEXTURESUBIMAGE2DPROC:
  given _tag: Tag[PFNGLCOPYTEXTURESUBIMAGE2DPROC] = Tag.materializeCFuncPtr8[GLuint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOPYTEXTURESUBIMAGE2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[GLuint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit]): PFNGLCOPYTEXTURESUBIMAGE2DPROC = o
  extension (v: PFNGLCOPYTEXTURESUBIMAGE2DPROC)
    inline def value: CFuncPtr8[GLuint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCOPYTEXTURESUBIMAGE3DPROC = CFuncPtr9[GLuint, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit]
object PFNGLCOPYTEXTURESUBIMAGE3DPROC:
  given _tag: Tag[PFNGLCOPYTEXTURESUBIMAGE3DPROC] = Tag.materializeCFuncPtr9[GLuint, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCOPYTEXTURESUBIMAGE3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr9[GLuint, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit]): PFNGLCOPYTEXTURESUBIMAGE3DPROC = o
  extension (v: PFNGLCOPYTEXTURESUBIMAGE3DPROC)
    inline def value: CFuncPtr9[GLuint, GLint, GLint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCREATEBUFFERSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLCREATEBUFFERSPROC:
  given _tag: Tag[PFNGLCREATEBUFFERSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCREATEBUFFERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLCREATEBUFFERSPROC = o
  extension (v: PFNGLCREATEBUFFERSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCREATEFRAMEBUFFERSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLCREATEFRAMEBUFFERSPROC:
  given _tag: Tag[PFNGLCREATEFRAMEBUFFERSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCREATEFRAMEBUFFERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLCREATEFRAMEBUFFERSPROC = o
  extension (v: PFNGLCREATEFRAMEBUFFERSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCREATEPROGRAMPIPELINESPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLCREATEPROGRAMPIPELINESPROC:
  given _tag: Tag[PFNGLCREATEPROGRAMPIPELINESPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCREATEPROGRAMPIPELINESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLCREATEPROGRAMPIPELINESPROC = o
  extension (v: PFNGLCREATEPROGRAMPIPELINESPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCREATEPROGRAMPROC = CFuncPtr0[GLuint]
object PFNGLCREATEPROGRAMPROC:
  given _tag: Tag[PFNGLCREATEPROGRAMPROC] = Tag.materializeCFuncPtr0[GLuint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCREATEPROGRAMPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[GLuint]): PFNGLCREATEPROGRAMPROC = o
  extension (v: PFNGLCREATEPROGRAMPROC)
    inline def value: CFuncPtr0[GLuint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCREATEQUERIESPROC = CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]
object PFNGLCREATEQUERIESPROC:
  given _tag: Tag[PFNGLCREATEQUERIESPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCREATEQUERIESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]): PFNGLCREATEQUERIESPROC = o
  extension (v: PFNGLCREATEQUERIESPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCREATERENDERBUFFERSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLCREATERENDERBUFFERSPROC:
  given _tag: Tag[PFNGLCREATERENDERBUFFERSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCREATERENDERBUFFERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLCREATERENDERBUFFERSPROC = o
  extension (v: PFNGLCREATERENDERBUFFERSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCREATESAMPLERSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLCREATESAMPLERSPROC:
  given _tag: Tag[PFNGLCREATESAMPLERSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCREATESAMPLERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLCREATESAMPLERSPROC = o
  extension (v: PFNGLCREATESAMPLERSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCREATESHADERPROC = CFuncPtr1[GLenum, GLuint]
object PFNGLCREATESHADERPROC:
  given _tag: Tag[PFNGLCREATESHADERPROC] = Tag.materializeCFuncPtr1[GLenum, GLuint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCREATESHADERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, GLuint]): PFNGLCREATESHADERPROC = o
  extension (v: PFNGLCREATESHADERPROC)
    inline def value: CFuncPtr1[GLenum, GLuint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCREATESHADERPROGRAMVPROC = CFuncPtr3[GLenum, GLsizei, Ptr[Ptr[GLchar]], GLuint]
object PFNGLCREATESHADERPROGRAMVPROC:
  given _tag: Tag[PFNGLCREATESHADERPROGRAMVPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[Ptr[GLchar]], GLuint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCREATESHADERPROGRAMVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[Ptr[GLchar]], GLuint]): PFNGLCREATESHADERPROGRAMVPROC = o
  extension (v: PFNGLCREATESHADERPROGRAMVPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[Ptr[GLchar]], GLuint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCREATETEXTURESPROC = CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]
object PFNGLCREATETEXTURESPROC:
  given _tag: Tag[PFNGLCREATETEXTURESPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCREATETEXTURESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]): PFNGLCREATETEXTURESPROC = o
  extension (v: PFNGLCREATETEXTURESPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCREATETRANSFORMFEEDBACKSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLCREATETRANSFORMFEEDBACKSPROC:
  given _tag: Tag[PFNGLCREATETRANSFORMFEEDBACKSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCREATETRANSFORMFEEDBACKSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLCREATETRANSFORMFEEDBACKSPROC = o
  extension (v: PFNGLCREATETRANSFORMFEEDBACKSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCREATEVERTEXARRAYSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLCREATEVERTEXARRAYSPROC:
  given _tag: Tag[PFNGLCREATEVERTEXARRAYSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCREATEVERTEXARRAYSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLCREATEVERTEXARRAYSPROC = o
  extension (v: PFNGLCREATEVERTEXARRAYSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLCULLFACEPROC = CFuncPtr1[GLenum, Unit]
object PFNGLCULLFACEPROC:
  given _tag: Tag[PFNGLCULLFACEPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLCULLFACEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLCULLFACEPROC = o
  extension (v: PFNGLCULLFACEPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDEBUGMESSAGECALLBACKPROC = CFuncPtr2[GLDEBUGPROC, Ptr[Byte], Unit]
object PFNGLDEBUGMESSAGECALLBACKPROC:
  given _tag: Tag[PFNGLDEBUGMESSAGECALLBACKPROC] = Tag.materializeCFuncPtr2[GLDEBUGPROC, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDEBUGMESSAGECALLBACKPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLDEBUGPROC, Ptr[Byte], Unit]): PFNGLDEBUGMESSAGECALLBACKPROC = o
  extension (v: PFNGLDEBUGMESSAGECALLBACKPROC)
    inline def value: CFuncPtr2[GLDEBUGPROC, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDEBUGMESSAGECONTROLPROC = CFuncPtr6[GLenum, GLenum, GLenum, GLsizei, Ptr[GLuint], GLboolean, Unit]
object PFNGLDEBUGMESSAGECONTROLPROC:
  given _tag: Tag[PFNGLDEBUGMESSAGECONTROLPROC] = Tag.materializeCFuncPtr6[GLenum, GLenum, GLenum, GLsizei, Ptr[GLuint], GLboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDEBUGMESSAGECONTROLPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLenum, GLenum, GLsizei, Ptr[GLuint], GLboolean, Unit]): PFNGLDEBUGMESSAGECONTROLPROC = o
  extension (v: PFNGLDEBUGMESSAGECONTROLPROC)
    inline def value: CFuncPtr6[GLenum, GLenum, GLenum, GLsizei, Ptr[GLuint], GLboolean, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDEBUGMESSAGEINSERTPROC = CFuncPtr6[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Unit]
object PFNGLDEBUGMESSAGEINSERTPROC:
  given _tag: Tag[PFNGLDEBUGMESSAGEINSERTPROC] = Tag.materializeCFuncPtr6[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDEBUGMESSAGEINSERTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Unit]): PFNGLDEBUGMESSAGEINSERTPROC = o
  extension (v: PFNGLDEBUGMESSAGEINSERTPROC)
    inline def value: CFuncPtr6[GLenum, GLenum, GLuint, GLenum, GLsizei, Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDELETEBUFFERSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLDELETEBUFFERSPROC:
  given _tag: Tag[PFNGLDELETEBUFFERSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDELETEBUFFERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLDELETEBUFFERSPROC = o
  extension (v: PFNGLDELETEBUFFERSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDELETEFRAMEBUFFERSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLDELETEFRAMEBUFFERSPROC:
  given _tag: Tag[PFNGLDELETEFRAMEBUFFERSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDELETEFRAMEBUFFERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLDELETEFRAMEBUFFERSPROC = o
  extension (v: PFNGLDELETEFRAMEBUFFERSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDELETELISTSPROC = CFuncPtr2[GLuint, GLsizei, Unit]
object PFNGLDELETELISTSPROC:
  given _tag: Tag[PFNGLDELETELISTSPROC] = Tag.materializeCFuncPtr2[GLuint, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDELETELISTSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLsizei, Unit]): PFNGLDELETELISTSPROC = o
  extension (v: PFNGLDELETELISTSPROC)
    inline def value: CFuncPtr2[GLuint, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDELETEPROGRAMPIPELINESPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLDELETEPROGRAMPIPELINESPROC:
  given _tag: Tag[PFNGLDELETEPROGRAMPIPELINESPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDELETEPROGRAMPIPELINESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLDELETEPROGRAMPIPELINESPROC = o
  extension (v: PFNGLDELETEPROGRAMPIPELINESPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDELETEPROGRAMPROC = CFuncPtr1[GLuint, Unit]
object PFNGLDELETEPROGRAMPROC:
  given _tag: Tag[PFNGLDELETEPROGRAMPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDELETEPROGRAMPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLDELETEPROGRAMPROC = o
  extension (v: PFNGLDELETEPROGRAMPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDELETEQUERIESPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLDELETEQUERIESPROC:
  given _tag: Tag[PFNGLDELETEQUERIESPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDELETEQUERIESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLDELETEQUERIESPROC = o
  extension (v: PFNGLDELETEQUERIESPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDELETERENDERBUFFERSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLDELETERENDERBUFFERSPROC:
  given _tag: Tag[PFNGLDELETERENDERBUFFERSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDELETERENDERBUFFERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLDELETERENDERBUFFERSPROC = o
  extension (v: PFNGLDELETERENDERBUFFERSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDELETESAMPLERSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLDELETESAMPLERSPROC:
  given _tag: Tag[PFNGLDELETESAMPLERSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDELETESAMPLERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLDELETESAMPLERSPROC = o
  extension (v: PFNGLDELETESAMPLERSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDELETESHADERPROC = CFuncPtr1[GLuint, Unit]
object PFNGLDELETESHADERPROC:
  given _tag: Tag[PFNGLDELETESHADERPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDELETESHADERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLDELETESHADERPROC = o
  extension (v: PFNGLDELETESHADERPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDELETESYNCPROC = CFuncPtr1[GLsync, Unit]
object PFNGLDELETESYNCPROC:
  given _tag: Tag[PFNGLDELETESYNCPROC] = Tag.materializeCFuncPtr1[GLsync, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDELETESYNCPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLsync, Unit]): PFNGLDELETESYNCPROC = o
  extension (v: PFNGLDELETESYNCPROC)
    inline def value: CFuncPtr1[GLsync, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDELETETEXTURESPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLDELETETEXTURESPROC:
  given _tag: Tag[PFNGLDELETETEXTURESPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDELETETEXTURESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLDELETETEXTURESPROC = o
  extension (v: PFNGLDELETETEXTURESPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDELETETRANSFORMFEEDBACKSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLDELETETRANSFORMFEEDBACKSPROC:
  given _tag: Tag[PFNGLDELETETRANSFORMFEEDBACKSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDELETETRANSFORMFEEDBACKSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLDELETETRANSFORMFEEDBACKSPROC = o
  extension (v: PFNGLDELETETRANSFORMFEEDBACKSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDELETEVERTEXARRAYSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLDELETEVERTEXARRAYSPROC:
  given _tag: Tag[PFNGLDELETEVERTEXARRAYSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDELETEVERTEXARRAYSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLDELETEVERTEXARRAYSPROC = o
  extension (v: PFNGLDELETEVERTEXARRAYSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDEPTHFUNCPROC = CFuncPtr1[GLenum, Unit]
object PFNGLDEPTHFUNCPROC:
  given _tag: Tag[PFNGLDEPTHFUNCPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDEPTHFUNCPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLDEPTHFUNCPROC = o
  extension (v: PFNGLDEPTHFUNCPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDEPTHMASKPROC = CFuncPtr1[GLboolean, Unit]
object PFNGLDEPTHMASKPROC:
  given _tag: Tag[PFNGLDEPTHMASKPROC] = Tag.materializeCFuncPtr1[GLboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDEPTHMASKPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLboolean, Unit]): PFNGLDEPTHMASKPROC = o
  extension (v: PFNGLDEPTHMASKPROC)
    inline def value: CFuncPtr1[GLboolean, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDEPTHRANGEARRAYVPROC = CFuncPtr3[GLuint, GLsizei, Ptr[GLdouble], Unit]
object PFNGLDEPTHRANGEARRAYVPROC:
  given _tag: Tag[PFNGLDEPTHRANGEARRAYVPROC] = Tag.materializeCFuncPtr3[GLuint, GLsizei, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDEPTHRANGEARRAYVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLsizei, Ptr[GLdouble], Unit]): PFNGLDEPTHRANGEARRAYVPROC = o
  extension (v: PFNGLDEPTHRANGEARRAYVPROC)
    inline def value: CFuncPtr3[GLuint, GLsizei, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDEPTHRANGEFPROC = CFuncPtr2[GLfloat, GLfloat, Unit]
object PFNGLDEPTHRANGEFPROC:
  given _tag: Tag[PFNGLDEPTHRANGEFPROC] = Tag.materializeCFuncPtr2[GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDEPTHRANGEFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLfloat, GLfloat, Unit]): PFNGLDEPTHRANGEFPROC = o
  extension (v: PFNGLDEPTHRANGEFPROC)
    inline def value: CFuncPtr2[GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDEPTHRANGEINDEXEDPROC = CFuncPtr3[GLuint, GLdouble, GLdouble, Unit]
object PFNGLDEPTHRANGEINDEXEDPROC:
  given _tag: Tag[PFNGLDEPTHRANGEINDEXEDPROC] = Tag.materializeCFuncPtr3[GLuint, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDEPTHRANGEINDEXEDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLdouble, GLdouble, Unit]): PFNGLDEPTHRANGEINDEXEDPROC = o
  extension (v: PFNGLDEPTHRANGEINDEXEDPROC)
    inline def value: CFuncPtr3[GLuint, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDEPTHRANGEPROC = CFuncPtr2[GLdouble, GLdouble, Unit]
object PFNGLDEPTHRANGEPROC:
  given _tag: Tag[PFNGLDEPTHRANGEPROC] = Tag.materializeCFuncPtr2[GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDEPTHRANGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLdouble, GLdouble, Unit]): PFNGLDEPTHRANGEPROC = o
  extension (v: PFNGLDEPTHRANGEPROC)
    inline def value: CFuncPtr2[GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDETACHSHADERPROC = CFuncPtr2[GLuint, GLuint, Unit]
object PFNGLDETACHSHADERPROC:
  given _tag: Tag[PFNGLDETACHSHADERPROC] = Tag.materializeCFuncPtr2[GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDETACHSHADERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLuint, Unit]): PFNGLDETACHSHADERPROC = o
  extension (v: PFNGLDETACHSHADERPROC)
    inline def value: CFuncPtr2[GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDISABLECLIENTSTATEPROC = CFuncPtr1[GLenum, Unit]
object PFNGLDISABLECLIENTSTATEPROC:
  given _tag: Tag[PFNGLDISABLECLIENTSTATEPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDISABLECLIENTSTATEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLDISABLECLIENTSTATEPROC = o
  extension (v: PFNGLDISABLECLIENTSTATEPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDISABLEIPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLDISABLEIPROC:
  given _tag: Tag[PFNGLDISABLEIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDISABLEIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLDISABLEIPROC = o
  extension (v: PFNGLDISABLEIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDISABLEPROC = CFuncPtr1[GLenum, Unit]
object PFNGLDISABLEPROC:
  given _tag: Tag[PFNGLDISABLEPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDISABLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLDISABLEPROC = o
  extension (v: PFNGLDISABLEPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDISABLEVERTEXARRAYATTRIBPROC = CFuncPtr2[GLuint, GLuint, Unit]
object PFNGLDISABLEVERTEXARRAYATTRIBPROC:
  given _tag: Tag[PFNGLDISABLEVERTEXARRAYATTRIBPROC] = Tag.materializeCFuncPtr2[GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDISABLEVERTEXARRAYATTRIBPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLuint, Unit]): PFNGLDISABLEVERTEXARRAYATTRIBPROC = o
  extension (v: PFNGLDISABLEVERTEXARRAYATTRIBPROC)
    inline def value: CFuncPtr2[GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDISABLEVERTEXATTRIBARRAYPROC = CFuncPtr1[GLuint, Unit]
object PFNGLDISABLEVERTEXATTRIBARRAYPROC:
  given _tag: Tag[PFNGLDISABLEVERTEXATTRIBARRAYPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDISABLEVERTEXATTRIBARRAYPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLDISABLEVERTEXATTRIBARRAYPROC = o
  extension (v: PFNGLDISABLEVERTEXATTRIBARRAYPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDISPATCHCOMPUTEINDIRECTPROC = CFuncPtr1[GLintptr, Unit]
object PFNGLDISPATCHCOMPUTEINDIRECTPROC:
  given _tag: Tag[PFNGLDISPATCHCOMPUTEINDIRECTPROC] = Tag.materializeCFuncPtr1[GLintptr, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDISPATCHCOMPUTEINDIRECTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLintptr, Unit]): PFNGLDISPATCHCOMPUTEINDIRECTPROC = o
  extension (v: PFNGLDISPATCHCOMPUTEINDIRECTPROC)
    inline def value: CFuncPtr1[GLintptr, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDISPATCHCOMPUTEPROC = CFuncPtr3[GLuint, GLuint, GLuint, Unit]
object PFNGLDISPATCHCOMPUTEPROC:
  given _tag: Tag[PFNGLDISPATCHCOMPUTEPROC] = Tag.materializeCFuncPtr3[GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDISPATCHCOMPUTEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLuint, GLuint, Unit]): PFNGLDISPATCHCOMPUTEPROC = o
  extension (v: PFNGLDISPATCHCOMPUTEPROC)
    inline def value: CFuncPtr3[GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWARRAYSINDIRECTPROC = CFuncPtr2[GLenum, Ptr[Byte], Unit]
object PFNGLDRAWARRAYSINDIRECTPROC:
  given _tag: Tag[PFNGLDRAWARRAYSINDIRECTPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWARRAYSINDIRECTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[Byte], Unit]): PFNGLDRAWARRAYSINDIRECTPROC = o
  extension (v: PFNGLDRAWARRAYSINDIRECTPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWARRAYSINSTANCEDBASEINSTANCEPROC = CFuncPtr5[GLenum, GLint, GLsizei, GLsizei, GLuint, Unit]
object PFNGLDRAWARRAYSINSTANCEDBASEINSTANCEPROC:
  given _tag: Tag[PFNGLDRAWARRAYSINSTANCEDBASEINSTANCEPROC] = Tag.materializeCFuncPtr5[GLenum, GLint, GLsizei, GLsizei, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWARRAYSINSTANCEDBASEINSTANCEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLint, GLsizei, GLsizei, GLuint, Unit]): PFNGLDRAWARRAYSINSTANCEDBASEINSTANCEPROC = o
  extension (v: PFNGLDRAWARRAYSINSTANCEDBASEINSTANCEPROC)
    inline def value: CFuncPtr5[GLenum, GLint, GLsizei, GLsizei, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWARRAYSINSTANCEDPROC = CFuncPtr4[GLenum, GLint, GLsizei, GLsizei, Unit]
object PFNGLDRAWARRAYSINSTANCEDPROC:
  given _tag: Tag[PFNGLDRAWARRAYSINSTANCEDPROC] = Tag.materializeCFuncPtr4[GLenum, GLint, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWARRAYSINSTANCEDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLint, GLsizei, GLsizei, Unit]): PFNGLDRAWARRAYSINSTANCEDPROC = o
  extension (v: PFNGLDRAWARRAYSINSTANCEDPROC)
    inline def value: CFuncPtr4[GLenum, GLint, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWARRAYSPROC = CFuncPtr3[GLenum, GLint, GLsizei, Unit]
object PFNGLDRAWARRAYSPROC:
  given _tag: Tag[PFNGLDRAWARRAYSPROC] = Tag.materializeCFuncPtr3[GLenum, GLint, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWARRAYSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLint, GLsizei, Unit]): PFNGLDRAWARRAYSPROC = o
  extension (v: PFNGLDRAWARRAYSPROC)
    inline def value: CFuncPtr3[GLenum, GLint, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWBUFFERPROC = CFuncPtr1[GLenum, Unit]
object PFNGLDRAWBUFFERPROC:
  given _tag: Tag[PFNGLDRAWBUFFERPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLDRAWBUFFERPROC = o
  extension (v: PFNGLDRAWBUFFERPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWBUFFERSPROC = CFuncPtr2[GLsizei, Ptr[GLenum], Unit]
object PFNGLDRAWBUFFERSPROC:
  given _tag: Tag[PFNGLDRAWBUFFERSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLenum], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWBUFFERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLenum], Unit]): PFNGLDRAWBUFFERSPROC = o
  extension (v: PFNGLDRAWBUFFERSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLenum], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWELEMENTSBASEVERTEXPROC = CFuncPtr5[GLenum, GLsizei, GLenum, Ptr[Byte], GLint, Unit]
object PFNGLDRAWELEMENTSBASEVERTEXPROC:
  given _tag: Tag[PFNGLDRAWELEMENTSBASEVERTEXPROC] = Tag.materializeCFuncPtr5[GLenum, GLsizei, GLenum, Ptr[Byte], GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWELEMENTSBASEVERTEXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLsizei, GLenum, Ptr[Byte], GLint, Unit]): PFNGLDRAWELEMENTSBASEVERTEXPROC = o
  extension (v: PFNGLDRAWELEMENTSBASEVERTEXPROC)
    inline def value: CFuncPtr5[GLenum, GLsizei, GLenum, Ptr[Byte], GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWELEMENTSINDIRECTPROC = CFuncPtr3[GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLDRAWELEMENTSINDIRECTPROC:
  given _tag: Tag[PFNGLDRAWELEMENTSINDIRECTPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWELEMENTSINDIRECTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[Byte], Unit]): PFNGLDRAWELEMENTSINDIRECTPROC = o
  extension (v: PFNGLDRAWELEMENTSINDIRECTPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC = CFuncPtr6[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, GLuint, Unit]
object PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC:
  given _tag: Tag[PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC] = Tag.materializeCFuncPtr6[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, GLuint, Unit]): PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC = o
  extension (v: PFNGLDRAWELEMENTSINSTANCEDBASEINSTANCEPROC)
    inline def value: CFuncPtr6[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXBASEINSTANCEPROC = CFuncPtr7[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, GLint, GLuint, Unit]
object PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXBASEINSTANCEPROC:
  given _tag: Tag[PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXBASEINSTANCEPROC] = Tag.materializeCFuncPtr7[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, GLint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXBASEINSTANCEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, GLint, GLuint, Unit]): PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXBASEINSTANCEPROC = o
  extension (v: PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXBASEINSTANCEPROC)
    inline def value: CFuncPtr7[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, GLint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC = CFuncPtr6[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, GLint, Unit]
object PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC:
  given _tag: Tag[PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC] = Tag.materializeCFuncPtr6[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, GLint, Unit]): PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC = o
  extension (v: PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC)
    inline def value: CFuncPtr6[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWELEMENTSINSTANCEDPROC = CFuncPtr5[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, Unit]
object PFNGLDRAWELEMENTSINSTANCEDPROC:
  given _tag: Tag[PFNGLDRAWELEMENTSINSTANCEDPROC] = Tag.materializeCFuncPtr5[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWELEMENTSINSTANCEDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, Unit]): PFNGLDRAWELEMENTSINSTANCEDPROC = o
  extension (v: PFNGLDRAWELEMENTSINSTANCEDPROC)
    inline def value: CFuncPtr5[GLenum, GLsizei, GLenum, Ptr[Byte], GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWELEMENTSPROC = CFuncPtr4[GLenum, GLsizei, GLenum, Ptr[Byte], Unit]
object PFNGLDRAWELEMENTSPROC:
  given _tag: Tag[PFNGLDRAWELEMENTSPROC] = Tag.materializeCFuncPtr4[GLenum, GLsizei, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWELEMENTSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLsizei, GLenum, Ptr[Byte], Unit]): PFNGLDRAWELEMENTSPROC = o
  extension (v: PFNGLDRAWELEMENTSPROC)
    inline def value: CFuncPtr4[GLenum, GLsizei, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWPIXELSPROC = CFuncPtr5[GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLDRAWPIXELSPROC:
  given _tag: Tag[PFNGLDRAWPIXELSPROC] = Tag.materializeCFuncPtr5[GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWPIXELSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLDRAWPIXELSPROC = o
  extension (v: PFNGLDRAWPIXELSPROC)
    inline def value: CFuncPtr5[GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC = CFuncPtr7[GLenum, GLuint, GLuint, GLsizei, GLenum, Ptr[Byte], GLint, Unit]
object PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC:
  given _tag: Tag[PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC] = Tag.materializeCFuncPtr7[GLenum, GLuint, GLuint, GLsizei, GLenum, Ptr[Byte], GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLenum, GLuint, GLuint, GLsizei, GLenum, Ptr[Byte], GLint, Unit]): PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC = o
  extension (v: PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC)
    inline def value: CFuncPtr7[GLenum, GLuint, GLuint, GLsizei, GLenum, Ptr[Byte], GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWRANGEELEMENTSPROC = CFuncPtr6[GLenum, GLuint, GLuint, GLsizei, GLenum, Ptr[Byte], Unit]
object PFNGLDRAWRANGEELEMENTSPROC:
  given _tag: Tag[PFNGLDRAWRANGEELEMENTSPROC] = Tag.materializeCFuncPtr6[GLenum, GLuint, GLuint, GLsizei, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWRANGEELEMENTSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLuint, GLuint, GLsizei, GLenum, Ptr[Byte], Unit]): PFNGLDRAWRANGEELEMENTSPROC = o
  extension (v: PFNGLDRAWRANGEELEMENTSPROC)
    inline def value: CFuncPtr6[GLenum, GLuint, GLuint, GLsizei, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC = CFuncPtr3[GLenum, GLuint, GLsizei, Unit]
object PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC:
  given _tag: Tag[PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC] = Tag.materializeCFuncPtr3[GLenum, GLuint, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLuint, GLsizei, Unit]): PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC = o
  extension (v: PFNGLDRAWTRANSFORMFEEDBACKINSTANCEDPROC)
    inline def value: CFuncPtr3[GLenum, GLuint, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWTRANSFORMFEEDBACKPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLDRAWTRANSFORMFEEDBACKPROC:
  given _tag: Tag[PFNGLDRAWTRANSFORMFEEDBACKPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWTRANSFORMFEEDBACKPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLDRAWTRANSFORMFEEDBACKPROC = o
  extension (v: PFNGLDRAWTRANSFORMFEEDBACKPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWTRANSFORMFEEDBACKSTREAMINSTANCEDPROC = CFuncPtr4[GLenum, GLuint, GLuint, GLsizei, Unit]
object PFNGLDRAWTRANSFORMFEEDBACKSTREAMINSTANCEDPROC:
  given _tag: Tag[PFNGLDRAWTRANSFORMFEEDBACKSTREAMINSTANCEDPROC] = Tag.materializeCFuncPtr4[GLenum, GLuint, GLuint, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWTRANSFORMFEEDBACKSTREAMINSTANCEDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLuint, GLuint, GLsizei, Unit]): PFNGLDRAWTRANSFORMFEEDBACKSTREAMINSTANCEDPROC = o
  extension (v: PFNGLDRAWTRANSFORMFEEDBACKSTREAMINSTANCEDPROC)
    inline def value: CFuncPtr4[GLenum, GLuint, GLuint, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC = CFuncPtr3[GLenum, GLuint, GLuint, Unit]
object PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC:
  given _tag: Tag[PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC] = Tag.materializeCFuncPtr3[GLenum, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLuint, GLuint, Unit]): PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC = o
  extension (v: PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC)
    inline def value: CFuncPtr3[GLenum, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEDGEFLAGPOINTERPROC = CFuncPtr2[GLsizei, Ptr[Byte], Unit]
object PFNGLEDGEFLAGPOINTERPROC:
  given _tag: Tag[PFNGLEDGEFLAGPOINTERPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEDGEFLAGPOINTERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[Byte], Unit]): PFNGLEDGEFLAGPOINTERPROC = o
  extension (v: PFNGLEDGEFLAGPOINTERPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEDGEFLAGPROC = CFuncPtr1[GLboolean, Unit]
object PFNGLEDGEFLAGPROC:
  given _tag: Tag[PFNGLEDGEFLAGPROC] = Tag.materializeCFuncPtr1[GLboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEDGEFLAGPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLboolean, Unit]): PFNGLEDGEFLAGPROC = o
  extension (v: PFNGLEDGEFLAGPROC)
    inline def value: CFuncPtr1[GLboolean, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEDGEFLAGVPROC = CFuncPtr1[Ptr[GLboolean], Unit]
object PFNGLEDGEFLAGVPROC:
  given _tag: Tag[PFNGLEDGEFLAGVPROC] = Tag.materializeCFuncPtr1[Ptr[GLboolean], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEDGEFLAGVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLboolean], Unit]): PFNGLEDGEFLAGVPROC = o
  extension (v: PFNGLEDGEFLAGVPROC)
    inline def value: CFuncPtr1[Ptr[GLboolean], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLENABLECLIENTSTATEPROC = CFuncPtr1[GLenum, Unit]
object PFNGLENABLECLIENTSTATEPROC:
  given _tag: Tag[PFNGLENABLECLIENTSTATEPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLENABLECLIENTSTATEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLENABLECLIENTSTATEPROC = o
  extension (v: PFNGLENABLECLIENTSTATEPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLENABLEIPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLENABLEIPROC:
  given _tag: Tag[PFNGLENABLEIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLENABLEIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLENABLEIPROC = o
  extension (v: PFNGLENABLEIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLENABLEPROC = CFuncPtr1[GLenum, Unit]
object PFNGLENABLEPROC:
  given _tag: Tag[PFNGLENABLEPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLENABLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLENABLEPROC = o
  extension (v: PFNGLENABLEPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLENABLEVERTEXARRAYATTRIBPROC = CFuncPtr2[GLuint, GLuint, Unit]
object PFNGLENABLEVERTEXARRAYATTRIBPROC:
  given _tag: Tag[PFNGLENABLEVERTEXARRAYATTRIBPROC] = Tag.materializeCFuncPtr2[GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLENABLEVERTEXARRAYATTRIBPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLuint, Unit]): PFNGLENABLEVERTEXARRAYATTRIBPROC = o
  extension (v: PFNGLENABLEVERTEXARRAYATTRIBPROC)
    inline def value: CFuncPtr2[GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLENABLEVERTEXATTRIBARRAYPROC = CFuncPtr1[GLuint, Unit]
object PFNGLENABLEVERTEXATTRIBARRAYPROC:
  given _tag: Tag[PFNGLENABLEVERTEXATTRIBARRAYPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLENABLEVERTEXATTRIBARRAYPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLENABLEVERTEXATTRIBARRAYPROC = o
  extension (v: PFNGLENABLEVERTEXATTRIBARRAYPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLENDCONDITIONALRENDERPROC = CFuncPtr0[Unit]
object PFNGLENDCONDITIONALRENDERPROC:
  given _tag: Tag[PFNGLENDCONDITIONALRENDERPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLENDCONDITIONALRENDERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLENDCONDITIONALRENDERPROC = o
  extension (v: PFNGLENDCONDITIONALRENDERPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLENDLISTPROC = CFuncPtr0[Unit]
object PFNGLENDLISTPROC:
  given _tag: Tag[PFNGLENDLISTPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLENDLISTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLENDLISTPROC = o
  extension (v: PFNGLENDLISTPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLENDPROC = CFuncPtr0[Unit]
object PFNGLENDPROC:
  given _tag: Tag[PFNGLENDPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLENDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLENDPROC = o
  extension (v: PFNGLENDPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLENDQUERYINDEXEDPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLENDQUERYINDEXEDPROC:
  given _tag: Tag[PFNGLENDQUERYINDEXEDPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLENDQUERYINDEXEDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLENDQUERYINDEXEDPROC = o
  extension (v: PFNGLENDQUERYINDEXEDPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLENDQUERYPROC = CFuncPtr1[GLenum, Unit]
object PFNGLENDQUERYPROC:
  given _tag: Tag[PFNGLENDQUERYPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLENDQUERYPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLENDQUERYPROC = o
  extension (v: PFNGLENDQUERYPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLENDTRANSFORMFEEDBACKPROC = CFuncPtr0[Unit]
object PFNGLENDTRANSFORMFEEDBACKPROC:
  given _tag: Tag[PFNGLENDTRANSFORMFEEDBACKPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLENDTRANSFORMFEEDBACKPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLENDTRANSFORMFEEDBACKPROC = o
  extension (v: PFNGLENDTRANSFORMFEEDBACKPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEVALCOORD1DPROC = CFuncPtr1[GLdouble, Unit]
object PFNGLEVALCOORD1DPROC:
  given _tag: Tag[PFNGLEVALCOORD1DPROC] = Tag.materializeCFuncPtr1[GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEVALCOORD1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLdouble, Unit]): PFNGLEVALCOORD1DPROC = o
  extension (v: PFNGLEVALCOORD1DPROC)
    inline def value: CFuncPtr1[GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEVALCOORD1DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLEVALCOORD1DVPROC:
  given _tag: Tag[PFNGLEVALCOORD1DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEVALCOORD1DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLEVALCOORD1DVPROC = o
  extension (v: PFNGLEVALCOORD1DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEVALCOORD1FPROC = CFuncPtr1[GLfloat, Unit]
object PFNGLEVALCOORD1FPROC:
  given _tag: Tag[PFNGLEVALCOORD1FPROC] = Tag.materializeCFuncPtr1[GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEVALCOORD1FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLfloat, Unit]): PFNGLEVALCOORD1FPROC = o
  extension (v: PFNGLEVALCOORD1FPROC)
    inline def value: CFuncPtr1[GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEVALCOORD1FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLEVALCOORD1FVPROC:
  given _tag: Tag[PFNGLEVALCOORD1FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEVALCOORD1FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLEVALCOORD1FVPROC = o
  extension (v: PFNGLEVALCOORD1FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEVALCOORD2DPROC = CFuncPtr2[GLdouble, GLdouble, Unit]
object PFNGLEVALCOORD2DPROC:
  given _tag: Tag[PFNGLEVALCOORD2DPROC] = Tag.materializeCFuncPtr2[GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEVALCOORD2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLdouble, GLdouble, Unit]): PFNGLEVALCOORD2DPROC = o
  extension (v: PFNGLEVALCOORD2DPROC)
    inline def value: CFuncPtr2[GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEVALCOORD2DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLEVALCOORD2DVPROC:
  given _tag: Tag[PFNGLEVALCOORD2DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEVALCOORD2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLEVALCOORD2DVPROC = o
  extension (v: PFNGLEVALCOORD2DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEVALCOORD2FPROC = CFuncPtr2[GLfloat, GLfloat, Unit]
object PFNGLEVALCOORD2FPROC:
  given _tag: Tag[PFNGLEVALCOORD2FPROC] = Tag.materializeCFuncPtr2[GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEVALCOORD2FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLfloat, GLfloat, Unit]): PFNGLEVALCOORD2FPROC = o
  extension (v: PFNGLEVALCOORD2FPROC)
    inline def value: CFuncPtr2[GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEVALCOORD2FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLEVALCOORD2FVPROC:
  given _tag: Tag[PFNGLEVALCOORD2FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEVALCOORD2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLEVALCOORD2FVPROC = o
  extension (v: PFNGLEVALCOORD2FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEVALMESH1PROC = CFuncPtr3[GLenum, GLint, GLint, Unit]
object PFNGLEVALMESH1PROC:
  given _tag: Tag[PFNGLEVALMESH1PROC] = Tag.materializeCFuncPtr3[GLenum, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEVALMESH1PROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLint, GLint, Unit]): PFNGLEVALMESH1PROC = o
  extension (v: PFNGLEVALMESH1PROC)
    inline def value: CFuncPtr3[GLenum, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEVALMESH2PROC = CFuncPtr5[GLenum, GLint, GLint, GLint, GLint, Unit]
object PFNGLEVALMESH2PROC:
  given _tag: Tag[PFNGLEVALMESH2PROC] = Tag.materializeCFuncPtr5[GLenum, GLint, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEVALMESH2PROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLint, GLint, GLint, GLint, Unit]): PFNGLEVALMESH2PROC = o
  extension (v: PFNGLEVALMESH2PROC)
    inline def value: CFuncPtr5[GLenum, GLint, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEVALPOINT1PROC = CFuncPtr1[GLint, Unit]
object PFNGLEVALPOINT1PROC:
  given _tag: Tag[PFNGLEVALPOINT1PROC] = Tag.materializeCFuncPtr1[GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEVALPOINT1PROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLint, Unit]): PFNGLEVALPOINT1PROC = o
  extension (v: PFNGLEVALPOINT1PROC)
    inline def value: CFuncPtr1[GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLEVALPOINT2PROC = CFuncPtr2[GLint, GLint, Unit]
object PFNGLEVALPOINT2PROC:
  given _tag: Tag[PFNGLEVALPOINT2PROC] = Tag.materializeCFuncPtr2[GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLEVALPOINT2PROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLint, GLint, Unit]): PFNGLEVALPOINT2PROC = o
  extension (v: PFNGLEVALPOINT2PROC)
    inline def value: CFuncPtr2[GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFEEDBACKBUFFERPROC = CFuncPtr3[GLsizei, GLenum, Ptr[GLfloat], Unit]
object PFNGLFEEDBACKBUFFERPROC:
  given _tag: Tag[PFNGLFEEDBACKBUFFERPROC] = Tag.materializeCFuncPtr3[GLsizei, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFEEDBACKBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLsizei, GLenum, Ptr[GLfloat], Unit]): PFNGLFEEDBACKBUFFERPROC = o
  extension (v: PFNGLFEEDBACKBUFFERPROC)
    inline def value: CFuncPtr3[GLsizei, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFENCESYNCPROC = CFuncPtr2[GLenum, GLbitfield, GLsync]
object PFNGLFENCESYNCPROC:
  given _tag: Tag[PFNGLFENCESYNCPROC] = Tag.materializeCFuncPtr2[GLenum, GLbitfield, GLsync]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFENCESYNCPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLbitfield, GLsync]): PFNGLFENCESYNCPROC = o
  extension (v: PFNGLFENCESYNCPROC)
    inline def value: CFuncPtr2[GLenum, GLbitfield, GLsync] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFINISHPROC = CFuncPtr0[Unit]
object PFNGLFINISHPROC:
  given _tag: Tag[PFNGLFINISHPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFINISHPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLFINISHPROC = o
  extension (v: PFNGLFINISHPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFLUSHMAPPEDBUFFERRANGEPROC = CFuncPtr3[GLenum, GLintptr, GLsizeiptr, Unit]
object PFNGLFLUSHMAPPEDBUFFERRANGEPROC:
  given _tag: Tag[PFNGLFLUSHMAPPEDBUFFERRANGEPROC] = Tag.materializeCFuncPtr3[GLenum, GLintptr, GLsizeiptr, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFLUSHMAPPEDBUFFERRANGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLintptr, GLsizeiptr, Unit]): PFNGLFLUSHMAPPEDBUFFERRANGEPROC = o
  extension (v: PFNGLFLUSHMAPPEDBUFFERRANGEPROC)
    inline def value: CFuncPtr3[GLenum, GLintptr, GLsizeiptr, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEPROC = CFuncPtr3[GLuint, GLintptr, GLsizeiptr, Unit]
object PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEPROC:
  given _tag: Tag[PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEPROC] = Tag.materializeCFuncPtr3[GLuint, GLintptr, GLsizeiptr, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLintptr, GLsizeiptr, Unit]): PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEPROC = o
  extension (v: PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEPROC)
    inline def value: CFuncPtr3[GLuint, GLintptr, GLsizeiptr, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFLUSHPROC = CFuncPtr0[Unit]
object PFNGLFLUSHPROC:
  given _tag: Tag[PFNGLFLUSHPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFLUSHPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLFLUSHPROC = o
  extension (v: PFNGLFLUSHPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFOGCOORDDPROC = CFuncPtr1[GLdouble, Unit]
object PFNGLFOGCOORDDPROC:
  given _tag: Tag[PFNGLFOGCOORDDPROC] = Tag.materializeCFuncPtr1[GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFOGCOORDDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLdouble, Unit]): PFNGLFOGCOORDDPROC = o
  extension (v: PFNGLFOGCOORDDPROC)
    inline def value: CFuncPtr1[GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFOGCOORDDVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLFOGCOORDDVPROC:
  given _tag: Tag[PFNGLFOGCOORDDVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFOGCOORDDVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLFOGCOORDDVPROC = o
  extension (v: PFNGLFOGCOORDDVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFOGCOORDFPROC = CFuncPtr1[GLfloat, Unit]
object PFNGLFOGCOORDFPROC:
  given _tag: Tag[PFNGLFOGCOORDFPROC] = Tag.materializeCFuncPtr1[GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFOGCOORDFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLfloat, Unit]): PFNGLFOGCOORDFPROC = o
  extension (v: PFNGLFOGCOORDFPROC)
    inline def value: CFuncPtr1[GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFOGCOORDFVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLFOGCOORDFVPROC:
  given _tag: Tag[PFNGLFOGCOORDFVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFOGCOORDFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLFOGCOORDFVPROC = o
  extension (v: PFNGLFOGCOORDFVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFOGCOORDPOINTERPROC = CFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLFOGCOORDPOINTERPROC:
  given _tag: Tag[PFNGLFOGCOORDPOINTERPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFOGCOORDPOINTERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLFOGCOORDPOINTERPROC = o
  extension (v: PFNGLFOGCOORDPOINTERPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFOGFPROC = CFuncPtr2[GLenum, GLfloat, Unit]
object PFNGLFOGFPROC:
  given _tag: Tag[PFNGLFOGFPROC] = Tag.materializeCFuncPtr2[GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFOGFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLfloat, Unit]): PFNGLFOGFPROC = o
  extension (v: PFNGLFOGFPROC)
    inline def value: CFuncPtr2[GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFOGFVPROC = CFuncPtr2[GLenum, Ptr[GLfloat], Unit]
object PFNGLFOGFVPROC:
  given _tag: Tag[PFNGLFOGFVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFOGFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLfloat], Unit]): PFNGLFOGFVPROC = o
  extension (v: PFNGLFOGFVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFOGIPROC = CFuncPtr2[GLenum, GLint, Unit]
object PFNGLFOGIPROC:
  given _tag: Tag[PFNGLFOGIPROC] = Tag.materializeCFuncPtr2[GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFOGIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLint, Unit]): PFNGLFOGIPROC = o
  extension (v: PFNGLFOGIPROC)
    inline def value: CFuncPtr2[GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFOGIVPROC = CFuncPtr2[GLenum, Ptr[GLint], Unit]
object PFNGLFOGIVPROC:
  given _tag: Tag[PFNGLFOGIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFOGIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLint], Unit]): PFNGLFOGIVPROC = o
  extension (v: PFNGLFOGIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFRAMEBUFFERPARAMETERIPROC = CFuncPtr3[GLenum, GLenum, GLint, Unit]
object PFNGLFRAMEBUFFERPARAMETERIPROC:
  given _tag: Tag[PFNGLFRAMEBUFFERPARAMETERIPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFRAMEBUFFERPARAMETERIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLint, Unit]): PFNGLFRAMEBUFFERPARAMETERIPROC = o
  extension (v: PFNGLFRAMEBUFFERPARAMETERIPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFRAMEBUFFERRENDERBUFFERPROC = CFuncPtr4[GLenum, GLenum, GLenum, GLuint, Unit]
object PFNGLFRAMEBUFFERRENDERBUFFERPROC:
  given _tag: Tag[PFNGLFRAMEBUFFERRENDERBUFFERPROC] = Tag.materializeCFuncPtr4[GLenum, GLenum, GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFRAMEBUFFERRENDERBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLenum, GLenum, GLuint, Unit]): PFNGLFRAMEBUFFERRENDERBUFFERPROC = o
  extension (v: PFNGLFRAMEBUFFERRENDERBUFFERPROC)
    inline def value: CFuncPtr4[GLenum, GLenum, GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFRAMEBUFFERTEXTURE1DPROC = CFuncPtr5[GLenum, GLenum, GLenum, GLuint, GLint, Unit]
object PFNGLFRAMEBUFFERTEXTURE1DPROC:
  given _tag: Tag[PFNGLFRAMEBUFFERTEXTURE1DPROC] = Tag.materializeCFuncPtr5[GLenum, GLenum, GLenum, GLuint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFRAMEBUFFERTEXTURE1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLenum, GLenum, GLuint, GLint, Unit]): PFNGLFRAMEBUFFERTEXTURE1DPROC = o
  extension (v: PFNGLFRAMEBUFFERTEXTURE1DPROC)
    inline def value: CFuncPtr5[GLenum, GLenum, GLenum, GLuint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFRAMEBUFFERTEXTURE2DPROC = CFuncPtr5[GLenum, GLenum, GLenum, GLuint, GLint, Unit]
object PFNGLFRAMEBUFFERTEXTURE2DPROC:
  given _tag: Tag[PFNGLFRAMEBUFFERTEXTURE2DPROC] = Tag.materializeCFuncPtr5[GLenum, GLenum, GLenum, GLuint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFRAMEBUFFERTEXTURE2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLenum, GLenum, GLuint, GLint, Unit]): PFNGLFRAMEBUFFERTEXTURE2DPROC = o
  extension (v: PFNGLFRAMEBUFFERTEXTURE2DPROC)
    inline def value: CFuncPtr5[GLenum, GLenum, GLenum, GLuint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFRAMEBUFFERTEXTURE3DPROC = CFuncPtr6[GLenum, GLenum, GLenum, GLuint, GLint, GLint, Unit]
object PFNGLFRAMEBUFFERTEXTURE3DPROC:
  given _tag: Tag[PFNGLFRAMEBUFFERTEXTURE3DPROC] = Tag.materializeCFuncPtr6[GLenum, GLenum, GLenum, GLuint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFRAMEBUFFERTEXTURE3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLenum, GLenum, GLuint, GLint, GLint, Unit]): PFNGLFRAMEBUFFERTEXTURE3DPROC = o
  extension (v: PFNGLFRAMEBUFFERTEXTURE3DPROC)
    inline def value: CFuncPtr6[GLenum, GLenum, GLenum, GLuint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFRAMEBUFFERTEXTURELAYERPROC = CFuncPtr5[GLenum, GLenum, GLuint, GLint, GLint, Unit]
object PFNGLFRAMEBUFFERTEXTURELAYERPROC:
  given _tag: Tag[PFNGLFRAMEBUFFERTEXTURELAYERPROC] = Tag.materializeCFuncPtr5[GLenum, GLenum, GLuint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFRAMEBUFFERTEXTURELAYERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLenum, GLuint, GLint, GLint, Unit]): PFNGLFRAMEBUFFERTEXTURELAYERPROC = o
  extension (v: PFNGLFRAMEBUFFERTEXTURELAYERPROC)
    inline def value: CFuncPtr5[GLenum, GLenum, GLuint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFRAMEBUFFERTEXTUREPROC = CFuncPtr4[GLenum, GLenum, GLuint, GLint, Unit]
object PFNGLFRAMEBUFFERTEXTUREPROC:
  given _tag: Tag[PFNGLFRAMEBUFFERTEXTUREPROC] = Tag.materializeCFuncPtr4[GLenum, GLenum, GLuint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFRAMEBUFFERTEXTUREPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLenum, GLuint, GLint, Unit]): PFNGLFRAMEBUFFERTEXTUREPROC = o
  extension (v: PFNGLFRAMEBUFFERTEXTUREPROC)
    inline def value: CFuncPtr4[GLenum, GLenum, GLuint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFRONTFACEPROC = CFuncPtr1[GLenum, Unit]
object PFNGLFRONTFACEPROC:
  given _tag: Tag[PFNGLFRONTFACEPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFRONTFACEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLFRONTFACEPROC = o
  extension (v: PFNGLFRONTFACEPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLFRUSTUMPROC = CFuncPtr6[GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLFRUSTUMPROC:
  given _tag: Tag[PFNGLFRUSTUMPROC] = Tag.materializeCFuncPtr6[GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLFRUSTUMPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, Unit]): PFNGLFRUSTUMPROC = o
  extension (v: PFNGLFRUSTUMPROC)
    inline def value: CFuncPtr6[GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGENBUFFERSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLGENBUFFERSPROC:
  given _tag: Tag[PFNGLGENBUFFERSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGENBUFFERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLGENBUFFERSPROC = o
  extension (v: PFNGLGENBUFFERSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGENERATEMIPMAPPROC = CFuncPtr1[GLenum, Unit]
object PFNGLGENERATEMIPMAPPROC:
  given _tag: Tag[PFNGLGENERATEMIPMAPPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGENERATEMIPMAPPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLGENERATEMIPMAPPROC = o
  extension (v: PFNGLGENERATEMIPMAPPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGENERATETEXTUREMIPMAPPROC = CFuncPtr1[GLuint, Unit]
object PFNGLGENERATETEXTUREMIPMAPPROC:
  given _tag: Tag[PFNGLGENERATETEXTUREMIPMAPPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGENERATETEXTUREMIPMAPPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLGENERATETEXTUREMIPMAPPROC = o
  extension (v: PFNGLGENERATETEXTUREMIPMAPPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGENFRAMEBUFFERSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLGENFRAMEBUFFERSPROC:
  given _tag: Tag[PFNGLGENFRAMEBUFFERSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGENFRAMEBUFFERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLGENFRAMEBUFFERSPROC = o
  extension (v: PFNGLGENFRAMEBUFFERSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGENLISTSPROC = CFuncPtr1[GLsizei, GLuint]
object PFNGLGENLISTSPROC:
  given _tag: Tag[PFNGLGENLISTSPROC] = Tag.materializeCFuncPtr1[GLsizei, GLuint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGENLISTSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLsizei, GLuint]): PFNGLGENLISTSPROC = o
  extension (v: PFNGLGENLISTSPROC)
    inline def value: CFuncPtr1[GLsizei, GLuint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGENPROGRAMPIPELINESPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLGENPROGRAMPIPELINESPROC:
  given _tag: Tag[PFNGLGENPROGRAMPIPELINESPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGENPROGRAMPIPELINESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLGENPROGRAMPIPELINESPROC = o
  extension (v: PFNGLGENPROGRAMPIPELINESPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGENQUERIESPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLGENQUERIESPROC:
  given _tag: Tag[PFNGLGENQUERIESPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGENQUERIESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLGENQUERIESPROC = o
  extension (v: PFNGLGENQUERIESPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGENRENDERBUFFERSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLGENRENDERBUFFERSPROC:
  given _tag: Tag[PFNGLGENRENDERBUFFERSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGENRENDERBUFFERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLGENRENDERBUFFERSPROC = o
  extension (v: PFNGLGENRENDERBUFFERSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGENSAMPLERSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLGENSAMPLERSPROC:
  given _tag: Tag[PFNGLGENSAMPLERSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGENSAMPLERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLGENSAMPLERSPROC = o
  extension (v: PFNGLGENSAMPLERSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGENTEXTURESPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLGENTEXTURESPROC:
  given _tag: Tag[PFNGLGENTEXTURESPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGENTEXTURESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLGENTEXTURESPROC = o
  extension (v: PFNGLGENTEXTURESPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGENTRANSFORMFEEDBACKSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLGENTRANSFORMFEEDBACKSPROC:
  given _tag: Tag[PFNGLGENTRANSFORMFEEDBACKSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGENTRANSFORMFEEDBACKSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLGENTRANSFORMFEEDBACKSPROC = o
  extension (v: PFNGLGENTRANSFORMFEEDBACKSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGENVERTEXARRAYSPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLGENVERTEXARRAYSPROC:
  given _tag: Tag[PFNGLGENVERTEXARRAYSPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGENVERTEXARRAYSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLGENVERTEXARRAYSPROC = o
  extension (v: PFNGLGENVERTEXARRAYSPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETACTIVEATOMICCOUNTERBUFFERIVPROC = CFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETACTIVEATOMICCOUNTERBUFFERIVPROC:
  given _tag: Tag[PFNGLGETACTIVEATOMICCOUNTERBUFFERIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETACTIVEATOMICCOUNTERBUFFERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETACTIVEATOMICCOUNTERBUFFERIVPROC = o
  extension (v: PFNGLGETACTIVEATOMICCOUNTERBUFFERIVPROC)
    inline def value: CFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETACTIVEATTRIBPROC = CFuncPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLint], Ptr[GLenum], Ptr[GLchar], Unit]
object PFNGLGETACTIVEATTRIBPROC:
  given _tag: Tag[PFNGLGETACTIVEATTRIBPROC] = Tag.materializeCFuncPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLint], Ptr[GLenum], Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETACTIVEATTRIBPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLint], Ptr[GLenum], Ptr[GLchar], Unit]): PFNGLGETACTIVEATTRIBPROC = o
  extension (v: PFNGLGETACTIVEATTRIBPROC)
    inline def value: CFuncPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLint], Ptr[GLenum], Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETACTIVESUBROUTINENAMEPROC = CFuncPtr6[GLuint, GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
object PFNGLGETACTIVESUBROUTINENAMEPROC:
  given _tag: Tag[PFNGLGETACTIVESUBROUTINENAMEPROC] = Tag.materializeCFuncPtr6[GLuint, GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETACTIVESUBROUTINENAMEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]): PFNGLGETACTIVESUBROUTINENAMEPROC = o
  extension (v: PFNGLGETACTIVESUBROUTINENAMEPROC)
    inline def value: CFuncPtr6[GLuint, GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC = CFuncPtr5[GLuint, GLenum, GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC:
  given _tag: Tag[PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC] = Tag.materializeCFuncPtr5[GLuint, GLenum, GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLenum, GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC = o
  extension (v: PFNGLGETACTIVESUBROUTINEUNIFORMIVPROC)
    inline def value: CFuncPtr5[GLuint, GLenum, GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROC = CFuncPtr6[GLuint, GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
object PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROC:
  given _tag: Tag[PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROC] = Tag.materializeCFuncPtr6[GLuint, GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]): PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROC = o
  extension (v: PFNGLGETACTIVESUBROUTINEUNIFORMNAMEPROC)
    inline def value: CFuncPtr6[GLuint, GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETACTIVEUNIFORMBLOCKIVPROC = CFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETACTIVEUNIFORMBLOCKIVPROC:
  given _tag: Tag[PFNGLGETACTIVEUNIFORMBLOCKIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETACTIVEUNIFORMBLOCKIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETACTIVEUNIFORMBLOCKIVPROC = o
  extension (v: PFNGLGETACTIVEUNIFORMBLOCKIVPROC)
    inline def value: CFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC = CFuncPtr5[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
object PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC:
  given _tag: Tag[PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC] = Tag.materializeCFuncPtr5[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]): PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC = o
  extension (v: PFNGLGETACTIVEUNIFORMBLOCKNAMEPROC)
    inline def value: CFuncPtr5[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETACTIVEUNIFORMNAMEPROC = CFuncPtr5[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
object PFNGLGETACTIVEUNIFORMNAMEPROC:
  given _tag: Tag[PFNGLGETACTIVEUNIFORMNAMEPROC] = Tag.materializeCFuncPtr5[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETACTIVEUNIFORMNAMEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]): PFNGLGETACTIVEUNIFORMNAMEPROC = o
  extension (v: PFNGLGETACTIVEUNIFORMNAMEPROC)
    inline def value: CFuncPtr5[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETACTIVEUNIFORMPROC = CFuncPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLint], Ptr[GLenum], Ptr[GLchar], Unit]
object PFNGLGETACTIVEUNIFORMPROC:
  given _tag: Tag[PFNGLGETACTIVEUNIFORMPROC] = Tag.materializeCFuncPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLint], Ptr[GLenum], Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETACTIVEUNIFORMPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLint], Ptr[GLenum], Ptr[GLchar], Unit]): PFNGLGETACTIVEUNIFORMPROC = o
  extension (v: PFNGLGETACTIVEUNIFORMPROC)
    inline def value: CFuncPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLint], Ptr[GLenum], Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETACTIVEUNIFORMSIVPROC = CFuncPtr5[GLuint, GLsizei, Ptr[GLuint], GLenum, Ptr[GLint], Unit]
object PFNGLGETACTIVEUNIFORMSIVPROC:
  given _tag: Tag[PFNGLGETACTIVEUNIFORMSIVPROC] = Tag.materializeCFuncPtr5[GLuint, GLsizei, Ptr[GLuint], GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETACTIVEUNIFORMSIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLsizei, Ptr[GLuint], GLenum, Ptr[GLint], Unit]): PFNGLGETACTIVEUNIFORMSIVPROC = o
  extension (v: PFNGLGETACTIVEUNIFORMSIVPROC)
    inline def value: CFuncPtr5[GLuint, GLsizei, Ptr[GLuint], GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETATTACHEDSHADERSPROC = CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLuint], Unit]
object PFNGLGETATTACHEDSHADERSPROC:
  given _tag: Tag[PFNGLGETATTACHEDSHADERSPROC] = Tag.materializeCFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETATTACHEDSHADERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLuint], Unit]): PFNGLGETATTACHEDSHADERSPROC = o
  extension (v: PFNGLGETATTACHEDSHADERSPROC)
    inline def value: CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETATTRIBLOCATIONPROC = CFuncPtr2[GLuint, Ptr[GLchar], GLint]
object PFNGLGETATTRIBLOCATIONPROC:
  given _tag: Tag[PFNGLGETATTRIBLOCATIONPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLchar], GLint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETATTRIBLOCATIONPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLchar], GLint]): PFNGLGETATTRIBLOCATIONPROC = o
  extension (v: PFNGLGETATTRIBLOCATIONPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLchar], GLint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETBOOLEANI_VPROC = CFuncPtr3[GLenum, GLuint, Ptr[GLboolean], Unit]
object PFNGLGETBOOLEANI_VPROC:
  given _tag: Tag[PFNGLGETBOOLEANI_VPROC] = Tag.materializeCFuncPtr3[GLenum, GLuint, Ptr[GLboolean], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETBOOLEANI_VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLuint, Ptr[GLboolean], Unit]): PFNGLGETBOOLEANI_VPROC = o
  extension (v: PFNGLGETBOOLEANI_VPROC)
    inline def value: CFuncPtr3[GLenum, GLuint, Ptr[GLboolean], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETBOOLEANVPROC = CFuncPtr2[GLenum, Ptr[GLboolean], Unit]
object PFNGLGETBOOLEANVPROC:
  given _tag: Tag[PFNGLGETBOOLEANVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLboolean], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETBOOLEANVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLboolean], Unit]): PFNGLGETBOOLEANVPROC = o
  extension (v: PFNGLGETBOOLEANVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLboolean], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETBUFFERPARAMETERI64VPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint64], Unit]
object PFNGLGETBUFFERPARAMETERI64VPROC:
  given _tag: Tag[PFNGLGETBUFFERPARAMETERI64VPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint64], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETBUFFERPARAMETERI64VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint64], Unit]): PFNGLGETBUFFERPARAMETERI64VPROC = o
  extension (v: PFNGLGETBUFFERPARAMETERI64VPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint64], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETBUFFERPARAMETERIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETBUFFERPARAMETERIVPROC:
  given _tag: Tag[PFNGLGETBUFFERPARAMETERIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETBUFFERPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETBUFFERPARAMETERIVPROC = o
  extension (v: PFNGLGETBUFFERPARAMETERIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETBUFFERPOINTERVPROC = CFuncPtr3[GLenum, GLenum, Ptr[Ptr[Byte]], Unit]
object PFNGLGETBUFFERPOINTERVPROC:
  given _tag: Tag[PFNGLGETBUFFERPOINTERVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[Ptr[Byte]], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETBUFFERPOINTERVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[Ptr[Byte]], Unit]): PFNGLGETBUFFERPOINTERVPROC = o
  extension (v: PFNGLGETBUFFERPOINTERVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[Ptr[Byte]], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETBUFFERSUBDATAPROC = CFuncPtr4[GLenum, GLintptr, GLsizeiptr, Ptr[Byte], Unit]
object PFNGLGETBUFFERSUBDATAPROC:
  given _tag: Tag[PFNGLGETBUFFERSUBDATAPROC] = Tag.materializeCFuncPtr4[GLenum, GLintptr, GLsizeiptr, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETBUFFERSUBDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLintptr, GLsizeiptr, Ptr[Byte], Unit]): PFNGLGETBUFFERSUBDATAPROC = o
  extension (v: PFNGLGETBUFFERSUBDATAPROC)
    inline def value: CFuncPtr4[GLenum, GLintptr, GLsizeiptr, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETCLIPPLANEPROC = CFuncPtr2[GLenum, Ptr[GLdouble], Unit]
object PFNGLGETCLIPPLANEPROC:
  given _tag: Tag[PFNGLGETCLIPPLANEPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETCLIPPLANEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLdouble], Unit]): PFNGLGETCLIPPLANEPROC = o
  extension (v: PFNGLGETCLIPPLANEPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETCOMPRESSEDTEXIMAGEPROC = CFuncPtr3[GLenum, GLint, Ptr[Byte], Unit]
object PFNGLGETCOMPRESSEDTEXIMAGEPROC:
  given _tag: Tag[PFNGLGETCOMPRESSEDTEXIMAGEPROC] = Tag.materializeCFuncPtr3[GLenum, GLint, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETCOMPRESSEDTEXIMAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLint, Ptr[Byte], Unit]): PFNGLGETCOMPRESSEDTEXIMAGEPROC = o
  extension (v: PFNGLGETCOMPRESSEDTEXIMAGEPROC)
    inline def value: CFuncPtr3[GLenum, GLint, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETCOMPRESSEDTEXTUREIMAGEPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[Byte], Unit]
object PFNGLGETCOMPRESSEDTEXTUREIMAGEPROC:
  given _tag: Tag[PFNGLGETCOMPRESSEDTEXTUREIMAGEPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETCOMPRESSEDTEXTUREIMAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[Byte], Unit]): PFNGLGETCOMPRESSEDTEXTUREIMAGEPROC = o
  extension (v: PFNGLGETCOMPRESSEDTEXTUREIMAGEPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETCOMPRESSEDTEXTURESUBIMAGEPROC = CFuncPtr10[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLsizei, Ptr[Byte], Unit]
object PFNGLGETCOMPRESSEDTEXTURESUBIMAGEPROC:
  given _tag: Tag[PFNGLGETCOMPRESSEDTEXTURESUBIMAGEPROC] = Tag.materializeCFuncPtr10[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETCOMPRESSEDTEXTURESUBIMAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr10[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLsizei, Ptr[Byte], Unit]): PFNGLGETCOMPRESSEDTEXTURESUBIMAGEPROC = o
  extension (v: PFNGLGETCOMPRESSEDTEXTURESUBIMAGEPROC)
    inline def value: CFuncPtr10[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETDEBUGMESSAGELOGPROC = CFuncPtr8[GLuint, GLsizei, Ptr[GLenum], Ptr[GLenum], Ptr[GLuint], Ptr[GLenum], Ptr[GLsizei], Ptr[GLchar], GLuint]
object PFNGLGETDEBUGMESSAGELOGPROC:
  given _tag: Tag[PFNGLGETDEBUGMESSAGELOGPROC] = Tag.materializeCFuncPtr8[GLuint, GLsizei, Ptr[GLenum], Ptr[GLenum], Ptr[GLuint], Ptr[GLenum], Ptr[GLsizei], Ptr[GLchar], GLuint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETDEBUGMESSAGELOGPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[GLuint, GLsizei, Ptr[GLenum], Ptr[GLenum], Ptr[GLuint], Ptr[GLenum], Ptr[GLsizei], Ptr[GLchar], GLuint]): PFNGLGETDEBUGMESSAGELOGPROC = o
  extension (v: PFNGLGETDEBUGMESSAGELOGPROC)
    inline def value: CFuncPtr8[GLuint, GLsizei, Ptr[GLenum], Ptr[GLenum], Ptr[GLuint], Ptr[GLenum], Ptr[GLsizei], Ptr[GLchar], GLuint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETDOUBLEI_VPROC = CFuncPtr3[GLenum, GLuint, Ptr[GLdouble], Unit]
object PFNGLGETDOUBLEI_VPROC:
  given _tag: Tag[PFNGLGETDOUBLEI_VPROC] = Tag.materializeCFuncPtr3[GLenum, GLuint, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETDOUBLEI_VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLuint, Ptr[GLdouble], Unit]): PFNGLGETDOUBLEI_VPROC = o
  extension (v: PFNGLGETDOUBLEI_VPROC)
    inline def value: CFuncPtr3[GLenum, GLuint, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETDOUBLEVPROC = CFuncPtr2[GLenum, Ptr[GLdouble], Unit]
object PFNGLGETDOUBLEVPROC:
  given _tag: Tag[PFNGLGETDOUBLEVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETDOUBLEVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLdouble], Unit]): PFNGLGETDOUBLEVPROC = o
  extension (v: PFNGLGETDOUBLEVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETERRORPROC = CFuncPtr0[GLenum]
object PFNGLGETERRORPROC:
  given _tag: Tag[PFNGLGETERRORPROC] = Tag.materializeCFuncPtr0[GLenum]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETERRORPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[GLenum]): PFNGLGETERRORPROC = o
  extension (v: PFNGLGETERRORPROC)
    inline def value: CFuncPtr0[GLenum] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETFLOATI_VPROC = CFuncPtr3[GLenum, GLuint, Ptr[GLfloat], Unit]
object PFNGLGETFLOATI_VPROC:
  given _tag: Tag[PFNGLGETFLOATI_VPROC] = Tag.materializeCFuncPtr3[GLenum, GLuint, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETFLOATI_VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLuint, Ptr[GLfloat], Unit]): PFNGLGETFLOATI_VPROC = o
  extension (v: PFNGLGETFLOATI_VPROC)
    inline def value: CFuncPtr3[GLenum, GLuint, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETFLOATVPROC = CFuncPtr2[GLenum, Ptr[GLfloat], Unit]
object PFNGLGETFLOATVPROC:
  given _tag: Tag[PFNGLGETFLOATVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETFLOATVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLfloat], Unit]): PFNGLGETFLOATVPROC = o
  extension (v: PFNGLGETFLOATVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETFRAGDATAINDEXPROC = CFuncPtr2[GLuint, Ptr[GLchar], GLint]
object PFNGLGETFRAGDATAINDEXPROC:
  given _tag: Tag[PFNGLGETFRAGDATAINDEXPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLchar], GLint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETFRAGDATAINDEXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLchar], GLint]): PFNGLGETFRAGDATAINDEXPROC = o
  extension (v: PFNGLGETFRAGDATAINDEXPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLchar], GLint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETFRAGDATALOCATIONPROC = CFuncPtr2[GLuint, Ptr[GLchar], GLint]
object PFNGLGETFRAGDATALOCATIONPROC:
  given _tag: Tag[PFNGLGETFRAGDATALOCATIONPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLchar], GLint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETFRAGDATALOCATIONPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLchar], GLint]): PFNGLGETFRAGDATALOCATIONPROC = o
  extension (v: PFNGLGETFRAGDATALOCATIONPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLchar], GLint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC = CFuncPtr4[GLenum, GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC:
  given _tag: Tag[PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC] = Tag.materializeCFuncPtr4[GLenum, GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC = o
  extension (v: PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC)
    inline def value: CFuncPtr4[GLenum, GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETFRAMEBUFFERPARAMETERIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETFRAMEBUFFERPARAMETERIVPROC:
  given _tag: Tag[PFNGLGETFRAMEBUFFERPARAMETERIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETFRAMEBUFFERPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETFRAMEBUFFERPARAMETERIVPROC = o
  extension (v: PFNGLGETFRAMEBUFFERPARAMETERIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETGRAPHICSRESETSTATUSPROC = CFuncPtr0[GLenum]
object PFNGLGETGRAPHICSRESETSTATUSPROC:
  given _tag: Tag[PFNGLGETGRAPHICSRESETSTATUSPROC] = Tag.materializeCFuncPtr0[GLenum]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETGRAPHICSRESETSTATUSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[GLenum]): PFNGLGETGRAPHICSRESETSTATUSPROC = o
  extension (v: PFNGLGETGRAPHICSRESETSTATUSPROC)
    inline def value: CFuncPtr0[GLenum] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETINTEGER64I_VPROC = CFuncPtr3[GLenum, GLuint, Ptr[GLint64], Unit]
object PFNGLGETINTEGER64I_VPROC:
  given _tag: Tag[PFNGLGETINTEGER64I_VPROC] = Tag.materializeCFuncPtr3[GLenum, GLuint, Ptr[GLint64], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETINTEGER64I_VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLuint, Ptr[GLint64], Unit]): PFNGLGETINTEGER64I_VPROC = o
  extension (v: PFNGLGETINTEGER64I_VPROC)
    inline def value: CFuncPtr3[GLenum, GLuint, Ptr[GLint64], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETINTEGER64VPROC = CFuncPtr2[GLenum, Ptr[GLint64], Unit]
object PFNGLGETINTEGER64VPROC:
  given _tag: Tag[PFNGLGETINTEGER64VPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLint64], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETINTEGER64VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLint64], Unit]): PFNGLGETINTEGER64VPROC = o
  extension (v: PFNGLGETINTEGER64VPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLint64], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETINTEGERI_VPROC = CFuncPtr3[GLenum, GLuint, Ptr[GLint], Unit]
object PFNGLGETINTEGERI_VPROC:
  given _tag: Tag[PFNGLGETINTEGERI_VPROC] = Tag.materializeCFuncPtr3[GLenum, GLuint, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETINTEGERI_VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLuint, Ptr[GLint], Unit]): PFNGLGETINTEGERI_VPROC = o
  extension (v: PFNGLGETINTEGERI_VPROC)
    inline def value: CFuncPtr3[GLenum, GLuint, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETINTEGERVPROC = CFuncPtr2[GLenum, Ptr[GLint], Unit]
object PFNGLGETINTEGERVPROC:
  given _tag: Tag[PFNGLGETINTEGERVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETINTEGERVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLint], Unit]): PFNGLGETINTEGERVPROC = o
  extension (v: PFNGLGETINTEGERVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETINTERNALFORMATI64VPROC = CFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[GLint64], Unit]
object PFNGLGETINTERNALFORMATI64VPROC:
  given _tag: Tag[PFNGLGETINTERNALFORMATI64VPROC] = Tag.materializeCFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[GLint64], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETINTERNALFORMATI64VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[GLint64], Unit]): PFNGLGETINTERNALFORMATI64VPROC = o
  extension (v: PFNGLGETINTERNALFORMATI64VPROC)
    inline def value: CFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[GLint64], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETINTERNALFORMATIVPROC = CFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[GLint], Unit]
object PFNGLGETINTERNALFORMATIVPROC:
  given _tag: Tag[PFNGLGETINTERNALFORMATIVPROC] = Tag.materializeCFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETINTERNALFORMATIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[GLint], Unit]): PFNGLGETINTERNALFORMATIVPROC = o
  extension (v: PFNGLGETINTERNALFORMATIVPROC)
    inline def value: CFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETLIGHTFVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
object PFNGLGETLIGHTFVPROC:
  given _tag: Tag[PFNGLGETLIGHTFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETLIGHTFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]): PFNGLGETLIGHTFVPROC = o
  extension (v: PFNGLGETLIGHTFVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETLIGHTIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETLIGHTIVPROC:
  given _tag: Tag[PFNGLGETLIGHTIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETLIGHTIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETLIGHTIVPROC = o
  extension (v: PFNGLGETLIGHTIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETMAPDVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLdouble], Unit]
object PFNGLGETMAPDVPROC:
  given _tag: Tag[PFNGLGETMAPDVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETMAPDVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLdouble], Unit]): PFNGLGETMAPDVPROC = o
  extension (v: PFNGLGETMAPDVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETMAPFVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
object PFNGLGETMAPFVPROC:
  given _tag: Tag[PFNGLGETMAPFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETMAPFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]): PFNGLGETMAPFVPROC = o
  extension (v: PFNGLGETMAPFVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETMAPIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETMAPIVPROC:
  given _tag: Tag[PFNGLGETMAPIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETMAPIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETMAPIVPROC = o
  extension (v: PFNGLGETMAPIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETMATERIALFVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
object PFNGLGETMATERIALFVPROC:
  given _tag: Tag[PFNGLGETMATERIALFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETMATERIALFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]): PFNGLGETMATERIALFVPROC = o
  extension (v: PFNGLGETMATERIALFVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETMATERIALIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETMATERIALIVPROC:
  given _tag: Tag[PFNGLGETMATERIALIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETMATERIALIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETMATERIALIVPROC = o
  extension (v: PFNGLGETMATERIALIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETMULTISAMPLEFVPROC = CFuncPtr3[GLenum, GLuint, Ptr[GLfloat], Unit]
object PFNGLGETMULTISAMPLEFVPROC:
  given _tag: Tag[PFNGLGETMULTISAMPLEFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLuint, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETMULTISAMPLEFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLuint, Ptr[GLfloat], Unit]): PFNGLGETMULTISAMPLEFVPROC = o
  extension (v: PFNGLGETMULTISAMPLEFVPROC)
    inline def value: CFuncPtr3[GLenum, GLuint, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNAMEDBUFFERPARAMETERI64VPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint64], Unit]
object PFNGLGETNAMEDBUFFERPARAMETERI64VPROC:
  given _tag: Tag[PFNGLGETNAMEDBUFFERPARAMETERI64VPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint64], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNAMEDBUFFERPARAMETERI64VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint64], Unit]): PFNGLGETNAMEDBUFFERPARAMETERI64VPROC = o
  extension (v: PFNGLGETNAMEDBUFFERPARAMETERI64VPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint64], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNAMEDBUFFERPARAMETERIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETNAMEDBUFFERPARAMETERIVPROC:
  given _tag: Tag[PFNGLGETNAMEDBUFFERPARAMETERIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNAMEDBUFFERPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETNAMEDBUFFERPARAMETERIVPROC = o
  extension (v: PFNGLGETNAMEDBUFFERPARAMETERIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNAMEDBUFFERPOINTERVPROC = CFuncPtr3[GLuint, GLenum, Ptr[Ptr[Byte]], Unit]
object PFNGLGETNAMEDBUFFERPOINTERVPROC:
  given _tag: Tag[PFNGLGETNAMEDBUFFERPOINTERVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[Ptr[Byte]], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNAMEDBUFFERPOINTERVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[Ptr[Byte]], Unit]): PFNGLGETNAMEDBUFFERPOINTERVPROC = o
  extension (v: PFNGLGETNAMEDBUFFERPOINTERVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[Ptr[Byte]], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNAMEDBUFFERSUBDATAPROC = CFuncPtr4[GLuint, GLintptr, GLsizeiptr, Ptr[Byte], Unit]
object PFNGLGETNAMEDBUFFERSUBDATAPROC:
  given _tag: Tag[PFNGLGETNAMEDBUFFERSUBDATAPROC] = Tag.materializeCFuncPtr4[GLuint, GLintptr, GLsizeiptr, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNAMEDBUFFERSUBDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLintptr, GLsizeiptr, Ptr[Byte], Unit]): PFNGLGETNAMEDBUFFERSUBDATAPROC = o
  extension (v: PFNGLGETNAMEDBUFFERSUBDATAPROC)
    inline def value: CFuncPtr4[GLuint, GLintptr, GLsizeiptr, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROC = CFuncPtr4[GLuint, GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROC:
  given _tag: Tag[PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROC = o
  extension (v: PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC:
  given _tag: Tag[PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC = o
  extension (v: PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC:
  given _tag: Tag[PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC = o
  extension (v: PFNGLGETNAMEDRENDERBUFFERPARAMETERIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNCOLORTABLEPROC = CFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLGETNCOLORTABLEPROC:
  given _tag: Tag[PFNGLGETNCOLORTABLEPROC] = Tag.materializeCFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNCOLORTABLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLGETNCOLORTABLEPROC = o
  extension (v: PFNGLGETNCOLORTABLEPROC)
    inline def value: CFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNCOMPRESSEDTEXIMAGEPROC = CFuncPtr4[GLenum, GLint, GLsizei, Ptr[Byte], Unit]
object PFNGLGETNCOMPRESSEDTEXIMAGEPROC:
  given _tag: Tag[PFNGLGETNCOMPRESSEDTEXIMAGEPROC] = Tag.materializeCFuncPtr4[GLenum, GLint, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNCOMPRESSEDTEXIMAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLint, GLsizei, Ptr[Byte], Unit]): PFNGLGETNCOMPRESSEDTEXIMAGEPROC = o
  extension (v: PFNGLGETNCOMPRESSEDTEXIMAGEPROC)
    inline def value: CFuncPtr4[GLenum, GLint, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNCONVOLUTIONFILTERPROC = CFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLGETNCONVOLUTIONFILTERPROC:
  given _tag: Tag[PFNGLGETNCONVOLUTIONFILTERPROC] = Tag.materializeCFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNCONVOLUTIONFILTERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLGETNCONVOLUTIONFILTERPROC = o
  extension (v: PFNGLGETNCONVOLUTIONFILTERPROC)
    inline def value: CFuncPtr5[GLenum, GLenum, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNHISTOGRAMPROC = CFuncPtr6[GLenum, GLboolean, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLGETNHISTOGRAMPROC:
  given _tag: Tag[PFNGLGETNHISTOGRAMPROC] = Tag.materializeCFuncPtr6[GLenum, GLboolean, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNHISTOGRAMPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLboolean, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLGETNHISTOGRAMPROC = o
  extension (v: PFNGLGETNHISTOGRAMPROC)
    inline def value: CFuncPtr6[GLenum, GLboolean, GLenum, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNMAPDVPROC = CFuncPtr4[GLenum, GLenum, GLsizei, Ptr[GLdouble], Unit]
object PFNGLGETNMAPDVPROC:
  given _tag: Tag[PFNGLGETNMAPDVPROC] = Tag.materializeCFuncPtr4[GLenum, GLenum, GLsizei, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNMAPDVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLenum, GLsizei, Ptr[GLdouble], Unit]): PFNGLGETNMAPDVPROC = o
  extension (v: PFNGLGETNMAPDVPROC)
    inline def value: CFuncPtr4[GLenum, GLenum, GLsizei, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNMAPFVPROC = CFuncPtr4[GLenum, GLenum, GLsizei, Ptr[GLfloat], Unit]
object PFNGLGETNMAPFVPROC:
  given _tag: Tag[PFNGLGETNMAPFVPROC] = Tag.materializeCFuncPtr4[GLenum, GLenum, GLsizei, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNMAPFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLenum, GLsizei, Ptr[GLfloat], Unit]): PFNGLGETNMAPFVPROC = o
  extension (v: PFNGLGETNMAPFVPROC)
    inline def value: CFuncPtr4[GLenum, GLenum, GLsizei, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNMAPIVPROC = CFuncPtr4[GLenum, GLenum, GLsizei, Ptr[GLint], Unit]
object PFNGLGETNMAPIVPROC:
  given _tag: Tag[PFNGLGETNMAPIVPROC] = Tag.materializeCFuncPtr4[GLenum, GLenum, GLsizei, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNMAPIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLenum, GLsizei, Ptr[GLint], Unit]): PFNGLGETNMAPIVPROC = o
  extension (v: PFNGLGETNMAPIVPROC)
    inline def value: CFuncPtr4[GLenum, GLenum, GLsizei, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNMINMAXPROC = CFuncPtr6[GLenum, GLboolean, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLGETNMINMAXPROC:
  given _tag: Tag[PFNGLGETNMINMAXPROC] = Tag.materializeCFuncPtr6[GLenum, GLboolean, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNMINMAXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLboolean, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLGETNMINMAXPROC = o
  extension (v: PFNGLGETNMINMAXPROC)
    inline def value: CFuncPtr6[GLenum, GLboolean, GLenum, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNPIXELMAPFVPROC = CFuncPtr3[GLenum, GLsizei, Ptr[GLfloat], Unit]
object PFNGLGETNPIXELMAPFVPROC:
  given _tag: Tag[PFNGLGETNPIXELMAPFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNPIXELMAPFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[GLfloat], Unit]): PFNGLGETNPIXELMAPFVPROC = o
  extension (v: PFNGLGETNPIXELMAPFVPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNPIXELMAPUIVPROC = CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]
object PFNGLGETNPIXELMAPUIVPROC:
  given _tag: Tag[PFNGLGETNPIXELMAPUIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNPIXELMAPUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]): PFNGLGETNPIXELMAPUIVPROC = o
  extension (v: PFNGLGETNPIXELMAPUIVPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNPIXELMAPUSVPROC = CFuncPtr3[GLenum, GLsizei, Ptr[GLushort], Unit]
object PFNGLGETNPIXELMAPUSVPROC:
  given _tag: Tag[PFNGLGETNPIXELMAPUSVPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[GLushort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNPIXELMAPUSVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[GLushort], Unit]): PFNGLGETNPIXELMAPUSVPROC = o
  extension (v: PFNGLGETNPIXELMAPUSVPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[GLushort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNPOLYGONSTIPPLEPROC = CFuncPtr2[GLsizei, Ptr[GLubyte], Unit]
object PFNGLGETNPOLYGONSTIPPLEPROC:
  given _tag: Tag[PFNGLGETNPOLYGONSTIPPLEPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLubyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNPOLYGONSTIPPLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLubyte], Unit]): PFNGLGETNPOLYGONSTIPPLEPROC = o
  extension (v: PFNGLGETNPOLYGONSTIPPLEPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLubyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNSEPARABLEFILTERPROC = CFuncPtr8[GLenum, GLenum, GLenum, GLsizei, Ptr[Byte], GLsizei, Ptr[Byte], Ptr[Byte], Unit]
object PFNGLGETNSEPARABLEFILTERPROC:
  given _tag: Tag[PFNGLGETNSEPARABLEFILTERPROC] = Tag.materializeCFuncPtr8[GLenum, GLenum, GLenum, GLsizei, Ptr[Byte], GLsizei, Ptr[Byte], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNSEPARABLEFILTERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[GLenum, GLenum, GLenum, GLsizei, Ptr[Byte], GLsizei, Ptr[Byte], Ptr[Byte], Unit]): PFNGLGETNSEPARABLEFILTERPROC = o
  extension (v: PFNGLGETNSEPARABLEFILTERPROC)
    inline def value: CFuncPtr8[GLenum, GLenum, GLenum, GLsizei, Ptr[Byte], GLsizei, Ptr[Byte], Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNTEXIMAGEPROC = CFuncPtr6[GLenum, GLint, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLGETNTEXIMAGEPROC:
  given _tag: Tag[PFNGLGETNTEXIMAGEPROC] = Tag.materializeCFuncPtr6[GLenum, GLint, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNTEXIMAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLint, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLGETNTEXIMAGEPROC = o
  extension (v: PFNGLGETNTEXIMAGEPROC)
    inline def value: CFuncPtr6[GLenum, GLint, GLenum, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNUNIFORMDVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]
object PFNGLGETNUNIFORMDVPROC:
  given _tag: Tag[PFNGLGETNUNIFORMDVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNUNIFORMDVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]): PFNGLGETNUNIFORMDVPROC = o
  extension (v: PFNGLGETNUNIFORMDVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNUNIFORMFVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]
object PFNGLGETNUNIFORMFVPROC:
  given _tag: Tag[PFNGLGETNUNIFORMFVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNUNIFORMFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]): PFNGLGETNUNIFORMFVPROC = o
  extension (v: PFNGLGETNUNIFORMFVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNUNIFORMIVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]
object PFNGLGETNUNIFORMIVPROC:
  given _tag: Tag[PFNGLGETNUNIFORMIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNUNIFORMIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]): PFNGLGETNUNIFORMIVPROC = o
  extension (v: PFNGLGETNUNIFORMIVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETNUNIFORMUIVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]
object PFNGLGETNUNIFORMUIVPROC:
  given _tag: Tag[PFNGLGETNUNIFORMUIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETNUNIFORMUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]): PFNGLGETNUNIFORMUIVPROC = o
  extension (v: PFNGLGETNUNIFORMUIVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETOBJECTLABELPROC = CFuncPtr5[GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
object PFNGLGETOBJECTLABELPROC:
  given _tag: Tag[PFNGLGETOBJECTLABELPROC] = Tag.materializeCFuncPtr5[GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETOBJECTLABELPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]): PFNGLGETOBJECTLABELPROC = o
  extension (v: PFNGLGETOBJECTLABELPROC)
    inline def value: CFuncPtr5[GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETOBJECTPTRLABELPROC = CFuncPtr4[Ptr[Byte], GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
object PFNGLGETOBJECTPTRLABELPROC:
  given _tag: Tag[PFNGLGETOBJECTPTRLABELPROC] = Tag.materializeCFuncPtr4[Ptr[Byte], GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETOBJECTPTRLABELPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[Byte], GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]): PFNGLGETOBJECTPTRLABELPROC = o
  extension (v: PFNGLGETOBJECTPTRLABELPROC)
    inline def value: CFuncPtr4[Ptr[Byte], GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPIXELMAPFVPROC = CFuncPtr2[GLenum, Ptr[GLfloat], Unit]
object PFNGLGETPIXELMAPFVPROC:
  given _tag: Tag[PFNGLGETPIXELMAPFVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPIXELMAPFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLfloat], Unit]): PFNGLGETPIXELMAPFVPROC = o
  extension (v: PFNGLGETPIXELMAPFVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPIXELMAPUIVPROC = CFuncPtr2[GLenum, Ptr[GLuint], Unit]
object PFNGLGETPIXELMAPUIVPROC:
  given _tag: Tag[PFNGLGETPIXELMAPUIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPIXELMAPUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLuint], Unit]): PFNGLGETPIXELMAPUIVPROC = o
  extension (v: PFNGLGETPIXELMAPUIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPIXELMAPUSVPROC = CFuncPtr2[GLenum, Ptr[GLushort], Unit]
object PFNGLGETPIXELMAPUSVPROC:
  given _tag: Tag[PFNGLGETPIXELMAPUSVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLushort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPIXELMAPUSVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLushort], Unit]): PFNGLGETPIXELMAPUSVPROC = o
  extension (v: PFNGLGETPIXELMAPUSVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLushort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPOINTERVPROC = CFuncPtr2[GLenum, Ptr[Ptr[Byte]], Unit]
object PFNGLGETPOINTERVPROC:
  given _tag: Tag[PFNGLGETPOINTERVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[Ptr[Byte]], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPOINTERVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[Ptr[Byte]], Unit]): PFNGLGETPOINTERVPROC = o
  extension (v: PFNGLGETPOINTERVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[Ptr[Byte]], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPOLYGONSTIPPLEPROC = CFuncPtr1[Ptr[GLubyte], Unit]
object PFNGLGETPOLYGONSTIPPLEPROC:
  given _tag: Tag[PFNGLGETPOLYGONSTIPPLEPROC] = Tag.materializeCFuncPtr1[Ptr[GLubyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPOLYGONSTIPPLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLubyte], Unit]): PFNGLGETPOLYGONSTIPPLEPROC = o
  extension (v: PFNGLGETPOLYGONSTIPPLEPROC)
    inline def value: CFuncPtr1[Ptr[GLubyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPROGRAMBINARYPROC = CFuncPtr5[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLenum], Ptr[Byte], Unit]
object PFNGLGETPROGRAMBINARYPROC:
  given _tag: Tag[PFNGLGETPROGRAMBINARYPROC] = Tag.materializeCFuncPtr5[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLenum], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPROGRAMBINARYPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLenum], Ptr[Byte], Unit]): PFNGLGETPROGRAMBINARYPROC = o
  extension (v: PFNGLGETPROGRAMBINARYPROC)
    inline def value: CFuncPtr5[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLenum], Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPROGRAMINFOLOGPROC = CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
object PFNGLGETPROGRAMINFOLOGPROC:
  given _tag: Tag[PFNGLGETPROGRAMINFOLOGPROC] = Tag.materializeCFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPROGRAMINFOLOGPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]): PFNGLGETPROGRAMINFOLOGPROC = o
  extension (v: PFNGLGETPROGRAMINFOLOGPROC)
    inline def value: CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPROGRAMINTERFACEIVPROC = CFuncPtr4[GLuint, GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETPROGRAMINTERFACEIVPROC:
  given _tag: Tag[PFNGLGETPROGRAMINTERFACEIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPROGRAMINTERFACEIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETPROGRAMINTERFACEIVPROC = o
  extension (v: PFNGLGETPROGRAMINTERFACEIVPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPROGRAMIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETPROGRAMIVPROC:
  given _tag: Tag[PFNGLGETPROGRAMIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPROGRAMIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETPROGRAMIVPROC = o
  extension (v: PFNGLGETPROGRAMIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPROGRAMPIPELINEINFOLOGPROC = CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
object PFNGLGETPROGRAMPIPELINEINFOLOGPROC:
  given _tag: Tag[PFNGLGETPROGRAMPIPELINEINFOLOGPROC] = Tag.materializeCFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPROGRAMPIPELINEINFOLOGPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]): PFNGLGETPROGRAMPIPELINEINFOLOGPROC = o
  extension (v: PFNGLGETPROGRAMPIPELINEINFOLOGPROC)
    inline def value: CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPROGRAMPIPELINEIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETPROGRAMPIPELINEIVPROC:
  given _tag: Tag[PFNGLGETPROGRAMPIPELINEIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPROGRAMPIPELINEIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETPROGRAMPIPELINEIVPROC = o
  extension (v: PFNGLGETPROGRAMPIPELINEIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPROGRAMRESOURCEINDEXPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLuint]
object PFNGLGETPROGRAMRESOURCEINDEXPROC:
  given _tag: Tag[PFNGLGETPROGRAMRESOURCEINDEXPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLuint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPROGRAMRESOURCEINDEXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLuint]): PFNGLGETPROGRAMRESOURCEINDEXPROC = o
  extension (v: PFNGLGETPROGRAMRESOURCEINDEXPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLuint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPROGRAMRESOURCEIVPROC = CFuncPtr8[GLuint, GLenum, GLuint, GLsizei, Ptr[GLenum], GLsizei, Ptr[GLsizei], Ptr[GLint], Unit]
object PFNGLGETPROGRAMRESOURCEIVPROC:
  given _tag: Tag[PFNGLGETPROGRAMRESOURCEIVPROC] = Tag.materializeCFuncPtr8[GLuint, GLenum, GLuint, GLsizei, Ptr[GLenum], GLsizei, Ptr[GLsizei], Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPROGRAMRESOURCEIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[GLuint, GLenum, GLuint, GLsizei, Ptr[GLenum], GLsizei, Ptr[GLsizei], Ptr[GLint], Unit]): PFNGLGETPROGRAMRESOURCEIVPROC = o
  extension (v: PFNGLGETPROGRAMRESOURCEIVPROC)
    inline def value: CFuncPtr8[GLuint, GLenum, GLuint, GLsizei, Ptr[GLenum], GLsizei, Ptr[GLsizei], Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPROGRAMRESOURCELOCATIONINDEXPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLint]
object PFNGLGETPROGRAMRESOURCELOCATIONINDEXPROC:
  given _tag: Tag[PFNGLGETPROGRAMRESOURCELOCATIONINDEXPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPROGRAMRESOURCELOCATIONINDEXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLint]): PFNGLGETPROGRAMRESOURCELOCATIONINDEXPROC = o
  extension (v: PFNGLGETPROGRAMRESOURCELOCATIONINDEXPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPROGRAMRESOURCELOCATIONPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLint]
object PFNGLGETPROGRAMRESOURCELOCATIONPROC:
  given _tag: Tag[PFNGLGETPROGRAMRESOURCELOCATIONPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPROGRAMRESOURCELOCATIONPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLint]): PFNGLGETPROGRAMRESOURCELOCATIONPROC = o
  extension (v: PFNGLGETPROGRAMRESOURCELOCATIONPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPROGRAMRESOURCENAMEPROC = CFuncPtr6[GLuint, GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
object PFNGLGETPROGRAMRESOURCENAMEPROC:
  given _tag: Tag[PFNGLGETPROGRAMRESOURCENAMEPROC] = Tag.materializeCFuncPtr6[GLuint, GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPROGRAMRESOURCENAMEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]): PFNGLGETPROGRAMRESOURCENAMEPROC = o
  extension (v: PFNGLGETPROGRAMRESOURCENAMEPROC)
    inline def value: CFuncPtr6[GLuint, GLenum, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETPROGRAMSTAGEIVPROC = CFuncPtr4[GLuint, GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETPROGRAMSTAGEIVPROC:
  given _tag: Tag[PFNGLGETPROGRAMSTAGEIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETPROGRAMSTAGEIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETPROGRAMSTAGEIVPROC = o
  extension (v: PFNGLGETPROGRAMSTAGEIVPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETQUERYBUFFEROBJECTI64VPROC = CFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit]
object PFNGLGETQUERYBUFFEROBJECTI64VPROC:
  given _tag: Tag[PFNGLGETQUERYBUFFEROBJECTI64VPROC] = Tag.materializeCFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETQUERYBUFFEROBJECTI64VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit]): PFNGLGETQUERYBUFFEROBJECTI64VPROC = o
  extension (v: PFNGLGETQUERYBUFFEROBJECTI64VPROC)
    inline def value: CFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETQUERYBUFFEROBJECTIVPROC = CFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit]
object PFNGLGETQUERYBUFFEROBJECTIVPROC:
  given _tag: Tag[PFNGLGETQUERYBUFFEROBJECTIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETQUERYBUFFEROBJECTIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit]): PFNGLGETQUERYBUFFEROBJECTIVPROC = o
  extension (v: PFNGLGETQUERYBUFFEROBJECTIVPROC)
    inline def value: CFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETQUERYBUFFEROBJECTUI64VPROC = CFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit]
object PFNGLGETQUERYBUFFEROBJECTUI64VPROC:
  given _tag: Tag[PFNGLGETQUERYBUFFEROBJECTUI64VPROC] = Tag.materializeCFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETQUERYBUFFEROBJECTUI64VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit]): PFNGLGETQUERYBUFFEROBJECTUI64VPROC = o
  extension (v: PFNGLGETQUERYBUFFEROBJECTUI64VPROC)
    inline def value: CFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETQUERYBUFFEROBJECTUIVPROC = CFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit]
object PFNGLGETQUERYBUFFEROBJECTUIVPROC:
  given _tag: Tag[PFNGLGETQUERYBUFFEROBJECTUIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETQUERYBUFFEROBJECTUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit]): PFNGLGETQUERYBUFFEROBJECTUIVPROC = o
  extension (v: PFNGLGETQUERYBUFFEROBJECTUIVPROC)
    inline def value: CFuncPtr4[GLuint, GLuint, GLenum, GLintptr, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETQUERYINDEXEDIVPROC = CFuncPtr4[GLenum, GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETQUERYINDEXEDIVPROC:
  given _tag: Tag[PFNGLGETQUERYINDEXEDIVPROC] = Tag.materializeCFuncPtr4[GLenum, GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETQUERYINDEXEDIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETQUERYINDEXEDIVPROC = o
  extension (v: PFNGLGETQUERYINDEXEDIVPROC)
    inline def value: CFuncPtr4[GLenum, GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETQUERYIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETQUERYIVPROC:
  given _tag: Tag[PFNGLGETQUERYIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETQUERYIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETQUERYIVPROC = o
  extension (v: PFNGLGETQUERYIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETQUERYOBJECTI64VPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint64], Unit]
object PFNGLGETQUERYOBJECTI64VPROC:
  given _tag: Tag[PFNGLGETQUERYOBJECTI64VPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint64], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETQUERYOBJECTI64VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint64], Unit]): PFNGLGETQUERYOBJECTI64VPROC = o
  extension (v: PFNGLGETQUERYOBJECTI64VPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint64], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETQUERYOBJECTIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETQUERYOBJECTIVPROC:
  given _tag: Tag[PFNGLGETQUERYOBJECTIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETQUERYOBJECTIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETQUERYOBJECTIVPROC = o
  extension (v: PFNGLGETQUERYOBJECTIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETQUERYOBJECTUI64VPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLuint64], Unit]
object PFNGLGETQUERYOBJECTUI64VPROC:
  given _tag: Tag[PFNGLGETQUERYOBJECTUI64VPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLuint64], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETQUERYOBJECTUI64VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLuint64], Unit]): PFNGLGETQUERYOBJECTUI64VPROC = o
  extension (v: PFNGLGETQUERYOBJECTUI64VPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLuint64], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETQUERYOBJECTUIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]
object PFNGLGETQUERYOBJECTUIVPROC:
  given _tag: Tag[PFNGLGETQUERYOBJECTUIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETQUERYOBJECTUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]): PFNGLGETQUERYOBJECTUIVPROC = o
  extension (v: PFNGLGETQUERYOBJECTUIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETRENDERBUFFERPARAMETERIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETRENDERBUFFERPARAMETERIVPROC:
  given _tag: Tag[PFNGLGETRENDERBUFFERPARAMETERIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETRENDERBUFFERPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETRENDERBUFFERPARAMETERIVPROC = o
  extension (v: PFNGLGETRENDERBUFFERPARAMETERIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETSAMPLERPARAMETERFVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]
object PFNGLGETSAMPLERPARAMETERFVPROC:
  given _tag: Tag[PFNGLGETSAMPLERPARAMETERFVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETSAMPLERPARAMETERFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]): PFNGLGETSAMPLERPARAMETERFVPROC = o
  extension (v: PFNGLGETSAMPLERPARAMETERFVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETSAMPLERPARAMETERIIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETSAMPLERPARAMETERIIVPROC:
  given _tag: Tag[PFNGLGETSAMPLERPARAMETERIIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETSAMPLERPARAMETERIIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETSAMPLERPARAMETERIIVPROC = o
  extension (v: PFNGLGETSAMPLERPARAMETERIIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETSAMPLERPARAMETERIUIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]
object PFNGLGETSAMPLERPARAMETERIUIVPROC:
  given _tag: Tag[PFNGLGETSAMPLERPARAMETERIUIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETSAMPLERPARAMETERIUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]): PFNGLGETSAMPLERPARAMETERIUIVPROC = o
  extension (v: PFNGLGETSAMPLERPARAMETERIUIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETSAMPLERPARAMETERIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETSAMPLERPARAMETERIVPROC:
  given _tag: Tag[PFNGLGETSAMPLERPARAMETERIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETSAMPLERPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETSAMPLERPARAMETERIVPROC = o
  extension (v: PFNGLGETSAMPLERPARAMETERIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETSHADERINFOLOGPROC = CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
object PFNGLGETSHADERINFOLOGPROC:
  given _tag: Tag[PFNGLGETSHADERINFOLOGPROC] = Tag.materializeCFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETSHADERINFOLOGPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]): PFNGLGETSHADERINFOLOGPROC = o
  extension (v: PFNGLGETSHADERINFOLOGPROC)
    inline def value: CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETSHADERIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETSHADERIVPROC:
  given _tag: Tag[PFNGLGETSHADERIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETSHADERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETSHADERIVPROC = o
  extension (v: PFNGLGETSHADERIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETSHADERPRECISIONFORMATPROC = CFuncPtr4[GLenum, GLenum, Ptr[GLint], Ptr[GLint], Unit]
object PFNGLGETSHADERPRECISIONFORMATPROC:
  given _tag: Tag[PFNGLGETSHADERPRECISIONFORMATPROC] = Tag.materializeCFuncPtr4[GLenum, GLenum, Ptr[GLint], Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETSHADERPRECISIONFORMATPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLenum, Ptr[GLint], Ptr[GLint], Unit]): PFNGLGETSHADERPRECISIONFORMATPROC = o
  extension (v: PFNGLGETSHADERPRECISIONFORMATPROC)
    inline def value: CFuncPtr4[GLenum, GLenum, Ptr[GLint], Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETSHADERSOURCEPROC = CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
object PFNGLGETSHADERSOURCEPROC:
  given _tag: Tag[PFNGLGETSHADERSOURCEPROC] = Tag.materializeCFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETSHADERSOURCEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit]): PFNGLGETSHADERSOURCEPROC = o
  extension (v: PFNGLGETSHADERSOURCEPROC)
    inline def value: CFuncPtr4[GLuint, GLsizei, Ptr[GLsizei], Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETSTRINGIPROC = CFuncPtr2[GLenum, GLuint, Ptr[GLubyte]]
object PFNGLGETSTRINGIPROC:
  given _tag: Tag[PFNGLGETSTRINGIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Ptr[GLubyte]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETSTRINGIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Ptr[GLubyte]]): PFNGLGETSTRINGIPROC = o
  extension (v: PFNGLGETSTRINGIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Ptr[GLubyte]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETSTRINGPROC = CFuncPtr1[GLenum, Ptr[GLubyte]]
object PFNGLGETSTRINGPROC:
  given _tag: Tag[PFNGLGETSTRINGPROC] = Tag.materializeCFuncPtr1[GLenum, Ptr[GLubyte]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETSTRINGPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Ptr[GLubyte]]): PFNGLGETSTRINGPROC = o
  extension (v: PFNGLGETSTRINGPROC)
    inline def value: CFuncPtr1[GLenum, Ptr[GLubyte]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETSUBROUTINEINDEXPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLuint]
object PFNGLGETSUBROUTINEINDEXPROC:
  given _tag: Tag[PFNGLGETSUBROUTINEINDEXPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLuint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETSUBROUTINEINDEXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLuint]): PFNGLGETSUBROUTINEINDEXPROC = o
  extension (v: PFNGLGETSUBROUTINEINDEXPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLuint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETSUBROUTINEUNIFORMLOCATIONPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLint]
object PFNGLGETSUBROUTINEUNIFORMLOCATIONPROC:
  given _tag: Tag[PFNGLGETSUBROUTINEUNIFORMLOCATIONPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETSUBROUTINEUNIFORMLOCATIONPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLint]): PFNGLGETSUBROUTINEUNIFORMLOCATIONPROC = o
  extension (v: PFNGLGETSUBROUTINEUNIFORMLOCATIONPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLchar], GLint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETSYNCIVPROC = CFuncPtr5[GLsync, GLenum, GLsizei, Ptr[GLsizei], Ptr[GLint], Unit]
object PFNGLGETSYNCIVPROC:
  given _tag: Tag[PFNGLGETSYNCIVPROC] = Tag.materializeCFuncPtr5[GLsync, GLenum, GLsizei, Ptr[GLsizei], Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETSYNCIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLsync, GLenum, GLsizei, Ptr[GLsizei], Ptr[GLint], Unit]): PFNGLGETSYNCIVPROC = o
  extension (v: PFNGLGETSYNCIVPROC)
    inline def value: CFuncPtr5[GLsync, GLenum, GLsizei, Ptr[GLsizei], Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXENVFVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
object PFNGLGETTEXENVFVPROC:
  given _tag: Tag[PFNGLGETTEXENVFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXENVFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]): PFNGLGETTEXENVFVPROC = o
  extension (v: PFNGLGETTEXENVFVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXENVIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETTEXENVIVPROC:
  given _tag: Tag[PFNGLGETTEXENVIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXENVIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETTEXENVIVPROC = o
  extension (v: PFNGLGETTEXENVIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXGENDVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLdouble], Unit]
object PFNGLGETTEXGENDVPROC:
  given _tag: Tag[PFNGLGETTEXGENDVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXGENDVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLdouble], Unit]): PFNGLGETTEXGENDVPROC = o
  extension (v: PFNGLGETTEXGENDVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXGENFVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
object PFNGLGETTEXGENFVPROC:
  given _tag: Tag[PFNGLGETTEXGENFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXGENFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]): PFNGLGETTEXGENFVPROC = o
  extension (v: PFNGLGETTEXGENFVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXGENIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETTEXGENIVPROC:
  given _tag: Tag[PFNGLGETTEXGENIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXGENIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETTEXGENIVPROC = o
  extension (v: PFNGLGETTEXGENIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXIMAGEPROC = CFuncPtr5[GLenum, GLint, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLGETTEXIMAGEPROC:
  given _tag: Tag[PFNGLGETTEXIMAGEPROC] = Tag.materializeCFuncPtr5[GLenum, GLint, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXIMAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLint, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLGETTEXIMAGEPROC = o
  extension (v: PFNGLGETTEXIMAGEPROC)
    inline def value: CFuncPtr5[GLenum, GLint, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXLEVELPARAMETERFVPROC = CFuncPtr4[GLenum, GLint, GLenum, Ptr[GLfloat], Unit]
object PFNGLGETTEXLEVELPARAMETERFVPROC:
  given _tag: Tag[PFNGLGETTEXLEVELPARAMETERFVPROC] = Tag.materializeCFuncPtr4[GLenum, GLint, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXLEVELPARAMETERFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLint, GLenum, Ptr[GLfloat], Unit]): PFNGLGETTEXLEVELPARAMETERFVPROC = o
  extension (v: PFNGLGETTEXLEVELPARAMETERFVPROC)
    inline def value: CFuncPtr4[GLenum, GLint, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXLEVELPARAMETERIVPROC = CFuncPtr4[GLenum, GLint, GLenum, Ptr[GLint], Unit]
object PFNGLGETTEXLEVELPARAMETERIVPROC:
  given _tag: Tag[PFNGLGETTEXLEVELPARAMETERIVPROC] = Tag.materializeCFuncPtr4[GLenum, GLint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXLEVELPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLint, GLenum, Ptr[GLint], Unit]): PFNGLGETTEXLEVELPARAMETERIVPROC = o
  extension (v: PFNGLGETTEXLEVELPARAMETERIVPROC)
    inline def value: CFuncPtr4[GLenum, GLint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXPARAMETERFVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
object PFNGLGETTEXPARAMETERFVPROC:
  given _tag: Tag[PFNGLGETTEXPARAMETERFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXPARAMETERFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]): PFNGLGETTEXPARAMETERFVPROC = o
  extension (v: PFNGLGETTEXPARAMETERFVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXPARAMETERIIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETTEXPARAMETERIIVPROC:
  given _tag: Tag[PFNGLGETTEXPARAMETERIIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXPARAMETERIIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETTEXPARAMETERIIVPROC = o
  extension (v: PFNGLGETTEXPARAMETERIIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXPARAMETERIUIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]
object PFNGLGETTEXPARAMETERIUIVPROC:
  given _tag: Tag[PFNGLGETTEXPARAMETERIUIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXPARAMETERIUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]): PFNGLGETTEXPARAMETERIUIVPROC = o
  extension (v: PFNGLGETTEXPARAMETERIUIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXPARAMETERIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLGETTEXPARAMETERIVPROC:
  given _tag: Tag[PFNGLGETTEXPARAMETERIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLGETTEXPARAMETERIVPROC = o
  extension (v: PFNGLGETTEXPARAMETERIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXTUREIMAGEPROC = CFuncPtr6[GLuint, GLint, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLGETTEXTUREIMAGEPROC:
  given _tag: Tag[PFNGLGETTEXTUREIMAGEPROC] = Tag.materializeCFuncPtr6[GLuint, GLint, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXTUREIMAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLint, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLGETTEXTUREIMAGEPROC = o
  extension (v: PFNGLGETTEXTUREIMAGEPROC)
    inline def value: CFuncPtr6[GLuint, GLint, GLenum, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXTURELEVELPARAMETERFVPROC = CFuncPtr4[GLuint, GLint, GLenum, Ptr[GLfloat], Unit]
object PFNGLGETTEXTURELEVELPARAMETERFVPROC:
  given _tag: Tag[PFNGLGETTEXTURELEVELPARAMETERFVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXTURELEVELPARAMETERFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLenum, Ptr[GLfloat], Unit]): PFNGLGETTEXTURELEVELPARAMETERFVPROC = o
  extension (v: PFNGLGETTEXTURELEVELPARAMETERFVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXTURELEVELPARAMETERIVPROC = CFuncPtr4[GLuint, GLint, GLenum, Ptr[GLint], Unit]
object PFNGLGETTEXTURELEVELPARAMETERIVPROC:
  given _tag: Tag[PFNGLGETTEXTURELEVELPARAMETERIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXTURELEVELPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLenum, Ptr[GLint], Unit]): PFNGLGETTEXTURELEVELPARAMETERIVPROC = o
  extension (v: PFNGLGETTEXTURELEVELPARAMETERIVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXTUREPARAMETERFVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]
object PFNGLGETTEXTUREPARAMETERFVPROC:
  given _tag: Tag[PFNGLGETTEXTUREPARAMETERFVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXTUREPARAMETERFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]): PFNGLGETTEXTUREPARAMETERFVPROC = o
  extension (v: PFNGLGETTEXTUREPARAMETERFVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXTUREPARAMETERIIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETTEXTUREPARAMETERIIVPROC:
  given _tag: Tag[PFNGLGETTEXTUREPARAMETERIIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXTUREPARAMETERIIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETTEXTUREPARAMETERIIVPROC = o
  extension (v: PFNGLGETTEXTUREPARAMETERIIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXTUREPARAMETERIUIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]
object PFNGLGETTEXTUREPARAMETERIUIVPROC:
  given _tag: Tag[PFNGLGETTEXTUREPARAMETERIUIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXTUREPARAMETERIUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]): PFNGLGETTEXTUREPARAMETERIUIVPROC = o
  extension (v: PFNGLGETTEXTUREPARAMETERIUIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXTUREPARAMETERIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETTEXTUREPARAMETERIVPROC:
  given _tag: Tag[PFNGLGETTEXTUREPARAMETERIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXTUREPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETTEXTUREPARAMETERIVPROC = o
  extension (v: PFNGLGETTEXTUREPARAMETERIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTEXTURESUBIMAGEPROC = CFuncPtr12[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLGETTEXTURESUBIMAGEPROC:
  given _tag: Tag[PFNGLGETTEXTURESUBIMAGEPROC] = Tag.materializeCFuncPtr12[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTEXTURESUBIMAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr12[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLGETTEXTURESUBIMAGEPROC = o
  extension (v: PFNGLGETTEXTURESUBIMAGEPROC)
    inline def value: CFuncPtr12[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTRANSFORMFEEDBACKI64_VPROC = CFuncPtr4[GLuint, GLenum, GLuint, Ptr[GLint64], Unit]
object PFNGLGETTRANSFORMFEEDBACKI64_VPROC:
  given _tag: Tag[PFNGLGETTRANSFORMFEEDBACKI64_VPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLuint, Ptr[GLint64], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTRANSFORMFEEDBACKI64_VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLuint, Ptr[GLint64], Unit]): PFNGLGETTRANSFORMFEEDBACKI64_VPROC = o
  extension (v: PFNGLGETTRANSFORMFEEDBACKI64_VPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLuint, Ptr[GLint64], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTRANSFORMFEEDBACKIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETTRANSFORMFEEDBACKIVPROC:
  given _tag: Tag[PFNGLGETTRANSFORMFEEDBACKIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTRANSFORMFEEDBACKIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETTRANSFORMFEEDBACKIVPROC = o
  extension (v: PFNGLGETTRANSFORMFEEDBACKIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTRANSFORMFEEDBACKI_VPROC = CFuncPtr4[GLuint, GLenum, GLuint, Ptr[GLint], Unit]
object PFNGLGETTRANSFORMFEEDBACKI_VPROC:
  given _tag: Tag[PFNGLGETTRANSFORMFEEDBACKI_VPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLuint, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTRANSFORMFEEDBACKI_VPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLuint, Ptr[GLint], Unit]): PFNGLGETTRANSFORMFEEDBACKI_VPROC = o
  extension (v: PFNGLGETTRANSFORMFEEDBACKI_VPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLuint, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETTRANSFORMFEEDBACKVARYINGPROC = CFuncPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLsizei], Ptr[GLenum], Ptr[GLchar], Unit]
object PFNGLGETTRANSFORMFEEDBACKVARYINGPROC:
  given _tag: Tag[PFNGLGETTRANSFORMFEEDBACKVARYINGPROC] = Tag.materializeCFuncPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLsizei], Ptr[GLenum], Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETTRANSFORMFEEDBACKVARYINGPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLsizei], Ptr[GLenum], Ptr[GLchar], Unit]): PFNGLGETTRANSFORMFEEDBACKVARYINGPROC = o
  extension (v: PFNGLGETTRANSFORMFEEDBACKVARYINGPROC)
    inline def value: CFuncPtr7[GLuint, GLuint, GLsizei, Ptr[GLsizei], Ptr[GLsizei], Ptr[GLenum], Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETUNIFORMBLOCKINDEXPROC = CFuncPtr2[GLuint, Ptr[GLchar], GLuint]
object PFNGLGETUNIFORMBLOCKINDEXPROC:
  given _tag: Tag[PFNGLGETUNIFORMBLOCKINDEXPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLchar], GLuint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETUNIFORMBLOCKINDEXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLchar], GLuint]): PFNGLGETUNIFORMBLOCKINDEXPROC = o
  extension (v: PFNGLGETUNIFORMBLOCKINDEXPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLchar], GLuint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETUNIFORMDVPROC = CFuncPtr3[GLuint, GLint, Ptr[GLdouble], Unit]
object PFNGLGETUNIFORMDVPROC:
  given _tag: Tag[PFNGLGETUNIFORMDVPROC] = Tag.materializeCFuncPtr3[GLuint, GLint, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETUNIFORMDVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLint, Ptr[GLdouble], Unit]): PFNGLGETUNIFORMDVPROC = o
  extension (v: PFNGLGETUNIFORMDVPROC)
    inline def value: CFuncPtr3[GLuint, GLint, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETUNIFORMFVPROC = CFuncPtr3[GLuint, GLint, Ptr[GLfloat], Unit]
object PFNGLGETUNIFORMFVPROC:
  given _tag: Tag[PFNGLGETUNIFORMFVPROC] = Tag.materializeCFuncPtr3[GLuint, GLint, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETUNIFORMFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLint, Ptr[GLfloat], Unit]): PFNGLGETUNIFORMFVPROC = o
  extension (v: PFNGLGETUNIFORMFVPROC)
    inline def value: CFuncPtr3[GLuint, GLint, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETUNIFORMINDICESPROC = CFuncPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], Ptr[GLuint], Unit]
object PFNGLGETUNIFORMINDICESPROC:
  given _tag: Tag[PFNGLGETUNIFORMINDICESPROC] = Tag.materializeCFuncPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETUNIFORMINDICESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], Ptr[GLuint], Unit]): PFNGLGETUNIFORMINDICESPROC = o
  extension (v: PFNGLGETUNIFORMINDICESPROC)
    inline def value: CFuncPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETUNIFORMIVPROC = CFuncPtr3[GLuint, GLint, Ptr[GLint], Unit]
object PFNGLGETUNIFORMIVPROC:
  given _tag: Tag[PFNGLGETUNIFORMIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLint, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETUNIFORMIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLint, Ptr[GLint], Unit]): PFNGLGETUNIFORMIVPROC = o
  extension (v: PFNGLGETUNIFORMIVPROC)
    inline def value: CFuncPtr3[GLuint, GLint, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETUNIFORMLOCATIONPROC = CFuncPtr2[GLuint, Ptr[GLchar], GLint]
object PFNGLGETUNIFORMLOCATIONPROC:
  given _tag: Tag[PFNGLGETUNIFORMLOCATIONPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLchar], GLint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETUNIFORMLOCATIONPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLchar], GLint]): PFNGLGETUNIFORMLOCATIONPROC = o
  extension (v: PFNGLGETUNIFORMLOCATIONPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLchar], GLint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETUNIFORMSUBROUTINEUIVPROC = CFuncPtr3[GLenum, GLint, Ptr[GLuint], Unit]
object PFNGLGETUNIFORMSUBROUTINEUIVPROC:
  given _tag: Tag[PFNGLGETUNIFORMSUBROUTINEUIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLint, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETUNIFORMSUBROUTINEUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLint, Ptr[GLuint], Unit]): PFNGLGETUNIFORMSUBROUTINEUIVPROC = o
  extension (v: PFNGLGETUNIFORMSUBROUTINEUIVPROC)
    inline def value: CFuncPtr3[GLenum, GLint, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETUNIFORMUIVPROC = CFuncPtr3[GLuint, GLint, Ptr[GLuint], Unit]
object PFNGLGETUNIFORMUIVPROC:
  given _tag: Tag[PFNGLGETUNIFORMUIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLint, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETUNIFORMUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLint, Ptr[GLuint], Unit]): PFNGLGETUNIFORMUIVPROC = o
  extension (v: PFNGLGETUNIFORMUIVPROC)
    inline def value: CFuncPtr3[GLuint, GLint, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETVERTEXARRAYINDEXED64IVPROC = CFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint64], Unit]
object PFNGLGETVERTEXARRAYINDEXED64IVPROC:
  given _tag: Tag[PFNGLGETVERTEXARRAYINDEXED64IVPROC] = Tag.materializeCFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint64], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETVERTEXARRAYINDEXED64IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint64], Unit]): PFNGLGETVERTEXARRAYINDEXED64IVPROC = o
  extension (v: PFNGLGETVERTEXARRAYINDEXED64IVPROC)
    inline def value: CFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint64], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETVERTEXARRAYINDEXEDIVPROC = CFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETVERTEXARRAYINDEXEDIVPROC:
  given _tag: Tag[PFNGLGETVERTEXARRAYINDEXEDIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETVERTEXARRAYINDEXEDIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETVERTEXARRAYINDEXEDIVPROC = o
  extension (v: PFNGLGETVERTEXARRAYINDEXEDIVPROC)
    inline def value: CFuncPtr4[GLuint, GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETVERTEXARRAYIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETVERTEXARRAYIVPROC:
  given _tag: Tag[PFNGLGETVERTEXARRAYIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETVERTEXARRAYIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETVERTEXARRAYIVPROC = o
  extension (v: PFNGLGETVERTEXARRAYIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETVERTEXATTRIBDVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLdouble], Unit]
object PFNGLGETVERTEXATTRIBDVPROC:
  given _tag: Tag[PFNGLGETVERTEXATTRIBDVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETVERTEXATTRIBDVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLdouble], Unit]): PFNGLGETVERTEXATTRIBDVPROC = o
  extension (v: PFNGLGETVERTEXATTRIBDVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETVERTEXATTRIBFVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]
object PFNGLGETVERTEXATTRIBFVPROC:
  given _tag: Tag[PFNGLGETVERTEXATTRIBFVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETVERTEXATTRIBFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]): PFNGLGETVERTEXATTRIBFVPROC = o
  extension (v: PFNGLGETVERTEXATTRIBFVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETVERTEXATTRIBIIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETVERTEXATTRIBIIVPROC:
  given _tag: Tag[PFNGLGETVERTEXATTRIBIIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETVERTEXATTRIBIIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETVERTEXATTRIBIIVPROC = o
  extension (v: PFNGLGETVERTEXATTRIBIIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETVERTEXATTRIBIUIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]
object PFNGLGETVERTEXATTRIBIUIVPROC:
  given _tag: Tag[PFNGLGETVERTEXATTRIBIUIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETVERTEXATTRIBIUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]): PFNGLGETVERTEXATTRIBIUIVPROC = o
  extension (v: PFNGLGETVERTEXATTRIBIUIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETVERTEXATTRIBIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLGETVERTEXATTRIBIVPROC:
  given _tag: Tag[PFNGLGETVERTEXATTRIBIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETVERTEXATTRIBIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLGETVERTEXATTRIBIVPROC = o
  extension (v: PFNGLGETVERTEXATTRIBIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETVERTEXATTRIBLDVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLdouble], Unit]
object PFNGLGETVERTEXATTRIBLDVPROC:
  given _tag: Tag[PFNGLGETVERTEXATTRIBLDVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETVERTEXATTRIBLDVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLdouble], Unit]): PFNGLGETVERTEXATTRIBLDVPROC = o
  extension (v: PFNGLGETVERTEXATTRIBLDVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLGETVERTEXATTRIBPOINTERVPROC = CFuncPtr3[GLuint, GLenum, Ptr[Ptr[Byte]], Unit]
object PFNGLGETVERTEXATTRIBPOINTERVPROC:
  given _tag: Tag[PFNGLGETVERTEXATTRIBPOINTERVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[Ptr[Byte]], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLGETVERTEXATTRIBPOINTERVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[Ptr[Byte]], Unit]): PFNGLGETVERTEXATTRIBPOINTERVPROC = o
  extension (v: PFNGLGETVERTEXATTRIBPOINTERVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[Ptr[Byte]], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLHINTPROC = CFuncPtr2[GLenum, GLenum, Unit]
object PFNGLHINTPROC:
  given _tag: Tag[PFNGLHINTPROC] = Tag.materializeCFuncPtr2[GLenum, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLHINTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLenum, Unit]): PFNGLHINTPROC = o
  extension (v: PFNGLHINTPROC)
    inline def value: CFuncPtr2[GLenum, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINDEXDPROC = CFuncPtr1[GLdouble, Unit]
object PFNGLINDEXDPROC:
  given _tag: Tag[PFNGLINDEXDPROC] = Tag.materializeCFuncPtr1[GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINDEXDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLdouble, Unit]): PFNGLINDEXDPROC = o
  extension (v: PFNGLINDEXDPROC)
    inline def value: CFuncPtr1[GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINDEXDVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLINDEXDVPROC:
  given _tag: Tag[PFNGLINDEXDVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINDEXDVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLINDEXDVPROC = o
  extension (v: PFNGLINDEXDVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINDEXFPROC = CFuncPtr1[GLfloat, Unit]
object PFNGLINDEXFPROC:
  given _tag: Tag[PFNGLINDEXFPROC] = Tag.materializeCFuncPtr1[GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINDEXFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLfloat, Unit]): PFNGLINDEXFPROC = o
  extension (v: PFNGLINDEXFPROC)
    inline def value: CFuncPtr1[GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINDEXFVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLINDEXFVPROC:
  given _tag: Tag[PFNGLINDEXFVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINDEXFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLINDEXFVPROC = o
  extension (v: PFNGLINDEXFVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINDEXIPROC = CFuncPtr1[GLint, Unit]
object PFNGLINDEXIPROC:
  given _tag: Tag[PFNGLINDEXIPROC] = Tag.materializeCFuncPtr1[GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINDEXIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLint, Unit]): PFNGLINDEXIPROC = o
  extension (v: PFNGLINDEXIPROC)
    inline def value: CFuncPtr1[GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINDEXIVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLINDEXIVPROC:
  given _tag: Tag[PFNGLINDEXIVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINDEXIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLINDEXIVPROC = o
  extension (v: PFNGLINDEXIVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINDEXMASKPROC = CFuncPtr1[GLuint, Unit]
object PFNGLINDEXMASKPROC:
  given _tag: Tag[PFNGLINDEXMASKPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINDEXMASKPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLINDEXMASKPROC = o
  extension (v: PFNGLINDEXMASKPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINDEXPOINTERPROC = CFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLINDEXPOINTERPROC:
  given _tag: Tag[PFNGLINDEXPOINTERPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINDEXPOINTERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLINDEXPOINTERPROC = o
  extension (v: PFNGLINDEXPOINTERPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINDEXSPROC = CFuncPtr1[GLshort, Unit]
object PFNGLINDEXSPROC:
  given _tag: Tag[PFNGLINDEXSPROC] = Tag.materializeCFuncPtr1[GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINDEXSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLshort, Unit]): PFNGLINDEXSPROC = o
  extension (v: PFNGLINDEXSPROC)
    inline def value: CFuncPtr1[GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINDEXSVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLINDEXSVPROC:
  given _tag: Tag[PFNGLINDEXSVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINDEXSVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLINDEXSVPROC = o
  extension (v: PFNGLINDEXSVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINDEXUBPROC = CFuncPtr1[GLubyte, Unit]
object PFNGLINDEXUBPROC:
  given _tag: Tag[PFNGLINDEXUBPROC] = Tag.materializeCFuncPtr1[GLubyte, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINDEXUBPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLubyte, Unit]): PFNGLINDEXUBPROC = o
  extension (v: PFNGLINDEXUBPROC)
    inline def value: CFuncPtr1[GLubyte, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINDEXUBVPROC = CFuncPtr1[Ptr[GLubyte], Unit]
object PFNGLINDEXUBVPROC:
  given _tag: Tag[PFNGLINDEXUBVPROC] = Tag.materializeCFuncPtr1[Ptr[GLubyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINDEXUBVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLubyte], Unit]): PFNGLINDEXUBVPROC = o
  extension (v: PFNGLINDEXUBVPROC)
    inline def value: CFuncPtr1[Ptr[GLubyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINITNAMESPROC = CFuncPtr0[Unit]
object PFNGLINITNAMESPROC:
  given _tag: Tag[PFNGLINITNAMESPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINITNAMESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLINITNAMESPROC = o
  extension (v: PFNGLINITNAMESPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINTERLEAVEDARRAYSPROC = CFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLINTERLEAVEDARRAYSPROC:
  given _tag: Tag[PFNGLINTERLEAVEDARRAYSPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINTERLEAVEDARRAYSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLINTERLEAVEDARRAYSPROC = o
  extension (v: PFNGLINTERLEAVEDARRAYSPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINVALIDATEBUFFERDATAPROC = CFuncPtr1[GLuint, Unit]
object PFNGLINVALIDATEBUFFERDATAPROC:
  given _tag: Tag[PFNGLINVALIDATEBUFFERDATAPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINVALIDATEBUFFERDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLINVALIDATEBUFFERDATAPROC = o
  extension (v: PFNGLINVALIDATEBUFFERDATAPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINVALIDATEBUFFERSUBDATAPROC = CFuncPtr3[GLuint, GLintptr, GLsizeiptr, Unit]
object PFNGLINVALIDATEBUFFERSUBDATAPROC:
  given _tag: Tag[PFNGLINVALIDATEBUFFERSUBDATAPROC] = Tag.materializeCFuncPtr3[GLuint, GLintptr, GLsizeiptr, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINVALIDATEBUFFERSUBDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLintptr, GLsizeiptr, Unit]): PFNGLINVALIDATEBUFFERSUBDATAPROC = o
  extension (v: PFNGLINVALIDATEBUFFERSUBDATAPROC)
    inline def value: CFuncPtr3[GLuint, GLintptr, GLsizeiptr, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINVALIDATEFRAMEBUFFERPROC = CFuncPtr3[GLenum, GLsizei, Ptr[GLenum], Unit]
object PFNGLINVALIDATEFRAMEBUFFERPROC:
  given _tag: Tag[PFNGLINVALIDATEFRAMEBUFFERPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[GLenum], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINVALIDATEFRAMEBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[GLenum], Unit]): PFNGLINVALIDATEFRAMEBUFFERPROC = o
  extension (v: PFNGLINVALIDATEFRAMEBUFFERPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[GLenum], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC = CFuncPtr3[GLuint, GLsizei, Ptr[GLenum], Unit]
object PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC:
  given _tag: Tag[PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC] = Tag.materializeCFuncPtr3[GLuint, GLsizei, Ptr[GLenum], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLsizei, Ptr[GLenum], Unit]): PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC = o
  extension (v: PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC)
    inline def value: CFuncPtr3[GLuint, GLsizei, Ptr[GLenum], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC = CFuncPtr7[GLuint, GLsizei, Ptr[GLenum], GLint, GLint, GLsizei, GLsizei, Unit]
object PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC:
  given _tag: Tag[PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC] = Tag.materializeCFuncPtr7[GLuint, GLsizei, Ptr[GLenum], GLint, GLint, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLuint, GLsizei, Ptr[GLenum], GLint, GLint, GLsizei, GLsizei, Unit]): PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC = o
  extension (v: PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC)
    inline def value: CFuncPtr7[GLuint, GLsizei, Ptr[GLenum], GLint, GLint, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINVALIDATESUBFRAMEBUFFERPROC = CFuncPtr7[GLenum, GLsizei, Ptr[GLenum], GLint, GLint, GLsizei, GLsizei, Unit]
object PFNGLINVALIDATESUBFRAMEBUFFERPROC:
  given _tag: Tag[PFNGLINVALIDATESUBFRAMEBUFFERPROC] = Tag.materializeCFuncPtr7[GLenum, GLsizei, Ptr[GLenum], GLint, GLint, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINVALIDATESUBFRAMEBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLenum, GLsizei, Ptr[GLenum], GLint, GLint, GLsizei, GLsizei, Unit]): PFNGLINVALIDATESUBFRAMEBUFFERPROC = o
  extension (v: PFNGLINVALIDATESUBFRAMEBUFFERPROC)
    inline def value: CFuncPtr7[GLenum, GLsizei, Ptr[GLenum], GLint, GLint, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINVALIDATETEXIMAGEPROC = CFuncPtr2[GLuint, GLint, Unit]
object PFNGLINVALIDATETEXIMAGEPROC:
  given _tag: Tag[PFNGLINVALIDATETEXIMAGEPROC] = Tag.materializeCFuncPtr2[GLuint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINVALIDATETEXIMAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLint, Unit]): PFNGLINVALIDATETEXIMAGEPROC = o
  extension (v: PFNGLINVALIDATETEXIMAGEPROC)
    inline def value: CFuncPtr2[GLuint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLINVALIDATETEXSUBIMAGEPROC = CFuncPtr8[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, Unit]
object PFNGLINVALIDATETEXSUBIMAGEPROC:
  given _tag: Tag[PFNGLINVALIDATETEXSUBIMAGEPROC] = Tag.materializeCFuncPtr8[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLINVALIDATETEXSUBIMAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, Unit]): PFNGLINVALIDATETEXSUBIMAGEPROC = o
  extension (v: PFNGLINVALIDATETEXSUBIMAGEPROC)
    inline def value: CFuncPtr8[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISBUFFERPROC = CFuncPtr1[GLuint, GLboolean]
object PFNGLISBUFFERPROC:
  given _tag: Tag[PFNGLISBUFFERPROC] = Tag.materializeCFuncPtr1[GLuint, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, GLboolean]): PFNGLISBUFFERPROC = o
  extension (v: PFNGLISBUFFERPROC)
    inline def value: CFuncPtr1[GLuint, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISENABLEDIPROC = CFuncPtr2[GLenum, GLuint, GLboolean]
object PFNGLISENABLEDIPROC:
  given _tag: Tag[PFNGLISENABLEDIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISENABLEDIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, GLboolean]): PFNGLISENABLEDIPROC = o
  extension (v: PFNGLISENABLEDIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISENABLEDPROC = CFuncPtr1[GLenum, GLboolean]
object PFNGLISENABLEDPROC:
  given _tag: Tag[PFNGLISENABLEDPROC] = Tag.materializeCFuncPtr1[GLenum, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISENABLEDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, GLboolean]): PFNGLISENABLEDPROC = o
  extension (v: PFNGLISENABLEDPROC)
    inline def value: CFuncPtr1[GLenum, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISFRAMEBUFFERPROC = CFuncPtr1[GLuint, GLboolean]
object PFNGLISFRAMEBUFFERPROC:
  given _tag: Tag[PFNGLISFRAMEBUFFERPROC] = Tag.materializeCFuncPtr1[GLuint, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISFRAMEBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, GLboolean]): PFNGLISFRAMEBUFFERPROC = o
  extension (v: PFNGLISFRAMEBUFFERPROC)
    inline def value: CFuncPtr1[GLuint, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISLISTPROC = CFuncPtr1[GLuint, GLboolean]
object PFNGLISLISTPROC:
  given _tag: Tag[PFNGLISLISTPROC] = Tag.materializeCFuncPtr1[GLuint, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISLISTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, GLboolean]): PFNGLISLISTPROC = o
  extension (v: PFNGLISLISTPROC)
    inline def value: CFuncPtr1[GLuint, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISPROGRAMPIPELINEPROC = CFuncPtr1[GLuint, GLboolean]
object PFNGLISPROGRAMPIPELINEPROC:
  given _tag: Tag[PFNGLISPROGRAMPIPELINEPROC] = Tag.materializeCFuncPtr1[GLuint, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISPROGRAMPIPELINEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, GLboolean]): PFNGLISPROGRAMPIPELINEPROC = o
  extension (v: PFNGLISPROGRAMPIPELINEPROC)
    inline def value: CFuncPtr1[GLuint, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISPROGRAMPROC = CFuncPtr1[GLuint, GLboolean]
object PFNGLISPROGRAMPROC:
  given _tag: Tag[PFNGLISPROGRAMPROC] = Tag.materializeCFuncPtr1[GLuint, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISPROGRAMPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, GLboolean]): PFNGLISPROGRAMPROC = o
  extension (v: PFNGLISPROGRAMPROC)
    inline def value: CFuncPtr1[GLuint, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISQUERYPROC = CFuncPtr1[GLuint, GLboolean]
object PFNGLISQUERYPROC:
  given _tag: Tag[PFNGLISQUERYPROC] = Tag.materializeCFuncPtr1[GLuint, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISQUERYPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, GLboolean]): PFNGLISQUERYPROC = o
  extension (v: PFNGLISQUERYPROC)
    inline def value: CFuncPtr1[GLuint, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISRENDERBUFFERPROC = CFuncPtr1[GLuint, GLboolean]
object PFNGLISRENDERBUFFERPROC:
  given _tag: Tag[PFNGLISRENDERBUFFERPROC] = Tag.materializeCFuncPtr1[GLuint, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISRENDERBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, GLboolean]): PFNGLISRENDERBUFFERPROC = o
  extension (v: PFNGLISRENDERBUFFERPROC)
    inline def value: CFuncPtr1[GLuint, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISSAMPLERPROC = CFuncPtr1[GLuint, GLboolean]
object PFNGLISSAMPLERPROC:
  given _tag: Tag[PFNGLISSAMPLERPROC] = Tag.materializeCFuncPtr1[GLuint, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISSAMPLERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, GLboolean]): PFNGLISSAMPLERPROC = o
  extension (v: PFNGLISSAMPLERPROC)
    inline def value: CFuncPtr1[GLuint, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISSHADERPROC = CFuncPtr1[GLuint, GLboolean]
object PFNGLISSHADERPROC:
  given _tag: Tag[PFNGLISSHADERPROC] = Tag.materializeCFuncPtr1[GLuint, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISSHADERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, GLboolean]): PFNGLISSHADERPROC = o
  extension (v: PFNGLISSHADERPROC)
    inline def value: CFuncPtr1[GLuint, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISSYNCPROC = CFuncPtr1[GLsync, GLboolean]
object PFNGLISSYNCPROC:
  given _tag: Tag[PFNGLISSYNCPROC] = Tag.materializeCFuncPtr1[GLsync, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISSYNCPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLsync, GLboolean]): PFNGLISSYNCPROC = o
  extension (v: PFNGLISSYNCPROC)
    inline def value: CFuncPtr1[GLsync, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISTEXTUREPROC = CFuncPtr1[GLuint, GLboolean]
object PFNGLISTEXTUREPROC:
  given _tag: Tag[PFNGLISTEXTUREPROC] = Tag.materializeCFuncPtr1[GLuint, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISTEXTUREPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, GLboolean]): PFNGLISTEXTUREPROC = o
  extension (v: PFNGLISTEXTUREPROC)
    inline def value: CFuncPtr1[GLuint, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISTRANSFORMFEEDBACKPROC = CFuncPtr1[GLuint, GLboolean]
object PFNGLISTRANSFORMFEEDBACKPROC:
  given _tag: Tag[PFNGLISTRANSFORMFEEDBACKPROC] = Tag.materializeCFuncPtr1[GLuint, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISTRANSFORMFEEDBACKPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, GLboolean]): PFNGLISTRANSFORMFEEDBACKPROC = o
  extension (v: PFNGLISTRANSFORMFEEDBACKPROC)
    inline def value: CFuncPtr1[GLuint, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLISVERTEXARRAYPROC = CFuncPtr1[GLuint, GLboolean]
object PFNGLISVERTEXARRAYPROC:
  given _tag: Tag[PFNGLISVERTEXARRAYPROC] = Tag.materializeCFuncPtr1[GLuint, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLISVERTEXARRAYPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, GLboolean]): PFNGLISVERTEXARRAYPROC = o
  extension (v: PFNGLISVERTEXARRAYPROC)
    inline def value: CFuncPtr1[GLuint, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLIGHTFPROC = CFuncPtr3[GLenum, GLenum, GLfloat, Unit]
object PFNGLLIGHTFPROC:
  given _tag: Tag[PFNGLLIGHTFPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLIGHTFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLfloat, Unit]): PFNGLLIGHTFPROC = o
  extension (v: PFNGLLIGHTFPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLIGHTFVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
object PFNGLLIGHTFVPROC:
  given _tag: Tag[PFNGLLIGHTFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLIGHTFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]): PFNGLLIGHTFVPROC = o
  extension (v: PFNGLLIGHTFVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLIGHTIPROC = CFuncPtr3[GLenum, GLenum, GLint, Unit]
object PFNGLLIGHTIPROC:
  given _tag: Tag[PFNGLLIGHTIPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLIGHTIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLint, Unit]): PFNGLLIGHTIPROC = o
  extension (v: PFNGLLIGHTIPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLIGHTIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLLIGHTIVPROC:
  given _tag: Tag[PFNGLLIGHTIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLIGHTIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLLIGHTIVPROC = o
  extension (v: PFNGLLIGHTIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLIGHTMODELFPROC = CFuncPtr2[GLenum, GLfloat, Unit]
object PFNGLLIGHTMODELFPROC:
  given _tag: Tag[PFNGLLIGHTMODELFPROC] = Tag.materializeCFuncPtr2[GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLIGHTMODELFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLfloat, Unit]): PFNGLLIGHTMODELFPROC = o
  extension (v: PFNGLLIGHTMODELFPROC)
    inline def value: CFuncPtr2[GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLIGHTMODELFVPROC = CFuncPtr2[GLenum, Ptr[GLfloat], Unit]
object PFNGLLIGHTMODELFVPROC:
  given _tag: Tag[PFNGLLIGHTMODELFVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLIGHTMODELFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLfloat], Unit]): PFNGLLIGHTMODELFVPROC = o
  extension (v: PFNGLLIGHTMODELFVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLIGHTMODELIPROC = CFuncPtr2[GLenum, GLint, Unit]
object PFNGLLIGHTMODELIPROC:
  given _tag: Tag[PFNGLLIGHTMODELIPROC] = Tag.materializeCFuncPtr2[GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLIGHTMODELIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLint, Unit]): PFNGLLIGHTMODELIPROC = o
  extension (v: PFNGLLIGHTMODELIPROC)
    inline def value: CFuncPtr2[GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLIGHTMODELIVPROC = CFuncPtr2[GLenum, Ptr[GLint], Unit]
object PFNGLLIGHTMODELIVPROC:
  given _tag: Tag[PFNGLLIGHTMODELIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLIGHTMODELIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLint], Unit]): PFNGLLIGHTMODELIVPROC = o
  extension (v: PFNGLLIGHTMODELIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLINESTIPPLEPROC = CFuncPtr2[GLint, GLushort, Unit]
object PFNGLLINESTIPPLEPROC:
  given _tag: Tag[PFNGLLINESTIPPLEPROC] = Tag.materializeCFuncPtr2[GLint, GLushort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLINESTIPPLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLint, GLushort, Unit]): PFNGLLINESTIPPLEPROC = o
  extension (v: PFNGLLINESTIPPLEPROC)
    inline def value: CFuncPtr2[GLint, GLushort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLINEWIDTHPROC = CFuncPtr1[GLfloat, Unit]
object PFNGLLINEWIDTHPROC:
  given _tag: Tag[PFNGLLINEWIDTHPROC] = Tag.materializeCFuncPtr1[GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLINEWIDTHPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLfloat, Unit]): PFNGLLINEWIDTHPROC = o
  extension (v: PFNGLLINEWIDTHPROC)
    inline def value: CFuncPtr1[GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLINKPROGRAMPROC = CFuncPtr1[GLuint, Unit]
object PFNGLLINKPROGRAMPROC:
  given _tag: Tag[PFNGLLINKPROGRAMPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLINKPROGRAMPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLLINKPROGRAMPROC = o
  extension (v: PFNGLLINKPROGRAMPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLISTBASEPROC = CFuncPtr1[GLuint, Unit]
object PFNGLLISTBASEPROC:
  given _tag: Tag[PFNGLLISTBASEPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLISTBASEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLLISTBASEPROC = o
  extension (v: PFNGLLISTBASEPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLOADIDENTITYPROC = CFuncPtr0[Unit]
object PFNGLLOADIDENTITYPROC:
  given _tag: Tag[PFNGLLOADIDENTITYPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLOADIDENTITYPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLLOADIDENTITYPROC = o
  extension (v: PFNGLLOADIDENTITYPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLOADMATRIXDPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLLOADMATRIXDPROC:
  given _tag: Tag[PFNGLLOADMATRIXDPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLOADMATRIXDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLLOADMATRIXDPROC = o
  extension (v: PFNGLLOADMATRIXDPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLOADMATRIXFPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLLOADMATRIXFPROC:
  given _tag: Tag[PFNGLLOADMATRIXFPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLOADMATRIXFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLLOADMATRIXFPROC = o
  extension (v: PFNGLLOADMATRIXFPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLOADNAMEPROC = CFuncPtr1[GLuint, Unit]
object PFNGLLOADNAMEPROC:
  given _tag: Tag[PFNGLLOADNAMEPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLOADNAMEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLLOADNAMEPROC = o
  extension (v: PFNGLLOADNAMEPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLOADTRANSPOSEMATRIXDPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLLOADTRANSPOSEMATRIXDPROC:
  given _tag: Tag[PFNGLLOADTRANSPOSEMATRIXDPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLOADTRANSPOSEMATRIXDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLLOADTRANSPOSEMATRIXDPROC = o
  extension (v: PFNGLLOADTRANSPOSEMATRIXDPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLOADTRANSPOSEMATRIXFPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLLOADTRANSPOSEMATRIXFPROC:
  given _tag: Tag[PFNGLLOADTRANSPOSEMATRIXFPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLOADTRANSPOSEMATRIXFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLLOADTRANSPOSEMATRIXFPROC = o
  extension (v: PFNGLLOADTRANSPOSEMATRIXFPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLLOGICOPPROC = CFuncPtr1[GLenum, Unit]
object PFNGLLOGICOPPROC:
  given _tag: Tag[PFNGLLOGICOPPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLLOGICOPPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLLOGICOPPROC = o
  extension (v: PFNGLLOGICOPPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMAP1DPROC = CFuncPtr6[GLenum, GLdouble, GLdouble, GLint, GLint, Ptr[GLdouble], Unit]
object PFNGLMAP1DPROC:
  given _tag: Tag[PFNGLMAP1DPROC] = Tag.materializeCFuncPtr6[GLenum, GLdouble, GLdouble, GLint, GLint, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMAP1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLdouble, GLdouble, GLint, GLint, Ptr[GLdouble], Unit]): PFNGLMAP1DPROC = o
  extension (v: PFNGLMAP1DPROC)
    inline def value: CFuncPtr6[GLenum, GLdouble, GLdouble, GLint, GLint, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMAP1FPROC = CFuncPtr6[GLenum, GLfloat, GLfloat, GLint, GLint, Ptr[GLfloat], Unit]
object PFNGLMAP1FPROC:
  given _tag: Tag[PFNGLMAP1FPROC] = Tag.materializeCFuncPtr6[GLenum, GLfloat, GLfloat, GLint, GLint, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMAP1FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLfloat, GLfloat, GLint, GLint, Ptr[GLfloat], Unit]): PFNGLMAP1FPROC = o
  extension (v: PFNGLMAP1FPROC)
    inline def value: CFuncPtr6[GLenum, GLfloat, GLfloat, GLint, GLint, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMAP2DPROC = CFuncPtr10[GLenum, GLdouble, GLdouble, GLint, GLint, GLdouble, GLdouble, GLint, GLint, Ptr[GLdouble], Unit]
object PFNGLMAP2DPROC:
  given _tag: Tag[PFNGLMAP2DPROC] = Tag.materializeCFuncPtr10[GLenum, GLdouble, GLdouble, GLint, GLint, GLdouble, GLdouble, GLint, GLint, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMAP2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr10[GLenum, GLdouble, GLdouble, GLint, GLint, GLdouble, GLdouble, GLint, GLint, Ptr[GLdouble], Unit]): PFNGLMAP2DPROC = o
  extension (v: PFNGLMAP2DPROC)
    inline def value: CFuncPtr10[GLenum, GLdouble, GLdouble, GLint, GLint, GLdouble, GLdouble, GLint, GLint, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMAP2FPROC = CFuncPtr10[GLenum, GLfloat, GLfloat, GLint, GLint, GLfloat, GLfloat, GLint, GLint, Ptr[GLfloat], Unit]
object PFNGLMAP2FPROC:
  given _tag: Tag[PFNGLMAP2FPROC] = Tag.materializeCFuncPtr10[GLenum, GLfloat, GLfloat, GLint, GLint, GLfloat, GLfloat, GLint, GLint, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMAP2FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr10[GLenum, GLfloat, GLfloat, GLint, GLint, GLfloat, GLfloat, GLint, GLint, Ptr[GLfloat], Unit]): PFNGLMAP2FPROC = o
  extension (v: PFNGLMAP2FPROC)
    inline def value: CFuncPtr10[GLenum, GLfloat, GLfloat, GLint, GLint, GLfloat, GLfloat, GLint, GLint, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMAPBUFFERPROC = CFuncPtr2[GLenum, GLenum, Ptr[Byte]]
object PFNGLMAPBUFFERPROC:
  given _tag: Tag[PFNGLMAPBUFFERPROC] = Tag.materializeCFuncPtr2[GLenum, GLenum, Ptr[Byte]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMAPBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLenum, Ptr[Byte]]): PFNGLMAPBUFFERPROC = o
  extension (v: PFNGLMAPBUFFERPROC)
    inline def value: CFuncPtr2[GLenum, GLenum, Ptr[Byte]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMAPBUFFERRANGEPROC = CFuncPtr4[GLenum, GLintptr, GLsizeiptr, GLbitfield, Ptr[Byte]]
object PFNGLMAPBUFFERRANGEPROC:
  given _tag: Tag[PFNGLMAPBUFFERRANGEPROC] = Tag.materializeCFuncPtr4[GLenum, GLintptr, GLsizeiptr, GLbitfield, Ptr[Byte]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMAPBUFFERRANGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLintptr, GLsizeiptr, GLbitfield, Ptr[Byte]]): PFNGLMAPBUFFERRANGEPROC = o
  extension (v: PFNGLMAPBUFFERRANGEPROC)
    inline def value: CFuncPtr4[GLenum, GLintptr, GLsizeiptr, GLbitfield, Ptr[Byte]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMAPGRID1DPROC = CFuncPtr3[GLint, GLdouble, GLdouble, Unit]
object PFNGLMAPGRID1DPROC:
  given _tag: Tag[PFNGLMAPGRID1DPROC] = Tag.materializeCFuncPtr3[GLint, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMAPGRID1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLdouble, GLdouble, Unit]): PFNGLMAPGRID1DPROC = o
  extension (v: PFNGLMAPGRID1DPROC)
    inline def value: CFuncPtr3[GLint, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMAPGRID1FPROC = CFuncPtr3[GLint, GLfloat, GLfloat, Unit]
object PFNGLMAPGRID1FPROC:
  given _tag: Tag[PFNGLMAPGRID1FPROC] = Tag.materializeCFuncPtr3[GLint, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMAPGRID1FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLfloat, GLfloat, Unit]): PFNGLMAPGRID1FPROC = o
  extension (v: PFNGLMAPGRID1FPROC)
    inline def value: CFuncPtr3[GLint, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMAPGRID2DPROC = CFuncPtr6[GLint, GLdouble, GLdouble, GLint, GLdouble, GLdouble, Unit]
object PFNGLMAPGRID2DPROC:
  given _tag: Tag[PFNGLMAPGRID2DPROC] = Tag.materializeCFuncPtr6[GLint, GLdouble, GLdouble, GLint, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMAPGRID2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLint, GLdouble, GLdouble, GLint, GLdouble, GLdouble, Unit]): PFNGLMAPGRID2DPROC = o
  extension (v: PFNGLMAPGRID2DPROC)
    inline def value: CFuncPtr6[GLint, GLdouble, GLdouble, GLint, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMAPGRID2FPROC = CFuncPtr6[GLint, GLfloat, GLfloat, GLint, GLfloat, GLfloat, Unit]
object PFNGLMAPGRID2FPROC:
  given _tag: Tag[PFNGLMAPGRID2FPROC] = Tag.materializeCFuncPtr6[GLint, GLfloat, GLfloat, GLint, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMAPGRID2FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLint, GLfloat, GLfloat, GLint, GLfloat, GLfloat, Unit]): PFNGLMAPGRID2FPROC = o
  extension (v: PFNGLMAPGRID2FPROC)
    inline def value: CFuncPtr6[GLint, GLfloat, GLfloat, GLint, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMAPNAMEDBUFFERPROC = CFuncPtr2[GLuint, GLenum, Ptr[Byte]]
object PFNGLMAPNAMEDBUFFERPROC:
  given _tag: Tag[PFNGLMAPNAMEDBUFFERPROC] = Tag.materializeCFuncPtr2[GLuint, GLenum, Ptr[Byte]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMAPNAMEDBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLenum, Ptr[Byte]]): PFNGLMAPNAMEDBUFFERPROC = o
  extension (v: PFNGLMAPNAMEDBUFFERPROC)
    inline def value: CFuncPtr2[GLuint, GLenum, Ptr[Byte]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMAPNAMEDBUFFERRANGEPROC = CFuncPtr4[GLuint, GLintptr, GLsizeiptr, GLbitfield, Ptr[Byte]]
object PFNGLMAPNAMEDBUFFERRANGEPROC:
  given _tag: Tag[PFNGLMAPNAMEDBUFFERRANGEPROC] = Tag.materializeCFuncPtr4[GLuint, GLintptr, GLsizeiptr, GLbitfield, Ptr[Byte]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMAPNAMEDBUFFERRANGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLintptr, GLsizeiptr, GLbitfield, Ptr[Byte]]): PFNGLMAPNAMEDBUFFERRANGEPROC = o
  extension (v: PFNGLMAPNAMEDBUFFERRANGEPROC)
    inline def value: CFuncPtr4[GLuint, GLintptr, GLsizeiptr, GLbitfield, Ptr[Byte]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMATERIALFPROC = CFuncPtr3[GLenum, GLenum, GLfloat, Unit]
object PFNGLMATERIALFPROC:
  given _tag: Tag[PFNGLMATERIALFPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMATERIALFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLfloat, Unit]): PFNGLMATERIALFPROC = o
  extension (v: PFNGLMATERIALFPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMATERIALFVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
object PFNGLMATERIALFVPROC:
  given _tag: Tag[PFNGLMATERIALFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMATERIALFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]): PFNGLMATERIALFVPROC = o
  extension (v: PFNGLMATERIALFVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMATERIALIPROC = CFuncPtr3[GLenum, GLenum, GLint, Unit]
object PFNGLMATERIALIPROC:
  given _tag: Tag[PFNGLMATERIALIPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMATERIALIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLint, Unit]): PFNGLMATERIALIPROC = o
  extension (v: PFNGLMATERIALIPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMATERIALIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLMATERIALIVPROC:
  given _tag: Tag[PFNGLMATERIALIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMATERIALIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLMATERIALIVPROC = o
  extension (v: PFNGLMATERIALIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMATRIXMODEPROC = CFuncPtr1[GLenum, Unit]
object PFNGLMATRIXMODEPROC:
  given _tag: Tag[PFNGLMATRIXMODEPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMATRIXMODEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLMATRIXMODEPROC = o
  extension (v: PFNGLMATRIXMODEPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMEMORYBARRIERBYREGIONPROC = CFuncPtr1[GLbitfield, Unit]
object PFNGLMEMORYBARRIERBYREGIONPROC:
  given _tag: Tag[PFNGLMEMORYBARRIERBYREGIONPROC] = Tag.materializeCFuncPtr1[GLbitfield, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMEMORYBARRIERBYREGIONPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLbitfield, Unit]): PFNGLMEMORYBARRIERBYREGIONPROC = o
  extension (v: PFNGLMEMORYBARRIERBYREGIONPROC)
    inline def value: CFuncPtr1[GLbitfield, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMEMORYBARRIERPROC = CFuncPtr1[GLbitfield, Unit]
object PFNGLMEMORYBARRIERPROC:
  given _tag: Tag[PFNGLMEMORYBARRIERPROC] = Tag.materializeCFuncPtr1[GLbitfield, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMEMORYBARRIERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLbitfield, Unit]): PFNGLMEMORYBARRIERPROC = o
  extension (v: PFNGLMEMORYBARRIERPROC)
    inline def value: CFuncPtr1[GLbitfield, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMINSAMPLESHADINGPROC = CFuncPtr1[GLfloat, Unit]
object PFNGLMINSAMPLESHADINGPROC:
  given _tag: Tag[PFNGLMINSAMPLESHADINGPROC] = Tag.materializeCFuncPtr1[GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMINSAMPLESHADINGPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLfloat, Unit]): PFNGLMINSAMPLESHADINGPROC = o
  extension (v: PFNGLMINSAMPLESHADINGPROC)
    inline def value: CFuncPtr1[GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC = CFuncPtr5[GLenum, Ptr[Byte], GLintptr, GLsizei, GLsizei, Unit]
object PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC:
  given _tag: Tag[PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC] = Tag.materializeCFuncPtr5[GLenum, Ptr[Byte], GLintptr, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, Ptr[Byte], GLintptr, GLsizei, GLsizei, Unit]): PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC = o
  extension (v: PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC)
    inline def value: CFuncPtr5[GLenum, Ptr[Byte], GLintptr, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTIDRAWARRAYSINDIRECTPROC = CFuncPtr4[GLenum, Ptr[Byte], GLsizei, GLsizei, Unit]
object PFNGLMULTIDRAWARRAYSINDIRECTPROC:
  given _tag: Tag[PFNGLMULTIDRAWARRAYSINDIRECTPROC] = Tag.materializeCFuncPtr4[GLenum, Ptr[Byte], GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTIDRAWARRAYSINDIRECTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, Ptr[Byte], GLsizei, GLsizei, Unit]): PFNGLMULTIDRAWARRAYSINDIRECTPROC = o
  extension (v: PFNGLMULTIDRAWARRAYSINDIRECTPROC)
    inline def value: CFuncPtr4[GLenum, Ptr[Byte], GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTIDRAWARRAYSPROC = CFuncPtr4[GLenum, Ptr[GLint], Ptr[GLsizei], GLsizei, Unit]
object PFNGLMULTIDRAWARRAYSPROC:
  given _tag: Tag[PFNGLMULTIDRAWARRAYSPROC] = Tag.materializeCFuncPtr4[GLenum, Ptr[GLint], Ptr[GLsizei], GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTIDRAWARRAYSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, Ptr[GLint], Ptr[GLsizei], GLsizei, Unit]): PFNGLMULTIDRAWARRAYSPROC = o
  extension (v: PFNGLMULTIDRAWARRAYSPROC)
    inline def value: CFuncPtr4[GLenum, Ptr[GLint], Ptr[GLsizei], GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC = CFuncPtr6[GLenum, Ptr[GLsizei], GLenum, Ptr[Ptr[Byte]], GLsizei, Ptr[GLint], Unit]
object PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC:
  given _tag: Tag[PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC] = Tag.materializeCFuncPtr6[GLenum, Ptr[GLsizei], GLenum, Ptr[Ptr[Byte]], GLsizei, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, Ptr[GLsizei], GLenum, Ptr[Ptr[Byte]], GLsizei, Ptr[GLint], Unit]): PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC = o
  extension (v: PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC)
    inline def value: CFuncPtr6[GLenum, Ptr[GLsizei], GLenum, Ptr[Ptr[Byte]], GLsizei, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC = CFuncPtr6[GLenum, GLenum, Ptr[Byte], GLintptr, GLsizei, GLsizei, Unit]
object PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC:
  given _tag: Tag[PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC] = Tag.materializeCFuncPtr6[GLenum, GLenum, Ptr[Byte], GLintptr, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLenum, Ptr[Byte], GLintptr, GLsizei, GLsizei, Unit]): PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC = o
  extension (v: PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTPROC)
    inline def value: CFuncPtr6[GLenum, GLenum, Ptr[Byte], GLintptr, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTIDRAWELEMENTSINDIRECTPROC = CFuncPtr5[GLenum, GLenum, Ptr[Byte], GLsizei, GLsizei, Unit]
object PFNGLMULTIDRAWELEMENTSINDIRECTPROC:
  given _tag: Tag[PFNGLMULTIDRAWELEMENTSINDIRECTPROC] = Tag.materializeCFuncPtr5[GLenum, GLenum, Ptr[Byte], GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTIDRAWELEMENTSINDIRECTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLenum, Ptr[Byte], GLsizei, GLsizei, Unit]): PFNGLMULTIDRAWELEMENTSINDIRECTPROC = o
  extension (v: PFNGLMULTIDRAWELEMENTSINDIRECTPROC)
    inline def value: CFuncPtr5[GLenum, GLenum, Ptr[Byte], GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTIDRAWELEMENTSPROC = CFuncPtr5[GLenum, Ptr[GLsizei], GLenum, Ptr[Ptr[Byte]], GLsizei, Unit]
object PFNGLMULTIDRAWELEMENTSPROC:
  given _tag: Tag[PFNGLMULTIDRAWELEMENTSPROC] = Tag.materializeCFuncPtr5[GLenum, Ptr[GLsizei], GLenum, Ptr[Ptr[Byte]], GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTIDRAWELEMENTSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, Ptr[GLsizei], GLenum, Ptr[Ptr[Byte]], GLsizei, Unit]): PFNGLMULTIDRAWELEMENTSPROC = o
  extension (v: PFNGLMULTIDRAWELEMENTSPROC)
    inline def value: CFuncPtr5[GLenum, Ptr[GLsizei], GLenum, Ptr[Ptr[Byte]], GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD1DPROC = CFuncPtr2[GLenum, GLdouble, Unit]
object PFNGLMULTITEXCOORD1DPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD1DPROC] = Tag.materializeCFuncPtr2[GLenum, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLdouble, Unit]): PFNGLMULTITEXCOORD1DPROC = o
  extension (v: PFNGLMULTITEXCOORD1DPROC)
    inline def value: CFuncPtr2[GLenum, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD1DVPROC = CFuncPtr2[GLenum, Ptr[GLdouble], Unit]
object PFNGLMULTITEXCOORD1DVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD1DVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD1DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLdouble], Unit]): PFNGLMULTITEXCOORD1DVPROC = o
  extension (v: PFNGLMULTITEXCOORD1DVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD1FPROC = CFuncPtr2[GLenum, GLfloat, Unit]
object PFNGLMULTITEXCOORD1FPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD1FPROC] = Tag.materializeCFuncPtr2[GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD1FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLfloat, Unit]): PFNGLMULTITEXCOORD1FPROC = o
  extension (v: PFNGLMULTITEXCOORD1FPROC)
    inline def value: CFuncPtr2[GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD1FVPROC = CFuncPtr2[GLenum, Ptr[GLfloat], Unit]
object PFNGLMULTITEXCOORD1FVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD1FVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD1FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLfloat], Unit]): PFNGLMULTITEXCOORD1FVPROC = o
  extension (v: PFNGLMULTITEXCOORD1FVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD1IPROC = CFuncPtr2[GLenum, GLint, Unit]
object PFNGLMULTITEXCOORD1IPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD1IPROC] = Tag.materializeCFuncPtr2[GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD1IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLint, Unit]): PFNGLMULTITEXCOORD1IPROC = o
  extension (v: PFNGLMULTITEXCOORD1IPROC)
    inline def value: CFuncPtr2[GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD1IVPROC = CFuncPtr2[GLenum, Ptr[GLint], Unit]
object PFNGLMULTITEXCOORD1IVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD1IVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD1IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLint], Unit]): PFNGLMULTITEXCOORD1IVPROC = o
  extension (v: PFNGLMULTITEXCOORD1IVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD1SPROC = CFuncPtr2[GLenum, GLshort, Unit]
object PFNGLMULTITEXCOORD1SPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD1SPROC] = Tag.materializeCFuncPtr2[GLenum, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD1SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLshort, Unit]): PFNGLMULTITEXCOORD1SPROC = o
  extension (v: PFNGLMULTITEXCOORD1SPROC)
    inline def value: CFuncPtr2[GLenum, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD1SVPROC = CFuncPtr2[GLenum, Ptr[GLshort], Unit]
object PFNGLMULTITEXCOORD1SVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD1SVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD1SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLshort], Unit]): PFNGLMULTITEXCOORD1SVPROC = o
  extension (v: PFNGLMULTITEXCOORD1SVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD2DPROC = CFuncPtr3[GLenum, GLdouble, GLdouble, Unit]
object PFNGLMULTITEXCOORD2DPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD2DPROC] = Tag.materializeCFuncPtr3[GLenum, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLdouble, GLdouble, Unit]): PFNGLMULTITEXCOORD2DPROC = o
  extension (v: PFNGLMULTITEXCOORD2DPROC)
    inline def value: CFuncPtr3[GLenum, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD2DVPROC = CFuncPtr2[GLenum, Ptr[GLdouble], Unit]
object PFNGLMULTITEXCOORD2DVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD2DVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLdouble], Unit]): PFNGLMULTITEXCOORD2DVPROC = o
  extension (v: PFNGLMULTITEXCOORD2DVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD2FPROC = CFuncPtr3[GLenum, GLfloat, GLfloat, Unit]
object PFNGLMULTITEXCOORD2FPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD2FPROC] = Tag.materializeCFuncPtr3[GLenum, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD2FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLfloat, GLfloat, Unit]): PFNGLMULTITEXCOORD2FPROC = o
  extension (v: PFNGLMULTITEXCOORD2FPROC)
    inline def value: CFuncPtr3[GLenum, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD2FVPROC = CFuncPtr2[GLenum, Ptr[GLfloat], Unit]
object PFNGLMULTITEXCOORD2FVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD2FVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLfloat], Unit]): PFNGLMULTITEXCOORD2FVPROC = o
  extension (v: PFNGLMULTITEXCOORD2FVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD2IPROC = CFuncPtr3[GLenum, GLint, GLint, Unit]
object PFNGLMULTITEXCOORD2IPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD2IPROC] = Tag.materializeCFuncPtr3[GLenum, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD2IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLint, GLint, Unit]): PFNGLMULTITEXCOORD2IPROC = o
  extension (v: PFNGLMULTITEXCOORD2IPROC)
    inline def value: CFuncPtr3[GLenum, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD2IVPROC = CFuncPtr2[GLenum, Ptr[GLint], Unit]
object PFNGLMULTITEXCOORD2IVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD2IVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD2IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLint], Unit]): PFNGLMULTITEXCOORD2IVPROC = o
  extension (v: PFNGLMULTITEXCOORD2IVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD2SPROC = CFuncPtr3[GLenum, GLshort, GLshort, Unit]
object PFNGLMULTITEXCOORD2SPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD2SPROC] = Tag.materializeCFuncPtr3[GLenum, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD2SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLshort, GLshort, Unit]): PFNGLMULTITEXCOORD2SPROC = o
  extension (v: PFNGLMULTITEXCOORD2SPROC)
    inline def value: CFuncPtr3[GLenum, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD2SVPROC = CFuncPtr2[GLenum, Ptr[GLshort], Unit]
object PFNGLMULTITEXCOORD2SVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD2SVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD2SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLshort], Unit]): PFNGLMULTITEXCOORD2SVPROC = o
  extension (v: PFNGLMULTITEXCOORD2SVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD3DPROC = CFuncPtr4[GLenum, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLMULTITEXCOORD3DPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD3DPROC] = Tag.materializeCFuncPtr4[GLenum, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLdouble, GLdouble, GLdouble, Unit]): PFNGLMULTITEXCOORD3DPROC = o
  extension (v: PFNGLMULTITEXCOORD3DPROC)
    inline def value: CFuncPtr4[GLenum, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD3DVPROC = CFuncPtr2[GLenum, Ptr[GLdouble], Unit]
object PFNGLMULTITEXCOORD3DVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD3DVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLdouble], Unit]): PFNGLMULTITEXCOORD3DVPROC = o
  extension (v: PFNGLMULTITEXCOORD3DVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD3FPROC = CFuncPtr4[GLenum, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLMULTITEXCOORD3FPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD3FPROC] = Tag.materializeCFuncPtr4[GLenum, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD3FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLfloat, GLfloat, GLfloat, Unit]): PFNGLMULTITEXCOORD3FPROC = o
  extension (v: PFNGLMULTITEXCOORD3FPROC)
    inline def value: CFuncPtr4[GLenum, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD3FVPROC = CFuncPtr2[GLenum, Ptr[GLfloat], Unit]
object PFNGLMULTITEXCOORD3FVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD3FVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLfloat], Unit]): PFNGLMULTITEXCOORD3FVPROC = o
  extension (v: PFNGLMULTITEXCOORD3FVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD3IPROC = CFuncPtr4[GLenum, GLint, GLint, GLint, Unit]
object PFNGLMULTITEXCOORD3IPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD3IPROC] = Tag.materializeCFuncPtr4[GLenum, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD3IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLint, GLint, GLint, Unit]): PFNGLMULTITEXCOORD3IPROC = o
  extension (v: PFNGLMULTITEXCOORD3IPROC)
    inline def value: CFuncPtr4[GLenum, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD3IVPROC = CFuncPtr2[GLenum, Ptr[GLint], Unit]
object PFNGLMULTITEXCOORD3IVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD3IVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD3IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLint], Unit]): PFNGLMULTITEXCOORD3IVPROC = o
  extension (v: PFNGLMULTITEXCOORD3IVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD3SPROC = CFuncPtr4[GLenum, GLshort, GLshort, GLshort, Unit]
object PFNGLMULTITEXCOORD3SPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD3SPROC] = Tag.materializeCFuncPtr4[GLenum, GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD3SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLshort, GLshort, GLshort, Unit]): PFNGLMULTITEXCOORD3SPROC = o
  extension (v: PFNGLMULTITEXCOORD3SPROC)
    inline def value: CFuncPtr4[GLenum, GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD3SVPROC = CFuncPtr2[GLenum, Ptr[GLshort], Unit]
object PFNGLMULTITEXCOORD3SVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD3SVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD3SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLshort], Unit]): PFNGLMULTITEXCOORD3SVPROC = o
  extension (v: PFNGLMULTITEXCOORD3SVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD4DPROC = CFuncPtr5[GLenum, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLMULTITEXCOORD4DPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD4DPROC] = Tag.materializeCFuncPtr5[GLenum, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD4DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLdouble, GLdouble, GLdouble, GLdouble, Unit]): PFNGLMULTITEXCOORD4DPROC = o
  extension (v: PFNGLMULTITEXCOORD4DPROC)
    inline def value: CFuncPtr5[GLenum, GLdouble, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD4DVPROC = CFuncPtr2[GLenum, Ptr[GLdouble], Unit]
object PFNGLMULTITEXCOORD4DVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD4DVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLdouble], Unit]): PFNGLMULTITEXCOORD4DVPROC = o
  extension (v: PFNGLMULTITEXCOORD4DVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD4FPROC = CFuncPtr5[GLenum, GLfloat, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLMULTITEXCOORD4FPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD4FPROC] = Tag.materializeCFuncPtr5[GLenum, GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD4FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLfloat, GLfloat, GLfloat, GLfloat, Unit]): PFNGLMULTITEXCOORD4FPROC = o
  extension (v: PFNGLMULTITEXCOORD4FPROC)
    inline def value: CFuncPtr5[GLenum, GLfloat, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD4FVPROC = CFuncPtr2[GLenum, Ptr[GLfloat], Unit]
object PFNGLMULTITEXCOORD4FVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD4FVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD4FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLfloat], Unit]): PFNGLMULTITEXCOORD4FVPROC = o
  extension (v: PFNGLMULTITEXCOORD4FVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD4IPROC = CFuncPtr5[GLenum, GLint, GLint, GLint, GLint, Unit]
object PFNGLMULTITEXCOORD4IPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD4IPROC] = Tag.materializeCFuncPtr5[GLenum, GLint, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD4IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLint, GLint, GLint, GLint, Unit]): PFNGLMULTITEXCOORD4IPROC = o
  extension (v: PFNGLMULTITEXCOORD4IPROC)
    inline def value: CFuncPtr5[GLenum, GLint, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD4IVPROC = CFuncPtr2[GLenum, Ptr[GLint], Unit]
object PFNGLMULTITEXCOORD4IVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD4IVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD4IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLint], Unit]): PFNGLMULTITEXCOORD4IVPROC = o
  extension (v: PFNGLMULTITEXCOORD4IVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD4SPROC = CFuncPtr5[GLenum, GLshort, GLshort, GLshort, GLshort, Unit]
object PFNGLMULTITEXCOORD4SPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD4SPROC] = Tag.materializeCFuncPtr5[GLenum, GLshort, GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD4SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLshort, GLshort, GLshort, GLshort, Unit]): PFNGLMULTITEXCOORD4SPROC = o
  extension (v: PFNGLMULTITEXCOORD4SPROC)
    inline def value: CFuncPtr5[GLenum, GLshort, GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORD4SVPROC = CFuncPtr2[GLenum, Ptr[GLshort], Unit]
object PFNGLMULTITEXCOORD4SVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORD4SVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORD4SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLshort], Unit]): PFNGLMULTITEXCOORD4SVPROC = o
  extension (v: PFNGLMULTITEXCOORD4SVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORDP1UIPROC = CFuncPtr3[GLenum, GLenum, GLuint, Unit]
object PFNGLMULTITEXCOORDP1UIPROC:
  given _tag: Tag[PFNGLMULTITEXCOORDP1UIPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORDP1UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLuint, Unit]): PFNGLMULTITEXCOORDP1UIPROC = o
  extension (v: PFNGLMULTITEXCOORDP1UIPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORDP1UIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]
object PFNGLMULTITEXCOORDP1UIVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORDP1UIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORDP1UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]): PFNGLMULTITEXCOORDP1UIVPROC = o
  extension (v: PFNGLMULTITEXCOORDP1UIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORDP2UIPROC = CFuncPtr3[GLenum, GLenum, GLuint, Unit]
object PFNGLMULTITEXCOORDP2UIPROC:
  given _tag: Tag[PFNGLMULTITEXCOORDP2UIPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORDP2UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLuint, Unit]): PFNGLMULTITEXCOORDP2UIPROC = o
  extension (v: PFNGLMULTITEXCOORDP2UIPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORDP2UIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]
object PFNGLMULTITEXCOORDP2UIVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORDP2UIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORDP2UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]): PFNGLMULTITEXCOORDP2UIVPROC = o
  extension (v: PFNGLMULTITEXCOORDP2UIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORDP3UIPROC = CFuncPtr3[GLenum, GLenum, GLuint, Unit]
object PFNGLMULTITEXCOORDP3UIPROC:
  given _tag: Tag[PFNGLMULTITEXCOORDP3UIPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORDP3UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLuint, Unit]): PFNGLMULTITEXCOORDP3UIPROC = o
  extension (v: PFNGLMULTITEXCOORDP3UIPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORDP3UIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]
object PFNGLMULTITEXCOORDP3UIVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORDP3UIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORDP3UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]): PFNGLMULTITEXCOORDP3UIVPROC = o
  extension (v: PFNGLMULTITEXCOORDP3UIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORDP4UIPROC = CFuncPtr3[GLenum, GLenum, GLuint, Unit]
object PFNGLMULTITEXCOORDP4UIPROC:
  given _tag: Tag[PFNGLMULTITEXCOORDP4UIPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORDP4UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLuint, Unit]): PFNGLMULTITEXCOORDP4UIPROC = o
  extension (v: PFNGLMULTITEXCOORDP4UIPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTITEXCOORDP4UIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]
object PFNGLMULTITEXCOORDP4UIVPROC:
  given _tag: Tag[PFNGLMULTITEXCOORDP4UIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTITEXCOORDP4UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]): PFNGLMULTITEXCOORDP4UIVPROC = o
  extension (v: PFNGLMULTITEXCOORDP4UIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTMATRIXDPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLMULTMATRIXDPROC:
  given _tag: Tag[PFNGLMULTMATRIXDPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTMATRIXDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLMULTMATRIXDPROC = o
  extension (v: PFNGLMULTMATRIXDPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTMATRIXFPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLMULTMATRIXFPROC:
  given _tag: Tag[PFNGLMULTMATRIXFPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTMATRIXFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLMULTMATRIXFPROC = o
  extension (v: PFNGLMULTMATRIXFPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTTRANSPOSEMATRIXDPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLMULTTRANSPOSEMATRIXDPROC:
  given _tag: Tag[PFNGLMULTTRANSPOSEMATRIXDPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTTRANSPOSEMATRIXDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLMULTTRANSPOSEMATRIXDPROC = o
  extension (v: PFNGLMULTTRANSPOSEMATRIXDPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLMULTTRANSPOSEMATRIXFPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLMULTTRANSPOSEMATRIXFPROC:
  given _tag: Tag[PFNGLMULTTRANSPOSEMATRIXFPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLMULTTRANSPOSEMATRIXFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLMULTTRANSPOSEMATRIXFPROC = o
  extension (v: PFNGLMULTTRANSPOSEMATRIXFPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNAMEDBUFFERDATAPROC = CFuncPtr4[GLuint, GLsizeiptr, Ptr[Byte], GLenum, Unit]
object PFNGLNAMEDBUFFERDATAPROC:
  given _tag: Tag[PFNGLNAMEDBUFFERDATAPROC] = Tag.materializeCFuncPtr4[GLuint, GLsizeiptr, Ptr[Byte], GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNAMEDBUFFERDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLsizeiptr, Ptr[Byte], GLenum, Unit]): PFNGLNAMEDBUFFERDATAPROC = o
  extension (v: PFNGLNAMEDBUFFERDATAPROC)
    inline def value: CFuncPtr4[GLuint, GLsizeiptr, Ptr[Byte], GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNAMEDBUFFERSTORAGEPROC = CFuncPtr4[GLuint, GLsizeiptr, Ptr[Byte], GLbitfield, Unit]
object PFNGLNAMEDBUFFERSTORAGEPROC:
  given _tag: Tag[PFNGLNAMEDBUFFERSTORAGEPROC] = Tag.materializeCFuncPtr4[GLuint, GLsizeiptr, Ptr[Byte], GLbitfield, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNAMEDBUFFERSTORAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLsizeiptr, Ptr[Byte], GLbitfield, Unit]): PFNGLNAMEDBUFFERSTORAGEPROC = o
  extension (v: PFNGLNAMEDBUFFERSTORAGEPROC)
    inline def value: CFuncPtr4[GLuint, GLsizeiptr, Ptr[Byte], GLbitfield, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNAMEDBUFFERSUBDATAPROC = CFuncPtr4[GLuint, GLintptr, GLsizeiptr, Ptr[Byte], Unit]
object PFNGLNAMEDBUFFERSUBDATAPROC:
  given _tag: Tag[PFNGLNAMEDBUFFERSUBDATAPROC] = Tag.materializeCFuncPtr4[GLuint, GLintptr, GLsizeiptr, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNAMEDBUFFERSUBDATAPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLintptr, GLsizeiptr, Ptr[Byte], Unit]): PFNGLNAMEDBUFFERSUBDATAPROC = o
  extension (v: PFNGLNAMEDBUFFERSUBDATAPROC)
    inline def value: CFuncPtr4[GLuint, GLintptr, GLsizeiptr, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC = CFuncPtr2[GLuint, GLenum, Unit]
object PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC:
  given _tag: Tag[PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC] = Tag.materializeCFuncPtr2[GLuint, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLenum, Unit]): PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC = o
  extension (v: PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC)
    inline def value: CFuncPtr2[GLuint, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC = CFuncPtr3[GLuint, GLsizei, Ptr[GLenum], Unit]
object PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC:
  given _tag: Tag[PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC] = Tag.materializeCFuncPtr3[GLuint, GLsizei, Ptr[GLenum], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLsizei, Ptr[GLenum], Unit]): PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC = o
  extension (v: PFNGLNAMEDFRAMEBUFFERDRAWBUFFERSPROC)
    inline def value: CFuncPtr3[GLuint, GLsizei, Ptr[GLenum], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC = CFuncPtr3[GLuint, GLenum, GLint, Unit]
object PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC:
  given _tag: Tag[PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, GLint, Unit]): PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC = o
  extension (v: PFNGLNAMEDFRAMEBUFFERPARAMETERIPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC = CFuncPtr2[GLuint, GLenum, Unit]
object PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC:
  given _tag: Tag[PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC] = Tag.materializeCFuncPtr2[GLuint, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLenum, Unit]): PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC = o
  extension (v: PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC)
    inline def value: CFuncPtr2[GLuint, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROC = CFuncPtr4[GLuint, GLenum, GLenum, GLuint, Unit]
object PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROC:
  given _tag: Tag[PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLenum, GLuint, Unit]): PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROC = o
  extension (v: PFNGLNAMEDFRAMEBUFFERRENDERBUFFERPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROC = CFuncPtr5[GLuint, GLenum, GLuint, GLint, GLint, Unit]
object PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROC:
  given _tag: Tag[PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROC] = Tag.materializeCFuncPtr5[GLuint, GLenum, GLuint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLenum, GLuint, GLint, GLint, Unit]): PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROC = o
  extension (v: PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROC)
    inline def value: CFuncPtr5[GLuint, GLenum, GLuint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNAMEDFRAMEBUFFERTEXTUREPROC = CFuncPtr4[GLuint, GLenum, GLuint, GLint, Unit]
object PFNGLNAMEDFRAMEBUFFERTEXTUREPROC:
  given _tag: Tag[PFNGLNAMEDFRAMEBUFFERTEXTUREPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLuint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNAMEDFRAMEBUFFERTEXTUREPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLuint, GLint, Unit]): PFNGLNAMEDFRAMEBUFFERTEXTUREPROC = o
  extension (v: PFNGLNAMEDFRAMEBUFFERTEXTUREPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLuint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC = CFuncPtr5[GLuint, GLsizei, GLenum, GLsizei, GLsizei, Unit]
object PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC:
  given _tag: Tag[PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC] = Tag.materializeCFuncPtr5[GLuint, GLsizei, GLenum, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLsizei, GLenum, GLsizei, GLsizei, Unit]): PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC = o
  extension (v: PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC)
    inline def value: CFuncPtr5[GLuint, GLsizei, GLenum, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNAMEDRENDERBUFFERSTORAGEPROC = CFuncPtr4[GLuint, GLenum, GLsizei, GLsizei, Unit]
object PFNGLNAMEDRENDERBUFFERSTORAGEPROC:
  given _tag: Tag[PFNGLNAMEDRENDERBUFFERSTORAGEPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNAMEDRENDERBUFFERSTORAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLsizei, GLsizei, Unit]): PFNGLNAMEDRENDERBUFFERSTORAGEPROC = o
  extension (v: PFNGLNAMEDRENDERBUFFERSTORAGEPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNEWLISTPROC = CFuncPtr2[GLuint, GLenum, Unit]
object PFNGLNEWLISTPROC:
  given _tag: Tag[PFNGLNEWLISTPROC] = Tag.materializeCFuncPtr2[GLuint, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNEWLISTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLenum, Unit]): PFNGLNEWLISTPROC = o
  extension (v: PFNGLNEWLISTPROC)
    inline def value: CFuncPtr2[GLuint, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNORMAL3BPROC = CFuncPtr3[GLbyte, GLbyte, GLbyte, Unit]
object PFNGLNORMAL3BPROC:
  given _tag: Tag[PFNGLNORMAL3BPROC] = Tag.materializeCFuncPtr3[GLbyte, GLbyte, GLbyte, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNORMAL3BPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLbyte, GLbyte, GLbyte, Unit]): PFNGLNORMAL3BPROC = o
  extension (v: PFNGLNORMAL3BPROC)
    inline def value: CFuncPtr3[GLbyte, GLbyte, GLbyte, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNORMAL3BVPROC = CFuncPtr1[Ptr[GLbyte], Unit]
object PFNGLNORMAL3BVPROC:
  given _tag: Tag[PFNGLNORMAL3BVPROC] = Tag.materializeCFuncPtr1[Ptr[GLbyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNORMAL3BVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLbyte], Unit]): PFNGLNORMAL3BVPROC = o
  extension (v: PFNGLNORMAL3BVPROC)
    inline def value: CFuncPtr1[Ptr[GLbyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNORMAL3DPROC = CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
object PFNGLNORMAL3DPROC:
  given _tag: Tag[PFNGLNORMAL3DPROC] = Tag.materializeCFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNORMAL3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]): PFNGLNORMAL3DPROC = o
  extension (v: PFNGLNORMAL3DPROC)
    inline def value: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNORMAL3DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLNORMAL3DVPROC:
  given _tag: Tag[PFNGLNORMAL3DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNORMAL3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLNORMAL3DVPROC = o
  extension (v: PFNGLNORMAL3DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNORMAL3FPROC = CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
object PFNGLNORMAL3FPROC:
  given _tag: Tag[PFNGLNORMAL3FPROC] = Tag.materializeCFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNORMAL3FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]): PFNGLNORMAL3FPROC = o
  extension (v: PFNGLNORMAL3FPROC)
    inline def value: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNORMAL3FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLNORMAL3FVPROC:
  given _tag: Tag[PFNGLNORMAL3FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNORMAL3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLNORMAL3FVPROC = o
  extension (v: PFNGLNORMAL3FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNORMAL3IPROC = CFuncPtr3[GLint, GLint, GLint, Unit]
object PFNGLNORMAL3IPROC:
  given _tag: Tag[PFNGLNORMAL3IPROC] = Tag.materializeCFuncPtr3[GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNORMAL3IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLint, GLint, Unit]): PFNGLNORMAL3IPROC = o
  extension (v: PFNGLNORMAL3IPROC)
    inline def value: CFuncPtr3[GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNORMAL3IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLNORMAL3IVPROC:
  given _tag: Tag[PFNGLNORMAL3IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNORMAL3IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLNORMAL3IVPROC = o
  extension (v: PFNGLNORMAL3IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNORMAL3SPROC = CFuncPtr3[GLshort, GLshort, GLshort, Unit]
object PFNGLNORMAL3SPROC:
  given _tag: Tag[PFNGLNORMAL3SPROC] = Tag.materializeCFuncPtr3[GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNORMAL3SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLshort, GLshort, GLshort, Unit]): PFNGLNORMAL3SPROC = o
  extension (v: PFNGLNORMAL3SPROC)
    inline def value: CFuncPtr3[GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNORMAL3SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLNORMAL3SVPROC:
  given _tag: Tag[PFNGLNORMAL3SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNORMAL3SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLNORMAL3SVPROC = o
  extension (v: PFNGLNORMAL3SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNORMALP3UIPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLNORMALP3UIPROC:
  given _tag: Tag[PFNGLNORMALP3UIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNORMALP3UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLNORMALP3UIPROC = o
  extension (v: PFNGLNORMALP3UIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNORMALP3UIVPROC = CFuncPtr2[GLenum, Ptr[GLuint], Unit]
object PFNGLNORMALP3UIVPROC:
  given _tag: Tag[PFNGLNORMALP3UIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNORMALP3UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLuint], Unit]): PFNGLNORMALP3UIVPROC = o
  extension (v: PFNGLNORMALP3UIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLNORMALPOINTERPROC = CFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLNORMALPOINTERPROC:
  given _tag: Tag[PFNGLNORMALPOINTERPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLNORMALPOINTERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLNORMALPOINTERPROC = o
  extension (v: PFNGLNORMALPOINTERPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLOBJECTLABELPROC = CFuncPtr4[GLenum, GLuint, GLsizei, Ptr[GLchar], Unit]
object PFNGLOBJECTLABELPROC:
  given _tag: Tag[PFNGLOBJECTLABELPROC] = Tag.materializeCFuncPtr4[GLenum, GLuint, GLsizei, Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLOBJECTLABELPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLuint, GLsizei, Ptr[GLchar], Unit]): PFNGLOBJECTLABELPROC = o
  extension (v: PFNGLOBJECTLABELPROC)
    inline def value: CFuncPtr4[GLenum, GLuint, GLsizei, Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLOBJECTPTRLABELPROC = CFuncPtr3[Ptr[Byte], GLsizei, Ptr[GLchar], Unit]
object PFNGLOBJECTPTRLABELPROC:
  given _tag: Tag[PFNGLOBJECTPTRLABELPROC] = Tag.materializeCFuncPtr3[Ptr[Byte], GLsizei, Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLOBJECTPTRLABELPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[Byte], GLsizei, Ptr[GLchar], Unit]): PFNGLOBJECTPTRLABELPROC = o
  extension (v: PFNGLOBJECTPTRLABELPROC)
    inline def value: CFuncPtr3[Ptr[Byte], GLsizei, Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLORTHOPROC = CFuncPtr6[GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLORTHOPROC:
  given _tag: Tag[PFNGLORTHOPROC] = Tag.materializeCFuncPtr6[GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLORTHOPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, Unit]): PFNGLORTHOPROC = o
  extension (v: PFNGLORTHOPROC)
    inline def value: CFuncPtr6[GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPASSTHROUGHPROC = CFuncPtr1[GLfloat, Unit]
object PFNGLPASSTHROUGHPROC:
  given _tag: Tag[PFNGLPASSTHROUGHPROC] = Tag.materializeCFuncPtr1[GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPASSTHROUGHPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLfloat, Unit]): PFNGLPASSTHROUGHPROC = o
  extension (v: PFNGLPASSTHROUGHPROC)
    inline def value: CFuncPtr1[GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPATCHPARAMETERFVPROC = CFuncPtr2[GLenum, Ptr[GLfloat], Unit]
object PFNGLPATCHPARAMETERFVPROC:
  given _tag: Tag[PFNGLPATCHPARAMETERFVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPATCHPARAMETERFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLfloat], Unit]): PFNGLPATCHPARAMETERFVPROC = o
  extension (v: PFNGLPATCHPARAMETERFVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPATCHPARAMETERIPROC = CFuncPtr2[GLenum, GLint, Unit]
object PFNGLPATCHPARAMETERIPROC:
  given _tag: Tag[PFNGLPATCHPARAMETERIPROC] = Tag.materializeCFuncPtr2[GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPATCHPARAMETERIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLint, Unit]): PFNGLPATCHPARAMETERIPROC = o
  extension (v: PFNGLPATCHPARAMETERIPROC)
    inline def value: CFuncPtr2[GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPAUSETRANSFORMFEEDBACKPROC = CFuncPtr0[Unit]
object PFNGLPAUSETRANSFORMFEEDBACKPROC:
  given _tag: Tag[PFNGLPAUSETRANSFORMFEEDBACKPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPAUSETRANSFORMFEEDBACKPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLPAUSETRANSFORMFEEDBACKPROC = o
  extension (v: PFNGLPAUSETRANSFORMFEEDBACKPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPIXELMAPFVPROC = CFuncPtr3[GLenum, GLsizei, Ptr[GLfloat], Unit]
object PFNGLPIXELMAPFVPROC:
  given _tag: Tag[PFNGLPIXELMAPFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPIXELMAPFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[GLfloat], Unit]): PFNGLPIXELMAPFVPROC = o
  extension (v: PFNGLPIXELMAPFVPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPIXELMAPUIVPROC = CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]
object PFNGLPIXELMAPUIVPROC:
  given _tag: Tag[PFNGLPIXELMAPUIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPIXELMAPUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]): PFNGLPIXELMAPUIVPROC = o
  extension (v: PFNGLPIXELMAPUIVPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPIXELMAPUSVPROC = CFuncPtr3[GLenum, GLsizei, Ptr[GLushort], Unit]
object PFNGLPIXELMAPUSVPROC:
  given _tag: Tag[PFNGLPIXELMAPUSVPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[GLushort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPIXELMAPUSVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[GLushort], Unit]): PFNGLPIXELMAPUSVPROC = o
  extension (v: PFNGLPIXELMAPUSVPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[GLushort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPIXELSTOREFPROC = CFuncPtr2[GLenum, GLfloat, Unit]
object PFNGLPIXELSTOREFPROC:
  given _tag: Tag[PFNGLPIXELSTOREFPROC] = Tag.materializeCFuncPtr2[GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPIXELSTOREFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLfloat, Unit]): PFNGLPIXELSTOREFPROC = o
  extension (v: PFNGLPIXELSTOREFPROC)
    inline def value: CFuncPtr2[GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPIXELSTOREIPROC = CFuncPtr2[GLenum, GLint, Unit]
object PFNGLPIXELSTOREIPROC:
  given _tag: Tag[PFNGLPIXELSTOREIPROC] = Tag.materializeCFuncPtr2[GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPIXELSTOREIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLint, Unit]): PFNGLPIXELSTOREIPROC = o
  extension (v: PFNGLPIXELSTOREIPROC)
    inline def value: CFuncPtr2[GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPIXELTRANSFERFPROC = CFuncPtr2[GLenum, GLfloat, Unit]
object PFNGLPIXELTRANSFERFPROC:
  given _tag: Tag[PFNGLPIXELTRANSFERFPROC] = Tag.materializeCFuncPtr2[GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPIXELTRANSFERFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLfloat, Unit]): PFNGLPIXELTRANSFERFPROC = o
  extension (v: PFNGLPIXELTRANSFERFPROC)
    inline def value: CFuncPtr2[GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPIXELTRANSFERIPROC = CFuncPtr2[GLenum, GLint, Unit]
object PFNGLPIXELTRANSFERIPROC:
  given _tag: Tag[PFNGLPIXELTRANSFERIPROC] = Tag.materializeCFuncPtr2[GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPIXELTRANSFERIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLint, Unit]): PFNGLPIXELTRANSFERIPROC = o
  extension (v: PFNGLPIXELTRANSFERIPROC)
    inline def value: CFuncPtr2[GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPIXELZOOMPROC = CFuncPtr2[GLfloat, GLfloat, Unit]
object PFNGLPIXELZOOMPROC:
  given _tag: Tag[PFNGLPIXELZOOMPROC] = Tag.materializeCFuncPtr2[GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPIXELZOOMPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLfloat, GLfloat, Unit]): PFNGLPIXELZOOMPROC = o
  extension (v: PFNGLPIXELZOOMPROC)
    inline def value: CFuncPtr2[GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPOINTPARAMETERFPROC = CFuncPtr2[GLenum, GLfloat, Unit]
object PFNGLPOINTPARAMETERFPROC:
  given _tag: Tag[PFNGLPOINTPARAMETERFPROC] = Tag.materializeCFuncPtr2[GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPOINTPARAMETERFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLfloat, Unit]): PFNGLPOINTPARAMETERFPROC = o
  extension (v: PFNGLPOINTPARAMETERFPROC)
    inline def value: CFuncPtr2[GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPOINTPARAMETERFVPROC = CFuncPtr2[GLenum, Ptr[GLfloat], Unit]
object PFNGLPOINTPARAMETERFVPROC:
  given _tag: Tag[PFNGLPOINTPARAMETERFVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPOINTPARAMETERFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLfloat], Unit]): PFNGLPOINTPARAMETERFVPROC = o
  extension (v: PFNGLPOINTPARAMETERFVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPOINTPARAMETERIPROC = CFuncPtr2[GLenum, GLint, Unit]
object PFNGLPOINTPARAMETERIPROC:
  given _tag: Tag[PFNGLPOINTPARAMETERIPROC] = Tag.materializeCFuncPtr2[GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPOINTPARAMETERIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLint, Unit]): PFNGLPOINTPARAMETERIPROC = o
  extension (v: PFNGLPOINTPARAMETERIPROC)
    inline def value: CFuncPtr2[GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPOINTPARAMETERIVPROC = CFuncPtr2[GLenum, Ptr[GLint], Unit]
object PFNGLPOINTPARAMETERIVPROC:
  given _tag: Tag[PFNGLPOINTPARAMETERIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPOINTPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLint], Unit]): PFNGLPOINTPARAMETERIVPROC = o
  extension (v: PFNGLPOINTPARAMETERIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPOINTSIZEPROC = CFuncPtr1[GLfloat, Unit]
object PFNGLPOINTSIZEPROC:
  given _tag: Tag[PFNGLPOINTSIZEPROC] = Tag.materializeCFuncPtr1[GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPOINTSIZEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLfloat, Unit]): PFNGLPOINTSIZEPROC = o
  extension (v: PFNGLPOINTSIZEPROC)
    inline def value: CFuncPtr1[GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPOLYGONMODEPROC = CFuncPtr2[GLenum, GLenum, Unit]
object PFNGLPOLYGONMODEPROC:
  given _tag: Tag[PFNGLPOLYGONMODEPROC] = Tag.materializeCFuncPtr2[GLenum, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPOLYGONMODEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLenum, Unit]): PFNGLPOLYGONMODEPROC = o
  extension (v: PFNGLPOLYGONMODEPROC)
    inline def value: CFuncPtr2[GLenum, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPOLYGONOFFSETCLAMPPROC = CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
object PFNGLPOLYGONOFFSETCLAMPPROC:
  given _tag: Tag[PFNGLPOLYGONOFFSETCLAMPPROC] = Tag.materializeCFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPOLYGONOFFSETCLAMPPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]): PFNGLPOLYGONOFFSETCLAMPPROC = o
  extension (v: PFNGLPOLYGONOFFSETCLAMPPROC)
    inline def value: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPOLYGONOFFSETPROC = CFuncPtr2[GLfloat, GLfloat, Unit]
object PFNGLPOLYGONOFFSETPROC:
  given _tag: Tag[PFNGLPOLYGONOFFSETPROC] = Tag.materializeCFuncPtr2[GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPOLYGONOFFSETPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLfloat, GLfloat, Unit]): PFNGLPOLYGONOFFSETPROC = o
  extension (v: PFNGLPOLYGONOFFSETPROC)
    inline def value: CFuncPtr2[GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPOLYGONSTIPPLEPROC = CFuncPtr1[Ptr[GLubyte], Unit]
object PFNGLPOLYGONSTIPPLEPROC:
  given _tag: Tag[PFNGLPOLYGONSTIPPLEPROC] = Tag.materializeCFuncPtr1[Ptr[GLubyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPOLYGONSTIPPLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLubyte], Unit]): PFNGLPOLYGONSTIPPLEPROC = o
  extension (v: PFNGLPOLYGONSTIPPLEPROC)
    inline def value: CFuncPtr1[Ptr[GLubyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPOPATTRIBPROC = CFuncPtr0[Unit]
object PFNGLPOPATTRIBPROC:
  given _tag: Tag[PFNGLPOPATTRIBPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPOPATTRIBPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLPOPATTRIBPROC = o
  extension (v: PFNGLPOPATTRIBPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPOPCLIENTATTRIBPROC = CFuncPtr0[Unit]
object PFNGLPOPCLIENTATTRIBPROC:
  given _tag: Tag[PFNGLPOPCLIENTATTRIBPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPOPCLIENTATTRIBPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLPOPCLIENTATTRIBPROC = o
  extension (v: PFNGLPOPCLIENTATTRIBPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPOPDEBUGGROUPPROC = CFuncPtr0[Unit]
object PFNGLPOPDEBUGGROUPPROC:
  given _tag: Tag[PFNGLPOPDEBUGGROUPPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPOPDEBUGGROUPPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLPOPDEBUGGROUPPROC = o
  extension (v: PFNGLPOPDEBUGGROUPPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPOPMATRIXPROC = CFuncPtr0[Unit]
object PFNGLPOPMATRIXPROC:
  given _tag: Tag[PFNGLPOPMATRIXPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPOPMATRIXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLPOPMATRIXPROC = o
  extension (v: PFNGLPOPMATRIXPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPOPNAMEPROC = CFuncPtr0[Unit]
object PFNGLPOPNAMEPROC:
  given _tag: Tag[PFNGLPOPNAMEPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPOPNAMEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLPOPNAMEPROC = o
  extension (v: PFNGLPOPNAMEPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPRIMITIVERESTARTINDEXPROC = CFuncPtr1[GLuint, Unit]
object PFNGLPRIMITIVERESTARTINDEXPROC:
  given _tag: Tag[PFNGLPRIMITIVERESTARTINDEXPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPRIMITIVERESTARTINDEXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLPRIMITIVERESTARTINDEXPROC = o
  extension (v: PFNGLPRIMITIVERESTARTINDEXPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPRIORITIZETEXTURESPROC = CFuncPtr3[GLsizei, Ptr[GLuint], Ptr[GLfloat], Unit]
object PFNGLPRIORITIZETEXTURESPROC:
  given _tag: Tag[PFNGLPRIORITIZETEXTURESPROC] = Tag.materializeCFuncPtr3[GLsizei, Ptr[GLuint], Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPRIORITIZETEXTURESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLsizei, Ptr[GLuint], Ptr[GLfloat], Unit]): PFNGLPRIORITIZETEXTURESPROC = o
  extension (v: PFNGLPRIORITIZETEXTURESPROC)
    inline def value: CFuncPtr3[GLsizei, Ptr[GLuint], Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMBINARYPROC = CFuncPtr4[GLuint, GLenum, Ptr[Byte], GLsizei, Unit]
object PFNGLPROGRAMBINARYPROC:
  given _tag: Tag[PFNGLPROGRAMBINARYPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, Ptr[Byte], GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMBINARYPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, Ptr[Byte], GLsizei, Unit]): PFNGLPROGRAMBINARYPROC = o
  extension (v: PFNGLPROGRAMBINARYPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, Ptr[Byte], GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMPARAMETERIPROC = CFuncPtr3[GLuint, GLenum, GLint, Unit]
object PFNGLPROGRAMPARAMETERIPROC:
  given _tag: Tag[PFNGLPROGRAMPARAMETERIPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMPARAMETERIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, GLint, Unit]): PFNGLPROGRAMPARAMETERIPROC = o
  extension (v: PFNGLPROGRAMPARAMETERIPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM1DPROC = CFuncPtr3[GLuint, GLint, GLdouble, Unit]
object PFNGLPROGRAMUNIFORM1DPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM1DPROC] = Tag.materializeCFuncPtr3[GLuint, GLint, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLint, GLdouble, Unit]): PFNGLPROGRAMUNIFORM1DPROC = o
  extension (v: PFNGLPROGRAMUNIFORM1DPROC)
    inline def value: CFuncPtr3[GLuint, GLint, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM1DVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]
object PFNGLPROGRAMUNIFORM1DVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM1DVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM1DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]): PFNGLPROGRAMUNIFORM1DVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM1DVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM1FPROC = CFuncPtr3[GLuint, GLint, GLfloat, Unit]
object PFNGLPROGRAMUNIFORM1FPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM1FPROC] = Tag.materializeCFuncPtr3[GLuint, GLint, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM1FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLint, GLfloat, Unit]): PFNGLPROGRAMUNIFORM1FPROC = o
  extension (v: PFNGLPROGRAMUNIFORM1FPROC)
    inline def value: CFuncPtr3[GLuint, GLint, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM1FVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]
object PFNGLPROGRAMUNIFORM1FVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM1FVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM1FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]): PFNGLPROGRAMUNIFORM1FVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM1FVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM1IPROC = CFuncPtr3[GLuint, GLint, GLint, Unit]
object PFNGLPROGRAMUNIFORM1IPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM1IPROC] = Tag.materializeCFuncPtr3[GLuint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM1IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLint, GLint, Unit]): PFNGLPROGRAMUNIFORM1IPROC = o
  extension (v: PFNGLPROGRAMUNIFORM1IPROC)
    inline def value: CFuncPtr3[GLuint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM1IVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]
object PFNGLPROGRAMUNIFORM1IVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM1IVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM1IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]): PFNGLPROGRAMUNIFORM1IVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM1IVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM1UIPROC = CFuncPtr3[GLuint, GLint, GLuint, Unit]
object PFNGLPROGRAMUNIFORM1UIPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM1UIPROC] = Tag.materializeCFuncPtr3[GLuint, GLint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM1UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLint, GLuint, Unit]): PFNGLPROGRAMUNIFORM1UIPROC = o
  extension (v: PFNGLPROGRAMUNIFORM1UIPROC)
    inline def value: CFuncPtr3[GLuint, GLint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM1UIVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]
object PFNGLPROGRAMUNIFORM1UIVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM1UIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM1UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]): PFNGLPROGRAMUNIFORM1UIVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM1UIVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM2DPROC = CFuncPtr4[GLuint, GLint, GLdouble, GLdouble, Unit]
object PFNGLPROGRAMUNIFORM2DPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM2DPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLdouble, GLdouble, Unit]): PFNGLPROGRAMUNIFORM2DPROC = o
  extension (v: PFNGLPROGRAMUNIFORM2DPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM2DVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]
object PFNGLPROGRAMUNIFORM2DVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM2DVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]): PFNGLPROGRAMUNIFORM2DVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM2DVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM2FPROC = CFuncPtr4[GLuint, GLint, GLfloat, GLfloat, Unit]
object PFNGLPROGRAMUNIFORM2FPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM2FPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM2FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLfloat, GLfloat, Unit]): PFNGLPROGRAMUNIFORM2FPROC = o
  extension (v: PFNGLPROGRAMUNIFORM2FPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM2FVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]
object PFNGLPROGRAMUNIFORM2FVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM2FVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]): PFNGLPROGRAMUNIFORM2FVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM2FVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM2IPROC = CFuncPtr4[GLuint, GLint, GLint, GLint, Unit]
object PFNGLPROGRAMUNIFORM2IPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM2IPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM2IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLint, GLint, Unit]): PFNGLPROGRAMUNIFORM2IPROC = o
  extension (v: PFNGLPROGRAMUNIFORM2IPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM2IVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]
object PFNGLPROGRAMUNIFORM2IVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM2IVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM2IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]): PFNGLPROGRAMUNIFORM2IVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM2IVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM2UIPROC = CFuncPtr4[GLuint, GLint, GLuint, GLuint, Unit]
object PFNGLPROGRAMUNIFORM2UIPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM2UIPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM2UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLuint, GLuint, Unit]): PFNGLPROGRAMUNIFORM2UIPROC = o
  extension (v: PFNGLPROGRAMUNIFORM2UIPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM2UIVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]
object PFNGLPROGRAMUNIFORM2UIVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM2UIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM2UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]): PFNGLPROGRAMUNIFORM2UIVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM2UIVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM3DPROC = CFuncPtr5[GLuint, GLint, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLPROGRAMUNIFORM3DPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM3DPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLdouble, GLdouble, GLdouble, Unit]): PFNGLPROGRAMUNIFORM3DPROC = o
  extension (v: PFNGLPROGRAMUNIFORM3DPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM3DVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]
object PFNGLPROGRAMUNIFORM3DVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM3DVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]): PFNGLPROGRAMUNIFORM3DVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM3DVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM3FPROC = CFuncPtr5[GLuint, GLint, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLPROGRAMUNIFORM3FPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM3FPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM3FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLfloat, GLfloat, GLfloat, Unit]): PFNGLPROGRAMUNIFORM3FPROC = o
  extension (v: PFNGLPROGRAMUNIFORM3FPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM3FVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]
object PFNGLPROGRAMUNIFORM3FVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM3FVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]): PFNGLPROGRAMUNIFORM3FVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM3FVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM3IPROC = CFuncPtr5[GLuint, GLint, GLint, GLint, GLint, Unit]
object PFNGLPROGRAMUNIFORM3IPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM3IPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM3IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLint, GLint, GLint, Unit]): PFNGLPROGRAMUNIFORM3IPROC = o
  extension (v: PFNGLPROGRAMUNIFORM3IPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM3IVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]
object PFNGLPROGRAMUNIFORM3IVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM3IVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM3IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]): PFNGLPROGRAMUNIFORM3IVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM3IVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM3UIPROC = CFuncPtr5[GLuint, GLint, GLuint, GLuint, GLuint, Unit]
object PFNGLPROGRAMUNIFORM3UIPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM3UIPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM3UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLuint, GLuint, GLuint, Unit]): PFNGLPROGRAMUNIFORM3UIPROC = o
  extension (v: PFNGLPROGRAMUNIFORM3UIPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM3UIVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]
object PFNGLPROGRAMUNIFORM3UIVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM3UIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM3UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]): PFNGLPROGRAMUNIFORM3UIVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM3UIVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM4DPROC = CFuncPtr6[GLuint, GLint, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLPROGRAMUNIFORM4DPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM4DPROC] = Tag.materializeCFuncPtr6[GLuint, GLint, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM4DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLint, GLdouble, GLdouble, GLdouble, GLdouble, Unit]): PFNGLPROGRAMUNIFORM4DPROC = o
  extension (v: PFNGLPROGRAMUNIFORM4DPROC)
    inline def value: CFuncPtr6[GLuint, GLint, GLdouble, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM4DVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]
object PFNGLPROGRAMUNIFORM4DVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM4DVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit]): PFNGLPROGRAMUNIFORM4DVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM4DVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM4FPROC = CFuncPtr6[GLuint, GLint, GLfloat, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLPROGRAMUNIFORM4FPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM4FPROC] = Tag.materializeCFuncPtr6[GLuint, GLint, GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM4FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLint, GLfloat, GLfloat, GLfloat, GLfloat, Unit]): PFNGLPROGRAMUNIFORM4FPROC = o
  extension (v: PFNGLPROGRAMUNIFORM4FPROC)
    inline def value: CFuncPtr6[GLuint, GLint, GLfloat, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM4FVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]
object PFNGLPROGRAMUNIFORM4FVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM4FVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM4FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit]): PFNGLPROGRAMUNIFORM4FVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM4FVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM4IPROC = CFuncPtr6[GLuint, GLint, GLint, GLint, GLint, GLint, Unit]
object PFNGLPROGRAMUNIFORM4IPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM4IPROC] = Tag.materializeCFuncPtr6[GLuint, GLint, GLint, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM4IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLint, GLint, GLint, GLint, GLint, Unit]): PFNGLPROGRAMUNIFORM4IPROC = o
  extension (v: PFNGLPROGRAMUNIFORM4IPROC)
    inline def value: CFuncPtr6[GLuint, GLint, GLint, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM4IVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]
object PFNGLPROGRAMUNIFORM4IVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM4IVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM4IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit]): PFNGLPROGRAMUNIFORM4IVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM4IVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM4UIPROC = CFuncPtr6[GLuint, GLint, GLuint, GLuint, GLuint, GLuint, Unit]
object PFNGLPROGRAMUNIFORM4UIPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM4UIPROC] = Tag.materializeCFuncPtr6[GLuint, GLint, GLuint, GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM4UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLint, GLuint, GLuint, GLuint, GLuint, Unit]): PFNGLPROGRAMUNIFORM4UIPROC = o
  extension (v: PFNGLPROGRAMUNIFORM4UIPROC)
    inline def value: CFuncPtr6[GLuint, GLint, GLuint, GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORM4UIVPROC = CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]
object PFNGLPROGRAMUNIFORM4UIVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORM4UIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORM4UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit]): PFNGLPROGRAMUNIFORM4UIVPROC = o
  extension (v: PFNGLPROGRAMUNIFORM4UIVPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX2DVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLPROGRAMUNIFORMMATRIX2DVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX2DVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLPROGRAMUNIFORMMATRIX2DVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX2DVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX2FVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLPROGRAMUNIFORMMATRIX2FVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX2FVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLPROGRAMUNIFORMMATRIX2FVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX2FVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX2X3DVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLPROGRAMUNIFORMMATRIX2X3DVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX2X3DVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX2X3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLPROGRAMUNIFORMMATRIX2X3DVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX2X3DVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX2X3FVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLPROGRAMUNIFORMMATRIX2X3FVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX2X3FVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX2X3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLPROGRAMUNIFORMMATRIX2X3FVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX2X3FVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX2X4DVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLPROGRAMUNIFORMMATRIX2X4DVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX2X4DVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX2X4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLPROGRAMUNIFORMMATRIX2X4DVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX2X4DVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX2X4FVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLPROGRAMUNIFORMMATRIX2X4FVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX2X4FVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX2X4FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLPROGRAMUNIFORMMATRIX2X4FVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX2X4FVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX3DVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLPROGRAMUNIFORMMATRIX3DVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX3DVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLPROGRAMUNIFORMMATRIX3DVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX3DVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX3FVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLPROGRAMUNIFORMMATRIX3FVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX3FVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLPROGRAMUNIFORMMATRIX3FVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX3FVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX3X2DVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLPROGRAMUNIFORMMATRIX3X2DVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX3X2DVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX3X2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLPROGRAMUNIFORMMATRIX3X2DVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX3X2DVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX3X2FVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLPROGRAMUNIFORMMATRIX3X2FVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX3X2FVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX3X2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLPROGRAMUNIFORMMATRIX3X2FVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX3X2FVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX3X4DVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLPROGRAMUNIFORMMATRIX3X4DVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX3X4DVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX3X4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLPROGRAMUNIFORMMATRIX3X4DVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX3X4DVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX3X4FVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLPROGRAMUNIFORMMATRIX3X4FVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX3X4FVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX3X4FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLPROGRAMUNIFORMMATRIX3X4FVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX3X4FVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX4DVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLPROGRAMUNIFORMMATRIX4DVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX4DVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLPROGRAMUNIFORMMATRIX4DVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX4DVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX4FVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLPROGRAMUNIFORMMATRIX4FVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX4FVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX4FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLPROGRAMUNIFORMMATRIX4FVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX4FVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX4X2DVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLPROGRAMUNIFORMMATRIX4X2DVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX4X2DVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX4X2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLPROGRAMUNIFORMMATRIX4X2DVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX4X2DVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX4X2FVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLPROGRAMUNIFORMMATRIX4X2FVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX4X2FVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX4X2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLPROGRAMUNIFORMMATRIX4X2FVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX4X2FVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROGRAMUNIFORMMATRIX4X3FVPROC = CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLPROGRAMUNIFORMMATRIX4X3FVPROC:
  given _tag: Tag[PFNGLPROGRAMUNIFORMMATRIX4X3FVPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROGRAMUNIFORMMATRIX4X3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLPROGRAMUNIFORMMATRIX4X3FVPROC = o
  extension (v: PFNGLPROGRAMUNIFORMMATRIX4X3FVPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPROVOKINGVERTEXPROC = CFuncPtr1[GLenum, Unit]
object PFNGLPROVOKINGVERTEXPROC:
  given _tag: Tag[PFNGLPROVOKINGVERTEXPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPROVOKINGVERTEXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLPROVOKINGVERTEXPROC = o
  extension (v: PFNGLPROVOKINGVERTEXPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPUSHATTRIBPROC = CFuncPtr1[GLbitfield, Unit]
object PFNGLPUSHATTRIBPROC:
  given _tag: Tag[PFNGLPUSHATTRIBPROC] = Tag.materializeCFuncPtr1[GLbitfield, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPUSHATTRIBPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLbitfield, Unit]): PFNGLPUSHATTRIBPROC = o
  extension (v: PFNGLPUSHATTRIBPROC)
    inline def value: CFuncPtr1[GLbitfield, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPUSHCLIENTATTRIBPROC = CFuncPtr1[GLbitfield, Unit]
object PFNGLPUSHCLIENTATTRIBPROC:
  given _tag: Tag[PFNGLPUSHCLIENTATTRIBPROC] = Tag.materializeCFuncPtr1[GLbitfield, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPUSHCLIENTATTRIBPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLbitfield, Unit]): PFNGLPUSHCLIENTATTRIBPROC = o
  extension (v: PFNGLPUSHCLIENTATTRIBPROC)
    inline def value: CFuncPtr1[GLbitfield, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPUSHDEBUGGROUPPROC = CFuncPtr4[GLenum, GLuint, GLsizei, Ptr[GLchar], Unit]
object PFNGLPUSHDEBUGGROUPPROC:
  given _tag: Tag[PFNGLPUSHDEBUGGROUPPROC] = Tag.materializeCFuncPtr4[GLenum, GLuint, GLsizei, Ptr[GLchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPUSHDEBUGGROUPPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLuint, GLsizei, Ptr[GLchar], Unit]): PFNGLPUSHDEBUGGROUPPROC = o
  extension (v: PFNGLPUSHDEBUGGROUPPROC)
    inline def value: CFuncPtr4[GLenum, GLuint, GLsizei, Ptr[GLchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPUSHMATRIXPROC = CFuncPtr0[Unit]
object PFNGLPUSHMATRIXPROC:
  given _tag: Tag[PFNGLPUSHMATRIXPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPUSHMATRIXPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLPUSHMATRIXPROC = o
  extension (v: PFNGLPUSHMATRIXPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLPUSHNAMEPROC = CFuncPtr1[GLuint, Unit]
object PFNGLPUSHNAMEPROC:
  given _tag: Tag[PFNGLPUSHNAMEPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLPUSHNAMEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLPUSHNAMEPROC = o
  extension (v: PFNGLPUSHNAMEPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLQUERYCOUNTERPROC = CFuncPtr2[GLuint, GLenum, Unit]
object PFNGLQUERYCOUNTERPROC:
  given _tag: Tag[PFNGLQUERYCOUNTERPROC] = Tag.materializeCFuncPtr2[GLuint, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLQUERYCOUNTERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLenum, Unit]): PFNGLQUERYCOUNTERPROC = o
  extension (v: PFNGLQUERYCOUNTERPROC)
    inline def value: CFuncPtr2[GLuint, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS2DPROC = CFuncPtr2[GLdouble, GLdouble, Unit]
object PFNGLRASTERPOS2DPROC:
  given _tag: Tag[PFNGLRASTERPOS2DPROC] = Tag.materializeCFuncPtr2[GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLdouble, GLdouble, Unit]): PFNGLRASTERPOS2DPROC = o
  extension (v: PFNGLRASTERPOS2DPROC)
    inline def value: CFuncPtr2[GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS2DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLRASTERPOS2DVPROC:
  given _tag: Tag[PFNGLRASTERPOS2DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLRASTERPOS2DVPROC = o
  extension (v: PFNGLRASTERPOS2DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS2FPROC = CFuncPtr2[GLfloat, GLfloat, Unit]
object PFNGLRASTERPOS2FPROC:
  given _tag: Tag[PFNGLRASTERPOS2FPROC] = Tag.materializeCFuncPtr2[GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS2FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLfloat, GLfloat, Unit]): PFNGLRASTERPOS2FPROC = o
  extension (v: PFNGLRASTERPOS2FPROC)
    inline def value: CFuncPtr2[GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS2FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLRASTERPOS2FVPROC:
  given _tag: Tag[PFNGLRASTERPOS2FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLRASTERPOS2FVPROC = o
  extension (v: PFNGLRASTERPOS2FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS2IPROC = CFuncPtr2[GLint, GLint, Unit]
object PFNGLRASTERPOS2IPROC:
  given _tag: Tag[PFNGLRASTERPOS2IPROC] = Tag.materializeCFuncPtr2[GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS2IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLint, GLint, Unit]): PFNGLRASTERPOS2IPROC = o
  extension (v: PFNGLRASTERPOS2IPROC)
    inline def value: CFuncPtr2[GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS2IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLRASTERPOS2IVPROC:
  given _tag: Tag[PFNGLRASTERPOS2IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS2IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLRASTERPOS2IVPROC = o
  extension (v: PFNGLRASTERPOS2IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS2SPROC = CFuncPtr2[GLshort, GLshort, Unit]
object PFNGLRASTERPOS2SPROC:
  given _tag: Tag[PFNGLRASTERPOS2SPROC] = Tag.materializeCFuncPtr2[GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS2SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLshort, GLshort, Unit]): PFNGLRASTERPOS2SPROC = o
  extension (v: PFNGLRASTERPOS2SPROC)
    inline def value: CFuncPtr2[GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS2SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLRASTERPOS2SVPROC:
  given _tag: Tag[PFNGLRASTERPOS2SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS2SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLRASTERPOS2SVPROC = o
  extension (v: PFNGLRASTERPOS2SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS3DPROC = CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
object PFNGLRASTERPOS3DPROC:
  given _tag: Tag[PFNGLRASTERPOS3DPROC] = Tag.materializeCFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]): PFNGLRASTERPOS3DPROC = o
  extension (v: PFNGLRASTERPOS3DPROC)
    inline def value: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS3DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLRASTERPOS3DVPROC:
  given _tag: Tag[PFNGLRASTERPOS3DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLRASTERPOS3DVPROC = o
  extension (v: PFNGLRASTERPOS3DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS3FPROC = CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
object PFNGLRASTERPOS3FPROC:
  given _tag: Tag[PFNGLRASTERPOS3FPROC] = Tag.materializeCFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS3FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]): PFNGLRASTERPOS3FPROC = o
  extension (v: PFNGLRASTERPOS3FPROC)
    inline def value: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS3FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLRASTERPOS3FVPROC:
  given _tag: Tag[PFNGLRASTERPOS3FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLRASTERPOS3FVPROC = o
  extension (v: PFNGLRASTERPOS3FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS3IPROC = CFuncPtr3[GLint, GLint, GLint, Unit]
object PFNGLRASTERPOS3IPROC:
  given _tag: Tag[PFNGLRASTERPOS3IPROC] = Tag.materializeCFuncPtr3[GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS3IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLint, GLint, Unit]): PFNGLRASTERPOS3IPROC = o
  extension (v: PFNGLRASTERPOS3IPROC)
    inline def value: CFuncPtr3[GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS3IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLRASTERPOS3IVPROC:
  given _tag: Tag[PFNGLRASTERPOS3IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS3IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLRASTERPOS3IVPROC = o
  extension (v: PFNGLRASTERPOS3IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS3SPROC = CFuncPtr3[GLshort, GLshort, GLshort, Unit]
object PFNGLRASTERPOS3SPROC:
  given _tag: Tag[PFNGLRASTERPOS3SPROC] = Tag.materializeCFuncPtr3[GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS3SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLshort, GLshort, GLshort, Unit]): PFNGLRASTERPOS3SPROC = o
  extension (v: PFNGLRASTERPOS3SPROC)
    inline def value: CFuncPtr3[GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS3SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLRASTERPOS3SVPROC:
  given _tag: Tag[PFNGLRASTERPOS3SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS3SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLRASTERPOS3SVPROC = o
  extension (v: PFNGLRASTERPOS3SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS4DPROC = CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLRASTERPOS4DPROC:
  given _tag: Tag[PFNGLRASTERPOS4DPROC] = Tag.materializeCFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS4DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]): PFNGLRASTERPOS4DPROC = o
  extension (v: PFNGLRASTERPOS4DPROC)
    inline def value: CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS4DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLRASTERPOS4DVPROC:
  given _tag: Tag[PFNGLRASTERPOS4DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLRASTERPOS4DVPROC = o
  extension (v: PFNGLRASTERPOS4DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS4FPROC = CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLRASTERPOS4FPROC:
  given _tag: Tag[PFNGLRASTERPOS4FPROC] = Tag.materializeCFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS4FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]): PFNGLRASTERPOS4FPROC = o
  extension (v: PFNGLRASTERPOS4FPROC)
    inline def value: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS4FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLRASTERPOS4FVPROC:
  given _tag: Tag[PFNGLRASTERPOS4FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS4FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLRASTERPOS4FVPROC = o
  extension (v: PFNGLRASTERPOS4FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS4IPROC = CFuncPtr4[GLint, GLint, GLint, GLint, Unit]
object PFNGLRASTERPOS4IPROC:
  given _tag: Tag[PFNGLRASTERPOS4IPROC] = Tag.materializeCFuncPtr4[GLint, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS4IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLint, GLint, GLint, Unit]): PFNGLRASTERPOS4IPROC = o
  extension (v: PFNGLRASTERPOS4IPROC)
    inline def value: CFuncPtr4[GLint, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS4IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLRASTERPOS4IVPROC:
  given _tag: Tag[PFNGLRASTERPOS4IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS4IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLRASTERPOS4IVPROC = o
  extension (v: PFNGLRASTERPOS4IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS4SPROC = CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]
object PFNGLRASTERPOS4SPROC:
  given _tag: Tag[PFNGLRASTERPOS4SPROC] = Tag.materializeCFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS4SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]): PFNGLRASTERPOS4SPROC = o
  extension (v: PFNGLRASTERPOS4SPROC)
    inline def value: CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRASTERPOS4SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLRASTERPOS4SVPROC:
  given _tag: Tag[PFNGLRASTERPOS4SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRASTERPOS4SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLRASTERPOS4SVPROC = o
  extension (v: PFNGLRASTERPOS4SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLREADBUFFERPROC = CFuncPtr1[GLenum, Unit]
object PFNGLREADBUFFERPROC:
  given _tag: Tag[PFNGLREADBUFFERPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLREADBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLREADBUFFERPROC = o
  extension (v: PFNGLREADBUFFERPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLREADNPIXELSPROC = CFuncPtr8[GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLREADNPIXELSPROC:
  given _tag: Tag[PFNGLREADNPIXELSPROC] = Tag.materializeCFuncPtr8[GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLREADNPIXELSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLREADNPIXELSPROC = o
  extension (v: PFNGLREADNPIXELSPROC)
    inline def value: CFuncPtr8[GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLREADPIXELSPROC = CFuncPtr7[GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLREADPIXELSPROC:
  given _tag: Tag[PFNGLREADPIXELSPROC] = Tag.materializeCFuncPtr7[GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLREADPIXELSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLREADPIXELSPROC = o
  extension (v: PFNGLREADPIXELSPROC)
    inline def value: CFuncPtr7[GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRECTDPROC = CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLRECTDPROC:
  given _tag: Tag[PFNGLRECTDPROC] = Tag.materializeCFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRECTDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]): PFNGLRECTDPROC = o
  extension (v: PFNGLRECTDPROC)
    inline def value: CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRECTDVPROC = CFuncPtr2[Ptr[GLdouble], Ptr[GLdouble], Unit]
object PFNGLRECTDVPROC:
  given _tag: Tag[PFNGLRECTDVPROC] = Tag.materializeCFuncPtr2[Ptr[GLdouble], Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRECTDVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GLdouble], Ptr[GLdouble], Unit]): PFNGLRECTDVPROC = o
  extension (v: PFNGLRECTDVPROC)
    inline def value: CFuncPtr2[Ptr[GLdouble], Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRECTFPROC = CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLRECTFPROC:
  given _tag: Tag[PFNGLRECTFPROC] = Tag.materializeCFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRECTFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]): PFNGLRECTFPROC = o
  extension (v: PFNGLRECTFPROC)
    inline def value: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRECTFVPROC = CFuncPtr2[Ptr[GLfloat], Ptr[GLfloat], Unit]
object PFNGLRECTFVPROC:
  given _tag: Tag[PFNGLRECTFVPROC] = Tag.materializeCFuncPtr2[Ptr[GLfloat], Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRECTFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GLfloat], Ptr[GLfloat], Unit]): PFNGLRECTFVPROC = o
  extension (v: PFNGLRECTFVPROC)
    inline def value: CFuncPtr2[Ptr[GLfloat], Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRECTIPROC = CFuncPtr4[GLint, GLint, GLint, GLint, Unit]
object PFNGLRECTIPROC:
  given _tag: Tag[PFNGLRECTIPROC] = Tag.materializeCFuncPtr4[GLint, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRECTIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLint, GLint, GLint, Unit]): PFNGLRECTIPROC = o
  extension (v: PFNGLRECTIPROC)
    inline def value: CFuncPtr4[GLint, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRECTIVPROC = CFuncPtr2[Ptr[GLint], Ptr[GLint], Unit]
object PFNGLRECTIVPROC:
  given _tag: Tag[PFNGLRECTIVPROC] = Tag.materializeCFuncPtr2[Ptr[GLint], Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRECTIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GLint], Ptr[GLint], Unit]): PFNGLRECTIVPROC = o
  extension (v: PFNGLRECTIVPROC)
    inline def value: CFuncPtr2[Ptr[GLint], Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRECTSPROC = CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]
object PFNGLRECTSPROC:
  given _tag: Tag[PFNGLRECTSPROC] = Tag.materializeCFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRECTSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]): PFNGLRECTSPROC = o
  extension (v: PFNGLRECTSPROC)
    inline def value: CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRECTSVPROC = CFuncPtr2[Ptr[GLshort], Ptr[GLshort], Unit]
object PFNGLRECTSVPROC:
  given _tag: Tag[PFNGLRECTSVPROC] = Tag.materializeCFuncPtr2[Ptr[GLshort], Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRECTSVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GLshort], Ptr[GLshort], Unit]): PFNGLRECTSVPROC = o
  extension (v: PFNGLRECTSVPROC)
    inline def value: CFuncPtr2[Ptr[GLshort], Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRELEASESHADERCOMPILERPROC = CFuncPtr0[Unit]
object PFNGLRELEASESHADERCOMPILERPROC:
  given _tag: Tag[PFNGLRELEASESHADERCOMPILERPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRELEASESHADERCOMPILERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLRELEASESHADERCOMPILERPROC = o
  extension (v: PFNGLRELEASESHADERCOMPILERPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC = CFuncPtr5[GLenum, GLsizei, GLenum, GLsizei, GLsizei, Unit]
object PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC:
  given _tag: Tag[PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC] = Tag.materializeCFuncPtr5[GLenum, GLsizei, GLenum, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLsizei, GLenum, GLsizei, GLsizei, Unit]): PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC = o
  extension (v: PFNGLRENDERBUFFERSTORAGEMULTISAMPLEPROC)
    inline def value: CFuncPtr5[GLenum, GLsizei, GLenum, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRENDERBUFFERSTORAGEPROC = CFuncPtr4[GLenum, GLenum, GLsizei, GLsizei, Unit]
object PFNGLRENDERBUFFERSTORAGEPROC:
  given _tag: Tag[PFNGLRENDERBUFFERSTORAGEPROC] = Tag.materializeCFuncPtr4[GLenum, GLenum, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRENDERBUFFERSTORAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLenum, GLsizei, GLsizei, Unit]): PFNGLRENDERBUFFERSTORAGEPROC = o
  extension (v: PFNGLRENDERBUFFERSTORAGEPROC)
    inline def value: CFuncPtr4[GLenum, GLenum, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRENDERMODEPROC = CFuncPtr1[GLenum, GLint]
object PFNGLRENDERMODEPROC:
  given _tag: Tag[PFNGLRENDERMODEPROC] = Tag.materializeCFuncPtr1[GLenum, GLint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRENDERMODEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, GLint]): PFNGLRENDERMODEPROC = o
  extension (v: PFNGLRENDERMODEPROC)
    inline def value: CFuncPtr1[GLenum, GLint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLRESUMETRANSFORMFEEDBACKPROC = CFuncPtr0[Unit]
object PFNGLRESUMETRANSFORMFEEDBACKPROC:
  given _tag: Tag[PFNGLRESUMETRANSFORMFEEDBACKPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLRESUMETRANSFORMFEEDBACKPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLRESUMETRANSFORMFEEDBACKPROC = o
  extension (v: PFNGLRESUMETRANSFORMFEEDBACKPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLROTATEDPROC = CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLROTATEDPROC:
  given _tag: Tag[PFNGLROTATEDPROC] = Tag.materializeCFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLROTATEDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]): PFNGLROTATEDPROC = o
  extension (v: PFNGLROTATEDPROC)
    inline def value: CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLROTATEFPROC = CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLROTATEFPROC:
  given _tag: Tag[PFNGLROTATEFPROC] = Tag.materializeCFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLROTATEFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]): PFNGLROTATEFPROC = o
  extension (v: PFNGLROTATEFPROC)
    inline def value: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSAMPLECOVERAGEPROC = CFuncPtr2[GLfloat, GLboolean, Unit]
object PFNGLSAMPLECOVERAGEPROC:
  given _tag: Tag[PFNGLSAMPLECOVERAGEPROC] = Tag.materializeCFuncPtr2[GLfloat, GLboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSAMPLECOVERAGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLfloat, GLboolean, Unit]): PFNGLSAMPLECOVERAGEPROC = o
  extension (v: PFNGLSAMPLECOVERAGEPROC)
    inline def value: CFuncPtr2[GLfloat, GLboolean, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSAMPLEMASKIPROC = CFuncPtr2[GLuint, GLbitfield, Unit]
object PFNGLSAMPLEMASKIPROC:
  given _tag: Tag[PFNGLSAMPLEMASKIPROC] = Tag.materializeCFuncPtr2[GLuint, GLbitfield, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSAMPLEMASKIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLbitfield, Unit]): PFNGLSAMPLEMASKIPROC = o
  extension (v: PFNGLSAMPLEMASKIPROC)
    inline def value: CFuncPtr2[GLuint, GLbitfield, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSAMPLERPARAMETERFPROC = CFuncPtr3[GLuint, GLenum, GLfloat, Unit]
object PFNGLSAMPLERPARAMETERFPROC:
  given _tag: Tag[PFNGLSAMPLERPARAMETERFPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSAMPLERPARAMETERFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, GLfloat, Unit]): PFNGLSAMPLERPARAMETERFPROC = o
  extension (v: PFNGLSAMPLERPARAMETERFPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSAMPLERPARAMETERFVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]
object PFNGLSAMPLERPARAMETERFVPROC:
  given _tag: Tag[PFNGLSAMPLERPARAMETERFVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSAMPLERPARAMETERFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]): PFNGLSAMPLERPARAMETERFVPROC = o
  extension (v: PFNGLSAMPLERPARAMETERFVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSAMPLERPARAMETERIIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLSAMPLERPARAMETERIIVPROC:
  given _tag: Tag[PFNGLSAMPLERPARAMETERIIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSAMPLERPARAMETERIIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLSAMPLERPARAMETERIIVPROC = o
  extension (v: PFNGLSAMPLERPARAMETERIIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSAMPLERPARAMETERIPROC = CFuncPtr3[GLuint, GLenum, GLint, Unit]
object PFNGLSAMPLERPARAMETERIPROC:
  given _tag: Tag[PFNGLSAMPLERPARAMETERIPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSAMPLERPARAMETERIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, GLint, Unit]): PFNGLSAMPLERPARAMETERIPROC = o
  extension (v: PFNGLSAMPLERPARAMETERIPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSAMPLERPARAMETERIUIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]
object PFNGLSAMPLERPARAMETERIUIVPROC:
  given _tag: Tag[PFNGLSAMPLERPARAMETERIUIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSAMPLERPARAMETERIUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]): PFNGLSAMPLERPARAMETERIUIVPROC = o
  extension (v: PFNGLSAMPLERPARAMETERIUIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSAMPLERPARAMETERIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLSAMPLERPARAMETERIVPROC:
  given _tag: Tag[PFNGLSAMPLERPARAMETERIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSAMPLERPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLSAMPLERPARAMETERIVPROC = o
  extension (v: PFNGLSAMPLERPARAMETERIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSCALEDPROC = CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
object PFNGLSCALEDPROC:
  given _tag: Tag[PFNGLSCALEDPROC] = Tag.materializeCFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSCALEDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]): PFNGLSCALEDPROC = o
  extension (v: PFNGLSCALEDPROC)
    inline def value: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSCALEFPROC = CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
object PFNGLSCALEFPROC:
  given _tag: Tag[PFNGLSCALEFPROC] = Tag.materializeCFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSCALEFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]): PFNGLSCALEFPROC = o
  extension (v: PFNGLSCALEFPROC)
    inline def value: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSCISSORARRAYVPROC = CFuncPtr3[GLuint, GLsizei, Ptr[GLint], Unit]
object PFNGLSCISSORARRAYVPROC:
  given _tag: Tag[PFNGLSCISSORARRAYVPROC] = Tag.materializeCFuncPtr3[GLuint, GLsizei, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSCISSORARRAYVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLsizei, Ptr[GLint], Unit]): PFNGLSCISSORARRAYVPROC = o
  extension (v: PFNGLSCISSORARRAYVPROC)
    inline def value: CFuncPtr3[GLuint, GLsizei, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSCISSORINDEXEDPROC = CFuncPtr5[GLuint, GLint, GLint, GLsizei, GLsizei, Unit]
object PFNGLSCISSORINDEXEDPROC:
  given _tag: Tag[PFNGLSCISSORINDEXEDPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLint, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSCISSORINDEXEDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLint, GLsizei, GLsizei, Unit]): PFNGLSCISSORINDEXEDPROC = o
  extension (v: PFNGLSCISSORINDEXEDPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLint, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSCISSORINDEXEDVPROC = CFuncPtr2[GLuint, Ptr[GLint], Unit]
object PFNGLSCISSORINDEXEDVPROC:
  given _tag: Tag[PFNGLSCISSORINDEXEDVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSCISSORINDEXEDVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLint], Unit]): PFNGLSCISSORINDEXEDVPROC = o
  extension (v: PFNGLSCISSORINDEXEDVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSCISSORPROC = CFuncPtr4[GLint, GLint, GLsizei, GLsizei, Unit]
object PFNGLSCISSORPROC:
  given _tag: Tag[PFNGLSCISSORPROC] = Tag.materializeCFuncPtr4[GLint, GLint, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSCISSORPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLint, GLsizei, GLsizei, Unit]): PFNGLSCISSORPROC = o
  extension (v: PFNGLSCISSORPROC)
    inline def value: CFuncPtr4[GLint, GLint, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3BPROC = CFuncPtr3[GLbyte, GLbyte, GLbyte, Unit]
object PFNGLSECONDARYCOLOR3BPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3BPROC] = Tag.materializeCFuncPtr3[GLbyte, GLbyte, GLbyte, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3BPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLbyte, GLbyte, GLbyte, Unit]): PFNGLSECONDARYCOLOR3BPROC = o
  extension (v: PFNGLSECONDARYCOLOR3BPROC)
    inline def value: CFuncPtr3[GLbyte, GLbyte, GLbyte, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3BVPROC = CFuncPtr1[Ptr[GLbyte], Unit]
object PFNGLSECONDARYCOLOR3BVPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3BVPROC] = Tag.materializeCFuncPtr1[Ptr[GLbyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3BVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLbyte], Unit]): PFNGLSECONDARYCOLOR3BVPROC = o
  extension (v: PFNGLSECONDARYCOLOR3BVPROC)
    inline def value: CFuncPtr1[Ptr[GLbyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3DPROC = CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
object PFNGLSECONDARYCOLOR3DPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3DPROC] = Tag.materializeCFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]): PFNGLSECONDARYCOLOR3DPROC = o
  extension (v: PFNGLSECONDARYCOLOR3DPROC)
    inline def value: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLSECONDARYCOLOR3DVPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLSECONDARYCOLOR3DVPROC = o
  extension (v: PFNGLSECONDARYCOLOR3DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3FPROC = CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
object PFNGLSECONDARYCOLOR3FPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3FPROC] = Tag.materializeCFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]): PFNGLSECONDARYCOLOR3FPROC = o
  extension (v: PFNGLSECONDARYCOLOR3FPROC)
    inline def value: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLSECONDARYCOLOR3FVPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLSECONDARYCOLOR3FVPROC = o
  extension (v: PFNGLSECONDARYCOLOR3FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3IPROC = CFuncPtr3[GLint, GLint, GLint, Unit]
object PFNGLSECONDARYCOLOR3IPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3IPROC] = Tag.materializeCFuncPtr3[GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLint, GLint, Unit]): PFNGLSECONDARYCOLOR3IPROC = o
  extension (v: PFNGLSECONDARYCOLOR3IPROC)
    inline def value: CFuncPtr3[GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLSECONDARYCOLOR3IVPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLSECONDARYCOLOR3IVPROC = o
  extension (v: PFNGLSECONDARYCOLOR3IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3SPROC = CFuncPtr3[GLshort, GLshort, GLshort, Unit]
object PFNGLSECONDARYCOLOR3SPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3SPROC] = Tag.materializeCFuncPtr3[GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLshort, GLshort, GLshort, Unit]): PFNGLSECONDARYCOLOR3SPROC = o
  extension (v: PFNGLSECONDARYCOLOR3SPROC)
    inline def value: CFuncPtr3[GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLSECONDARYCOLOR3SVPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLSECONDARYCOLOR3SVPROC = o
  extension (v: PFNGLSECONDARYCOLOR3SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3UBPROC = CFuncPtr3[GLubyte, GLubyte, GLubyte, Unit]
object PFNGLSECONDARYCOLOR3UBPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3UBPROC] = Tag.materializeCFuncPtr3[GLubyte, GLubyte, GLubyte, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3UBPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLubyte, GLubyte, GLubyte, Unit]): PFNGLSECONDARYCOLOR3UBPROC = o
  extension (v: PFNGLSECONDARYCOLOR3UBPROC)
    inline def value: CFuncPtr3[GLubyte, GLubyte, GLubyte, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3UBVPROC = CFuncPtr1[Ptr[GLubyte], Unit]
object PFNGLSECONDARYCOLOR3UBVPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3UBVPROC] = Tag.materializeCFuncPtr1[Ptr[GLubyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3UBVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLubyte], Unit]): PFNGLSECONDARYCOLOR3UBVPROC = o
  extension (v: PFNGLSECONDARYCOLOR3UBVPROC)
    inline def value: CFuncPtr1[Ptr[GLubyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3UIPROC = CFuncPtr3[GLuint, GLuint, GLuint, Unit]
object PFNGLSECONDARYCOLOR3UIPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3UIPROC] = Tag.materializeCFuncPtr3[GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLuint, GLuint, Unit]): PFNGLSECONDARYCOLOR3UIPROC = o
  extension (v: PFNGLSECONDARYCOLOR3UIPROC)
    inline def value: CFuncPtr3[GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3UIVPROC = CFuncPtr1[Ptr[GLuint], Unit]
object PFNGLSECONDARYCOLOR3UIVPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3UIVPROC] = Tag.materializeCFuncPtr1[Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLuint], Unit]): PFNGLSECONDARYCOLOR3UIVPROC = o
  extension (v: PFNGLSECONDARYCOLOR3UIVPROC)
    inline def value: CFuncPtr1[Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3USPROC = CFuncPtr3[GLushort, GLushort, GLushort, Unit]
object PFNGLSECONDARYCOLOR3USPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3USPROC] = Tag.materializeCFuncPtr3[GLushort, GLushort, GLushort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3USPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLushort, GLushort, GLushort, Unit]): PFNGLSECONDARYCOLOR3USPROC = o
  extension (v: PFNGLSECONDARYCOLOR3USPROC)
    inline def value: CFuncPtr3[GLushort, GLushort, GLushort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLOR3USVPROC = CFuncPtr1[Ptr[GLushort], Unit]
object PFNGLSECONDARYCOLOR3USVPROC:
  given _tag: Tag[PFNGLSECONDARYCOLOR3USVPROC] = Tag.materializeCFuncPtr1[Ptr[GLushort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLOR3USVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLushort], Unit]): PFNGLSECONDARYCOLOR3USVPROC = o
  extension (v: PFNGLSECONDARYCOLOR3USVPROC)
    inline def value: CFuncPtr1[Ptr[GLushort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLORP3UIPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLSECONDARYCOLORP3UIPROC:
  given _tag: Tag[PFNGLSECONDARYCOLORP3UIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLORP3UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLSECONDARYCOLORP3UIPROC = o
  extension (v: PFNGLSECONDARYCOLORP3UIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLORP3UIVPROC = CFuncPtr2[GLenum, Ptr[GLuint], Unit]
object PFNGLSECONDARYCOLORP3UIVPROC:
  given _tag: Tag[PFNGLSECONDARYCOLORP3UIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLORP3UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLuint], Unit]): PFNGLSECONDARYCOLORP3UIVPROC = o
  extension (v: PFNGLSECONDARYCOLORP3UIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSECONDARYCOLORPOINTERPROC = CFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLSECONDARYCOLORPOINTERPROC:
  given _tag: Tag[PFNGLSECONDARYCOLORPOINTERPROC] = Tag.materializeCFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSECONDARYCOLORPOINTERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLSECONDARYCOLORPOINTERPROC = o
  extension (v: PFNGLSECONDARYCOLORPOINTERPROC)
    inline def value: CFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSELECTBUFFERPROC = CFuncPtr2[GLsizei, Ptr[GLuint], Unit]
object PFNGLSELECTBUFFERPROC:
  given _tag: Tag[PFNGLSELECTBUFFERPROC] = Tag.materializeCFuncPtr2[GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSELECTBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLsizei, Ptr[GLuint], Unit]): PFNGLSELECTBUFFERPROC = o
  extension (v: PFNGLSELECTBUFFERPROC)
    inline def value: CFuncPtr2[GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSHADEMODELPROC = CFuncPtr1[GLenum, Unit]
object PFNGLSHADEMODELPROC:
  given _tag: Tag[PFNGLSHADEMODELPROC] = Tag.materializeCFuncPtr1[GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSHADEMODELPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, Unit]): PFNGLSHADEMODELPROC = o
  extension (v: PFNGLSHADEMODELPROC)
    inline def value: CFuncPtr1[GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSHADERBINARYPROC = CFuncPtr5[GLsizei, Ptr[GLuint], GLenum, Ptr[Byte], GLsizei, Unit]
object PFNGLSHADERBINARYPROC:
  given _tag: Tag[PFNGLSHADERBINARYPROC] = Tag.materializeCFuncPtr5[GLsizei, Ptr[GLuint], GLenum, Ptr[Byte], GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSHADERBINARYPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLsizei, Ptr[GLuint], GLenum, Ptr[Byte], GLsizei, Unit]): PFNGLSHADERBINARYPROC = o
  extension (v: PFNGLSHADERBINARYPROC)
    inline def value: CFuncPtr5[GLsizei, Ptr[GLuint], GLenum, Ptr[Byte], GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSHADERSOURCEPROC = CFuncPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], Ptr[GLint], Unit]
object PFNGLSHADERSOURCEPROC:
  given _tag: Tag[PFNGLSHADERSOURCEPROC] = Tag.materializeCFuncPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSHADERSOURCEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], Ptr[GLint], Unit]): PFNGLSHADERSOURCEPROC = o
  extension (v: PFNGLSHADERSOURCEPROC)
    inline def value: CFuncPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSHADERSTORAGEBLOCKBINDINGPROC = CFuncPtr3[GLuint, GLuint, GLuint, Unit]
object PFNGLSHADERSTORAGEBLOCKBINDINGPROC:
  given _tag: Tag[PFNGLSHADERSTORAGEBLOCKBINDINGPROC] = Tag.materializeCFuncPtr3[GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSHADERSTORAGEBLOCKBINDINGPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLuint, GLuint, Unit]): PFNGLSHADERSTORAGEBLOCKBINDINGPROC = o
  extension (v: PFNGLSHADERSTORAGEBLOCKBINDINGPROC)
    inline def value: CFuncPtr3[GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSPECIALIZESHADERPROC = CFuncPtr5[GLuint, Ptr[GLchar], GLuint, Ptr[GLuint], Ptr[GLuint], Unit]
object PFNGLSPECIALIZESHADERPROC:
  given _tag: Tag[PFNGLSPECIALIZESHADERPROC] = Tag.materializeCFuncPtr5[GLuint, Ptr[GLchar], GLuint, Ptr[GLuint], Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSPECIALIZESHADERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, Ptr[GLchar], GLuint, Ptr[GLuint], Ptr[GLuint], Unit]): PFNGLSPECIALIZESHADERPROC = o
  extension (v: PFNGLSPECIALIZESHADERPROC)
    inline def value: CFuncPtr5[GLuint, Ptr[GLchar], GLuint, Ptr[GLuint], Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSTENCILFUNCPROC = CFuncPtr3[GLenum, GLint, GLuint, Unit]
object PFNGLSTENCILFUNCPROC:
  given _tag: Tag[PFNGLSTENCILFUNCPROC] = Tag.materializeCFuncPtr3[GLenum, GLint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSTENCILFUNCPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLint, GLuint, Unit]): PFNGLSTENCILFUNCPROC = o
  extension (v: PFNGLSTENCILFUNCPROC)
    inline def value: CFuncPtr3[GLenum, GLint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSTENCILFUNCSEPARATEPROC = CFuncPtr4[GLenum, GLenum, GLint, GLuint, Unit]
object PFNGLSTENCILFUNCSEPARATEPROC:
  given _tag: Tag[PFNGLSTENCILFUNCSEPARATEPROC] = Tag.materializeCFuncPtr4[GLenum, GLenum, GLint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSTENCILFUNCSEPARATEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLenum, GLint, GLuint, Unit]): PFNGLSTENCILFUNCSEPARATEPROC = o
  extension (v: PFNGLSTENCILFUNCSEPARATEPROC)
    inline def value: CFuncPtr4[GLenum, GLenum, GLint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSTENCILMASKPROC = CFuncPtr1[GLuint, Unit]
object PFNGLSTENCILMASKPROC:
  given _tag: Tag[PFNGLSTENCILMASKPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSTENCILMASKPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLSTENCILMASKPROC = o
  extension (v: PFNGLSTENCILMASKPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSTENCILMASKSEPARATEPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLSTENCILMASKSEPARATEPROC:
  given _tag: Tag[PFNGLSTENCILMASKSEPARATEPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSTENCILMASKSEPARATEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLSTENCILMASKSEPARATEPROC = o
  extension (v: PFNGLSTENCILMASKSEPARATEPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSTENCILOPPROC = CFuncPtr3[GLenum, GLenum, GLenum, Unit]
object PFNGLSTENCILOPPROC:
  given _tag: Tag[PFNGLSTENCILOPPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSTENCILOPPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLenum, Unit]): PFNGLSTENCILOPPROC = o
  extension (v: PFNGLSTENCILOPPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLSTENCILOPSEPARATEPROC = CFuncPtr4[GLenum, GLenum, GLenum, GLenum, Unit]
object PFNGLSTENCILOPSEPARATEPROC:
  given _tag: Tag[PFNGLSTENCILOPSEPARATEPROC] = Tag.materializeCFuncPtr4[GLenum, GLenum, GLenum, GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLSTENCILOPSEPARATEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLenum, GLenum, GLenum, Unit]): PFNGLSTENCILOPSEPARATEPROC = o
  extension (v: PFNGLSTENCILOPSEPARATEPROC)
    inline def value: CFuncPtr4[GLenum, GLenum, GLenum, GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXBUFFERPROC = CFuncPtr3[GLenum, GLenum, GLuint, Unit]
object PFNGLTEXBUFFERPROC:
  given _tag: Tag[PFNGLTEXBUFFERPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLuint, Unit]): PFNGLTEXBUFFERPROC = o
  extension (v: PFNGLTEXBUFFERPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXBUFFERRANGEPROC = CFuncPtr5[GLenum, GLenum, GLuint, GLintptr, GLsizeiptr, Unit]
object PFNGLTEXBUFFERRANGEPROC:
  given _tag: Tag[PFNGLTEXBUFFERRANGEPROC] = Tag.materializeCFuncPtr5[GLenum, GLenum, GLuint, GLintptr, GLsizeiptr, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXBUFFERRANGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLenum, GLuint, GLintptr, GLsizeiptr, Unit]): PFNGLTEXBUFFERRANGEPROC = o
  extension (v: PFNGLTEXBUFFERRANGEPROC)
    inline def value: CFuncPtr5[GLenum, GLenum, GLuint, GLintptr, GLsizeiptr, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD1DPROC = CFuncPtr1[GLdouble, Unit]
object PFNGLTEXCOORD1DPROC:
  given _tag: Tag[PFNGLTEXCOORD1DPROC] = Tag.materializeCFuncPtr1[GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLdouble, Unit]): PFNGLTEXCOORD1DPROC = o
  extension (v: PFNGLTEXCOORD1DPROC)
    inline def value: CFuncPtr1[GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD1DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLTEXCOORD1DVPROC:
  given _tag: Tag[PFNGLTEXCOORD1DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD1DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLTEXCOORD1DVPROC = o
  extension (v: PFNGLTEXCOORD1DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD1FPROC = CFuncPtr1[GLfloat, Unit]
object PFNGLTEXCOORD1FPROC:
  given _tag: Tag[PFNGLTEXCOORD1FPROC] = Tag.materializeCFuncPtr1[GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD1FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLfloat, Unit]): PFNGLTEXCOORD1FPROC = o
  extension (v: PFNGLTEXCOORD1FPROC)
    inline def value: CFuncPtr1[GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD1FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLTEXCOORD1FVPROC:
  given _tag: Tag[PFNGLTEXCOORD1FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD1FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLTEXCOORD1FVPROC = o
  extension (v: PFNGLTEXCOORD1FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD1IPROC = CFuncPtr1[GLint, Unit]
object PFNGLTEXCOORD1IPROC:
  given _tag: Tag[PFNGLTEXCOORD1IPROC] = Tag.materializeCFuncPtr1[GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD1IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLint, Unit]): PFNGLTEXCOORD1IPROC = o
  extension (v: PFNGLTEXCOORD1IPROC)
    inline def value: CFuncPtr1[GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD1IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLTEXCOORD1IVPROC:
  given _tag: Tag[PFNGLTEXCOORD1IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD1IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLTEXCOORD1IVPROC = o
  extension (v: PFNGLTEXCOORD1IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD1SPROC = CFuncPtr1[GLshort, Unit]
object PFNGLTEXCOORD1SPROC:
  given _tag: Tag[PFNGLTEXCOORD1SPROC] = Tag.materializeCFuncPtr1[GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD1SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLshort, Unit]): PFNGLTEXCOORD1SPROC = o
  extension (v: PFNGLTEXCOORD1SPROC)
    inline def value: CFuncPtr1[GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD1SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLTEXCOORD1SVPROC:
  given _tag: Tag[PFNGLTEXCOORD1SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD1SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLTEXCOORD1SVPROC = o
  extension (v: PFNGLTEXCOORD1SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD2DPROC = CFuncPtr2[GLdouble, GLdouble, Unit]
object PFNGLTEXCOORD2DPROC:
  given _tag: Tag[PFNGLTEXCOORD2DPROC] = Tag.materializeCFuncPtr2[GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLdouble, GLdouble, Unit]): PFNGLTEXCOORD2DPROC = o
  extension (v: PFNGLTEXCOORD2DPROC)
    inline def value: CFuncPtr2[GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD2DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLTEXCOORD2DVPROC:
  given _tag: Tag[PFNGLTEXCOORD2DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLTEXCOORD2DVPROC = o
  extension (v: PFNGLTEXCOORD2DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD2FPROC = CFuncPtr2[GLfloat, GLfloat, Unit]
object PFNGLTEXCOORD2FPROC:
  given _tag: Tag[PFNGLTEXCOORD2FPROC] = Tag.materializeCFuncPtr2[GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD2FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLfloat, GLfloat, Unit]): PFNGLTEXCOORD2FPROC = o
  extension (v: PFNGLTEXCOORD2FPROC)
    inline def value: CFuncPtr2[GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD2FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLTEXCOORD2FVPROC:
  given _tag: Tag[PFNGLTEXCOORD2FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLTEXCOORD2FVPROC = o
  extension (v: PFNGLTEXCOORD2FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD2IPROC = CFuncPtr2[GLint, GLint, Unit]
object PFNGLTEXCOORD2IPROC:
  given _tag: Tag[PFNGLTEXCOORD2IPROC] = Tag.materializeCFuncPtr2[GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD2IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLint, GLint, Unit]): PFNGLTEXCOORD2IPROC = o
  extension (v: PFNGLTEXCOORD2IPROC)
    inline def value: CFuncPtr2[GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD2IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLTEXCOORD2IVPROC:
  given _tag: Tag[PFNGLTEXCOORD2IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD2IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLTEXCOORD2IVPROC = o
  extension (v: PFNGLTEXCOORD2IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD2SPROC = CFuncPtr2[GLshort, GLshort, Unit]
object PFNGLTEXCOORD2SPROC:
  given _tag: Tag[PFNGLTEXCOORD2SPROC] = Tag.materializeCFuncPtr2[GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD2SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLshort, GLshort, Unit]): PFNGLTEXCOORD2SPROC = o
  extension (v: PFNGLTEXCOORD2SPROC)
    inline def value: CFuncPtr2[GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD2SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLTEXCOORD2SVPROC:
  given _tag: Tag[PFNGLTEXCOORD2SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD2SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLTEXCOORD2SVPROC = o
  extension (v: PFNGLTEXCOORD2SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD3DPROC = CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
object PFNGLTEXCOORD3DPROC:
  given _tag: Tag[PFNGLTEXCOORD3DPROC] = Tag.materializeCFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]): PFNGLTEXCOORD3DPROC = o
  extension (v: PFNGLTEXCOORD3DPROC)
    inline def value: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD3DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLTEXCOORD3DVPROC:
  given _tag: Tag[PFNGLTEXCOORD3DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLTEXCOORD3DVPROC = o
  extension (v: PFNGLTEXCOORD3DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD3FPROC = CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
object PFNGLTEXCOORD3FPROC:
  given _tag: Tag[PFNGLTEXCOORD3FPROC] = Tag.materializeCFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD3FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]): PFNGLTEXCOORD3FPROC = o
  extension (v: PFNGLTEXCOORD3FPROC)
    inline def value: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD3FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLTEXCOORD3FVPROC:
  given _tag: Tag[PFNGLTEXCOORD3FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLTEXCOORD3FVPROC = o
  extension (v: PFNGLTEXCOORD3FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD3IPROC = CFuncPtr3[GLint, GLint, GLint, Unit]
object PFNGLTEXCOORD3IPROC:
  given _tag: Tag[PFNGLTEXCOORD3IPROC] = Tag.materializeCFuncPtr3[GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD3IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLint, GLint, Unit]): PFNGLTEXCOORD3IPROC = o
  extension (v: PFNGLTEXCOORD3IPROC)
    inline def value: CFuncPtr3[GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD3IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLTEXCOORD3IVPROC:
  given _tag: Tag[PFNGLTEXCOORD3IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD3IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLTEXCOORD3IVPROC = o
  extension (v: PFNGLTEXCOORD3IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD3SPROC = CFuncPtr3[GLshort, GLshort, GLshort, Unit]
object PFNGLTEXCOORD3SPROC:
  given _tag: Tag[PFNGLTEXCOORD3SPROC] = Tag.materializeCFuncPtr3[GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD3SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLshort, GLshort, GLshort, Unit]): PFNGLTEXCOORD3SPROC = o
  extension (v: PFNGLTEXCOORD3SPROC)
    inline def value: CFuncPtr3[GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD3SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLTEXCOORD3SVPROC:
  given _tag: Tag[PFNGLTEXCOORD3SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD3SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLTEXCOORD3SVPROC = o
  extension (v: PFNGLTEXCOORD3SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD4DPROC = CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLTEXCOORD4DPROC:
  given _tag: Tag[PFNGLTEXCOORD4DPROC] = Tag.materializeCFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD4DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]): PFNGLTEXCOORD4DPROC = o
  extension (v: PFNGLTEXCOORD4DPROC)
    inline def value: CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD4DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLTEXCOORD4DVPROC:
  given _tag: Tag[PFNGLTEXCOORD4DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLTEXCOORD4DVPROC = o
  extension (v: PFNGLTEXCOORD4DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD4FPROC = CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLTEXCOORD4FPROC:
  given _tag: Tag[PFNGLTEXCOORD4FPROC] = Tag.materializeCFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD4FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]): PFNGLTEXCOORD4FPROC = o
  extension (v: PFNGLTEXCOORD4FPROC)
    inline def value: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD4FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLTEXCOORD4FVPROC:
  given _tag: Tag[PFNGLTEXCOORD4FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD4FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLTEXCOORD4FVPROC = o
  extension (v: PFNGLTEXCOORD4FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD4IPROC = CFuncPtr4[GLint, GLint, GLint, GLint, Unit]
object PFNGLTEXCOORD4IPROC:
  given _tag: Tag[PFNGLTEXCOORD4IPROC] = Tag.materializeCFuncPtr4[GLint, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD4IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLint, GLint, GLint, Unit]): PFNGLTEXCOORD4IPROC = o
  extension (v: PFNGLTEXCOORD4IPROC)
    inline def value: CFuncPtr4[GLint, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD4IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLTEXCOORD4IVPROC:
  given _tag: Tag[PFNGLTEXCOORD4IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD4IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLTEXCOORD4IVPROC = o
  extension (v: PFNGLTEXCOORD4IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD4SPROC = CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]
object PFNGLTEXCOORD4SPROC:
  given _tag: Tag[PFNGLTEXCOORD4SPROC] = Tag.materializeCFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD4SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]): PFNGLTEXCOORD4SPROC = o
  extension (v: PFNGLTEXCOORD4SPROC)
    inline def value: CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORD4SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLTEXCOORD4SVPROC:
  given _tag: Tag[PFNGLTEXCOORD4SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORD4SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLTEXCOORD4SVPROC = o
  extension (v: PFNGLTEXCOORD4SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORDP1UIPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLTEXCOORDP1UIPROC:
  given _tag: Tag[PFNGLTEXCOORDP1UIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORDP1UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLTEXCOORDP1UIPROC = o
  extension (v: PFNGLTEXCOORDP1UIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORDP1UIVPROC = CFuncPtr2[GLenum, Ptr[GLuint], Unit]
object PFNGLTEXCOORDP1UIVPROC:
  given _tag: Tag[PFNGLTEXCOORDP1UIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORDP1UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLuint], Unit]): PFNGLTEXCOORDP1UIVPROC = o
  extension (v: PFNGLTEXCOORDP1UIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORDP2UIPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLTEXCOORDP2UIPROC:
  given _tag: Tag[PFNGLTEXCOORDP2UIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORDP2UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLTEXCOORDP2UIPROC = o
  extension (v: PFNGLTEXCOORDP2UIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORDP2UIVPROC = CFuncPtr2[GLenum, Ptr[GLuint], Unit]
object PFNGLTEXCOORDP2UIVPROC:
  given _tag: Tag[PFNGLTEXCOORDP2UIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORDP2UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLuint], Unit]): PFNGLTEXCOORDP2UIVPROC = o
  extension (v: PFNGLTEXCOORDP2UIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORDP3UIPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLTEXCOORDP3UIPROC:
  given _tag: Tag[PFNGLTEXCOORDP3UIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORDP3UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLTEXCOORDP3UIPROC = o
  extension (v: PFNGLTEXCOORDP3UIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORDP3UIVPROC = CFuncPtr2[GLenum, Ptr[GLuint], Unit]
object PFNGLTEXCOORDP3UIVPROC:
  given _tag: Tag[PFNGLTEXCOORDP3UIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORDP3UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLuint], Unit]): PFNGLTEXCOORDP3UIVPROC = o
  extension (v: PFNGLTEXCOORDP3UIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORDP4UIPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLTEXCOORDP4UIPROC:
  given _tag: Tag[PFNGLTEXCOORDP4UIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORDP4UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLTEXCOORDP4UIPROC = o
  extension (v: PFNGLTEXCOORDP4UIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORDP4UIVPROC = CFuncPtr2[GLenum, Ptr[GLuint], Unit]
object PFNGLTEXCOORDP4UIVPROC:
  given _tag: Tag[PFNGLTEXCOORDP4UIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORDP4UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLuint], Unit]): PFNGLTEXCOORDP4UIVPROC = o
  extension (v: PFNGLTEXCOORDP4UIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXCOORDPOINTERPROC = CFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLTEXCOORDPOINTERPROC:
  given _tag: Tag[PFNGLTEXCOORDPOINTERPROC] = Tag.materializeCFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXCOORDPOINTERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLTEXCOORDPOINTERPROC = o
  extension (v: PFNGLTEXCOORDPOINTERPROC)
    inline def value: CFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXENVFPROC = CFuncPtr3[GLenum, GLenum, GLfloat, Unit]
object PFNGLTEXENVFPROC:
  given _tag: Tag[PFNGLTEXENVFPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXENVFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLfloat, Unit]): PFNGLTEXENVFPROC = o
  extension (v: PFNGLTEXENVFPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXENVFVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
object PFNGLTEXENVFVPROC:
  given _tag: Tag[PFNGLTEXENVFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXENVFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]): PFNGLTEXENVFVPROC = o
  extension (v: PFNGLTEXENVFVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXENVIPROC = CFuncPtr3[GLenum, GLenum, GLint, Unit]
object PFNGLTEXENVIPROC:
  given _tag: Tag[PFNGLTEXENVIPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXENVIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLint, Unit]): PFNGLTEXENVIPROC = o
  extension (v: PFNGLTEXENVIPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXENVIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLTEXENVIVPROC:
  given _tag: Tag[PFNGLTEXENVIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXENVIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLTEXENVIVPROC = o
  extension (v: PFNGLTEXENVIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXGENDPROC = CFuncPtr3[GLenum, GLenum, GLdouble, Unit]
object PFNGLTEXGENDPROC:
  given _tag: Tag[PFNGLTEXGENDPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXGENDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLdouble, Unit]): PFNGLTEXGENDPROC = o
  extension (v: PFNGLTEXGENDPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXGENDVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLdouble], Unit]
object PFNGLTEXGENDVPROC:
  given _tag: Tag[PFNGLTEXGENDVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXGENDVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLdouble], Unit]): PFNGLTEXGENDVPROC = o
  extension (v: PFNGLTEXGENDVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXGENFPROC = CFuncPtr3[GLenum, GLenum, GLfloat, Unit]
object PFNGLTEXGENFPROC:
  given _tag: Tag[PFNGLTEXGENFPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXGENFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLfloat, Unit]): PFNGLTEXGENFPROC = o
  extension (v: PFNGLTEXGENFPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXGENFVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
object PFNGLTEXGENFVPROC:
  given _tag: Tag[PFNGLTEXGENFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXGENFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]): PFNGLTEXGENFVPROC = o
  extension (v: PFNGLTEXGENFVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXGENIPROC = CFuncPtr3[GLenum, GLenum, GLint, Unit]
object PFNGLTEXGENIPROC:
  given _tag: Tag[PFNGLTEXGENIPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXGENIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLint, Unit]): PFNGLTEXGENIPROC = o
  extension (v: PFNGLTEXGENIPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXGENIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLTEXGENIVPROC:
  given _tag: Tag[PFNGLTEXGENIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXGENIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLTEXGENIVPROC = o
  extension (v: PFNGLTEXGENIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXIMAGE1DPROC = CFuncPtr8[GLenum, GLint, GLint, GLsizei, GLint, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLTEXIMAGE1DPROC:
  given _tag: Tag[PFNGLTEXIMAGE1DPROC] = Tag.materializeCFuncPtr8[GLenum, GLint, GLint, GLsizei, GLint, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXIMAGE1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[GLenum, GLint, GLint, GLsizei, GLint, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLTEXIMAGE1DPROC = o
  extension (v: PFNGLTEXIMAGE1DPROC)
    inline def value: CFuncPtr8[GLenum, GLint, GLint, GLsizei, GLint, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXIMAGE2DMULTISAMPLEPROC = CFuncPtr6[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, Unit]
object PFNGLTEXIMAGE2DMULTISAMPLEPROC:
  given _tag: Tag[PFNGLTEXIMAGE2DMULTISAMPLEPROC] = Tag.materializeCFuncPtr6[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXIMAGE2DMULTISAMPLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, Unit]): PFNGLTEXIMAGE2DMULTISAMPLEPROC = o
  extension (v: PFNGLTEXIMAGE2DMULTISAMPLEPROC)
    inline def value: CFuncPtr6[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXIMAGE2DPROC = CFuncPtr9[GLenum, GLint, GLint, GLsizei, GLsizei, GLint, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLTEXIMAGE2DPROC:
  given _tag: Tag[PFNGLTEXIMAGE2DPROC] = Tag.materializeCFuncPtr9[GLenum, GLint, GLint, GLsizei, GLsizei, GLint, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXIMAGE2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr9[GLenum, GLint, GLint, GLsizei, GLsizei, GLint, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLTEXIMAGE2DPROC = o
  extension (v: PFNGLTEXIMAGE2DPROC)
    inline def value: CFuncPtr9[GLenum, GLint, GLint, GLsizei, GLsizei, GLint, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXIMAGE3DMULTISAMPLEPROC = CFuncPtr7[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, Unit]
object PFNGLTEXIMAGE3DMULTISAMPLEPROC:
  given _tag: Tag[PFNGLTEXIMAGE3DMULTISAMPLEPROC] = Tag.materializeCFuncPtr7[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXIMAGE3DMULTISAMPLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, Unit]): PFNGLTEXIMAGE3DMULTISAMPLEPROC = o
  extension (v: PFNGLTEXIMAGE3DMULTISAMPLEPROC)
    inline def value: CFuncPtr7[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXIMAGE3DPROC = CFuncPtr10[GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLTEXIMAGE3DPROC:
  given _tag: Tag[PFNGLTEXIMAGE3DPROC] = Tag.materializeCFuncPtr10[GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXIMAGE3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr10[GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLTEXIMAGE3DPROC = o
  extension (v: PFNGLTEXIMAGE3DPROC)
    inline def value: CFuncPtr10[GLenum, GLint, GLint, GLsizei, GLsizei, GLsizei, GLint, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXPARAMETERFPROC = CFuncPtr3[GLenum, GLenum, GLfloat, Unit]
object PFNGLTEXPARAMETERFPROC:
  given _tag: Tag[PFNGLTEXPARAMETERFPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXPARAMETERFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLfloat, Unit]): PFNGLTEXPARAMETERFPROC = o
  extension (v: PFNGLTEXPARAMETERFPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXPARAMETERFVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
object PFNGLTEXPARAMETERFVPROC:
  given _tag: Tag[PFNGLTEXPARAMETERFVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXPARAMETERFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit]): PFNGLTEXPARAMETERFVPROC = o
  extension (v: PFNGLTEXPARAMETERFVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXPARAMETERIIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLTEXPARAMETERIIVPROC:
  given _tag: Tag[PFNGLTEXPARAMETERIIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXPARAMETERIIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLTEXPARAMETERIIVPROC = o
  extension (v: PFNGLTEXPARAMETERIIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXPARAMETERIPROC = CFuncPtr3[GLenum, GLenum, GLint, Unit]
object PFNGLTEXPARAMETERIPROC:
  given _tag: Tag[PFNGLTEXPARAMETERIPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXPARAMETERIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, GLint, Unit]): PFNGLTEXPARAMETERIPROC = o
  extension (v: PFNGLTEXPARAMETERIPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXPARAMETERIUIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]
object PFNGLTEXPARAMETERIUIVPROC:
  given _tag: Tag[PFNGLTEXPARAMETERIUIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXPARAMETERIUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit]): PFNGLTEXPARAMETERIUIVPROC = o
  extension (v: PFNGLTEXPARAMETERIUIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXPARAMETERIVPROC = CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
object PFNGLTEXPARAMETERIVPROC:
  given _tag: Tag[PFNGLTEXPARAMETERIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit]): PFNGLTEXPARAMETERIVPROC = o
  extension (v: PFNGLTEXPARAMETERIVPROC)
    inline def value: CFuncPtr3[GLenum, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXSTORAGE1DPROC = CFuncPtr4[GLenum, GLsizei, GLenum, GLsizei, Unit]
object PFNGLTEXSTORAGE1DPROC:
  given _tag: Tag[PFNGLTEXSTORAGE1DPROC] = Tag.materializeCFuncPtr4[GLenum, GLsizei, GLenum, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXSTORAGE1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLenum, GLsizei, GLenum, GLsizei, Unit]): PFNGLTEXSTORAGE1DPROC = o
  extension (v: PFNGLTEXSTORAGE1DPROC)
    inline def value: CFuncPtr4[GLenum, GLsizei, GLenum, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXSTORAGE2DMULTISAMPLEPROC = CFuncPtr6[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, Unit]
object PFNGLTEXSTORAGE2DMULTISAMPLEPROC:
  given _tag: Tag[PFNGLTEXSTORAGE2DMULTISAMPLEPROC] = Tag.materializeCFuncPtr6[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXSTORAGE2DMULTISAMPLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, Unit]): PFNGLTEXSTORAGE2DMULTISAMPLEPROC = o
  extension (v: PFNGLTEXSTORAGE2DMULTISAMPLEPROC)
    inline def value: CFuncPtr6[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXSTORAGE2DPROC = CFuncPtr5[GLenum, GLsizei, GLenum, GLsizei, GLsizei, Unit]
object PFNGLTEXSTORAGE2DPROC:
  given _tag: Tag[PFNGLTEXSTORAGE2DPROC] = Tag.materializeCFuncPtr5[GLenum, GLsizei, GLenum, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXSTORAGE2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLenum, GLsizei, GLenum, GLsizei, GLsizei, Unit]): PFNGLTEXSTORAGE2DPROC = o
  extension (v: PFNGLTEXSTORAGE2DPROC)
    inline def value: CFuncPtr5[GLenum, GLsizei, GLenum, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXSTORAGE3DMULTISAMPLEPROC = CFuncPtr7[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, Unit]
object PFNGLTEXSTORAGE3DMULTISAMPLEPROC:
  given _tag: Tag[PFNGLTEXSTORAGE3DMULTISAMPLEPROC] = Tag.materializeCFuncPtr7[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXSTORAGE3DMULTISAMPLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, Unit]): PFNGLTEXSTORAGE3DMULTISAMPLEPROC = o
  extension (v: PFNGLTEXSTORAGE3DMULTISAMPLEPROC)
    inline def value: CFuncPtr7[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXSTORAGE3DPROC = CFuncPtr6[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, Unit]
object PFNGLTEXSTORAGE3DPROC:
  given _tag: Tag[PFNGLTEXSTORAGE3DPROC] = Tag.materializeCFuncPtr6[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXSTORAGE3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, Unit]): PFNGLTEXSTORAGE3DPROC = o
  extension (v: PFNGLTEXSTORAGE3DPROC)
    inline def value: CFuncPtr6[GLenum, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXSUBIMAGE1DPROC = CFuncPtr7[GLenum, GLint, GLint, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLTEXSUBIMAGE1DPROC:
  given _tag: Tag[PFNGLTEXSUBIMAGE1DPROC] = Tag.materializeCFuncPtr7[GLenum, GLint, GLint, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXSUBIMAGE1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLenum, GLint, GLint, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLTEXSUBIMAGE1DPROC = o
  extension (v: PFNGLTEXSUBIMAGE1DPROC)
    inline def value: CFuncPtr7[GLenum, GLint, GLint, GLsizei, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXSUBIMAGE2DPROC = CFuncPtr9[GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLTEXSUBIMAGE2DPROC:
  given _tag: Tag[PFNGLTEXSUBIMAGE2DPROC] = Tag.materializeCFuncPtr9[GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXSUBIMAGE2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr9[GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLTEXSUBIMAGE2DPROC = o
  extension (v: PFNGLTEXSUBIMAGE2DPROC)
    inline def value: CFuncPtr9[GLenum, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXSUBIMAGE3DPROC = CFuncPtr11[GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLTEXSUBIMAGE3DPROC:
  given _tag: Tag[PFNGLTEXSUBIMAGE3DPROC] = Tag.materializeCFuncPtr11[GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXSUBIMAGE3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr11[GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLTEXSUBIMAGE3DPROC = o
  extension (v: PFNGLTEXSUBIMAGE3DPROC)
    inline def value: CFuncPtr11[GLenum, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTUREBARRIERPROC = CFuncPtr0[Unit]
object PFNGLTEXTUREBARRIERPROC:
  given _tag: Tag[PFNGLTEXTUREBARRIERPROC] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTUREBARRIERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): PFNGLTEXTUREBARRIERPROC = o
  extension (v: PFNGLTEXTUREBARRIERPROC)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTUREBUFFERPROC = CFuncPtr3[GLuint, GLenum, GLuint, Unit]
object PFNGLTEXTUREBUFFERPROC:
  given _tag: Tag[PFNGLTEXTUREBUFFERPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTUREBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, GLuint, Unit]): PFNGLTEXTUREBUFFERPROC = o
  extension (v: PFNGLTEXTUREBUFFERPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTUREBUFFERRANGEPROC = CFuncPtr5[GLuint, GLenum, GLuint, GLintptr, GLsizeiptr, Unit]
object PFNGLTEXTUREBUFFERRANGEPROC:
  given _tag: Tag[PFNGLTEXTUREBUFFERRANGEPROC] = Tag.materializeCFuncPtr5[GLuint, GLenum, GLuint, GLintptr, GLsizeiptr, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTUREBUFFERRANGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLenum, GLuint, GLintptr, GLsizeiptr, Unit]): PFNGLTEXTUREBUFFERRANGEPROC = o
  extension (v: PFNGLTEXTUREBUFFERRANGEPROC)
    inline def value: CFuncPtr5[GLuint, GLenum, GLuint, GLintptr, GLsizeiptr, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTUREPARAMETERFPROC = CFuncPtr3[GLuint, GLenum, GLfloat, Unit]
object PFNGLTEXTUREPARAMETERFPROC:
  given _tag: Tag[PFNGLTEXTUREPARAMETERFPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTUREPARAMETERFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, GLfloat, Unit]): PFNGLTEXTUREPARAMETERFPROC = o
  extension (v: PFNGLTEXTUREPARAMETERFPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTUREPARAMETERFVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]
object PFNGLTEXTUREPARAMETERFVPROC:
  given _tag: Tag[PFNGLTEXTUREPARAMETERFVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTUREPARAMETERFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit]): PFNGLTEXTUREPARAMETERFVPROC = o
  extension (v: PFNGLTEXTUREPARAMETERFVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTUREPARAMETERIIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLTEXTUREPARAMETERIIVPROC:
  given _tag: Tag[PFNGLTEXTUREPARAMETERIIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTUREPARAMETERIIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLTEXTUREPARAMETERIIVPROC = o
  extension (v: PFNGLTEXTUREPARAMETERIIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTUREPARAMETERIPROC = CFuncPtr3[GLuint, GLenum, GLint, Unit]
object PFNGLTEXTUREPARAMETERIPROC:
  given _tag: Tag[PFNGLTEXTUREPARAMETERIPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTUREPARAMETERIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, GLint, Unit]): PFNGLTEXTUREPARAMETERIPROC = o
  extension (v: PFNGLTEXTUREPARAMETERIPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTUREPARAMETERIUIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]
object PFNGLTEXTUREPARAMETERIUIVPROC:
  given _tag: Tag[PFNGLTEXTUREPARAMETERIUIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTUREPARAMETERIUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit]): PFNGLTEXTUREPARAMETERIUIVPROC = o
  extension (v: PFNGLTEXTUREPARAMETERIUIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTUREPARAMETERIVPROC = CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
object PFNGLTEXTUREPARAMETERIVPROC:
  given _tag: Tag[PFNGLTEXTUREPARAMETERIVPROC] = Tag.materializeCFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTUREPARAMETERIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit]): PFNGLTEXTUREPARAMETERIVPROC = o
  extension (v: PFNGLTEXTUREPARAMETERIVPROC)
    inline def value: CFuncPtr3[GLuint, GLenum, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTURESTORAGE1DPROC = CFuncPtr4[GLuint, GLsizei, GLenum, GLsizei, Unit]
object PFNGLTEXTURESTORAGE1DPROC:
  given _tag: Tag[PFNGLTEXTURESTORAGE1DPROC] = Tag.materializeCFuncPtr4[GLuint, GLsizei, GLenum, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTURESTORAGE1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLsizei, GLenum, GLsizei, Unit]): PFNGLTEXTURESTORAGE1DPROC = o
  extension (v: PFNGLTEXTURESTORAGE1DPROC)
    inline def value: CFuncPtr4[GLuint, GLsizei, GLenum, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC = CFuncPtr6[GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, Unit]
object PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC:
  given _tag: Tag[PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC] = Tag.materializeCFuncPtr6[GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, Unit]): PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC = o
  extension (v: PFNGLTEXTURESTORAGE2DMULTISAMPLEPROC)
    inline def value: CFuncPtr6[GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLboolean, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTURESTORAGE2DPROC = CFuncPtr5[GLuint, GLsizei, GLenum, GLsizei, GLsizei, Unit]
object PFNGLTEXTURESTORAGE2DPROC:
  given _tag: Tag[PFNGLTEXTURESTORAGE2DPROC] = Tag.materializeCFuncPtr5[GLuint, GLsizei, GLenum, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTURESTORAGE2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLsizei, GLenum, GLsizei, GLsizei, Unit]): PFNGLTEXTURESTORAGE2DPROC = o
  extension (v: PFNGLTEXTURESTORAGE2DPROC)
    inline def value: CFuncPtr5[GLuint, GLsizei, GLenum, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTURESTORAGE3DMULTISAMPLEPROC = CFuncPtr7[GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, Unit]
object PFNGLTEXTURESTORAGE3DMULTISAMPLEPROC:
  given _tag: Tag[PFNGLTEXTURESTORAGE3DMULTISAMPLEPROC] = Tag.materializeCFuncPtr7[GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTURESTORAGE3DMULTISAMPLEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, Unit]): PFNGLTEXTURESTORAGE3DMULTISAMPLEPROC = o
  extension (v: PFNGLTEXTURESTORAGE3DMULTISAMPLEPROC)
    inline def value: CFuncPtr7[GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, GLboolean, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTURESTORAGE3DPROC = CFuncPtr6[GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, Unit]
object PFNGLTEXTURESTORAGE3DPROC:
  given _tag: Tag[PFNGLTEXTURESTORAGE3DPROC] = Tag.materializeCFuncPtr6[GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTURESTORAGE3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, Unit]): PFNGLTEXTURESTORAGE3DPROC = o
  extension (v: PFNGLTEXTURESTORAGE3DPROC)
    inline def value: CFuncPtr6[GLuint, GLsizei, GLenum, GLsizei, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTURESUBIMAGE1DPROC = CFuncPtr7[GLuint, GLint, GLint, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLTEXTURESUBIMAGE1DPROC:
  given _tag: Tag[PFNGLTEXTURESUBIMAGE1DPROC] = Tag.materializeCFuncPtr7[GLuint, GLint, GLint, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTURESUBIMAGE1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[GLuint, GLint, GLint, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLTEXTURESUBIMAGE1DPROC = o
  extension (v: PFNGLTEXTURESUBIMAGE1DPROC)
    inline def value: CFuncPtr7[GLuint, GLint, GLint, GLsizei, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTURESUBIMAGE2DPROC = CFuncPtr9[GLuint, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLTEXTURESUBIMAGE2DPROC:
  given _tag: Tag[PFNGLTEXTURESUBIMAGE2DPROC] = Tag.materializeCFuncPtr9[GLuint, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTURESUBIMAGE2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr9[GLuint, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLTEXTURESUBIMAGE2DPROC = o
  extension (v: PFNGLTEXTURESUBIMAGE2DPROC)
    inline def value: CFuncPtr9[GLuint, GLint, GLint, GLint, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTURESUBIMAGE3DPROC = CFuncPtr11[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
object PFNGLTEXTURESUBIMAGE3DPROC:
  given _tag: Tag[PFNGLTEXTURESUBIMAGE3DPROC] = Tag.materializeCFuncPtr11[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTURESUBIMAGE3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr11[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit]): PFNGLTEXTURESUBIMAGE3DPROC = o
  extension (v: PFNGLTEXTURESUBIMAGE3DPROC)
    inline def value: CFuncPtr11[GLuint, GLint, GLint, GLint, GLint, GLsizei, GLsizei, GLsizei, GLenum, GLenum, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTEXTUREVIEWPROC = CFuncPtr8[GLuint, GLenum, GLuint, GLenum, GLuint, GLuint, GLuint, GLuint, Unit]
object PFNGLTEXTUREVIEWPROC:
  given _tag: Tag[PFNGLTEXTUREVIEWPROC] = Tag.materializeCFuncPtr8[GLuint, GLenum, GLuint, GLenum, GLuint, GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTEXTUREVIEWPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[GLuint, GLenum, GLuint, GLenum, GLuint, GLuint, GLuint, GLuint, Unit]): PFNGLTEXTUREVIEWPROC = o
  extension (v: PFNGLTEXTUREVIEWPROC)
    inline def value: CFuncPtr8[GLuint, GLenum, GLuint, GLenum, GLuint, GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC = CFuncPtr3[GLuint, GLuint, GLuint, Unit]
object PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC:
  given _tag: Tag[PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC] = Tag.materializeCFuncPtr3[GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLuint, GLuint, Unit]): PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC = o
  extension (v: PFNGLTRANSFORMFEEDBACKBUFFERBASEPROC)
    inline def value: CFuncPtr3[GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTRANSFORMFEEDBACKBUFFERRANGEPROC = CFuncPtr5[GLuint, GLuint, GLuint, GLintptr, GLsizeiptr, Unit]
object PFNGLTRANSFORMFEEDBACKBUFFERRANGEPROC:
  given _tag: Tag[PFNGLTRANSFORMFEEDBACKBUFFERRANGEPROC] = Tag.materializeCFuncPtr5[GLuint, GLuint, GLuint, GLintptr, GLsizeiptr, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTRANSFORMFEEDBACKBUFFERRANGEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLuint, GLuint, GLintptr, GLsizeiptr, Unit]): PFNGLTRANSFORMFEEDBACKBUFFERRANGEPROC = o
  extension (v: PFNGLTRANSFORMFEEDBACKBUFFERRANGEPROC)
    inline def value: CFuncPtr5[GLuint, GLuint, GLuint, GLintptr, GLsizeiptr, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTRANSFORMFEEDBACKVARYINGSPROC = CFuncPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], GLenum, Unit]
object PFNGLTRANSFORMFEEDBACKVARYINGSPROC:
  given _tag: Tag[PFNGLTRANSFORMFEEDBACKVARYINGSPROC] = Tag.materializeCFuncPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], GLenum, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTRANSFORMFEEDBACKVARYINGSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], GLenum, Unit]): PFNGLTRANSFORMFEEDBACKVARYINGSPROC = o
  extension (v: PFNGLTRANSFORMFEEDBACKVARYINGSPROC)
    inline def value: CFuncPtr4[GLuint, GLsizei, Ptr[Ptr[GLchar]], GLenum, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTRANSLATEDPROC = CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
object PFNGLTRANSLATEDPROC:
  given _tag: Tag[PFNGLTRANSLATEDPROC] = Tag.materializeCFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTRANSLATEDPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]): PFNGLTRANSLATEDPROC = o
  extension (v: PFNGLTRANSLATEDPROC)
    inline def value: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLTRANSLATEFPROC = CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
object PFNGLTRANSLATEFPROC:
  given _tag: Tag[PFNGLTRANSLATEFPROC] = Tag.materializeCFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLTRANSLATEFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]): PFNGLTRANSLATEFPROC = o
  extension (v: PFNGLTRANSLATEFPROC)
    inline def value: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM1DPROC = CFuncPtr2[GLint, GLdouble, Unit]
object PFNGLUNIFORM1DPROC:
  given _tag: Tag[PFNGLUNIFORM1DPROC] = Tag.materializeCFuncPtr2[GLint, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLint, GLdouble, Unit]): PFNGLUNIFORM1DPROC = o
  extension (v: PFNGLUNIFORM1DPROC)
    inline def value: CFuncPtr2[GLint, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM1DVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit]
object PFNGLUNIFORM1DVPROC:
  given _tag: Tag[PFNGLUNIFORM1DVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM1DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit]): PFNGLUNIFORM1DVPROC = o
  extension (v: PFNGLUNIFORM1DVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM1FPROC = CFuncPtr2[GLint, GLfloat, Unit]
object PFNGLUNIFORM1FPROC:
  given _tag: Tag[PFNGLUNIFORM1FPROC] = Tag.materializeCFuncPtr2[GLint, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM1FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLint, GLfloat, Unit]): PFNGLUNIFORM1FPROC = o
  extension (v: PFNGLUNIFORM1FPROC)
    inline def value: CFuncPtr2[GLint, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM1FVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]
object PFNGLUNIFORM1FVPROC:
  given _tag: Tag[PFNGLUNIFORM1FVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM1FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]): PFNGLUNIFORM1FVPROC = o
  extension (v: PFNGLUNIFORM1FVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM1IPROC = CFuncPtr2[GLint, GLint, Unit]
object PFNGLUNIFORM1IPROC:
  given _tag: Tag[PFNGLUNIFORM1IPROC] = Tag.materializeCFuncPtr2[GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM1IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLint, GLint, Unit]): PFNGLUNIFORM1IPROC = o
  extension (v: PFNGLUNIFORM1IPROC)
    inline def value: CFuncPtr2[GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM1IVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit]
object PFNGLUNIFORM1IVPROC:
  given _tag: Tag[PFNGLUNIFORM1IVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM1IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit]): PFNGLUNIFORM1IVPROC = o
  extension (v: PFNGLUNIFORM1IVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM1UIPROC = CFuncPtr2[GLint, GLuint, Unit]
object PFNGLUNIFORM1UIPROC:
  given _tag: Tag[PFNGLUNIFORM1UIPROC] = Tag.materializeCFuncPtr2[GLint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM1UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLint, GLuint, Unit]): PFNGLUNIFORM1UIPROC = o
  extension (v: PFNGLUNIFORM1UIPROC)
    inline def value: CFuncPtr2[GLint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM1UIVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit]
object PFNGLUNIFORM1UIVPROC:
  given _tag: Tag[PFNGLUNIFORM1UIVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM1UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit]): PFNGLUNIFORM1UIVPROC = o
  extension (v: PFNGLUNIFORM1UIVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM2DPROC = CFuncPtr3[GLint, GLdouble, GLdouble, Unit]
object PFNGLUNIFORM2DPROC:
  given _tag: Tag[PFNGLUNIFORM2DPROC] = Tag.materializeCFuncPtr3[GLint, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLdouble, GLdouble, Unit]): PFNGLUNIFORM2DPROC = o
  extension (v: PFNGLUNIFORM2DPROC)
    inline def value: CFuncPtr3[GLint, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM2DVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit]
object PFNGLUNIFORM2DVPROC:
  given _tag: Tag[PFNGLUNIFORM2DVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit]): PFNGLUNIFORM2DVPROC = o
  extension (v: PFNGLUNIFORM2DVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM2FPROC = CFuncPtr3[GLint, GLfloat, GLfloat, Unit]
object PFNGLUNIFORM2FPROC:
  given _tag: Tag[PFNGLUNIFORM2FPROC] = Tag.materializeCFuncPtr3[GLint, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM2FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLfloat, GLfloat, Unit]): PFNGLUNIFORM2FPROC = o
  extension (v: PFNGLUNIFORM2FPROC)
    inline def value: CFuncPtr3[GLint, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM2FVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]
object PFNGLUNIFORM2FVPROC:
  given _tag: Tag[PFNGLUNIFORM2FVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]): PFNGLUNIFORM2FVPROC = o
  extension (v: PFNGLUNIFORM2FVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM2IPROC = CFuncPtr3[GLint, GLint, GLint, Unit]
object PFNGLUNIFORM2IPROC:
  given _tag: Tag[PFNGLUNIFORM2IPROC] = Tag.materializeCFuncPtr3[GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM2IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLint, GLint, Unit]): PFNGLUNIFORM2IPROC = o
  extension (v: PFNGLUNIFORM2IPROC)
    inline def value: CFuncPtr3[GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM2IVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit]
object PFNGLUNIFORM2IVPROC:
  given _tag: Tag[PFNGLUNIFORM2IVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM2IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit]): PFNGLUNIFORM2IVPROC = o
  extension (v: PFNGLUNIFORM2IVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM2UIPROC = CFuncPtr3[GLint, GLuint, GLuint, Unit]
object PFNGLUNIFORM2UIPROC:
  given _tag: Tag[PFNGLUNIFORM2UIPROC] = Tag.materializeCFuncPtr3[GLint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM2UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLuint, GLuint, Unit]): PFNGLUNIFORM2UIPROC = o
  extension (v: PFNGLUNIFORM2UIPROC)
    inline def value: CFuncPtr3[GLint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM2UIVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit]
object PFNGLUNIFORM2UIVPROC:
  given _tag: Tag[PFNGLUNIFORM2UIVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM2UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit]): PFNGLUNIFORM2UIVPROC = o
  extension (v: PFNGLUNIFORM2UIVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM3DPROC = CFuncPtr4[GLint, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLUNIFORM3DPROC:
  given _tag: Tag[PFNGLUNIFORM3DPROC] = Tag.materializeCFuncPtr4[GLint, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLdouble, GLdouble, GLdouble, Unit]): PFNGLUNIFORM3DPROC = o
  extension (v: PFNGLUNIFORM3DPROC)
    inline def value: CFuncPtr4[GLint, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM3DVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit]
object PFNGLUNIFORM3DVPROC:
  given _tag: Tag[PFNGLUNIFORM3DVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit]): PFNGLUNIFORM3DVPROC = o
  extension (v: PFNGLUNIFORM3DVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM3FPROC = CFuncPtr4[GLint, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLUNIFORM3FPROC:
  given _tag: Tag[PFNGLUNIFORM3FPROC] = Tag.materializeCFuncPtr4[GLint, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM3FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLfloat, GLfloat, GLfloat, Unit]): PFNGLUNIFORM3FPROC = o
  extension (v: PFNGLUNIFORM3FPROC)
    inline def value: CFuncPtr4[GLint, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM3FVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]
object PFNGLUNIFORM3FVPROC:
  given _tag: Tag[PFNGLUNIFORM3FVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]): PFNGLUNIFORM3FVPROC = o
  extension (v: PFNGLUNIFORM3FVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM3IPROC = CFuncPtr4[GLint, GLint, GLint, GLint, Unit]
object PFNGLUNIFORM3IPROC:
  given _tag: Tag[PFNGLUNIFORM3IPROC] = Tag.materializeCFuncPtr4[GLint, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM3IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLint, GLint, GLint, Unit]): PFNGLUNIFORM3IPROC = o
  extension (v: PFNGLUNIFORM3IPROC)
    inline def value: CFuncPtr4[GLint, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM3IVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit]
object PFNGLUNIFORM3IVPROC:
  given _tag: Tag[PFNGLUNIFORM3IVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM3IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit]): PFNGLUNIFORM3IVPROC = o
  extension (v: PFNGLUNIFORM3IVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM3UIPROC = CFuncPtr4[GLint, GLuint, GLuint, GLuint, Unit]
object PFNGLUNIFORM3UIPROC:
  given _tag: Tag[PFNGLUNIFORM3UIPROC] = Tag.materializeCFuncPtr4[GLint, GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM3UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLuint, GLuint, GLuint, Unit]): PFNGLUNIFORM3UIPROC = o
  extension (v: PFNGLUNIFORM3UIPROC)
    inline def value: CFuncPtr4[GLint, GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM3UIVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit]
object PFNGLUNIFORM3UIVPROC:
  given _tag: Tag[PFNGLUNIFORM3UIVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM3UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit]): PFNGLUNIFORM3UIVPROC = o
  extension (v: PFNGLUNIFORM3UIVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM4DPROC = CFuncPtr5[GLint, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLUNIFORM4DPROC:
  given _tag: Tag[PFNGLUNIFORM4DPROC] = Tag.materializeCFuncPtr5[GLint, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM4DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLint, GLdouble, GLdouble, GLdouble, GLdouble, Unit]): PFNGLUNIFORM4DPROC = o
  extension (v: PFNGLUNIFORM4DPROC)
    inline def value: CFuncPtr5[GLint, GLdouble, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM4DVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit]
object PFNGLUNIFORM4DVPROC:
  given _tag: Tag[PFNGLUNIFORM4DVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit]): PFNGLUNIFORM4DVPROC = o
  extension (v: PFNGLUNIFORM4DVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM4FPROC = CFuncPtr5[GLint, GLfloat, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLUNIFORM4FPROC:
  given _tag: Tag[PFNGLUNIFORM4FPROC] = Tag.materializeCFuncPtr5[GLint, GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM4FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLint, GLfloat, GLfloat, GLfloat, GLfloat, Unit]): PFNGLUNIFORM4FPROC = o
  extension (v: PFNGLUNIFORM4FPROC)
    inline def value: CFuncPtr5[GLint, GLfloat, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM4FVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]
object PFNGLUNIFORM4FVPROC:
  given _tag: Tag[PFNGLUNIFORM4FVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM4FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit]): PFNGLUNIFORM4FVPROC = o
  extension (v: PFNGLUNIFORM4FVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM4IPROC = CFuncPtr5[GLint, GLint, GLint, GLint, GLint, Unit]
object PFNGLUNIFORM4IPROC:
  given _tag: Tag[PFNGLUNIFORM4IPROC] = Tag.materializeCFuncPtr5[GLint, GLint, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM4IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLint, GLint, GLint, GLint, GLint, Unit]): PFNGLUNIFORM4IPROC = o
  extension (v: PFNGLUNIFORM4IPROC)
    inline def value: CFuncPtr5[GLint, GLint, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM4IVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit]
object PFNGLUNIFORM4IVPROC:
  given _tag: Tag[PFNGLUNIFORM4IVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM4IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit]): PFNGLUNIFORM4IVPROC = o
  extension (v: PFNGLUNIFORM4IVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM4UIPROC = CFuncPtr5[GLint, GLuint, GLuint, GLuint, GLuint, Unit]
object PFNGLUNIFORM4UIPROC:
  given _tag: Tag[PFNGLUNIFORM4UIPROC] = Tag.materializeCFuncPtr5[GLint, GLuint, GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM4UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLint, GLuint, GLuint, GLuint, GLuint, Unit]): PFNGLUNIFORM4UIPROC = o
  extension (v: PFNGLUNIFORM4UIPROC)
    inline def value: CFuncPtr5[GLint, GLuint, GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORM4UIVPROC = CFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit]
object PFNGLUNIFORM4UIVPROC:
  given _tag: Tag[PFNGLUNIFORM4UIVPROC] = Tag.materializeCFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORM4UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit]): PFNGLUNIFORM4UIVPROC = o
  extension (v: PFNGLUNIFORM4UIVPROC)
    inline def value: CFuncPtr3[GLint, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMBLOCKBINDINGPROC = CFuncPtr3[GLuint, GLuint, GLuint, Unit]
object PFNGLUNIFORMBLOCKBINDINGPROC:
  given _tag: Tag[PFNGLUNIFORMBLOCKBINDINGPROC] = Tag.materializeCFuncPtr3[GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMBLOCKBINDINGPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLuint, GLuint, Unit]): PFNGLUNIFORMBLOCKBINDINGPROC = o
  extension (v: PFNGLUNIFORMBLOCKBINDINGPROC)
    inline def value: CFuncPtr3[GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX2DVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLUNIFORMMATRIX2DVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX2DVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLUNIFORMMATRIX2DVPROC = o
  extension (v: PFNGLUNIFORMMATRIX2DVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX2FVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLUNIFORMMATRIX2FVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX2FVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLUNIFORMMATRIX2FVPROC = o
  extension (v: PFNGLUNIFORMMATRIX2FVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX2X3DVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLUNIFORMMATRIX2X3DVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX2X3DVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX2X3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLUNIFORMMATRIX2X3DVPROC = o
  extension (v: PFNGLUNIFORMMATRIX2X3DVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX2X3FVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLUNIFORMMATRIX2X3FVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX2X3FVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX2X3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLUNIFORMMATRIX2X3FVPROC = o
  extension (v: PFNGLUNIFORMMATRIX2X3FVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX2X4DVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLUNIFORMMATRIX2X4DVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX2X4DVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX2X4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLUNIFORMMATRIX2X4DVPROC = o
  extension (v: PFNGLUNIFORMMATRIX2X4DVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX2X4FVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLUNIFORMMATRIX2X4FVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX2X4FVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX2X4FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLUNIFORMMATRIX2X4FVPROC = o
  extension (v: PFNGLUNIFORMMATRIX2X4FVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX3DVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLUNIFORMMATRIX3DVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX3DVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLUNIFORMMATRIX3DVPROC = o
  extension (v: PFNGLUNIFORMMATRIX3DVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX3FVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLUNIFORMMATRIX3FVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX3FVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLUNIFORMMATRIX3FVPROC = o
  extension (v: PFNGLUNIFORMMATRIX3FVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX3X2DVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLUNIFORMMATRIX3X2DVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX3X2DVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX3X2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLUNIFORMMATRIX3X2DVPROC = o
  extension (v: PFNGLUNIFORMMATRIX3X2DVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX3X2FVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLUNIFORMMATRIX3X2FVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX3X2FVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX3X2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLUNIFORMMATRIX3X2FVPROC = o
  extension (v: PFNGLUNIFORMMATRIX3X2FVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX3X4DVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLUNIFORMMATRIX3X4DVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX3X4DVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX3X4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLUNIFORMMATRIX3X4DVPROC = o
  extension (v: PFNGLUNIFORMMATRIX3X4DVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX3X4FVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLUNIFORMMATRIX3X4FVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX3X4FVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX3X4FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLUNIFORMMATRIX3X4FVPROC = o
  extension (v: PFNGLUNIFORMMATRIX3X4FVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX4DVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLUNIFORMMATRIX4DVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX4DVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLUNIFORMMATRIX4DVPROC = o
  extension (v: PFNGLUNIFORMMATRIX4DVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX4FVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLUNIFORMMATRIX4FVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX4FVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX4FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLUNIFORMMATRIX4FVPROC = o
  extension (v: PFNGLUNIFORMMATRIX4FVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX4X2DVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLUNIFORMMATRIX4X2DVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX4X2DVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX4X2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLUNIFORMMATRIX4X2DVPROC = o
  extension (v: PFNGLUNIFORMMATRIX4X2DVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX4X2FVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLUNIFORMMATRIX4X2FVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX4X2FVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX4X2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLUNIFORMMATRIX4X2FVPROC = o
  extension (v: PFNGLUNIFORMMATRIX4X2FVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX4X3DVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
object PFNGLUNIFORMMATRIX4X3DVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX4X3DVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX4X3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit]): PFNGLUNIFORMMATRIX4X3DVPROC = o
  extension (v: PFNGLUNIFORMMATRIX4X3DVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMMATRIX4X3FVPROC = CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
object PFNGLUNIFORMMATRIX4X3FVPROC:
  given _tag: Tag[PFNGLUNIFORMMATRIX4X3FVPROC] = Tag.materializeCFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMMATRIX4X3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit]): PFNGLUNIFORMMATRIX4X3FVPROC = o
  extension (v: PFNGLUNIFORMMATRIX4X3FVPROC)
    inline def value: CFuncPtr4[GLint, GLsizei, GLboolean, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNIFORMSUBROUTINESUIVPROC = CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]
object PFNGLUNIFORMSUBROUTINESUIVPROC:
  given _tag: Tag[PFNGLUNIFORMSUBROUTINESUIVPROC] = Tag.materializeCFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNIFORMSUBROUTINESUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit]): PFNGLUNIFORMSUBROUTINESUIVPROC = o
  extension (v: PFNGLUNIFORMSUBROUTINESUIVPROC)
    inline def value: CFuncPtr3[GLenum, GLsizei, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNMAPBUFFERPROC = CFuncPtr1[GLenum, GLboolean]
object PFNGLUNMAPBUFFERPROC:
  given _tag: Tag[PFNGLUNMAPBUFFERPROC] = Tag.materializeCFuncPtr1[GLenum, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNMAPBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLenum, GLboolean]): PFNGLUNMAPBUFFERPROC = o
  extension (v: PFNGLUNMAPBUFFERPROC)
    inline def value: CFuncPtr1[GLenum, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUNMAPNAMEDBUFFERPROC = CFuncPtr1[GLuint, GLboolean]
object PFNGLUNMAPNAMEDBUFFERPROC:
  given _tag: Tag[PFNGLUNMAPNAMEDBUFFERPROC] = Tag.materializeCFuncPtr1[GLuint, GLboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUNMAPNAMEDBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, GLboolean]): PFNGLUNMAPNAMEDBUFFERPROC = o
  extension (v: PFNGLUNMAPNAMEDBUFFERPROC)
    inline def value: CFuncPtr1[GLuint, GLboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUSEPROGRAMPROC = CFuncPtr1[GLuint, Unit]
object PFNGLUSEPROGRAMPROC:
  given _tag: Tag[PFNGLUSEPROGRAMPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUSEPROGRAMPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLUSEPROGRAMPROC = o
  extension (v: PFNGLUSEPROGRAMPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLUSEPROGRAMSTAGESPROC = CFuncPtr3[GLuint, GLbitfield, GLuint, Unit]
object PFNGLUSEPROGRAMSTAGESPROC:
  given _tag: Tag[PFNGLUSEPROGRAMSTAGESPROC] = Tag.materializeCFuncPtr3[GLuint, GLbitfield, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLUSEPROGRAMSTAGESPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLbitfield, GLuint, Unit]): PFNGLUSEPROGRAMSTAGESPROC = o
  extension (v: PFNGLUSEPROGRAMSTAGESPROC)
    inline def value: CFuncPtr3[GLuint, GLbitfield, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVALIDATEPROGRAMPIPELINEPROC = CFuncPtr1[GLuint, Unit]
object PFNGLVALIDATEPROGRAMPIPELINEPROC:
  given _tag: Tag[PFNGLVALIDATEPROGRAMPIPELINEPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVALIDATEPROGRAMPIPELINEPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLVALIDATEPROGRAMPIPELINEPROC = o
  extension (v: PFNGLVALIDATEPROGRAMPIPELINEPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVALIDATEPROGRAMPROC = CFuncPtr1[GLuint, Unit]
object PFNGLVALIDATEPROGRAMPROC:
  given _tag: Tag[PFNGLVALIDATEPROGRAMPROC] = Tag.materializeCFuncPtr1[GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVALIDATEPROGRAMPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[GLuint, Unit]): PFNGLVALIDATEPROGRAMPROC = o
  extension (v: PFNGLVALIDATEPROGRAMPROC)
    inline def value: CFuncPtr1[GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX2DPROC = CFuncPtr2[GLdouble, GLdouble, Unit]
object PFNGLVERTEX2DPROC:
  given _tag: Tag[PFNGLVERTEX2DPROC] = Tag.materializeCFuncPtr2[GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLdouble, GLdouble, Unit]): PFNGLVERTEX2DPROC = o
  extension (v: PFNGLVERTEX2DPROC)
    inline def value: CFuncPtr2[GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX2DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLVERTEX2DVPROC:
  given _tag: Tag[PFNGLVERTEX2DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLVERTEX2DVPROC = o
  extension (v: PFNGLVERTEX2DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX2FPROC = CFuncPtr2[GLfloat, GLfloat, Unit]
object PFNGLVERTEX2FPROC:
  given _tag: Tag[PFNGLVERTEX2FPROC] = Tag.materializeCFuncPtr2[GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX2FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLfloat, GLfloat, Unit]): PFNGLVERTEX2FPROC = o
  extension (v: PFNGLVERTEX2FPROC)
    inline def value: CFuncPtr2[GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX2FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLVERTEX2FVPROC:
  given _tag: Tag[PFNGLVERTEX2FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLVERTEX2FVPROC = o
  extension (v: PFNGLVERTEX2FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX2IPROC = CFuncPtr2[GLint, GLint, Unit]
object PFNGLVERTEX2IPROC:
  given _tag: Tag[PFNGLVERTEX2IPROC] = Tag.materializeCFuncPtr2[GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX2IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLint, GLint, Unit]): PFNGLVERTEX2IPROC = o
  extension (v: PFNGLVERTEX2IPROC)
    inline def value: CFuncPtr2[GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX2IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLVERTEX2IVPROC:
  given _tag: Tag[PFNGLVERTEX2IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX2IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLVERTEX2IVPROC = o
  extension (v: PFNGLVERTEX2IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX2SPROC = CFuncPtr2[GLshort, GLshort, Unit]
object PFNGLVERTEX2SPROC:
  given _tag: Tag[PFNGLVERTEX2SPROC] = Tag.materializeCFuncPtr2[GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX2SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLshort, GLshort, Unit]): PFNGLVERTEX2SPROC = o
  extension (v: PFNGLVERTEX2SPROC)
    inline def value: CFuncPtr2[GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX2SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLVERTEX2SVPROC:
  given _tag: Tag[PFNGLVERTEX2SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX2SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLVERTEX2SVPROC = o
  extension (v: PFNGLVERTEX2SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX3DPROC = CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
object PFNGLVERTEX3DPROC:
  given _tag: Tag[PFNGLVERTEX3DPROC] = Tag.materializeCFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]): PFNGLVERTEX3DPROC = o
  extension (v: PFNGLVERTEX3DPROC)
    inline def value: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX3DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLVERTEX3DVPROC:
  given _tag: Tag[PFNGLVERTEX3DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLVERTEX3DVPROC = o
  extension (v: PFNGLVERTEX3DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX3FPROC = CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
object PFNGLVERTEX3FPROC:
  given _tag: Tag[PFNGLVERTEX3FPROC] = Tag.materializeCFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX3FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]): PFNGLVERTEX3FPROC = o
  extension (v: PFNGLVERTEX3FPROC)
    inline def value: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX3FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLVERTEX3FVPROC:
  given _tag: Tag[PFNGLVERTEX3FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLVERTEX3FVPROC = o
  extension (v: PFNGLVERTEX3FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX3IPROC = CFuncPtr3[GLint, GLint, GLint, Unit]
object PFNGLVERTEX3IPROC:
  given _tag: Tag[PFNGLVERTEX3IPROC] = Tag.materializeCFuncPtr3[GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX3IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLint, GLint, Unit]): PFNGLVERTEX3IPROC = o
  extension (v: PFNGLVERTEX3IPROC)
    inline def value: CFuncPtr3[GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX3IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLVERTEX3IVPROC:
  given _tag: Tag[PFNGLVERTEX3IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX3IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLVERTEX3IVPROC = o
  extension (v: PFNGLVERTEX3IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX3SPROC = CFuncPtr3[GLshort, GLshort, GLshort, Unit]
object PFNGLVERTEX3SPROC:
  given _tag: Tag[PFNGLVERTEX3SPROC] = Tag.materializeCFuncPtr3[GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX3SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLshort, GLshort, GLshort, Unit]): PFNGLVERTEX3SPROC = o
  extension (v: PFNGLVERTEX3SPROC)
    inline def value: CFuncPtr3[GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX3SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLVERTEX3SVPROC:
  given _tag: Tag[PFNGLVERTEX3SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX3SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLVERTEX3SVPROC = o
  extension (v: PFNGLVERTEX3SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX4DPROC = CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLVERTEX4DPROC:
  given _tag: Tag[PFNGLVERTEX4DPROC] = Tag.materializeCFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX4DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit]): PFNGLVERTEX4DPROC = o
  extension (v: PFNGLVERTEX4DPROC)
    inline def value: CFuncPtr4[GLdouble, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX4DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLVERTEX4DVPROC:
  given _tag: Tag[PFNGLVERTEX4DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLVERTEX4DVPROC = o
  extension (v: PFNGLVERTEX4DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX4FPROC = CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLVERTEX4FPROC:
  given _tag: Tag[PFNGLVERTEX4FPROC] = Tag.materializeCFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX4FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit]): PFNGLVERTEX4FPROC = o
  extension (v: PFNGLVERTEX4FPROC)
    inline def value: CFuncPtr4[GLfloat, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX4FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLVERTEX4FVPROC:
  given _tag: Tag[PFNGLVERTEX4FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX4FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLVERTEX4FVPROC = o
  extension (v: PFNGLVERTEX4FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX4IPROC = CFuncPtr4[GLint, GLint, GLint, GLint, Unit]
object PFNGLVERTEX4IPROC:
  given _tag: Tag[PFNGLVERTEX4IPROC] = Tag.materializeCFuncPtr4[GLint, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX4IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLint, GLint, GLint, Unit]): PFNGLVERTEX4IPROC = o
  extension (v: PFNGLVERTEX4IPROC)
    inline def value: CFuncPtr4[GLint, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX4IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLVERTEX4IVPROC:
  given _tag: Tag[PFNGLVERTEX4IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX4IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLVERTEX4IVPROC = o
  extension (v: PFNGLVERTEX4IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX4SPROC = CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]
object PFNGLVERTEX4SPROC:
  given _tag: Tag[PFNGLVERTEX4SPROC] = Tag.materializeCFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX4SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit]): PFNGLVERTEX4SPROC = o
  extension (v: PFNGLVERTEX4SPROC)
    inline def value: CFuncPtr4[GLshort, GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEX4SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLVERTEX4SVPROC:
  given _tag: Tag[PFNGLVERTEX4SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEX4SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLVERTEX4SVPROC = o
  extension (v: PFNGLVERTEX4SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXARRAYATTRIBBINDINGPROC = CFuncPtr3[GLuint, GLuint, GLuint, Unit]
object PFNGLVERTEXARRAYATTRIBBINDINGPROC:
  given _tag: Tag[PFNGLVERTEXARRAYATTRIBBINDINGPROC] = Tag.materializeCFuncPtr3[GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXARRAYATTRIBBINDINGPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLuint, GLuint, Unit]): PFNGLVERTEXARRAYATTRIBBINDINGPROC = o
  extension (v: PFNGLVERTEXARRAYATTRIBBINDINGPROC)
    inline def value: CFuncPtr3[GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXARRAYATTRIBFORMATPROC = CFuncPtr6[GLuint, GLuint, GLint, GLenum, GLboolean, GLuint, Unit]
object PFNGLVERTEXARRAYATTRIBFORMATPROC:
  given _tag: Tag[PFNGLVERTEXARRAYATTRIBFORMATPROC] = Tag.materializeCFuncPtr6[GLuint, GLuint, GLint, GLenum, GLboolean, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXARRAYATTRIBFORMATPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLuint, GLint, GLenum, GLboolean, GLuint, Unit]): PFNGLVERTEXARRAYATTRIBFORMATPROC = o
  extension (v: PFNGLVERTEXARRAYATTRIBFORMATPROC)
    inline def value: CFuncPtr6[GLuint, GLuint, GLint, GLenum, GLboolean, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXARRAYATTRIBIFORMATPROC = CFuncPtr5[GLuint, GLuint, GLint, GLenum, GLuint, Unit]
object PFNGLVERTEXARRAYATTRIBIFORMATPROC:
  given _tag: Tag[PFNGLVERTEXARRAYATTRIBIFORMATPROC] = Tag.materializeCFuncPtr5[GLuint, GLuint, GLint, GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXARRAYATTRIBIFORMATPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLuint, GLint, GLenum, GLuint, Unit]): PFNGLVERTEXARRAYATTRIBIFORMATPROC = o
  extension (v: PFNGLVERTEXARRAYATTRIBIFORMATPROC)
    inline def value: CFuncPtr5[GLuint, GLuint, GLint, GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXARRAYATTRIBLFORMATPROC = CFuncPtr5[GLuint, GLuint, GLint, GLenum, GLuint, Unit]
object PFNGLVERTEXARRAYATTRIBLFORMATPROC:
  given _tag: Tag[PFNGLVERTEXARRAYATTRIBLFORMATPROC] = Tag.materializeCFuncPtr5[GLuint, GLuint, GLint, GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXARRAYATTRIBLFORMATPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLuint, GLint, GLenum, GLuint, Unit]): PFNGLVERTEXARRAYATTRIBLFORMATPROC = o
  extension (v: PFNGLVERTEXARRAYATTRIBLFORMATPROC)
    inline def value: CFuncPtr5[GLuint, GLuint, GLint, GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXARRAYBINDINGDIVISORPROC = CFuncPtr3[GLuint, GLuint, GLuint, Unit]
object PFNGLVERTEXARRAYBINDINGDIVISORPROC:
  given _tag: Tag[PFNGLVERTEXARRAYBINDINGDIVISORPROC] = Tag.materializeCFuncPtr3[GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXARRAYBINDINGDIVISORPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLuint, GLuint, Unit]): PFNGLVERTEXARRAYBINDINGDIVISORPROC = o
  extension (v: PFNGLVERTEXARRAYBINDINGDIVISORPROC)
    inline def value: CFuncPtr3[GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXARRAYELEMENTBUFFERPROC = CFuncPtr2[GLuint, GLuint, Unit]
object PFNGLVERTEXARRAYELEMENTBUFFERPROC:
  given _tag: Tag[PFNGLVERTEXARRAYELEMENTBUFFERPROC] = Tag.materializeCFuncPtr2[GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXARRAYELEMENTBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLuint, Unit]): PFNGLVERTEXARRAYELEMENTBUFFERPROC = o
  extension (v: PFNGLVERTEXARRAYELEMENTBUFFERPROC)
    inline def value: CFuncPtr2[GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXARRAYVERTEXBUFFERPROC = CFuncPtr5[GLuint, GLuint, GLuint, GLintptr, GLsizei, Unit]
object PFNGLVERTEXARRAYVERTEXBUFFERPROC:
  given _tag: Tag[PFNGLVERTEXARRAYVERTEXBUFFERPROC] = Tag.materializeCFuncPtr5[GLuint, GLuint, GLuint, GLintptr, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXARRAYVERTEXBUFFERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLuint, GLuint, GLintptr, GLsizei, Unit]): PFNGLVERTEXARRAYVERTEXBUFFERPROC = o
  extension (v: PFNGLVERTEXARRAYVERTEXBUFFERPROC)
    inline def value: CFuncPtr5[GLuint, GLuint, GLuint, GLintptr, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXARRAYVERTEXBUFFERSPROC = CFuncPtr6[GLuint, GLuint, GLsizei, Ptr[GLuint], Ptr[GLintptr], Ptr[GLsizei], Unit]
object PFNGLVERTEXARRAYVERTEXBUFFERSPROC:
  given _tag: Tag[PFNGLVERTEXARRAYVERTEXBUFFERSPROC] = Tag.materializeCFuncPtr6[GLuint, GLuint, GLsizei, Ptr[GLuint], Ptr[GLintptr], Ptr[GLsizei], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXARRAYVERTEXBUFFERSPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLuint, GLsizei, Ptr[GLuint], Ptr[GLintptr], Ptr[GLsizei], Unit]): PFNGLVERTEXARRAYVERTEXBUFFERSPROC = o
  extension (v: PFNGLVERTEXARRAYVERTEXBUFFERSPROC)
    inline def value: CFuncPtr6[GLuint, GLuint, GLsizei, Ptr[GLuint], Ptr[GLintptr], Ptr[GLsizei], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB1DPROC = CFuncPtr2[GLuint, GLdouble, Unit]
object PFNGLVERTEXATTRIB1DPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB1DPROC] = Tag.materializeCFuncPtr2[GLuint, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLdouble, Unit]): PFNGLVERTEXATTRIB1DPROC = o
  extension (v: PFNGLVERTEXATTRIB1DPROC)
    inline def value: CFuncPtr2[GLuint, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB1DVPROC = CFuncPtr2[GLuint, Ptr[GLdouble], Unit]
object PFNGLVERTEXATTRIB1DVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB1DVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB1DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLdouble], Unit]): PFNGLVERTEXATTRIB1DVPROC = o
  extension (v: PFNGLVERTEXATTRIB1DVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB1FPROC = CFuncPtr2[GLuint, GLfloat, Unit]
object PFNGLVERTEXATTRIB1FPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB1FPROC] = Tag.materializeCFuncPtr2[GLuint, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB1FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLfloat, Unit]): PFNGLVERTEXATTRIB1FPROC = o
  extension (v: PFNGLVERTEXATTRIB1FPROC)
    inline def value: CFuncPtr2[GLuint, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB1FVPROC = CFuncPtr2[GLuint, Ptr[GLfloat], Unit]
object PFNGLVERTEXATTRIB1FVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB1FVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB1FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLfloat], Unit]): PFNGLVERTEXATTRIB1FVPROC = o
  extension (v: PFNGLVERTEXATTRIB1FVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB1SPROC = CFuncPtr2[GLuint, GLshort, Unit]
object PFNGLVERTEXATTRIB1SPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB1SPROC] = Tag.materializeCFuncPtr2[GLuint, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB1SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLshort, Unit]): PFNGLVERTEXATTRIB1SPROC = o
  extension (v: PFNGLVERTEXATTRIB1SPROC)
    inline def value: CFuncPtr2[GLuint, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB1SVPROC = CFuncPtr2[GLuint, Ptr[GLshort], Unit]
object PFNGLVERTEXATTRIB1SVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB1SVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB1SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLshort], Unit]): PFNGLVERTEXATTRIB1SVPROC = o
  extension (v: PFNGLVERTEXATTRIB1SVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB2DPROC = CFuncPtr3[GLuint, GLdouble, GLdouble, Unit]
object PFNGLVERTEXATTRIB2DPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB2DPROC] = Tag.materializeCFuncPtr3[GLuint, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLdouble, GLdouble, Unit]): PFNGLVERTEXATTRIB2DPROC = o
  extension (v: PFNGLVERTEXATTRIB2DPROC)
    inline def value: CFuncPtr3[GLuint, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB2DVPROC = CFuncPtr2[GLuint, Ptr[GLdouble], Unit]
object PFNGLVERTEXATTRIB2DVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB2DVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLdouble], Unit]): PFNGLVERTEXATTRIB2DVPROC = o
  extension (v: PFNGLVERTEXATTRIB2DVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB2FPROC = CFuncPtr3[GLuint, GLfloat, GLfloat, Unit]
object PFNGLVERTEXATTRIB2FPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB2FPROC] = Tag.materializeCFuncPtr3[GLuint, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB2FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLfloat, GLfloat, Unit]): PFNGLVERTEXATTRIB2FPROC = o
  extension (v: PFNGLVERTEXATTRIB2FPROC)
    inline def value: CFuncPtr3[GLuint, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB2FVPROC = CFuncPtr2[GLuint, Ptr[GLfloat], Unit]
object PFNGLVERTEXATTRIB2FVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB2FVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLfloat], Unit]): PFNGLVERTEXATTRIB2FVPROC = o
  extension (v: PFNGLVERTEXATTRIB2FVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB2SPROC = CFuncPtr3[GLuint, GLshort, GLshort, Unit]
object PFNGLVERTEXATTRIB2SPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB2SPROC] = Tag.materializeCFuncPtr3[GLuint, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB2SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLshort, GLshort, Unit]): PFNGLVERTEXATTRIB2SPROC = o
  extension (v: PFNGLVERTEXATTRIB2SPROC)
    inline def value: CFuncPtr3[GLuint, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB2SVPROC = CFuncPtr2[GLuint, Ptr[GLshort], Unit]
object PFNGLVERTEXATTRIB2SVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB2SVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB2SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLshort], Unit]): PFNGLVERTEXATTRIB2SVPROC = o
  extension (v: PFNGLVERTEXATTRIB2SVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB3DPROC = CFuncPtr4[GLuint, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLVERTEXATTRIB3DPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB3DPROC] = Tag.materializeCFuncPtr4[GLuint, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLdouble, GLdouble, GLdouble, Unit]): PFNGLVERTEXATTRIB3DPROC = o
  extension (v: PFNGLVERTEXATTRIB3DPROC)
    inline def value: CFuncPtr4[GLuint, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB3DVPROC = CFuncPtr2[GLuint, Ptr[GLdouble], Unit]
object PFNGLVERTEXATTRIB3DVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB3DVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLdouble], Unit]): PFNGLVERTEXATTRIB3DVPROC = o
  extension (v: PFNGLVERTEXATTRIB3DVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB3FPROC = CFuncPtr4[GLuint, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLVERTEXATTRIB3FPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB3FPROC] = Tag.materializeCFuncPtr4[GLuint, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB3FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLfloat, GLfloat, GLfloat, Unit]): PFNGLVERTEXATTRIB3FPROC = o
  extension (v: PFNGLVERTEXATTRIB3FPROC)
    inline def value: CFuncPtr4[GLuint, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB3FVPROC = CFuncPtr2[GLuint, Ptr[GLfloat], Unit]
object PFNGLVERTEXATTRIB3FVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB3FVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLfloat], Unit]): PFNGLVERTEXATTRIB3FVPROC = o
  extension (v: PFNGLVERTEXATTRIB3FVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB3SPROC = CFuncPtr4[GLuint, GLshort, GLshort, GLshort, Unit]
object PFNGLVERTEXATTRIB3SPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB3SPROC] = Tag.materializeCFuncPtr4[GLuint, GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB3SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLshort, GLshort, GLshort, Unit]): PFNGLVERTEXATTRIB3SPROC = o
  extension (v: PFNGLVERTEXATTRIB3SPROC)
    inline def value: CFuncPtr4[GLuint, GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB3SVPROC = CFuncPtr2[GLuint, Ptr[GLshort], Unit]
object PFNGLVERTEXATTRIB3SVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB3SVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB3SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLshort], Unit]): PFNGLVERTEXATTRIB3SVPROC = o
  extension (v: PFNGLVERTEXATTRIB3SVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4BVPROC = CFuncPtr2[GLuint, Ptr[GLbyte], Unit]
object PFNGLVERTEXATTRIB4BVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4BVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLbyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4BVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLbyte], Unit]): PFNGLVERTEXATTRIB4BVPROC = o
  extension (v: PFNGLVERTEXATTRIB4BVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLbyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4DPROC = CFuncPtr5[GLuint, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLVERTEXATTRIB4DPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4DPROC] = Tag.materializeCFuncPtr5[GLuint, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLdouble, GLdouble, GLdouble, GLdouble, Unit]): PFNGLVERTEXATTRIB4DPROC = o
  extension (v: PFNGLVERTEXATTRIB4DPROC)
    inline def value: CFuncPtr5[GLuint, GLdouble, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4DVPROC = CFuncPtr2[GLuint, Ptr[GLdouble], Unit]
object PFNGLVERTEXATTRIB4DVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4DVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLdouble], Unit]): PFNGLVERTEXATTRIB4DVPROC = o
  extension (v: PFNGLVERTEXATTRIB4DVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4FPROC = CFuncPtr5[GLuint, GLfloat, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLVERTEXATTRIB4FPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4FPROC] = Tag.materializeCFuncPtr5[GLuint, GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLfloat, GLfloat, GLfloat, GLfloat, Unit]): PFNGLVERTEXATTRIB4FPROC = o
  extension (v: PFNGLVERTEXATTRIB4FPROC)
    inline def value: CFuncPtr5[GLuint, GLfloat, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4FVPROC = CFuncPtr2[GLuint, Ptr[GLfloat], Unit]
object PFNGLVERTEXATTRIB4FVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4FVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLfloat], Unit]): PFNGLVERTEXATTRIB4FVPROC = o
  extension (v: PFNGLVERTEXATTRIB4FVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4IVPROC = CFuncPtr2[GLuint, Ptr[GLint], Unit]
object PFNGLVERTEXATTRIB4IVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4IVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLint], Unit]): PFNGLVERTEXATTRIB4IVPROC = o
  extension (v: PFNGLVERTEXATTRIB4IVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4NBVPROC = CFuncPtr2[GLuint, Ptr[GLbyte], Unit]
object PFNGLVERTEXATTRIB4NBVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4NBVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLbyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4NBVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLbyte], Unit]): PFNGLVERTEXATTRIB4NBVPROC = o
  extension (v: PFNGLVERTEXATTRIB4NBVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLbyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4NIVPROC = CFuncPtr2[GLuint, Ptr[GLint], Unit]
object PFNGLVERTEXATTRIB4NIVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4NIVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4NIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLint], Unit]): PFNGLVERTEXATTRIB4NIVPROC = o
  extension (v: PFNGLVERTEXATTRIB4NIVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4NSVPROC = CFuncPtr2[GLuint, Ptr[GLshort], Unit]
object PFNGLVERTEXATTRIB4NSVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4NSVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4NSVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLshort], Unit]): PFNGLVERTEXATTRIB4NSVPROC = o
  extension (v: PFNGLVERTEXATTRIB4NSVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4NUBPROC = CFuncPtr5[GLuint, GLubyte, GLubyte, GLubyte, GLubyte, Unit]
object PFNGLVERTEXATTRIB4NUBPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4NUBPROC] = Tag.materializeCFuncPtr5[GLuint, GLubyte, GLubyte, GLubyte, GLubyte, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4NUBPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLubyte, GLubyte, GLubyte, GLubyte, Unit]): PFNGLVERTEXATTRIB4NUBPROC = o
  extension (v: PFNGLVERTEXATTRIB4NUBPROC)
    inline def value: CFuncPtr5[GLuint, GLubyte, GLubyte, GLubyte, GLubyte, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4NUBVPROC = CFuncPtr2[GLuint, Ptr[GLubyte], Unit]
object PFNGLVERTEXATTRIB4NUBVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4NUBVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLubyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4NUBVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLubyte], Unit]): PFNGLVERTEXATTRIB4NUBVPROC = o
  extension (v: PFNGLVERTEXATTRIB4NUBVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLubyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4NUIVPROC = CFuncPtr2[GLuint, Ptr[GLuint], Unit]
object PFNGLVERTEXATTRIB4NUIVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4NUIVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4NUIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLuint], Unit]): PFNGLVERTEXATTRIB4NUIVPROC = o
  extension (v: PFNGLVERTEXATTRIB4NUIVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4NUSVPROC = CFuncPtr2[GLuint, Ptr[GLushort], Unit]
object PFNGLVERTEXATTRIB4NUSVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4NUSVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLushort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4NUSVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLushort], Unit]): PFNGLVERTEXATTRIB4NUSVPROC = o
  extension (v: PFNGLVERTEXATTRIB4NUSVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLushort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4SPROC = CFuncPtr5[GLuint, GLshort, GLshort, GLshort, GLshort, Unit]
object PFNGLVERTEXATTRIB4SPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4SPROC] = Tag.materializeCFuncPtr5[GLuint, GLshort, GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLshort, GLshort, GLshort, GLshort, Unit]): PFNGLVERTEXATTRIB4SPROC = o
  extension (v: PFNGLVERTEXATTRIB4SPROC)
    inline def value: CFuncPtr5[GLuint, GLshort, GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4SVPROC = CFuncPtr2[GLuint, Ptr[GLshort], Unit]
object PFNGLVERTEXATTRIB4SVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4SVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLshort], Unit]): PFNGLVERTEXATTRIB4SVPROC = o
  extension (v: PFNGLVERTEXATTRIB4SVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4UBVPROC = CFuncPtr2[GLuint, Ptr[GLubyte], Unit]
object PFNGLVERTEXATTRIB4UBVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4UBVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLubyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4UBVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLubyte], Unit]): PFNGLVERTEXATTRIB4UBVPROC = o
  extension (v: PFNGLVERTEXATTRIB4UBVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLubyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4UIVPROC = CFuncPtr2[GLuint, Ptr[GLuint], Unit]
object PFNGLVERTEXATTRIB4UIVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4UIVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLuint], Unit]): PFNGLVERTEXATTRIB4UIVPROC = o
  extension (v: PFNGLVERTEXATTRIB4UIVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIB4USVPROC = CFuncPtr2[GLuint, Ptr[GLushort], Unit]
object PFNGLVERTEXATTRIB4USVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIB4USVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLushort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIB4USVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLushort], Unit]): PFNGLVERTEXATTRIB4USVPROC = o
  extension (v: PFNGLVERTEXATTRIB4USVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLushort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBBINDINGPROC = CFuncPtr2[GLuint, GLuint, Unit]
object PFNGLVERTEXATTRIBBINDINGPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBBINDINGPROC] = Tag.materializeCFuncPtr2[GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBBINDINGPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLuint, Unit]): PFNGLVERTEXATTRIBBINDINGPROC = o
  extension (v: PFNGLVERTEXATTRIBBINDINGPROC)
    inline def value: CFuncPtr2[GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBDIVISORPROC = CFuncPtr2[GLuint, GLuint, Unit]
object PFNGLVERTEXATTRIBDIVISORPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBDIVISORPROC] = Tag.materializeCFuncPtr2[GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBDIVISORPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLuint, Unit]): PFNGLVERTEXATTRIBDIVISORPROC = o
  extension (v: PFNGLVERTEXATTRIBDIVISORPROC)
    inline def value: CFuncPtr2[GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBFORMATPROC = CFuncPtr5[GLuint, GLint, GLenum, GLboolean, GLuint, Unit]
object PFNGLVERTEXATTRIBFORMATPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBFORMATPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLenum, GLboolean, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBFORMATPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLenum, GLboolean, GLuint, Unit]): PFNGLVERTEXATTRIBFORMATPROC = o
  extension (v: PFNGLVERTEXATTRIBFORMATPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLenum, GLboolean, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI1IPROC = CFuncPtr2[GLuint, GLint, Unit]
object PFNGLVERTEXATTRIBI1IPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI1IPROC] = Tag.materializeCFuncPtr2[GLuint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI1IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLint, Unit]): PFNGLVERTEXATTRIBI1IPROC = o
  extension (v: PFNGLVERTEXATTRIBI1IPROC)
    inline def value: CFuncPtr2[GLuint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI1IVPROC = CFuncPtr2[GLuint, Ptr[GLint], Unit]
object PFNGLVERTEXATTRIBI1IVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI1IVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI1IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLint], Unit]): PFNGLVERTEXATTRIBI1IVPROC = o
  extension (v: PFNGLVERTEXATTRIBI1IVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI1UIPROC = CFuncPtr2[GLuint, GLuint, Unit]
object PFNGLVERTEXATTRIBI1UIPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI1UIPROC] = Tag.materializeCFuncPtr2[GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI1UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLuint, Unit]): PFNGLVERTEXATTRIBI1UIPROC = o
  extension (v: PFNGLVERTEXATTRIBI1UIPROC)
    inline def value: CFuncPtr2[GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI1UIVPROC = CFuncPtr2[GLuint, Ptr[GLuint], Unit]
object PFNGLVERTEXATTRIBI1UIVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI1UIVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI1UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLuint], Unit]): PFNGLVERTEXATTRIBI1UIVPROC = o
  extension (v: PFNGLVERTEXATTRIBI1UIVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI2IPROC = CFuncPtr3[GLuint, GLint, GLint, Unit]
object PFNGLVERTEXATTRIBI2IPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI2IPROC] = Tag.materializeCFuncPtr3[GLuint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI2IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLint, GLint, Unit]): PFNGLVERTEXATTRIBI2IPROC = o
  extension (v: PFNGLVERTEXATTRIBI2IPROC)
    inline def value: CFuncPtr3[GLuint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI2IVPROC = CFuncPtr2[GLuint, Ptr[GLint], Unit]
object PFNGLVERTEXATTRIBI2IVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI2IVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI2IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLint], Unit]): PFNGLVERTEXATTRIBI2IVPROC = o
  extension (v: PFNGLVERTEXATTRIBI2IVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI2UIPROC = CFuncPtr3[GLuint, GLuint, GLuint, Unit]
object PFNGLVERTEXATTRIBI2UIPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI2UIPROC] = Tag.materializeCFuncPtr3[GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI2UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLuint, GLuint, Unit]): PFNGLVERTEXATTRIBI2UIPROC = o
  extension (v: PFNGLVERTEXATTRIBI2UIPROC)
    inline def value: CFuncPtr3[GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI2UIVPROC = CFuncPtr2[GLuint, Ptr[GLuint], Unit]
object PFNGLVERTEXATTRIBI2UIVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI2UIVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI2UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLuint], Unit]): PFNGLVERTEXATTRIBI2UIVPROC = o
  extension (v: PFNGLVERTEXATTRIBI2UIVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI3IPROC = CFuncPtr4[GLuint, GLint, GLint, GLint, Unit]
object PFNGLVERTEXATTRIBI3IPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI3IPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI3IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLint, GLint, Unit]): PFNGLVERTEXATTRIBI3IPROC = o
  extension (v: PFNGLVERTEXATTRIBI3IPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI3IVPROC = CFuncPtr2[GLuint, Ptr[GLint], Unit]
object PFNGLVERTEXATTRIBI3IVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI3IVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI3IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLint], Unit]): PFNGLVERTEXATTRIBI3IVPROC = o
  extension (v: PFNGLVERTEXATTRIBI3IVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI3UIPROC = CFuncPtr4[GLuint, GLuint, GLuint, GLuint, Unit]
object PFNGLVERTEXATTRIBI3UIPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI3UIPROC] = Tag.materializeCFuncPtr4[GLuint, GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI3UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLuint, GLuint, GLuint, Unit]): PFNGLVERTEXATTRIBI3UIPROC = o
  extension (v: PFNGLVERTEXATTRIBI3UIPROC)
    inline def value: CFuncPtr4[GLuint, GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI3UIVPROC = CFuncPtr2[GLuint, Ptr[GLuint], Unit]
object PFNGLVERTEXATTRIBI3UIVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI3UIVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI3UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLuint], Unit]): PFNGLVERTEXATTRIBI3UIVPROC = o
  extension (v: PFNGLVERTEXATTRIBI3UIVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI4BVPROC = CFuncPtr2[GLuint, Ptr[GLbyte], Unit]
object PFNGLVERTEXATTRIBI4BVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI4BVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLbyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI4BVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLbyte], Unit]): PFNGLVERTEXATTRIBI4BVPROC = o
  extension (v: PFNGLVERTEXATTRIBI4BVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLbyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI4IPROC = CFuncPtr5[GLuint, GLint, GLint, GLint, GLint, Unit]
object PFNGLVERTEXATTRIBI4IPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI4IPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI4IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLint, GLint, GLint, Unit]): PFNGLVERTEXATTRIBI4IPROC = o
  extension (v: PFNGLVERTEXATTRIBI4IPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI4IVPROC = CFuncPtr2[GLuint, Ptr[GLint], Unit]
object PFNGLVERTEXATTRIBI4IVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI4IVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI4IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLint], Unit]): PFNGLVERTEXATTRIBI4IVPROC = o
  extension (v: PFNGLVERTEXATTRIBI4IVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI4SVPROC = CFuncPtr2[GLuint, Ptr[GLshort], Unit]
object PFNGLVERTEXATTRIBI4SVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI4SVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI4SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLshort], Unit]): PFNGLVERTEXATTRIBI4SVPROC = o
  extension (v: PFNGLVERTEXATTRIBI4SVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI4UBVPROC = CFuncPtr2[GLuint, Ptr[GLubyte], Unit]
object PFNGLVERTEXATTRIBI4UBVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI4UBVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLubyte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI4UBVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLubyte], Unit]): PFNGLVERTEXATTRIBI4UBVPROC = o
  extension (v: PFNGLVERTEXATTRIBI4UBVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLubyte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI4UIPROC = CFuncPtr5[GLuint, GLuint, GLuint, GLuint, GLuint, Unit]
object PFNGLVERTEXATTRIBI4UIPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI4UIPROC] = Tag.materializeCFuncPtr5[GLuint, GLuint, GLuint, GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI4UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLuint, GLuint, GLuint, GLuint, Unit]): PFNGLVERTEXATTRIBI4UIPROC = o
  extension (v: PFNGLVERTEXATTRIBI4UIPROC)
    inline def value: CFuncPtr5[GLuint, GLuint, GLuint, GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI4UIVPROC = CFuncPtr2[GLuint, Ptr[GLuint], Unit]
object PFNGLVERTEXATTRIBI4UIVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI4UIVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI4UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLuint], Unit]): PFNGLVERTEXATTRIBI4UIVPROC = o
  extension (v: PFNGLVERTEXATTRIBI4UIVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBI4USVPROC = CFuncPtr2[GLuint, Ptr[GLushort], Unit]
object PFNGLVERTEXATTRIBI4USVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBI4USVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLushort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBI4USVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLushort], Unit]): PFNGLVERTEXATTRIBI4USVPROC = o
  extension (v: PFNGLVERTEXATTRIBI4USVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLushort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBIFORMATPROC = CFuncPtr4[GLuint, GLint, GLenum, GLuint, Unit]
object PFNGLVERTEXATTRIBIFORMATPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBIFORMATPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBIFORMATPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLenum, GLuint, Unit]): PFNGLVERTEXATTRIBIFORMATPROC = o
  extension (v: PFNGLVERTEXATTRIBIFORMATPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBIPOINTERPROC = CFuncPtr5[GLuint, GLint, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLVERTEXATTRIBIPOINTERPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBIPOINTERPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBIPOINTERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLVERTEXATTRIBIPOINTERPROC = o
  extension (v: PFNGLVERTEXATTRIBIPOINTERPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBL1DPROC = CFuncPtr2[GLuint, GLdouble, Unit]
object PFNGLVERTEXATTRIBL1DPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBL1DPROC] = Tag.materializeCFuncPtr2[GLuint, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBL1DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLdouble, Unit]): PFNGLVERTEXATTRIBL1DPROC = o
  extension (v: PFNGLVERTEXATTRIBL1DPROC)
    inline def value: CFuncPtr2[GLuint, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBL1DVPROC = CFuncPtr2[GLuint, Ptr[GLdouble], Unit]
object PFNGLVERTEXATTRIBL1DVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBL1DVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBL1DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLdouble], Unit]): PFNGLVERTEXATTRIBL1DVPROC = o
  extension (v: PFNGLVERTEXATTRIBL1DVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBL2DPROC = CFuncPtr3[GLuint, GLdouble, GLdouble, Unit]
object PFNGLVERTEXATTRIBL2DPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBL2DPROC] = Tag.materializeCFuncPtr3[GLuint, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBL2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLdouble, GLdouble, Unit]): PFNGLVERTEXATTRIBL2DPROC = o
  extension (v: PFNGLVERTEXATTRIBL2DPROC)
    inline def value: CFuncPtr3[GLuint, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBL2DVPROC = CFuncPtr2[GLuint, Ptr[GLdouble], Unit]
object PFNGLVERTEXATTRIBL2DVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBL2DVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBL2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLdouble], Unit]): PFNGLVERTEXATTRIBL2DVPROC = o
  extension (v: PFNGLVERTEXATTRIBL2DVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBL3DPROC = CFuncPtr4[GLuint, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLVERTEXATTRIBL3DPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBL3DPROC] = Tag.materializeCFuncPtr4[GLuint, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBL3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLdouble, GLdouble, GLdouble, Unit]): PFNGLVERTEXATTRIBL3DPROC = o
  extension (v: PFNGLVERTEXATTRIBL3DPROC)
    inline def value: CFuncPtr4[GLuint, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBL3DVPROC = CFuncPtr2[GLuint, Ptr[GLdouble], Unit]
object PFNGLVERTEXATTRIBL3DVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBL3DVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBL3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLdouble], Unit]): PFNGLVERTEXATTRIBL3DVPROC = o
  extension (v: PFNGLVERTEXATTRIBL3DVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBL4DPROC = CFuncPtr5[GLuint, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
object PFNGLVERTEXATTRIBL4DPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBL4DPROC] = Tag.materializeCFuncPtr5[GLuint, GLdouble, GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBL4DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLdouble, GLdouble, GLdouble, GLdouble, Unit]): PFNGLVERTEXATTRIBL4DPROC = o
  extension (v: PFNGLVERTEXATTRIBL4DPROC)
    inline def value: CFuncPtr5[GLuint, GLdouble, GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBL4DVPROC = CFuncPtr2[GLuint, Ptr[GLdouble], Unit]
object PFNGLVERTEXATTRIBL4DVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBL4DVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBL4DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLdouble], Unit]): PFNGLVERTEXATTRIBL4DVPROC = o
  extension (v: PFNGLVERTEXATTRIBL4DVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBLFORMATPROC = CFuncPtr4[GLuint, GLint, GLenum, GLuint, Unit]
object PFNGLVERTEXATTRIBLFORMATPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBLFORMATPROC] = Tag.materializeCFuncPtr4[GLuint, GLint, GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBLFORMATPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLint, GLenum, GLuint, Unit]): PFNGLVERTEXATTRIBLFORMATPROC = o
  extension (v: PFNGLVERTEXATTRIBLFORMATPROC)
    inline def value: CFuncPtr4[GLuint, GLint, GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBLPOINTERPROC = CFuncPtr5[GLuint, GLint, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLVERTEXATTRIBLPOINTERPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBLPOINTERPROC] = Tag.materializeCFuncPtr5[GLuint, GLint, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBLPOINTERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLint, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLVERTEXATTRIBLPOINTERPROC = o
  extension (v: PFNGLVERTEXATTRIBLPOINTERPROC)
    inline def value: CFuncPtr5[GLuint, GLint, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBP1UIPROC = CFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit]
object PFNGLVERTEXATTRIBP1UIPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBP1UIPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBP1UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit]): PFNGLVERTEXATTRIBP1UIPROC = o
  extension (v: PFNGLVERTEXATTRIBP1UIPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBP1UIVPROC = CFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit]
object PFNGLVERTEXATTRIBP1UIVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBP1UIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBP1UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit]): PFNGLVERTEXATTRIBP1UIVPROC = o
  extension (v: PFNGLVERTEXATTRIBP1UIVPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBP2UIPROC = CFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit]
object PFNGLVERTEXATTRIBP2UIPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBP2UIPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBP2UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit]): PFNGLVERTEXATTRIBP2UIPROC = o
  extension (v: PFNGLVERTEXATTRIBP2UIPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBP2UIVPROC = CFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit]
object PFNGLVERTEXATTRIBP2UIVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBP2UIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBP2UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit]): PFNGLVERTEXATTRIBP2UIVPROC = o
  extension (v: PFNGLVERTEXATTRIBP2UIVPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBP3UIPROC = CFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit]
object PFNGLVERTEXATTRIBP3UIPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBP3UIPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBP3UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit]): PFNGLVERTEXATTRIBP3UIPROC = o
  extension (v: PFNGLVERTEXATTRIBP3UIPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBP3UIVPROC = CFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit]
object PFNGLVERTEXATTRIBP3UIVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBP3UIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBP3UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit]): PFNGLVERTEXATTRIBP3UIVPROC = o
  extension (v: PFNGLVERTEXATTRIBP3UIVPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBP4UIPROC = CFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit]
object PFNGLVERTEXATTRIBP4UIPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBP4UIPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBP4UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit]): PFNGLVERTEXATTRIBP4UIPROC = o
  extension (v: PFNGLVERTEXATTRIBP4UIPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLboolean, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBP4UIVPROC = CFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit]
object PFNGLVERTEXATTRIBP4UIVPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBP4UIVPROC] = Tag.materializeCFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBP4UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit]): PFNGLVERTEXATTRIBP4UIVPROC = o
  extension (v: PFNGLVERTEXATTRIBP4UIVPROC)
    inline def value: CFuncPtr4[GLuint, GLenum, GLboolean, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXATTRIBPOINTERPROC = CFuncPtr6[GLuint, GLint, GLenum, GLboolean, GLsizei, Ptr[Byte], Unit]
object PFNGLVERTEXATTRIBPOINTERPROC:
  given _tag: Tag[PFNGLVERTEXATTRIBPOINTERPROC] = Tag.materializeCFuncPtr6[GLuint, GLint, GLenum, GLboolean, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXATTRIBPOINTERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[GLuint, GLint, GLenum, GLboolean, GLsizei, Ptr[Byte], Unit]): PFNGLVERTEXATTRIBPOINTERPROC = o
  extension (v: PFNGLVERTEXATTRIBPOINTERPROC)
    inline def value: CFuncPtr6[GLuint, GLint, GLenum, GLboolean, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXBINDINGDIVISORPROC = CFuncPtr2[GLuint, GLuint, Unit]
object PFNGLVERTEXBINDINGDIVISORPROC:
  given _tag: Tag[PFNGLVERTEXBINDINGDIVISORPROC] = Tag.materializeCFuncPtr2[GLuint, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXBINDINGDIVISORPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, GLuint, Unit]): PFNGLVERTEXBINDINGDIVISORPROC = o
  extension (v: PFNGLVERTEXBINDINGDIVISORPROC)
    inline def value: CFuncPtr2[GLuint, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXP2UIPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLVERTEXP2UIPROC:
  given _tag: Tag[PFNGLVERTEXP2UIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXP2UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLVERTEXP2UIPROC = o
  extension (v: PFNGLVERTEXP2UIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXP2UIVPROC = CFuncPtr2[GLenum, Ptr[GLuint], Unit]
object PFNGLVERTEXP2UIVPROC:
  given _tag: Tag[PFNGLVERTEXP2UIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXP2UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLuint], Unit]): PFNGLVERTEXP2UIVPROC = o
  extension (v: PFNGLVERTEXP2UIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXP3UIPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLVERTEXP3UIPROC:
  given _tag: Tag[PFNGLVERTEXP3UIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXP3UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLVERTEXP3UIPROC = o
  extension (v: PFNGLVERTEXP3UIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXP3UIVPROC = CFuncPtr2[GLenum, Ptr[GLuint], Unit]
object PFNGLVERTEXP3UIVPROC:
  given _tag: Tag[PFNGLVERTEXP3UIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXP3UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLuint], Unit]): PFNGLVERTEXP3UIVPROC = o
  extension (v: PFNGLVERTEXP3UIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXP4UIPROC = CFuncPtr2[GLenum, GLuint, Unit]
object PFNGLVERTEXP4UIPROC:
  given _tag: Tag[PFNGLVERTEXP4UIPROC] = Tag.materializeCFuncPtr2[GLenum, GLuint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXP4UIPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, GLuint, Unit]): PFNGLVERTEXP4UIPROC = o
  extension (v: PFNGLVERTEXP4UIPROC)
    inline def value: CFuncPtr2[GLenum, GLuint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXP4UIVPROC = CFuncPtr2[GLenum, Ptr[GLuint], Unit]
object PFNGLVERTEXP4UIVPROC:
  given _tag: Tag[PFNGLVERTEXP4UIVPROC] = Tag.materializeCFuncPtr2[GLenum, Ptr[GLuint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXP4UIVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLenum, Ptr[GLuint], Unit]): PFNGLVERTEXP4UIVPROC = o
  extension (v: PFNGLVERTEXP4UIVPROC)
    inline def value: CFuncPtr2[GLenum, Ptr[GLuint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVERTEXPOINTERPROC = CFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit]
object PFNGLVERTEXPOINTERPROC:
  given _tag: Tag[PFNGLVERTEXPOINTERPROC] = Tag.materializeCFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVERTEXPOINTERPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit]): PFNGLVERTEXPOINTERPROC = o
  extension (v: PFNGLVERTEXPOINTERPROC)
    inline def value: CFuncPtr4[GLint, GLenum, GLsizei, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVIEWPORTARRAYVPROC = CFuncPtr3[GLuint, GLsizei, Ptr[GLfloat], Unit]
object PFNGLVIEWPORTARRAYVPROC:
  given _tag: Tag[PFNGLVIEWPORTARRAYVPROC] = Tag.materializeCFuncPtr3[GLuint, GLsizei, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVIEWPORTARRAYVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLuint, GLsizei, Ptr[GLfloat], Unit]): PFNGLVIEWPORTARRAYVPROC = o
  extension (v: PFNGLVIEWPORTARRAYVPROC)
    inline def value: CFuncPtr3[GLuint, GLsizei, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVIEWPORTINDEXEDFPROC = CFuncPtr5[GLuint, GLfloat, GLfloat, GLfloat, GLfloat, Unit]
object PFNGLVIEWPORTINDEXEDFPROC:
  given _tag: Tag[PFNGLVIEWPORTINDEXEDFPROC] = Tag.materializeCFuncPtr5[GLuint, GLfloat, GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVIEWPORTINDEXEDFPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GLuint, GLfloat, GLfloat, GLfloat, GLfloat, Unit]): PFNGLVIEWPORTINDEXEDFPROC = o
  extension (v: PFNGLVIEWPORTINDEXEDFPROC)
    inline def value: CFuncPtr5[GLuint, GLfloat, GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVIEWPORTINDEXEDFVPROC = CFuncPtr2[GLuint, Ptr[GLfloat], Unit]
object PFNGLVIEWPORTINDEXEDFVPROC:
  given _tag: Tag[PFNGLVIEWPORTINDEXEDFVPROC] = Tag.materializeCFuncPtr2[GLuint, Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVIEWPORTINDEXEDFVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLuint, Ptr[GLfloat], Unit]): PFNGLVIEWPORTINDEXEDFVPROC = o
  extension (v: PFNGLVIEWPORTINDEXEDFVPROC)
    inline def value: CFuncPtr2[GLuint, Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLVIEWPORTPROC = CFuncPtr4[GLint, GLint, GLsizei, GLsizei, Unit]
object PFNGLVIEWPORTPROC:
  given _tag: Tag[PFNGLVIEWPORTPROC] = Tag.materializeCFuncPtr4[GLint, GLint, GLsizei, GLsizei, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLVIEWPORTPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLint, GLint, GLsizei, GLsizei, Unit]): PFNGLVIEWPORTPROC = o
  extension (v: PFNGLVIEWPORTPROC)
    inline def value: CFuncPtr4[GLint, GLint, GLsizei, GLsizei, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWAITSYNCPROC = CFuncPtr3[GLsync, GLbitfield, GLuint64, Unit]
object PFNGLWAITSYNCPROC:
  given _tag: Tag[PFNGLWAITSYNCPROC] = Tag.materializeCFuncPtr3[GLsync, GLbitfield, GLuint64, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWAITSYNCPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLsync, GLbitfield, GLuint64, Unit]): PFNGLWAITSYNCPROC = o
  extension (v: PFNGLWAITSYNCPROC)
    inline def value: CFuncPtr3[GLsync, GLbitfield, GLuint64, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS2DPROC = CFuncPtr2[GLdouble, GLdouble, Unit]
object PFNGLWINDOWPOS2DPROC:
  given _tag: Tag[PFNGLWINDOWPOS2DPROC] = Tag.materializeCFuncPtr2[GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS2DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLdouble, GLdouble, Unit]): PFNGLWINDOWPOS2DPROC = o
  extension (v: PFNGLWINDOWPOS2DPROC)
    inline def value: CFuncPtr2[GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS2DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLWINDOWPOS2DVPROC:
  given _tag: Tag[PFNGLWINDOWPOS2DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS2DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLWINDOWPOS2DVPROC = o
  extension (v: PFNGLWINDOWPOS2DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS2FPROC = CFuncPtr2[GLfloat, GLfloat, Unit]
object PFNGLWINDOWPOS2FPROC:
  given _tag: Tag[PFNGLWINDOWPOS2FPROC] = Tag.materializeCFuncPtr2[GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS2FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLfloat, GLfloat, Unit]): PFNGLWINDOWPOS2FPROC = o
  extension (v: PFNGLWINDOWPOS2FPROC)
    inline def value: CFuncPtr2[GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS2FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLWINDOWPOS2FVPROC:
  given _tag: Tag[PFNGLWINDOWPOS2FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS2FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLWINDOWPOS2FVPROC = o
  extension (v: PFNGLWINDOWPOS2FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS2IPROC = CFuncPtr2[GLint, GLint, Unit]
object PFNGLWINDOWPOS2IPROC:
  given _tag: Tag[PFNGLWINDOWPOS2IPROC] = Tag.materializeCFuncPtr2[GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS2IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLint, GLint, Unit]): PFNGLWINDOWPOS2IPROC = o
  extension (v: PFNGLWINDOWPOS2IPROC)
    inline def value: CFuncPtr2[GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS2IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLWINDOWPOS2IVPROC:
  given _tag: Tag[PFNGLWINDOWPOS2IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS2IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLWINDOWPOS2IVPROC = o
  extension (v: PFNGLWINDOWPOS2IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS2SPROC = CFuncPtr2[GLshort, GLshort, Unit]
object PFNGLWINDOWPOS2SPROC:
  given _tag: Tag[PFNGLWINDOWPOS2SPROC] = Tag.materializeCFuncPtr2[GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS2SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[GLshort, GLshort, Unit]): PFNGLWINDOWPOS2SPROC = o
  extension (v: PFNGLWINDOWPOS2SPROC)
    inline def value: CFuncPtr2[GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS2SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLWINDOWPOS2SVPROC:
  given _tag: Tag[PFNGLWINDOWPOS2SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS2SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLWINDOWPOS2SVPROC = o
  extension (v: PFNGLWINDOWPOS2SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS3DPROC = CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
object PFNGLWINDOWPOS3DPROC:
  given _tag: Tag[PFNGLWINDOWPOS3DPROC] = Tag.materializeCFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS3DPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit]): PFNGLWINDOWPOS3DPROC = o
  extension (v: PFNGLWINDOWPOS3DPROC)
    inline def value: CFuncPtr3[GLdouble, GLdouble, GLdouble, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS3DVPROC = CFuncPtr1[Ptr[GLdouble], Unit]
object PFNGLWINDOWPOS3DVPROC:
  given _tag: Tag[PFNGLWINDOWPOS3DVPROC] = Tag.materializeCFuncPtr1[Ptr[GLdouble], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS3DVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLdouble], Unit]): PFNGLWINDOWPOS3DVPROC = o
  extension (v: PFNGLWINDOWPOS3DVPROC)
    inline def value: CFuncPtr1[Ptr[GLdouble], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS3FPROC = CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
object PFNGLWINDOWPOS3FPROC:
  given _tag: Tag[PFNGLWINDOWPOS3FPROC] = Tag.materializeCFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS3FPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit]): PFNGLWINDOWPOS3FPROC = o
  extension (v: PFNGLWINDOWPOS3FPROC)
    inline def value: CFuncPtr3[GLfloat, GLfloat, GLfloat, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS3FVPROC = CFuncPtr1[Ptr[GLfloat], Unit]
object PFNGLWINDOWPOS3FVPROC:
  given _tag: Tag[PFNGLWINDOWPOS3FVPROC] = Tag.materializeCFuncPtr1[Ptr[GLfloat], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS3FVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLfloat], Unit]): PFNGLWINDOWPOS3FVPROC = o
  extension (v: PFNGLWINDOWPOS3FVPROC)
    inline def value: CFuncPtr1[Ptr[GLfloat], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS3IPROC = CFuncPtr3[GLint, GLint, GLint, Unit]
object PFNGLWINDOWPOS3IPROC:
  given _tag: Tag[PFNGLWINDOWPOS3IPROC] = Tag.materializeCFuncPtr3[GLint, GLint, GLint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS3IPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLint, GLint, GLint, Unit]): PFNGLWINDOWPOS3IPROC = o
  extension (v: PFNGLWINDOWPOS3IPROC)
    inline def value: CFuncPtr3[GLint, GLint, GLint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS3IVPROC = CFuncPtr1[Ptr[GLint], Unit]
object PFNGLWINDOWPOS3IVPROC:
  given _tag: Tag[PFNGLWINDOWPOS3IVPROC] = Tag.materializeCFuncPtr1[Ptr[GLint], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS3IVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLint], Unit]): PFNGLWINDOWPOS3IVPROC = o
  extension (v: PFNGLWINDOWPOS3IVPROC)
    inline def value: CFuncPtr1[Ptr[GLint], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS3SPROC = CFuncPtr3[GLshort, GLshort, GLshort, Unit]
object PFNGLWINDOWPOS3SPROC:
  given _tag: Tag[PFNGLWINDOWPOS3SPROC] = Tag.materializeCFuncPtr3[GLshort, GLshort, GLshort, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS3SPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GLshort, GLshort, GLshort, Unit]): PFNGLWINDOWPOS3SPROC = o
  extension (v: PFNGLWINDOWPOS3SPROC)
    inline def value: CFuncPtr3[GLshort, GLshort, GLshort, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type PFNGLWINDOWPOS3SVPROC = CFuncPtr1[Ptr[GLshort], Unit]
object PFNGLWINDOWPOS3SVPROC:
  given _tag: Tag[PFNGLWINDOWPOS3SVPROC] = Tag.materializeCFuncPtr1[Ptr[GLshort], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PFNGLWINDOWPOS3SVPROC = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLshort], Unit]): PFNGLWINDOWPOS3SVPROC = o
  extension (v: PFNGLWINDOWPOS3SVPROC)
    inline def value: CFuncPtr1[Ptr[GLshort], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type int32_t = scala.scalanative.unsafe.CInt
object int32_t:
  val _tag: Tag[int32_t] = summon[Tag[scala.scalanative.unsafe.CInt]]
  inline def apply(inline o: scala.scalanative.unsafe.CInt): int32_t = o
  extension (v: int32_t)
    inline def value: scala.scalanative.unsafe.CInt = v

type int64_t = scala.Long
object int64_t:
  val _tag: Tag[int64_t] = summon[Tag[scala.Long]]
  inline def apply(inline o: scala.Long): int64_t = o
  extension (v: int64_t)
    inline def value: scala.Long = v

type intptr_t = CLongLong
object intptr_t:
  given _tag: Tag[intptr_t] = Tag.Long
  inline def apply(inline o: CLongLong): intptr_t = o
  extension (v: intptr_t)
    inline def value: CLongLong = v

type khronos_float_t = Float
object khronos_float_t:
  given _tag: Tag[khronos_float_t] = Tag.Float
  inline def apply(inline o: Float): khronos_float_t = o
  extension (v: khronos_float_t)
    inline def value: Float = v

type khronos_int16_t = CShort
object khronos_int16_t:
  given _tag: Tag[khronos_int16_t] = Tag.Short
  inline def apply(inline o: CShort): khronos_int16_t = o
  extension (v: khronos_int16_t)
    inline def value: CShort = v

type khronos_int32_t = int32_t
object khronos_int32_t:
  given _tag: Tag[khronos_int32_t] = int32_t._tag
  inline def apply(inline o: int32_t): khronos_int32_t = o
  extension (v: khronos_int32_t)
    inline def value: int32_t = v

type khronos_int64_t = int64_t
object khronos_int64_t:
  given _tag: Tag[khronos_int64_t] = int64_t._tag
  inline def apply(inline o: int64_t): khronos_int64_t = o
  extension (v: khronos_int64_t)
    inline def value: int64_t = v

type khronos_int8_t = CChar
object khronos_int8_t:
  given _tag: Tag[khronos_int8_t] = Tag.Byte
  inline def apply(inline o: CChar): khronos_int8_t = o
  extension (v: khronos_int8_t)
    inline def value: CChar = v

type khronos_intptr_t = intptr_t
object khronos_intptr_t:
  given _tag: Tag[khronos_intptr_t] = intptr_t._tag
  inline def apply(inline o: intptr_t): khronos_intptr_t = o
  extension (v: khronos_intptr_t)
    inline def value: intptr_t = v

type khronos_ssize_t = CLongLong
object khronos_ssize_t:
  given _tag: Tag[khronos_ssize_t] = Tag.Long
  inline def apply(inline o: CLongLong): khronos_ssize_t = o
  extension (v: khronos_ssize_t)
    inline def value: CLongLong = v

type khronos_stime_nanoseconds_t = khronos_int64_t
object khronos_stime_nanoseconds_t:
  given _tag: Tag[khronos_stime_nanoseconds_t] = khronos_int64_t._tag
  inline def apply(inline o: khronos_int64_t): khronos_stime_nanoseconds_t = o
  extension (v: khronos_stime_nanoseconds_t)
    inline def value: khronos_int64_t = v

type khronos_uint16_t = CUnsignedShort
object khronos_uint16_t:
  given _tag: Tag[khronos_uint16_t] = Tag.UShort
  inline def apply(inline o: CUnsignedShort): khronos_uint16_t = o
  extension (v: khronos_uint16_t)
    inline def value: CUnsignedShort = v

type khronos_uint32_t = uint32_t
object khronos_uint32_t:
  given _tag: Tag[khronos_uint32_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): khronos_uint32_t = o
  extension (v: khronos_uint32_t)
    inline def value: uint32_t = v

type khronos_uint64_t = uint64_t
object khronos_uint64_t:
  given _tag: Tag[khronos_uint64_t] = uint64_t._tag
  inline def apply(inline o: uint64_t): khronos_uint64_t = o
  extension (v: khronos_uint64_t)
    inline def value: uint64_t = v

type khronos_uint8_t = CUnsignedChar
object khronos_uint8_t:
  given _tag: Tag[khronos_uint8_t] = Tag.UByte
  inline def apply(inline o: CUnsignedChar): khronos_uint8_t = o
  extension (v: khronos_uint8_t)
    inline def value: CUnsignedChar = v

type khronos_uintptr_t = uintptr_t
object khronos_uintptr_t:
  given _tag: Tag[khronos_uintptr_t] = uintptr_t._tag
  inline def apply(inline o: uintptr_t): khronos_uintptr_t = o
  extension (v: khronos_uintptr_t)
    inline def value: uintptr_t = v

type khronos_usize_t = CUnsignedLongLong
object khronos_usize_t:
  given _tag: Tag[khronos_usize_t] = Tag.ULong
  inline def apply(inline o: CUnsignedLongLong): khronos_usize_t = o
  extension (v: khronos_usize_t)
    inline def value: CUnsignedLongLong = v

type khronos_utime_nanoseconds_t = khronos_uint64_t
object khronos_utime_nanoseconds_t:
  given _tag: Tag[khronos_utime_nanoseconds_t] = khronos_uint64_t._tag
  inline def apply(inline o: khronos_uint64_t): khronos_utime_nanoseconds_t = o
  extension (v: khronos_utime_nanoseconds_t)
    inline def value: khronos_uint64_t = v

type uint32_t = scala.scalanative.unsigned.UInt
object uint32_t:
  val _tag: Tag[uint32_t] = summon[Tag[scala.scalanative.unsigned.UInt]]
  inline def apply(inline o: scala.scalanative.unsigned.UInt): uint32_t = o
  extension (v: uint32_t)
    inline def value: scala.scalanative.unsigned.UInt = v

type uint64_t = scala.scalanative.unsigned.ULong
object uint64_t:
  val _tag: Tag[uint64_t] = summon[Tag[scala.scalanative.unsigned.ULong]]
  inline def apply(inline o: scala.scalanative.unsigned.ULong): uint64_t = o
  extension (v: uint64_t)
    inline def value: scala.scalanative.unsigned.ULong = v

type uintptr_t = CUnsignedLongLong
object uintptr_t:
  given _tag: Tag[uintptr_t] = Tag.ULong
  inline def apply(inline o: CUnsignedLongLong): uintptr_t = o
  extension (v: uintptr_t)
    inline def value: CUnsignedLongLong = v