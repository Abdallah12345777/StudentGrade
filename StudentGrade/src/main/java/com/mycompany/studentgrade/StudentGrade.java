/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentgrade;

/**
 *
 * @author Windows.10
 */
public class StudentGrade {

   /**
     * Calculates grade as follows:
     * A (90 - 100), B (80 - 89), F ( < 80 && > 100)
     * @param mark Student mark
     * @return The grade based on the mark entered by user
     */
    public static String getGrade(int mark) {
        if (mark >= 90 && mark <= 100)
            return "A";
        else if (mark >= 80 && mark < 90)
            return "B";
        else 
            return "F";
    }
}
