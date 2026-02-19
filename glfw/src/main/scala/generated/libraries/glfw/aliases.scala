package opengl.bindings.glfw

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * The function pointer type for memory allocation callbacks.
*/
type GLFWallocatefun = CFuncPtr2[size_t, Ptr[Byte], Ptr[Byte]]
object GLFWallocatefun:
  given _tag: Tag[GLFWallocatefun] = Tag.materializeCFuncPtr2[size_t, Ptr[Byte], Ptr[Byte]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWallocatefun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[size_t, Ptr[Byte], Ptr[Byte]]): GLFWallocatefun = o
  extension (v: GLFWallocatefun)
    inline def value: CFuncPtr2[size_t, Ptr[Byte], Ptr[Byte]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for Unicode character callbacks.
*/
type GLFWcharfun = CFuncPtr2[Ptr[GLFWwindow], CUnsignedInt, Unit]
object GLFWcharfun:
  given _tag: Tag[GLFWcharfun] = Tag.materializeCFuncPtr2[Ptr[GLFWwindow], CUnsignedInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWcharfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GLFWwindow], CUnsignedInt, Unit]): GLFWcharfun = o
  extension (v: GLFWcharfun)
    inline def value: CFuncPtr2[Ptr[GLFWwindow], CUnsignedInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for Unicode character with modifiers callbacks.
*/
type GLFWcharmodsfun = CFuncPtr3[Ptr[GLFWwindow], CUnsignedInt, CInt, Unit]
object GLFWcharmodsfun:
  given _tag: Tag[GLFWcharmodsfun] = Tag.materializeCFuncPtr3[Ptr[GLFWwindow], CUnsignedInt, CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWcharmodsfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GLFWwindow], CUnsignedInt, CInt, Unit]): GLFWcharmodsfun = o
  extension (v: GLFWcharmodsfun)
    inline def value: CFuncPtr3[Ptr[GLFWwindow], CUnsignedInt, CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for cursor enter/leave callbacks.
*/
type GLFWcursorenterfun = CFuncPtr2[Ptr[GLFWwindow], CInt, Unit]
object GLFWcursorenterfun:
  given _tag: Tag[GLFWcursorenterfun] = Tag.materializeCFuncPtr2[Ptr[GLFWwindow], CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWcursorenterfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GLFWwindow], CInt, Unit]): GLFWcursorenterfun = o
  extension (v: GLFWcursorenterfun)
    inline def value: CFuncPtr2[Ptr[GLFWwindow], CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for cursor position callbacks.
*/
type GLFWcursorposfun = CFuncPtr3[Ptr[GLFWwindow], Double, Double, Unit]
object GLFWcursorposfun:
  given _tag: Tag[GLFWcursorposfun] = Tag.materializeCFuncPtr3[Ptr[GLFWwindow], Double, Double, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWcursorposfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GLFWwindow], Double, Double, Unit]): GLFWcursorposfun = o
  extension (v: GLFWcursorposfun)
    inline def value: CFuncPtr3[Ptr[GLFWwindow], Double, Double, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for memory deallocation callbacks.
*/
type GLFWdeallocatefun = CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit]
object GLFWdeallocatefun:
  given _tag: Tag[GLFWdeallocatefun] = Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWdeallocatefun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit]): GLFWdeallocatefun = o
  extension (v: GLFWdeallocatefun)
    inline def value: CFuncPtr2[Ptr[Byte], Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for path drop callbacks.
*/
type GLFWdropfun = CFuncPtr3[Ptr[GLFWwindow], CInt, Ptr[CString], Unit]
object GLFWdropfun:
  given _tag: Tag[GLFWdropfun] = Tag.materializeCFuncPtr3[Ptr[GLFWwindow], CInt, Ptr[CString], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWdropfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GLFWwindow], CInt, Ptr[CString], Unit]): GLFWdropfun = o
  extension (v: GLFWdropfun)
    inline def value: CFuncPtr3[Ptr[GLFWwindow], CInt, Ptr[CString], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for error callbacks.
*/
type GLFWerrorfun = CFuncPtr2[CInt, CString, Unit]
object GLFWerrorfun:
  given _tag: Tag[GLFWerrorfun] = Tag.materializeCFuncPtr2[CInt, CString, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWerrorfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[CInt, CString, Unit]): GLFWerrorfun = o
  extension (v: GLFWerrorfun)
    inline def value: CFuncPtr2[CInt, CString, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for framebuffer size callbacks.
*/
type GLFWframebuffersizefun = CFuncPtr3[Ptr[GLFWwindow], CInt, CInt, Unit]
object GLFWframebuffersizefun:
  given _tag: Tag[GLFWframebuffersizefun] = Tag.materializeCFuncPtr3[Ptr[GLFWwindow], CInt, CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWframebuffersizefun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GLFWwindow], CInt, CInt, Unit]): GLFWframebuffersizefun = o
  extension (v: GLFWframebuffersizefun)
    inline def value: CFuncPtr3[Ptr[GLFWwindow], CInt, CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * Client API function pointer type.
*/
type GLFWglproc = CFuncPtr0[Unit]
object GLFWglproc:
  given _tag: Tag[GLFWglproc] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWglproc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): GLFWglproc = o
  extension (v: GLFWglproc)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for joystick configuration callbacks.
