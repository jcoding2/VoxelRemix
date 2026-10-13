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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "VoxelRemix v0.1 -- Written by jcoding2");
        LOGGER.log(Level.INFO, "VoxelRemix is running with LWJGL " + Version.getVersion() + ".");
        
        GLFWErrorCallback.createPrint(System.err).set();
        
        if (!glfwInit()) {
            throw new IllegalStateException("Couldn't initialize the GLFW window.");
        }
        
        glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 3);
        glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
        glfwWindowHint(GLFW_VISIBLE, GLFW_TRUE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        long window = glfwCreateWindow(300, 300, "VoxelRemix v0.1", 0, 0);
        if ( window <= 0 ) {
            LOGGER.log(Level.SEVERE, "Couldn't create the GLFW window");
            glfwTerminate();
        }
        // Make the OpenGL context current
        glfwMakeContextCurrent(window);
        
    }
    
}
