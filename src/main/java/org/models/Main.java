package org.models;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

import static java.time.temporal.TemporalQueries.localTime;

public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe", 7500);

        Expenses expense1 = new Expenses(
                "dejeuner",
                5000, Categories.FOOD,
                LocalDateTime.of(
                        2010,
                        Month.OCTOBER,
                        10,
                        0,
                        0)
        );
        Expenses expense2 = new Expenses(
                "diner",
                2500,
                Categories.FOOD,
                LocalDateTime.of(
                        2010,
                        Month.NOVEMBER,
                        5,
                        0,
                        0)
        );

        user.addNewExpenses(expense1);
        user.addNewExpenses(expense2);

        user.getExpensesThisMonth(2010, 10);
        user.getExpensesThisMonth(2010, 11);
        user.monthlyBugdetLeft(2010, 10);
    }

}