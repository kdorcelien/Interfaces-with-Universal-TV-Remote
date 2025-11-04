package com.pluralsight;

import com.pluralsight.remote.SmartTv;

public class MainApp {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv("Samsung",12,30,true,"cartoon network","hulu");
        System.out.println(tv);
    }
}
