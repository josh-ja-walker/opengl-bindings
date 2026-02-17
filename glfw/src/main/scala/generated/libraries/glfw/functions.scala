package glfw

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * Creates a custom cursor.
*/
@extern def glfwCreateCursor(image : Ptr[GLFWimage], xhot : CInt, yhot : CInt): Ptr[GLFWcursor] = extern

/**
 * Creates a cursor with a standard shape.
*/
@extern def glfwCreateStandardCursor(shape : CInt): Ptr[GLFWcursor] = extern

/**
 * Creates a window and its associated context.
*/
@extern def glfwCreateWindow(width : CInt, height : CInt, title : CString, monitor : Ptr[GLFWmonitor], share : Ptr[GLFWwindow]): Ptr[GLFWwindow] = extern

/**
 * Resets all window hints to their default values.
*/
@extern def glfwDefaultWindowHints(): Unit = extern

/**
 * Destroys a cursor.
*/
@extern def glfwDestroyCursor(cursor : Ptr[GLFWcursor]): Unit = extern

/**
 * Destroys the specified window and its context.
*/
@extern def glfwDestroyWindow(window : Ptr[GLFWwindow]): Unit = extern

/**
 * Returns whether the specified extension is available.
*/
@extern def glfwExtensionSupported(extension : CString): CInt = extern

/**
 * Brings the specified window to front and sets input focus.
*/
@extern def glfwFocusWindow(window : Ptr[GLFWwindow]): Unit = extern

/**
 * Returns the contents of the clipboard as a string.
*/
@extern def glfwGetClipboardString(window : Ptr[GLFWwindow]): CString = extern

/**
 * Returns the window whose context is current on the calling thread.
*/
@extern def glfwGetCurrentContext(): Ptr[GLFWwindow] = extern

/**
 * Retrieves the position of the cursor relative to the content area of the window.
*/
@extern def glfwGetCursorPos(window : Ptr[GLFWwindow], xpos : Ptr[Double], ypos : Ptr[Double]): Unit = extern

/**
 * Returns and clears the last error for the calling thread.
*/
@extern def glfwGetError(description : Ptr[CString]): CInt = extern

/**
 * Retrieves the size of the framebuffer of the specified window.
*/
@extern def glfwGetFramebufferSize(window : Ptr[GLFWwindow], width : Ptr[CInt], height : Ptr[CInt]): Unit = extern

/**
 * Returns the human-readable gamepad name for the specified joystick.
*/
@extern def glfwGetGamepadName(jid : CInt): CString = extern

/**
 * Retrieves the state of the specified joystick remapped as a gamepad.
*/
@extern def glfwGetGamepadState(jid : CInt, state : Ptr[GLFWgamepadstate]): CInt = extern

/**
 * Returns the current gamma ramp for the specified monitor.
*/
@extern def glfwGetGammaRamp(monitor : Ptr[GLFWmonitor]): Ptr[GLFWgammaramp] = extern

/**
 * Returns the value of an input option for the specified window.
*/
@extern def glfwGetInputMode(window : Ptr[GLFWwindow], mode : CInt): CInt = extern

/**
 * Returns the values of all axes of the specified joystick.
*/
@extern def glfwGetJoystickAxes(jid : CInt, count : Ptr[CInt]): Ptr[Float] = extern

/**
 * Returns the state of all buttons of the specified joystick.
*/
@extern def glfwGetJoystickButtons(jid : CInt, count : Ptr[CInt]): Ptr[CUnsignedChar] = extern

/**
 * Returns the SDL compatible GUID of the specified joystick.
*/
@extern def glfwGetJoystickGUID(jid : CInt): CString = extern

/**
 * Returns the state of all hats of the specified joystick.
*/
@extern def glfwGetJoystickHats(jid : CInt, count : Ptr[CInt]): Ptr[CUnsignedChar] = extern

/**
 * Returns the name of the specified joystick.
*/
@extern def glfwGetJoystickName(jid : CInt): CString = extern

/**
 * Returns the user pointer of the specified joystick.
*/
@extern def glfwGetJoystickUserPointer(jid : CInt): Ptr[Byte] = extern

/**
 * Returns the last reported state of a keyboard key for the specified window.
*/
@extern def glfwGetKey(window : Ptr[GLFWwindow], key : CInt): CInt = extern

