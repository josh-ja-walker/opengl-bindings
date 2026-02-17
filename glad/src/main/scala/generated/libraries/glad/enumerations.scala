package glad

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

private[glad] trait _BindgenEnumCInt[T](using eq: T =:= CInt):
  given Tag[T] = Tag.Int.asInstanceOf[Tag[T]]
  extension (inline t: T)
    inline def value: CInt = eq.apply(t)
    inline def int: CInt = eq.apply(t).toInt
opaque type khronos_boolean_enum_t = CInt
object khronos_boolean_enum_t extends _BindgenEnumCInt[khronos_boolean_enum_t]:
  given _tag: Tag[khronos_boolean_enum_t] = Tag.Int
  inline def define(inline a: CInt): khronos_boolean_enum_t = a
  val KHRONOS_FALSE = define(0)
  val KHRONOS_TRUE = define(1)
  val KHRONOS_BOOLEAN_ENUM_FORCE_SIZE = define(2147483647)
  def getName(value: khronos_boolean_enum_t): Option[String] =
    value match
      case `KHRONOS_FALSE` => Some("KHRONOS_FALSE")
      case `KHRONOS_TRUE` => Some("KHRONOS_TRUE")
      case `KHRONOS_BOOLEAN_ENUM_FORCE_SIZE` => Some("KHRONOS_BOOLEAN_ENUM_FORCE_SIZE")
      case _ => _root_.scala.None
  extension (a: khronos_boolean_enum_t)
    inline def &(b: khronos_boolean_enum_t): khronos_boolean_enum_t = a & b
    inline def |(b: khronos_boolean_enum_t): khronos_boolean_enum_t = a | b
    inline def is(b: khronos_boolean_enum_t): Boolean = (a & b) == b