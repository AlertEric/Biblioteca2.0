package org.biblioteca.controller;

import org.biblioteca.controller.cases.CaseMenu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            public void run() {
                CaseMenu caseMenu = new CaseMenu();
            }
        };
    }
}