package glad

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/* Load GLAD constant forwarder functions with extern */

@name("CONST_GL_RENDERER") @extern def GL_RENDERER: GLenum = extern
@name("CONST_GL_VERSION") @extern def GL_VERSION: GLenum = extern
@name("CONST_GL_VERTEX_SHADER") @extern def GL_VERTEX_SHADER: GLenum = extern
@name("CONST_GL_FRAGMENT_SHADER") @extern def GL_FRAGMENT_SHADER: GLenum = extern
@name("CONST_GL_ARRAY_BUFFER") @extern def GL_ARRAY_BUFFER: GLenum = extern
@name("CONST_GL_STATIC_DRAW") @extern def GL_STATIC_DRAW: GLenum = extern
@name("CONST_GL_FLOAT") @extern def GL_FLOAT: GLenum = extern
@name("CONST_GL_DEPTH_BUFFER_BIT") @extern def GL_DEPTH_BUFFER_BIT: GLbitfield = extern
@name("CONST_GL_COLOR_BUFFER_BIT") @extern def GL_COLOR_BUFFER_BIT: GLbitfield = extern
@name("CONST_GL_TRIANGLES") @extern def GL_TRIANGLES: GLenum = extern

@name("CONST_GL_TRUE") @extern def GL_TRUE: GLboolean = extern
@name("CONST_GL_FALSE") @extern def GL_FALSE: GLboolean = extern
