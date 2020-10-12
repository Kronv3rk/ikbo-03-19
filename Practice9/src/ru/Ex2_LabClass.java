package ru;

public class Ex2_LabClass {
    Ex2_LabClassUI classUI;
    public Ex2_LabClass() {
        this.classUI = new Ex2_LabClassDriver();
    }

    public Ex2_LabClassUI getClassUI() {
        return classUI;
    }

    @Override
    public String toString() {
        return classUI.toString();
    }
}