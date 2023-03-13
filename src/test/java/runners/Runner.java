package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resource/features",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false

)
public class Runner {

}
/*
 Runner class'i testlerimizi tekli veya toplu olarak calistirmamizi saglar.
 Runner Clasi BOS bir class;dir
 burada asil isi yapan iki tane notasyon
 ve iclerine yazdigimiz argumentler olacak.

 @Cucumber options icerisine yazacagimiz degerler bu runner classinin
 calistiracagi
  -feature dosyalarinin ve
  -feature dosyalarina ait Java Methodlarinin nerede oldugunu
  -ve bu feature  dosyalari icerisinde olusturulan
  -Scenario veya  feautuelarin hangilerinin calistirilacagini belirler.

 */