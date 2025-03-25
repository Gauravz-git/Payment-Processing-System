package com.example.ademo.pojo;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MyNum {
    private int num1;
    private int num2;

    // Constructor
    public MyNum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getters
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    // Setters
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // toString method
    @Override
    public String toString() {
        return "MyNum{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

     // Method to convert JSON string to MyNum object
    public static MyNum convertJsonToMyNum(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(jsonString, MyNum.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Return null if parsing fails
        }
    }

    public static void main(String[] args) {
        // Creating an object
        MyNum myNum = new MyNum(1, 2);
        
        // Printing the object
        System.out.println(myNum);
    }
}

