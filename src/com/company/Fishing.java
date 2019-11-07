package com.company;
import java.time.*;
import java.time.DayOfWeek;
public class Fishing {

    public static void main(String[] args) {
    int t = 21;
    int DayOfWeek = 4;
    int tMore = t - 21;
    int tLess = 19 - t;
    int leftDays = (7 - DayOfWeek) + 4;

            if (23 >= t & t >= 19 & DayOfWeek == 4) {
                System.out.println("\033[32mVasya go fishing today!\033[0m");
            } else if (23 >= t & t >= 19 & DayOfWeek != 4) {
                leftDays = (7 - DayOfWeek) + 4;
                System.out.println("Untill the next fishing left " + leftDays + " days.");
            } else if (t < 19 & DayOfWeek == 4 & DayOfWeek >= 7) {
                System.out.println("Vasya goes not fishing, because the temperature is lower than necessary by " + tLess + "°C.");
            } else if (t > 21 & DayOfWeek == 4 & DayOfWeek >= 7) {
                System.out.println("Vasya goes not fishing, because the temperature is higher than necessary by " + tMore + "°C.");
            } else if (t > 21 & DayOfWeek != 4 & DayOfWeek >= 7) {
                System.out.println("Vasya goes not fishing, because T is higher than necessary by " + tMore + "°C. " +
                        "Untill the next possible fishing left " + leftDays + " days.");
            } else if (t < 19 & t >= -273 & DayOfWeek != 4 & DayOfWeek >= 7) {
                System.out.println("\033[32mVasya will not go fishing, because T is lower than necessary by " + tLess + "°C.\033[0m");
                System.out.println("\033[36mUntill the next possible fishing left " + leftDays + " days.\033[0m");
            } else if (t < -273 & DayOfWeek != 4 & DayOfWeek >= 7) {
                System.out.println("\033[31mVasya will not go fishing, because he is died by " + t + "°C.\033[0m");
                System.out.println("\033[31mFortunately, absolut zero (-273.15) is not reachable.\033[0m");
            } else {
                System.out.println("\033[31mVasya will not go fishing\033[0m");

    }
}