*/
type GLFWjoystickfun = CFuncPtr2[CInt, CInt, Unit]
object GLFWjoystickfun:
  given _tag: Tag[GLFWjoystickfun] = Tag.materializeCFuncPtr2[CInt, CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWjoystickfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[CInt, CInt, Unit]): GLFWjoystickfun = o
  extension (v: GLFWjoystickfun)
    inline def value: CFuncPtr2[CInt, CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for keyboard key callbacks.
*/
type GLFWkeyfun = CFuncPtr5[Ptr[GLFWwindow], CInt, CInt, CInt, CInt, Unit]
object GLFWkeyfun:
  given _tag: Tag[GLFWkeyfun] = Tag.materializeCFuncPtr5[Ptr[GLFWwindow], CInt, CInt, CInt, CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWkeyfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GLFWwindow], CInt, CInt, CInt, CInt, Unit]): GLFWkeyfun = o
  extension (v: GLFWkeyfun)
    inline def value: CFuncPtr5[Ptr[GLFWwindow], CInt, CInt, CInt, CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for monitor configuration callbacks.
*/
type GLFWmonitorfun = CFuncPtr2[Ptr[GLFWmonitor], CInt, Unit]
object GLFWmonitorfun:
  given _tag: Tag[GLFWmonitorfun] = Tag.materializeCFuncPtr2[Ptr[GLFWmonitor], CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWmonitorfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GLFWmonitor], CInt, Unit]): GLFWmonitorfun = o
  extension (v: GLFWmonitorfun)
    inline def value: CFuncPtr2[Ptr[GLFWmonitor], CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for mouse button callbacks.
*/
type GLFWmousebuttonfun = CFuncPtr4[Ptr[GLFWwindow], CInt, CInt, CInt, Unit]
object GLFWmousebuttonfun:
  given _tag: Tag[GLFWmousebuttonfun] = Tag.materializeCFuncPtr4[Ptr[GLFWwindow], CInt, CInt, CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWmousebuttonfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GLFWwindow], CInt, CInt, CInt, Unit]): GLFWmousebuttonfun = o
  extension (v: GLFWmousebuttonfun)
    inline def value: CFuncPtr4[Ptr[GLFWwindow], CInt, CInt, CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for memory reallocation callbacks.
*/
type GLFWreallocatefun = CFuncPtr3[Ptr[Byte], size_t, Ptr[Byte], Ptr[Byte]]
object GLFWreallocatefun:
  given _tag: Tag[GLFWreallocatefun] = Tag.materializeCFuncPtr3[Ptr[Byte], size_t, Ptr[Byte], Ptr[Byte]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWreallocatefun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[Byte], size_t, Ptr[Byte], Ptr[Byte]]): GLFWreallocatefun = o
  extension (v: GLFWreallocatefun)
    inline def value: CFuncPtr3[Ptr[Byte], size_t, Ptr[Byte], Ptr[Byte]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for scroll callbacks.
*/
type GLFWscrollfun = CFuncPtr3[Ptr[GLFWwindow], Double, Double, Unit]
object GLFWscrollfun:
  given _tag: Tag[GLFWscrollfun] = Tag.materializeCFuncPtr3[Ptr[GLFWwindow], Double, Double, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWscrollfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GLFWwindow], Double, Double, Unit]): GLFWscrollfun = o
  extension (v: GLFWscrollfun)
    inline def value: CFuncPtr3[Ptr[GLFWwindow], Double, Double, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * Vulkan API function pointer type.
*/
type GLFWvkproc = CFuncPtr0[Unit]
object GLFWvkproc:
  given _tag: Tag[GLFWvkproc] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWvkproc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): GLFWvkproc = o
  extension (v: GLFWvkproc)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for window close callbacks.
