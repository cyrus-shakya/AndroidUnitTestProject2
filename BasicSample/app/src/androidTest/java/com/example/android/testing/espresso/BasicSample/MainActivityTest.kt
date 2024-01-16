package com.example.android.testing.espresso.BasicSample

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)
    @Test
    fun validateTextViewInMainActivity() {
        // Validate correct strings in the TextView in the main activity.
        Espresso.onView(ViewMatchers.withId(R.id.textToBeChanged))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.hello_world)))

        pause()
    }
    @Test
    fun validateEditTextChangeTextButton() {
        // Enter “123” and press Change Text Button, and test the string
        val inputText = "123"
        Espresso.onView(ViewMatchers.withId(R.id.editTextUserInput))
            .perform(ViewActions.typeText(inputText))
        Espresso.onView(ViewMatchers.withId(R.id.changeTextBt))
            .perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.textToBeChanged))
            .check(ViewAssertions.matches(ViewMatchers.withText(inputText)))
        pause()
    }
    @Test
    fun validateEditTextOpenActivityChangeTextButton() {
        // Enter “123” and press Open Activity and Change Text Button,
        // and test the string in ShowTextActivity
        val inputText = "123"
        Espresso.onView(ViewMatchers.withId(R.id.editTextUserInput))
            .perform(ViewActions.typeText(inputText))
        Espresso.onView(ViewMatchers.withId(R.id.activityChangeTextBtn))
            .perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.show_text_view))
            .check(ViewAssertions.matches(ViewMatchers.withText(inputText)))
        pause()
    }

    @Test
    fun validateEmptyEditTextChangeTextButton() {
        // Without entering anything and press Change Text Button and test the string (empty/null)
        Espresso.onView(ViewMatchers.withId(R.id.changeTextBt))
            .perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.textToBeChanged))
            .check(ViewAssertions.matches(ViewMatchers.withText("")))
        pause()
    }

    @Test
    fun validateEmptyEditTextOpenActivityChangeTextButton() {
        // Without entering anything and press Open Activity and Change Text Button,
        // and test the string in ShowTextActivity (null).
        Espresso.onView(ViewMatchers.withId(R.id.activityChangeTextBtn))
            .perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.show_text_view))
            .check(ViewAssertions.matches(ViewMatchers.withText("")))

        pause()
    }

    @Test
    fun validateNonEmptyEditTextChangeTextButton() {
        // Enter “abcdef” and press Change Text Button, and test the string
        val inputText = "abcdef"
        Espresso.onView(ViewMatchers.withId(R.id.editTextUserInput))
            .perform(ViewActions.typeText(inputText))
        Espresso.onView(ViewMatchers.withId(R.id.changeTextBt))
            .perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.textToBeChanged))
            .check(ViewAssertions.matches(ViewMatchers.withText(inputText)))

        pause()
    }

    @Test
    fun validateNonEmptyEditTextOpenActivityChangeTextButton() {
        // Enter “abcdef” and press Open Activity and Change Text Button,
        // and test the string in ShowTextActivity
        val inputText = "abcdef"
        Espresso.onView(ViewMatchers.withId(R.id.editTextUserInput))
            .perform(ViewActions.typeText(inputText))
        Espresso.onView(ViewMatchers.withId(R.id.activityChangeTextBtn))
            .perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.show_text_view))
            .check(ViewAssertions.matches(ViewMatchers.withText(inputText)))

        pause()
    }

    private fun pause() {
        try {
            Thread.sleep(1000) // Pause for 1 second
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}

