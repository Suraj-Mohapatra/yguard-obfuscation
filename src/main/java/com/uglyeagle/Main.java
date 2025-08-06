package com.uglyeagle;

public class Main {
  private static final String COMPANY_NAME = "ABC Pvt Ltd";

    private static String displayCompanyName() {
      return COMPANY_NAME;
    }

    public static void main(String[] args) {
        System.out.println("Hello World from " + displayCompanyName() + '.');
    }
}