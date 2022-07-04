/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

/**
 *
 * @author Abdelrahman Hany
 */
public class Tag {
    private int position;
    private int length;
    private char next;

    public Tag(int position, int length, char next) {
        this.position = position;
        this.length = length;
        this.next = next;
    }

    @Override
    public String toString() {
        return "(" +position + "," + length + "," + next + ')';
    }
    
}
