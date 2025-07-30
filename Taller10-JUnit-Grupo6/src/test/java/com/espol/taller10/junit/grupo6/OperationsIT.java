/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.espol.taller10.junit.grupo6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author CltControl
 */
public class OperationsIT {
    
    public OperationsIT() {
    }
    
    
    
    @Test
    @DisplayName("El valor ingresado no sea vacio")
    public void SolveEmpity(){
        assertNotNull(Operations.Solve("4+93"));
    }
    
    @Test
    @DisplayName("El operado tiene que ser de 2 digitos")
    public void SolveOperando(){
        String result = "4";
        assertFalse(Operations.Solve("6-2") == result);
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
    
}
