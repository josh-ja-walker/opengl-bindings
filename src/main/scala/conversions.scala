package conversions

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*


object UBytePtr {
    extension (ptr: Ptr[UByte]) {
        def toCharPtr: Ptr[CChar] = ptr.asInstanceOf[Ptr[CChar]]
    }
}