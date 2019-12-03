package com.example.dh_testesandroid;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> testRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testActivityCalculo() {

        onView(withId(R.id.nota1_editText)).perform(typeText("10"));
        onView(withId(R.id.nota2_editText)).perform(typeText("8.5"));
        onView(withId(R.id.nota3_editText)).perform(typeText("10"));
        onView(withId(R.id.nota4_editText)).perform(typeText("7.5"));

        closeSoftKeyboard();

        onView(withId(R.id.btnCalcularMedia)).perform(click());
        onView(withText("Nota final: 9.0")).check(matches(isDisplayed()));

    }
}
