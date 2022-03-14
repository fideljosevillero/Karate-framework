package co.com.fideljose.training.karate;

import com.intuit.karate.junit5.Karate;

public class TestRunner {

    @Karate.Test
    Karate test(){
        return Karate.run("test").relativeTo(getClass());
        //return Karate.run("test").path("C:/REPO/NU0051001_Functional_Adapters_MR/PRUEBA/src/test/resources/co.com.fideljose.training.karate");//.relativeTo(getClass());
        //return Karate.run("classpath:co.com.fideljose.training.karate/test.feature");
    }
}
