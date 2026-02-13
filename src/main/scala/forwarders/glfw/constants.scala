package glfw

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/* Load GLFW constant forwarder functions with extern */

@name("CONST_GLFW_CONTEXT_VERSION_MAJOR") def GLFW_CONTEXT_VERSION_MAJOR: Int = extern
@name("CONST_GLFW_CONTEXT_VERSION_MINOR") def GLFW_CONTEXT_VERSION_MINOR: Int = extern
@name("CONST_GLFW_OPENGL_FORWARD_COMPAT") def GLFW_OPENGL_FORWARD_COMPAT: Int = extern
@name("CONST_GLFW_OPENGL_PROFILE") def GLFW_OPENGL_PROFILE: Int = extern
@name("CONST_GLFW_OPENGL_CORE_PROFILE") def GLFW_OPENGL_CORE_PROFILE: Int = extern

@name("CONST_GLFW_TRUE") def GL_TRUE: Int = extern
@name("CONST_GLFW_FALSE") def GL_FALSE: Int = extern
