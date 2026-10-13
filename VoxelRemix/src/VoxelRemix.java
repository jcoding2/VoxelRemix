/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.logging.Logger;

/**
 *
 * @author jcoding2
 */
public class VoxelRemix {
    // who knew Java had so much configutation for the JUL?
    private static final Logger LOGGER = Logger.getLogger(VoxelRemix.class.getName());
    public static void main(String[] args) {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%4$s: %5$s%6$s%n");
        LOGGER.info("JUL loaded, free to log more stuff");
        LOGGER.info("VoxelRemix v0.1 - (C) 2026 jcoding2, under the GNU GPL v2");
    }
}
