package com.bombieri.Alltest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.bombieri.tests.AcccesoABombieriTest;
import com.bombieri.tests.AccesoAUdemy;

@RunWith(Suite.class)
@SuiteClasses({ AcccesoABombieriTest.class, AccesoAUdemy.class })
public class AllTests {

}
