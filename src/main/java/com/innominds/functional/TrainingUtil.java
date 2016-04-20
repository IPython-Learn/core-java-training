package com.innominds.functional;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TrainingUtil {

    public static void addTraining(Training training) {

        System.out.println(" New Training added to the calender ::  " + training);
    }

    public static void addTraining(String title, Date date) {

        System.out.println(" New Training added to the calender" + title + " on  " + date);
    }

    public static Date getTrainingDate(String title) {

        return new Date();
    }

    public static List<Training> getTrainings(String title, Date date) {

        return Collections.singletonList(new Training(title, date));
    }

    public static boolean isJavaTraining(String title) {

        return title.toLowerCase().contains("java");
    }

    public static boolean isTrainingAdded(String title, Date date) {

        return true;
    }

    public static boolean customFun(String name, String title, Date date) {

        System.out.println("Custom functional interface invoked");

        return true;
    }

}
