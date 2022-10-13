package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start{
    public static void main(String[] data){
        ApplicationContext context;
        context = SpringApplication.run(Sample.class);
        System.out.println("This is a test");
    }
}
@SpringBootApplication
class Sample {
    
}
@RestController
class Setup {
    @RequestMapping("/nat")
    double showCheck() {
        return 123.456;
    }
}