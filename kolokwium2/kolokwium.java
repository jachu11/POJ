package com.company;

public class Main {
    public static void main(String[] args) {
        String input = "1 1 2 1 ";
        String numbers[] = input.split("\\s+");   // dzielenie stringa
        int sum = 0;
        for (String number : numbers) {  // petla przez wszystkie numery
            Integer n = Integer.parseInt(number);  // analiza numeru
            sum += n;     // suma numerow
        }
        System.out.println(sum);  // druk wyniku
    }
}
