/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.studentgrade;

import com.mycompany.studentgrade.StudentGrade;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Windows.10
 */
public class StudentGradeTest {
    
    public StudentGradeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    /**
     tests we will use:
     * 1- test for 100 passed
     * 2- test for 100 failed
     * 3- test for 90 passed
     * 4- test for 90 failed
     * 5- test for 80 passed
     * 6- test for 80 failed
     * 7- test for 70 passed
     * 8- test for 70 failed
     * 9- test for more than 100 passed
     * 10- test for more than 100 failed
     * 11- test for less than 70 passed
     * 12- test for less than 70 failed
     **/
    @Test
    public void testGrade100Passed(){
        System.out.println("test for A mark with 100 grade");
        int mark = 100;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }

    @Test
    public void testGrade100Failed(){
        System.out.println("test for B mark with 100 grade");
        int mark = 100;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }

    @Test
    public void testGrade90Passed(){
        System.out.println("test for A mark with 90 grade");
        int mark = 90;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }

    @Test
    public void testGrade90Failed(){
        System.out.println("test for F mark with 90 grade");
        int mark = 90;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    @Test
    public void testGrade80Passed(){
        System.out.println("test for B mark with 80 grade");
        int mark = 80;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }

    @Test
    public void testGrade80Failed(){
        System.out.println("test for F mark with 80 grade");
        int mark = 80;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    @Test
    public void testGrade70Passed(){
        System.out.println("test for F mark with 80 grade");
        int mark = 70;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }

    @Test
    public void testGrade70Failed(){
        System.out.println("test for A mark with 80 grade");
        int mark = 70;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    @Test
    public void testGrade110Passed(){
        System.out.println("test for more than 100");
        int mark = 110;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }

    @Test
    public void testGrade110Failed(){
        System.out.println("test for more than 100");
        int mark = 110;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    @Test
    public void testGrade10Passed(){
        System.out.println("test for less than 70");
        int mark = 10;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }

    @Test
    public void testGrade10Failed(){
        System.out.println("test for less than 70");
        int mark = 10;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
}
