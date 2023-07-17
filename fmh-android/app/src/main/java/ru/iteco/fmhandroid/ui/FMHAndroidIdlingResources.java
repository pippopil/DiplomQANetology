package ru.iteco.fmhandroid.ui;

import androidx.test.espresso.idling.CountingIdlingResource;

public class FMHAndroidIdlingResources {
    private static final String RESOURCE = "GLOBAL";
    public static CountingIdlingResource idlingResource = new CountingIdlingResource(RESOURCE);

    public static void increment() {idlingResource.increment();}

    public static void decrement() {
        if (!idlingResource.isIdleNow()) {
            idlingResource.decrement();
        }
    }
}
