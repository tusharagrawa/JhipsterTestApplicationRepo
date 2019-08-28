package com.agrawal.tushar.cucumber;

import org.junit.runner.RunWith;

import com.agrawal.tushar.AbstractCassandraTest;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/features")
public class CucumberIT extends AbstractCassandraTest {

}
