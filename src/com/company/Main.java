package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/////////////////////////////   Основное ДЗ  ///////////////////////////////////
        System.out.println();
        System.out.println("         Основное ДЗ           ");
        int quantity, available_amount = 0, total = 0, remainder;
        Scanner scanner = new Scanner(System.in);
        String result_out = "";
        int[] bank_notes = {1, 3, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000};
        int[] quantities = {10, 5, 5, 3, 2, 1, 2, 3, 3, 2, 0, 2};

        for (int i = 0; i < bank_notes.length; i++) {
            total += bank_notes[i] * quantities[i];
        }

        System.out.print("Введите желаемую сумму: ");
        int withdraw = remainder = scanner.nextInt();

        if (withdraw > total) {
            System.out.println("Вы можете снять только: " + total);
        } else {
            for (int i = bank_notes.length - 1; i >= 0; i--) {
                if (quantities[i] > 0) {
                    quantity = remainder / bank_notes[i];
                    if (quantity > quantities[i]) quantity = quantities[i];
                    if (quantity > 0) {
                        result_out += quantity + "x" + bank_notes[i] + "  ";
                        quantities[i] -= quantity;
                        remainder -= bank_notes[i] * quantity;
                        available_amount += bank_notes[i] * quantity;
                    }
                    if (remainder == 0) break;
                }
            }
            if (available_amount == withdraw) {
                System.out.println("Вы получили: " + result_out);
                System.out.println("Всего: " + available_amount);
            } else {
                System.out.println("Вы можете снять только: " + available_amount);
            }
        }
//////////////////////////////////////// Доп ДЗ-1 //////////////////////////////////////////////

        System.out.println();
        System.out.println("         Доп ДЗ-1          ");
        System.out.print("Введите годовую зарплату: ");
        int annual_salary = scanner.nextInt();
        int annual_bonus = (50 * annual_salary / 100) * 5 / 100 + (30 * annual_salary / 100) * 8 / 100 + (20 * annual_salary / 100) * 10 / 100;
        System.out.println("Бонусная зарплата: " + annual_bonus + " сом");

////////////////////////////////////// Доп ДЗ-2 //////////////////////////////////////////////

        System.out.println();
        System.out.println("         Доп ДЗ-2          ");
        System.out.print("Введити слово: ");
        String word = scanner.next(), result = "";
        int word_quantity = word.length();
        if (word_quantity % 2 == 0) {
            if (word.length() > 2) {
                for (int i = 0; i < word.length() - 2; i++) {
                    result += word.charAt(i);
                }
            } else result = word;

        } else {
            if (word.length() < 3) result = word;
            else {
                for (int i = word.length() / 2 - 1; i < (word.length() / 2 - 1) + 3; i++) {
                    result += word.charAt(i);
                }
            }
        }
        System.out.println(result);

////////////////////////////////////// Доп ДЗ-3 //////////////////////////////////////////////
        System.out.println();
        System.out.println("         Доп ДЗ-3          ");
        System.out.print("Введити количество элементов: ");
        long count = scanner.nextInt(),result_sum = 1;
        String one="1",one_result="1";
        for (long i = 1; i <count ; i++) {
            one +="1";
            one_result += "+"+one;
            result_sum += Long.parseLong(one);
        }
        System.out.println(one_result);
        System.out.println(result_sum);
    }

}
//        bank_notes ← [1, 3, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000]
//        quantities ← [10, 5, 5, 3, 2, 1, 2, 3, 3, 2, 0, 2]
//        total ← 0
//        result_out ← ''
//        available_amount ← 0;
//
//        FOR i ← 0 TO LEN(banknotes) - 1
    //        total ← total + bank_notes[i] * quantities[i]
//        ENDFOR
//
//        withdraw ← remainder ← USERINPUT # 7060
//
//        IF (withdraw > total)
//        THEN
//        OUTPUT 'Вы можете снять только' + total
//        ELSE
    //        FOR i ← LEN(bank_notes) - 1 TO 0
            //        IF (quantities[i] > 0)
            //        THEN
            //            quantity ← remainder DIV bank_notes[i]
                //        IF (quantity > quantities[i])
                //        THEN quantity ← quantities[i]
                //        ENDIF
                //        IF (quantity>0)
                //        THEN
                    //        result_out ← result_out + quantity + ' x ' + bank_notes[i] + ' '
                    //        quantities[i] ← quantities[i] - quantity;
                    //        remainder ← remainder - quantity * bank_notes[i]
                    //        available_amount ← available_amount + quantity * bank_notes[i]
                    //        IF(remainder == 0)
                    //        THEN
                    //        BREAK
                    //        ENDIF
                //        ENDIF
            //        ENDIF
    //        ENDFOR
    //        IF(available_amount == withdraw)
    //        THEN
    //        OUTPUT 'Вы получили ' + result_out + '. Всего ' + available_amount
    //
    //        ELSE OUTPUT 'Вы можете снять только: '+available_amount
    //        ENDIF
//        ENDIF