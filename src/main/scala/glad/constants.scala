package glad

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

@name("CONST_GL_RENDERER") def GL_RENDERER: GLenum = extern
@name("CONST_GL_VERSION") def GL_VERSION: GLenum = extern
@name("CONST_GL_VERTEX_SHADER") def GL_VERTEX_SHADER: GLenum = extern
@name("CONST_GL_FRAGMENT_SHADER") def GL_FRAGMENT_SHADER: GLenum = extern
@name("CONST_GL_ARRAY_BUFFER") def GL_ARRAY_BUFFER: GLenum = extern
@name("CONST_GL_STATIC_DRAW") def GL_STATIC_DRAW: GLenum = extern
@name("CONST_GL_FLOAT") def GL_FLOAT: GLenum = extern
@name("CONST_GL_DEPTH_BUFFER_BIT") def GL_DEPTH_BUFFER_BIT: GLbitfield = extern
@name("CONST_GL_COLOR_BUFFER_BIT") def GL_COLOR_BUFFER_BIT: GLbitfield = extern
@name("CONST_GL_TRIANGLES") def GL_TRIANGLES: GLenum = extern
@name("CONST_GL_TRUE") def GL_TRUE: GLboolean = extern
@name("CONST_GL_FALSE") def GL_FALSE: GLboolean = extern