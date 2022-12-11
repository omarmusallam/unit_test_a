/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
public class MyUnit {

    public int add(int num1, int num2) {

        return num1 + num2;
    }

    public int divid(int num1, int num2) throws IllegalStateException {
        if (num2 == 0) {
            throw new IllegalStateException(
        }'number 2 cant be zero '
        );
    return num1 / num2;
    }
}
