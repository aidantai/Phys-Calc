package com.aidantai;

import java.util.*;
import org.json.*;
import org.qscript.*;

public final class Calculator {
    private Calculator() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        ArrayList<String> equations = new ArrayList<String>();
        equations.add("a*t");
        equations.add("b*d");


        for (String eq : equations) {
            try { 
                System.out.println(eq);
                Solver.evaluate(eq);
            } catch(Exception e) {
                System.out.println(e.getMessage()); 
            }
        }
    }
}

/*
        Scanner keyboard = new Scanner(System.in);
        boolean kinematics = false;

        System.out.println("Welcome to the Physics Calculator!");
        while(true) { // Determines if the problem is kinematics or projectile motion.
            System.out.println("Are you trying to solve a kinematics or projectiles problem?");
            String kinproj = keyboard.next().toLowerCase();
            if (kinproj.equals("kinematics")) {
                kinematics = true;
                break;
            } else if (kinproj.equals("projectiles")) {
                kinematics = false;
                break;
            } else {
                System.out.println("Sorry, that's not an option. Die.");
                continue;
            }
        }

        System.out.println("Enter the variable that you are trying to find: ");
        String targetVariable = keyboard.next().toLowerCase();
        
        System.out.println(kinematics);
        keyboard.close();
        */