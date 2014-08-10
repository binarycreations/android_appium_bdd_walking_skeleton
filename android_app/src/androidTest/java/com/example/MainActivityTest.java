package com.example;

import android.content.Intent;
import android.test.ActivityUnitTestCase;

//TODO: Remove this fixture after checking project is setup
public class MainActivityTest extends ActivityUnitTestCase<MainActivity> {

    private Intent mLaunchIntent;
    private MainActivity sut;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mLaunchIntent =  new Intent(getInstrumentation().getTargetContext(), MainActivity.class);
        startActivity(mLaunchIntent, null, null);
        sut = getActivity();
    }

    public void testOnClick_RaisesIntentForOtherScreen() {
        sut.onClick(null); // The implementation doesn't check it's parameters.

        Intent startedIntent = getStartedActivityIntent();
        assertNotNull(startedIntent);
        assertEquals(SecondActivity.class.getName(), startedIntent.getComponent().getClassName());
    }
}
