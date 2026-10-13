/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.jcoding2.voxelremix;

/* JUL */
import java.util.logging.Logger;
import java.util.logging.Level;

/* LWJGL */
import org.lwjgl.*;
import org.lwjgl.glfw.*;
import static org.lwjgl.glfw.GLFW.*;

/**
 *
 * @author jcoding2
 */
public class VoxelRemix {
    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%4$s: %5$s%n");
    }
    
    public static final Logger LOGGER = Logger.getLogger(VoxelRemix.class.getName());
    
    // OpenGL versions
    private static int glMajor = 3;
    private static int glMinor = 3;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long window = 0;

        LOGGER.log(Level.INFO, "VoxelRemix v0.1 -- Written by jcoding2");
        LOGGER.log(Level.INFO, "VoxelRemix is running with LWJGL " + Version.getVersion() + ".");
        
        createWindow(window, glMajor, glMinor);
        
    }
    
    public static void createWindow(long handle, int glMajor, int glMinor) {
        GLFWErrorCallback.createPrint(System.err).set();
        
        
        // initialize, and if fails throw an exception
        if (!glfwInit()) {
            throw new IllegalStateException("Couldn't initialize the GLFW window.");
        }
        
        // set up GLFW windowhints
        glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, glMajor);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, glMinor);
        glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
        glfwWindowHint(GLFW_VISIBLE, GLFW_TRUE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        
        // actually create the window
        handle = glfwCreateWindow(300, 300, "VoxelRemix v0.1", 0, 0);
        
        if (handle <= 0) {
            LOGGER.log(Level.SEVERE, "Couldn't create the GLFW window.");
            glfwTerminate();
        }
        
        // "esc" key = close window
        glfwSetKeyCallback(handle, (window, key, scancode, action, mods) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(window, true);
            }
        });
        
        // Make the OpenGL context current
        glfwMakeContextCurrent(handle);
    }
    
}