/**
 * Returns the layout-specific name of the specified printable key.
*/
@extern def glfwGetKeyName(key : CInt, scancode : CInt): CString = extern

/**
 * Returns the platform-specific scancode of the specified key.
*/
@extern def glfwGetKeyScancode(key : CInt): CInt = extern

/**
 * Retrieves the content scale for the specified monitor.
*/
@extern def glfwGetMonitorContentScale(monitor : Ptr[GLFWmonitor], xscale : Ptr[Float], yscale : Ptr[Float]): Unit = extern

/**
 * Returns the name of the specified monitor.
*/
@extern def glfwGetMonitorName(monitor : Ptr[GLFWmonitor]): CString = extern

/**
 * Returns the physical size of the monitor.
*/
@extern def glfwGetMonitorPhysicalSize(monitor : Ptr[GLFWmonitor], widthMM : Ptr[CInt], heightMM : Ptr[CInt]): Unit = extern

/**
 * Returns the position of the monitor's viewport on the virtual screen.
*/
@extern def glfwGetMonitorPos(monitor : Ptr[GLFWmonitor], xpos : Ptr[CInt], ypos : Ptr[CInt]): Unit = extern

/**
 * Returns the user pointer of the specified monitor.
*/
@extern def glfwGetMonitorUserPointer(monitor : Ptr[GLFWmonitor]): Ptr[Byte] = extern

/**
 * Retrieves the work area of the monitor.
*/
@extern def glfwGetMonitorWorkarea(monitor : Ptr[GLFWmonitor], xpos : Ptr[CInt], ypos : Ptr[CInt], width : Ptr[CInt], height : Ptr[CInt]): Unit = extern

/**
 * Returns the currently connected monitors.
*/
@extern def glfwGetMonitors(count : Ptr[CInt]): Ptr[Ptr[GLFWmonitor]] = extern

/**
 * Returns the last reported state of a mouse button for the specified window.
*/
@extern def glfwGetMouseButton(window : Ptr[GLFWwindow], button : CInt): CInt = extern

/**
 * Returns the currently selected platform.
*/
@extern def glfwGetPlatform(): CInt = extern

/**
 * Returns the primary monitor.
*/
@extern def glfwGetPrimaryMonitor(): Ptr[GLFWmonitor] = extern

/**
 * Returns the address of the specified function for the current context.
*/
@extern def glfwGetProcAddress(procname : CString): GLFWglproc = extern

/**
 * Returns the Vulkan instance extensions required by GLFW.
*/
@extern def glfwGetRequiredInstanceExtensions(count : Ptr[uint32_t]): Ptr[CString] = extern

/**
 * Returns the GLFW time.
*/
@extern def glfwGetTime(): Double = extern

/**
 * Returns the frequency, in Hz, of the raw timer.
*/
@extern def glfwGetTimerFrequency(): uint64_t = extern

/**
 * Returns the current value of the raw timer.
*/
@extern def glfwGetTimerValue(): uint64_t = extern

/**
 * Retrieves the version of the GLFW library.
*/
@extern def glfwGetVersion(major : Ptr[CInt], minor : Ptr[CInt], rev : Ptr[CInt]): Unit = extern

/**
 * Returns a string describing the compile-time configuration.
*/
@extern def glfwGetVersionString(): CString = extern

/**
 * Returns the current mode of the specified monitor.
*/
@extern def glfwGetVideoMode(monitor : Ptr[GLFWmonitor]): Ptr[GLFWvidmode] = extern

/**
 * Returns the available video modes for the specified monitor.
*/
@extern def glfwGetVideoModes(monitor : Ptr[GLFWmonitor], count : Ptr[CInt]): Ptr[GLFWvidmode] = extern

/**
 * Returns an attribute of the specified window.
*/
@extern def glfwGetWindowAttrib(window : Ptr[GLFWwindow], attrib : CInt): CInt = extern

/**
 * Retrieves the content scale for the specified window.
*/
@extern def glfwGetWindowContentScale(window : Ptr[GLFWwindow], xscale : Ptr[Float], yscale : Ptr[Float]): Unit = extern

/**
 * Retrieves the size of the frame of the window.
*/
@extern def glfwGetWindowFrameSize(window : Ptr[GLFWwindow], left : Ptr[CInt], top : Ptr[CInt], right : Ptr[CInt], bottom : Ptr[CInt]): Unit = extern

