package fastfish2.fastfish2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.UUID;

@Configuration
public class TestAutoConfig {

    @Bean
    public void makeThread2(){
        System.out.println("守护线程2开启！！ ");
        Thread a=new Thread(() -> test());
        a.setDaemon(true);
        a.start();
    }

    private void  test(){
        for (;;) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Test2 cache!!1"+ UUID.randomUUID().toString().replace("-",""));
        }
    }
}