*/
type GLFWwindowclosefun = CFuncPtr1[Ptr[GLFWwindow], Unit]
object GLFWwindowclosefun:
  given _tag: Tag[GLFWwindowclosefun] = Tag.materializeCFuncPtr1[Ptr[GLFWwindow], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWwindowclosefun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLFWwindow], Unit]): GLFWwindowclosefun = o
  extension (v: GLFWwindowclosefun)
    inline def value: CFuncPtr1[Ptr[GLFWwindow], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for window content scale callbacks.
*/
type GLFWwindowcontentscalefun = CFuncPtr3[Ptr[GLFWwindow], Float, Float, Unit]
object GLFWwindowcontentscalefun:
  given _tag: Tag[GLFWwindowcontentscalefun] = Tag.materializeCFuncPtr3[Ptr[GLFWwindow], Float, Float, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWwindowcontentscalefun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GLFWwindow], Float, Float, Unit]): GLFWwindowcontentscalefun = o
  extension (v: GLFWwindowcontentscalefun)
    inline def value: CFuncPtr3[Ptr[GLFWwindow], Float, Float, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for window focus callbacks.
*/
type GLFWwindowfocusfun = CFuncPtr2[Ptr[GLFWwindow], CInt, Unit]
object GLFWwindowfocusfun:
  given _tag: Tag[GLFWwindowfocusfun] = Tag.materializeCFuncPtr2[Ptr[GLFWwindow], CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWwindowfocusfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GLFWwindow], CInt, Unit]): GLFWwindowfocusfun = o
  extension (v: GLFWwindowfocusfun)
    inline def value: CFuncPtr2[Ptr[GLFWwindow], CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for window iconify callbacks.
*/
type GLFWwindowiconifyfun = CFuncPtr2[Ptr[GLFWwindow], CInt, Unit]
object GLFWwindowiconifyfun:
  given _tag: Tag[GLFWwindowiconifyfun] = Tag.materializeCFuncPtr2[Ptr[GLFWwindow], CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWwindowiconifyfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GLFWwindow], CInt, Unit]): GLFWwindowiconifyfun = o
  extension (v: GLFWwindowiconifyfun)
    inline def value: CFuncPtr2[Ptr[GLFWwindow], CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for window maximize callbacks.
*/
type GLFWwindowmaximizefun = CFuncPtr2[Ptr[GLFWwindow], CInt, Unit]
object GLFWwindowmaximizefun:
  given _tag: Tag[GLFWwindowmaximizefun] = Tag.materializeCFuncPtr2[Ptr[GLFWwindow], CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWwindowmaximizefun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GLFWwindow], CInt, Unit]): GLFWwindowmaximizefun = o
  extension (v: GLFWwindowmaximizefun)
    inline def value: CFuncPtr2[Ptr[GLFWwindow], CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for window position callbacks.
*/
type GLFWwindowposfun = CFuncPtr3[Ptr[GLFWwindow], CInt, CInt, Unit]
object GLFWwindowposfun:
  given _tag: Tag[GLFWwindowposfun] = Tag.materializeCFuncPtr3[Ptr[GLFWwindow], CInt, CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWwindowposfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GLFWwindow], CInt, CInt, Unit]): GLFWwindowposfun = o
  extension (v: GLFWwindowposfun)
    inline def value: CFuncPtr3[Ptr[GLFWwindow], CInt, CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for window content refresh callbacks.
*/
type GLFWwindowrefreshfun = CFuncPtr1[Ptr[GLFWwindow], Unit]
object GLFWwindowrefreshfun:
  given _tag: Tag[GLFWwindowrefreshfun] = Tag.materializeCFuncPtr1[Ptr[GLFWwindow], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWwindowrefreshfun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GLFWwindow], Unit]): GLFWwindowrefreshfun = o
  extension (v: GLFWwindowrefreshfun)
    inline def value: CFuncPtr1[Ptr[GLFWwindow], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

/**
 * The function pointer type for window size callbacks.
*/
type GLFWwindowsizefun = CFuncPtr3[Ptr[GLFWwindow], CInt, CInt, Unit]
object GLFWwindowsizefun:
  given _tag: Tag[GLFWwindowsizefun] = Tag.materializeCFuncPtr3[Ptr[GLFWwindow], CInt, CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLFWwindowsizefun = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GLFWwindow], CInt, CInt, Unit]): GLFWwindowsizefun = o
  extension (v: GLFWwindowsizefun)
    inline def value: CFuncPtr3[Ptr[GLFWwindow], CInt, CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)

type size_t = libc.stddef.size_t
object size_t:
  val _tag: Tag[size_t] = summon[Tag[libc.stddef.size_t]]
  inline def apply(inline o: libc.stddef.size_t): size_t = o
  extension (v: size_t)
    inline def value: libc.stddef.size_t = v

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