package org.models;

import java.time.LocalDate;
import java.util.ArrayList;


public class User {
    private String name;
    private int monthlyBugdet;
    private ArrayList <Expenses> expenses;

    User(String name,int monthlyBugdet){
        this.name=  name;
        this.monthlyBugdet = monthlyBugdet;
        this.expenses = new ArrayList<Expenses>();
    }

/////////////////////////////////////////////////////////////////
    //Suivi des dépenses:

    //Ajouter une nouvelle dépense :
    public String addNewExpenses(Expenses exp){
        this.expenses.add(exp);
        return exp + "added succesfullly";
    }

    //Afficher toutes les dépenses : Par date
    public ArrayList<Expenses> getExpensesPerDate(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        ArrayList<Expenses> filteredExpenses = new ArrayList<>();
        for (Expenses expense : expenses) {
            LocalDate expenseDate = expense.getLocalDateTime().toLocalDate();
            if (expenseDate.equals(date)) {
                filteredExpenses.add(expense);
            }
        }
        System.out.println("here the array of all the expenses per date: " + filteredExpenses);
        return filteredExpenses;
    }

    //Afficher les dépenses par catégorie :
    public String showExpensesPer(Categories category) {
        ArrayList<Expenses> expenses1 = new ArrayList<>(expenses);
        expenses1.removeIf(expense -> !expense.getCategories().equals(category));
        return "here the array of all the expenses per categories " +expenses1;
    }
/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
    //Analyse du budget

    //Total dépensé ce mois-ci
    public int getExpensesThisMonth(int year, int month) {
        int totalCost = 0;
        for (Expenses expense : expenses) {
            LocalDate expenseDate = expense.getLocalDateTime().toLocalDate();
            if (expenseDate.getMonthValue() == month && expenseDate.getYear() == year) {
                totalCost += expense.getAmount();
            }
        }
        System.out.println("The amount total of expense this month: " + year + ", month: " + month + " = " + totalCost);
        return totalCost;
    }


    //Budget restant
    public int monthlyBugdetLeft(int year, int month) {
        int budgetLeft = monthlyBugdet - this.getExpensesThisMonth(year, month);
        System.out.println("The budget left this month: " + budgetLeft);
        return budgetLeft;
    }

/////////////////////////////////////////////////////////////////

    public ArrayList<Expenses> getExpenses() {
        return expenses;
    }

    public void setExpenses(ArrayList<Expenses> expenses) {
        this.expenses = expenses;
    }

    public int getMonthlyBugdet() {
        return monthlyBugdet;
    }

    public void setMonthlyBugdet(int monthlyBugdet) {
        this.monthlyBugdet = monthlyBugdet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                ", name='" + name + '\'' +
                ", monthlyBugdet=" + monthlyBugdet +
                '}';
    }
}
