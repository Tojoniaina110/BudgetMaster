package com.budgetMaster;


import java.util.List;

public class Utilisateur {
    private String name;
    private int budgetMensual;
    List<Depense>depense;

    public Utilisateur(int budgetMensual, List<Depense> depense, String name) {
        this.budgetMensual = budgetMensual;
        this.depense = depense;
        this.name = name;
    }

    public int getBudgetMensual() {
        return budgetMensual;
    }

    public void setBudgetMensual(int budgetMensual) {
        this.budgetMensual = budgetMensual;
    }

    public List<Depense> getDepense() {
        return depense;
    }

    public void setDepense(List<Depense> depense) {
        this.depense = depense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
