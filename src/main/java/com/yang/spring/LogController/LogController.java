package com.yang.spring.LogController;

public class LogController {
    private String packagePath;
    private String levelName;
    private int duration;

    public LogController(String packagePath, String levelName, int duration) {
        this.packagePath = packagePath;
        this.levelName = levelName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "LogController{" +
                "packagePath='" + packagePath + '\'' +
                ", levelName='" + levelName + '\'' +
                ", duration=" + duration +
                '}';
    }
}