/**
 * Returns the monitor that the window uses for full screen mode.
*/
@extern def glfwGetWindowMonitor(window : Ptr[GLFWwindow]): Ptr[GLFWmonitor] = extern

/**
 * Returns the opacity of the whole window.
*/
@extern def glfwGetWindowOpacity(window : Ptr[GLFWwindow]): Float = extern

/**
 * Retrieves the position of the content area of the specified window.
*/
@extern def glfwGetWindowPos(window : Ptr[GLFWwindow], xpos : Ptr[CInt], ypos : Ptr[CInt]): Unit = extern

/**
 * Retrieves the size of the content area of the specified window.
*/
@extern def glfwGetWindowSize(window : Ptr[GLFWwindow], width : Ptr[CInt], height : Ptr[CInt]): Unit = extern

/**
 * Returns the title of the specified window.
*/
@extern def glfwGetWindowTitle(window : Ptr[GLFWwindow]): CString = extern

/**
 * Returns the user pointer of the specified window.
*/
@extern def glfwGetWindowUserPointer(window : Ptr[GLFWwindow]): Ptr[Byte] = extern

/**
 * Hides the specified window.
*/
@extern def glfwHideWindow(window : Ptr[GLFWwindow]): Unit = extern

/**
 * Iconifies the specified window.
*/
@extern def glfwIconifyWindow(window : Ptr[GLFWwindow]): Unit = extern

/**
 * Initializes the GLFW library.
*/
@extern def glfwInit(): CInt = extern

/**
 * Sets the init allocator to the desired value.
*/
@extern def glfwInitAllocator(allocator : Ptr[GLFWallocator]): Unit = extern

/**
 * Sets the specified init hint to the desired value.
*/
@extern def glfwInitHint(hint : CInt, value : CInt): Unit = extern

/**
 * Returns whether the specified joystick has a gamepad mapping.
*/
@extern def glfwJoystickIsGamepad(jid : CInt): CInt = extern

/**
 * Returns whether the specified joystick is present.
*/
@extern def glfwJoystickPresent(jid : CInt): CInt = extern

/**
 * Makes the context of the specified window current for the calling thread.
*/
@extern def glfwMakeContextCurrent(window : Ptr[GLFWwindow]): Unit = extern

/**
 * Maximizes the specified window.
*/
@extern def glfwMaximizeWindow(window : Ptr[GLFWwindow]): Unit = extern

/**
 * Returns whether the library includes support for the specified platform.
*/
@extern def glfwPlatformSupported(platform : CInt): CInt = extern

/**
 * Processes all pending events.
*/
@extern def glfwPollEvents(): Unit = extern

/**
 * Posts an empty event to the event queue.
*/
@extern def glfwPostEmptyEvent(): Unit = extern

/**
 * Returns whether raw mouse motion is supported.
*/
@extern def glfwRawMouseMotionSupported(): CInt = extern

/**
 * Requests user attention to the specified window.
*/
@extern def glfwRequestWindowAttention(window : Ptr[GLFWwindow]): Unit = extern

/**
 * Restores the specified window.
*/
@extern def glfwRestoreWindow(window : Ptr[GLFWwindow]): Unit = extern

/**
 * Sets the Unicode character callback.
*/
@extern def glfwSetCharCallback(window : Ptr[GLFWwindow], callback : GLFWcharfun): GLFWcharfun = extern

/**
 * Sets the Unicode character with modifiers callback.
*/
@extern def glfwSetCharModsCallback(window : Ptr[GLFWwindow], callback : GLFWcharmodsfun): GLFWcharmodsfun = extern

/**
 * Sets the clipboard to the specified string.
*/
@extern def glfwSetClipboardString(window : Ptr[GLFWwindow], string : CString): Unit = extern

/**
 * Sets the cursor for the window.
*/
@extern def glfwSetCursor(window : Ptr[GLFWwindow], cursor : Ptr[GLFWcursor]): Unit = extern

/**
 * Sets the cursor enter/leave callback.
*/
@extern def glfwSetCursorEnterCallback(window : Ptr[GLFWwindow], callback : GLFWcursorenterfun): GLFWcursorenterfun = extern

