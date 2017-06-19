package com.fab.advanced;

import java.time.LocalDate;

/**
 * Created by @fahoulou on 19/06/2017.
 */
public abstract class Employee {

    public static final String DEFAULT_NAME = "INCONNU";
    private static int nextId;

    private String nom;
    private Integer id;
    private LocalDate hireDate;

    public Employee() {
        this(DEFAULT_NAME);
    }

    public Employee(String nom) {
        this.nom = nom;
        id = nextId ++;
        hireDate = LocalDate.now();
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getId() {
        return this.id;
    }

    public LocalDate getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public abstract double getPay();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (this.nom != null ? !this.nom.equals(employee.nom) : employee.nom != null) return false;
        if (this.id != null ? !this.id.equals(employee.id) : employee.id != null) return false;
        return this.hireDate != null ? this.hireDate.equals(employee.hireDate) : employee.hireDate == null;
    }

    @Override
    public int hashCode() {
        int result = this.nom != null ? this.nom.hashCode() : 0;
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.hireDate != null ? this.hireDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", id=").append(id);
        sb.append(", hireDate=").append(hireDate);
        sb.append('}');
        return sb.toString();
    }
}
