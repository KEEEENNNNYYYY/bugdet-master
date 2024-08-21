package org.models;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class Expenses {
    private String description;
    private int amount;
    public LocalDateTime date;
    private Categories categories;

    Expenses(String description, int amount, Categories categories, LocalDateTime date){
        this.description= description;
        this.date = date;
        this.amount = amount;
        this.categories = categories;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public LocalDateTime getLocalDateTime() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Expenses{" +
                "amount=" + amount +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", categories=" + categories +
                '}';
    }
}