/**
 * Sets the position of the cursor, relative to the content area of the window.
*/
@extern def glfwSetCursorPos(window : Ptr[GLFWwindow], xpos : Double, ypos : Double): Unit = extern

/**
 * Sets the cursor position callback.
*/
@extern def glfwSetCursorPosCallback(window : Ptr[GLFWwindow], callback : GLFWcursorposfun): GLFWcursorposfun = extern

/**
 * Sets the path drop callback.
*/
@extern def glfwSetDropCallback(window : Ptr[GLFWwindow], callback : GLFWdropfun): GLFWdropfun = extern

/**
 * Sets the error callback.
*/
@extern def glfwSetErrorCallback(callback : GLFWerrorfun): GLFWerrorfun = extern

/**
 * Sets the framebuffer resize callback for the specified window.
*/
@extern def glfwSetFramebufferSizeCallback(window : Ptr[GLFWwindow], callback : GLFWframebuffersizefun): GLFWframebuffersizefun = extern

/**
 * Generates a gamma ramp and sets it for the specified monitor.
*/
@extern def glfwSetGamma(monitor : Ptr[GLFWmonitor], gamma : Float): Unit = extern

/**
 * Sets the current gamma ramp for the specified monitor.
*/
@extern def glfwSetGammaRamp(monitor : Ptr[GLFWmonitor], ramp : Ptr[GLFWgammaramp]): Unit = extern

/**
 * Sets an input option for the specified window.
*/
@extern def glfwSetInputMode(window : Ptr[GLFWwindow], mode : CInt, value : CInt): Unit = extern

/**
 * Sets the joystick configuration callback.
*/
@extern def glfwSetJoystickCallback(callback : GLFWjoystickfun): GLFWjoystickfun = extern

/**
 * Sets the user pointer of the specified joystick.
*/
@extern def glfwSetJoystickUserPointer(jid : CInt, pointer : Ptr[Byte]): Unit = extern

/**
 * Sets the key callback.
*/
@extern def glfwSetKeyCallback(window : Ptr[GLFWwindow], callback : GLFWkeyfun): GLFWkeyfun = extern

/**
 * Sets the monitor configuration callback.
*/
@extern def glfwSetMonitorCallback(callback : GLFWmonitorfun): GLFWmonitorfun = extern

/**
 * Sets the user pointer of the specified monitor.
*/
@extern def glfwSetMonitorUserPointer(monitor : Ptr[GLFWmonitor], pointer : Ptr[Byte]): Unit = extern

/**
 * Sets the mouse button callback.
*/
@extern def glfwSetMouseButtonCallback(window : Ptr[GLFWwindow], callback : GLFWmousebuttonfun): GLFWmousebuttonfun = extern

/**
 * Sets the scroll callback.
*/
@extern def glfwSetScrollCallback(window : Ptr[GLFWwindow], callback : GLFWscrollfun): GLFWscrollfun = extern

/**
 * Sets the GLFW time.
*/
@extern def glfwSetTime(time : Double): Unit = extern

/**
 * Sets the aspect ratio of the specified window.
*/
@extern def glfwSetWindowAspectRatio(window : Ptr[GLFWwindow], numer : CInt, denom : CInt): Unit = extern

/**
 * Sets an attribute of the specified window.
*/
@extern def glfwSetWindowAttrib(window : Ptr[GLFWwindow], attrib : CInt, value : CInt): Unit = extern

/**
 * Sets the close callback for the specified window.
*/
@extern def glfwSetWindowCloseCallback(window : Ptr[GLFWwindow], callback : GLFWwindowclosefun): GLFWwindowclosefun = extern

/**
 * Sets the window content scale callback for the specified window.
*/
@extern def glfwSetWindowContentScaleCallback(window : Ptr[GLFWwindow], callback : GLFWwindowcontentscalefun): GLFWwindowcontentscalefun = extern

/**
 * Sets the focus callback for the specified window.
*/
@extern def glfwSetWindowFocusCallback(window : Ptr[GLFWwindow], callback : GLFWwindowfocusfun): GLFWwindowfocusfun = extern

/**
 * Sets the icon for the specified window.
*/
@extern def glfwSetWindowIcon(window : Ptr[GLFWwindow], count : CInt, images : Ptr[GLFWimage]): Unit = extern

