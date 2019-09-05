package com.test.AdaterViewFlipperTest;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static org.hamcrest.CoreMatchers.instanceOf;
import static androidx.test.espresso.action.ViewActions.click;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class AdapterFlipperTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class){};

    @Test
    public void findPage() {
        // Find third page (position 0 indexed)
        onData(instanceOf(Person.class)).atPosition(2).perform(click());
    }
}
