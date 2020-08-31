package be.intecbrussel.model;

import java.time.LocalDate;

public class User {
    private String username;
    private LocalDate dateOfAccountCreation;
    private double currency;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getDateOfAccountCreation() {
        return dateOfAccountCreation;
    }

    public void setDateOfAccountCreation(LocalDate dateOfAccountCreation) {
        this.dateOfAccountCreation = dateOfAccountCreation;
    }

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }

    public void addCurrency(double currencyToAdd) {
        currency += currencyToAdd;
    }

    public void removeCurrency(double currencyToRemove) {
        if (currencyToRemove > currency) {
            currency = 0;
        } else {
            currency -= currencyToRemove;
        }
    }

}