/**
 * Sets the iconify callback for the specified window.
*/
@extern def glfwSetWindowIconifyCallback(window : Ptr[GLFWwindow], callback : GLFWwindowiconifyfun): GLFWwindowiconifyfun = extern

/**
 * Sets the maximize callback for the specified window.
*/
@extern def glfwSetWindowMaximizeCallback(window : Ptr[GLFWwindow], callback : GLFWwindowmaximizefun): GLFWwindowmaximizefun = extern

/**
 * Sets the mode, monitor, video mode and placement of a window.
*/
@extern def glfwSetWindowMonitor(window : Ptr[GLFWwindow], monitor : Ptr[GLFWmonitor], xpos : CInt, ypos : CInt, width : CInt, height : CInt, refreshRate : CInt): Unit = extern

/**
 * Sets the opacity of the whole window.
*/
@extern def glfwSetWindowOpacity(window : Ptr[GLFWwindow], opacity : Float): Unit = extern

/**
 * Sets the position of the content area of the specified window.
*/
@extern def glfwSetWindowPos(window : Ptr[GLFWwindow], xpos : CInt, ypos : CInt): Unit = extern

/**
 * Sets the position callback for the specified window.
*/
@extern def glfwSetWindowPosCallback(window : Ptr[GLFWwindow], callback : GLFWwindowposfun): GLFWwindowposfun = extern

/**
 * Sets the refresh callback for the specified window.
*/
@extern def glfwSetWindowRefreshCallback(window : Ptr[GLFWwindow], callback : GLFWwindowrefreshfun): GLFWwindowrefreshfun = extern

/**
 * Sets the close flag of the specified window.
*/
@extern def glfwSetWindowShouldClose(window : Ptr[GLFWwindow], value : CInt): Unit = extern

/**
 * Sets the size of the content area of the specified window.
*/
@extern def glfwSetWindowSize(window : Ptr[GLFWwindow], width : CInt, height : CInt): Unit = extern

/**
 * Sets the size callback for the specified window.
*/
@extern def glfwSetWindowSizeCallback(window : Ptr[GLFWwindow], callback : GLFWwindowsizefun): GLFWwindowsizefun = extern

/**
 * Sets the size limits of the specified window.
*/
@extern def glfwSetWindowSizeLimits(window : Ptr[GLFWwindow], minwidth : CInt, minheight : CInt, maxwidth : CInt, maxheight : CInt): Unit = extern

/**
 * Sets the title of the specified window.
*/
@extern def glfwSetWindowTitle(window : Ptr[GLFWwindow], title : CString): Unit = extern

/**
 * Sets the user pointer of the specified window.
*/
@extern def glfwSetWindowUserPointer(window : Ptr[GLFWwindow], pointer : Ptr[Byte]): Unit = extern

/**
 * Makes the specified window visible.
*/
@extern def glfwShowWindow(window : Ptr[GLFWwindow]): Unit = extern

/**
 * Swaps the front and back buffers of the specified window.
*/
@extern def glfwSwapBuffers(window : Ptr[GLFWwindow]): Unit = extern

/**
 * Sets the swap interval for the current context.
*/
@extern def glfwSwapInterval(interval : CInt): Unit = extern

/**
 * Terminates the GLFW library.
*/
@extern def glfwTerminate(): Unit = extern

/**
 * Adds the specified SDL_GameControllerDB gamepad mappings.
*/
@extern def glfwUpdateGamepadMappings(string : CString): CInt = extern

/**
 * Returns whether the Vulkan loader and an ICD have been found.
*/
@extern def glfwVulkanSupported(): CInt = extern

/**
 * Waits until events are queued and processes them.
*/
@extern def glfwWaitEvents(): Unit = extern

/**
 * Waits with timeout until events are queued and processes them.
*/
@extern def glfwWaitEventsTimeout(timeout : Double): Unit = extern

/**
 * Sets the specified window hint to the desired value.
*/
@extern def glfwWindowHint(hint : CInt, value : CInt): Unit = extern

/**
 * Sets the specified window hint to the desired value.
*/
@extern def glfwWindowHintString(hint : CInt, value : CString): Unit = extern

/**
 * Checks the close flag of the specified window.
*/
@extern def glfwWindowShouldClose(window : Ptr[GLFWwindow]): CInt = extern