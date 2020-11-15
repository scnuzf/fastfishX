package fastfish2.fastfish2;


import org.springframework.context.annotation.Import;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({FastfishConfig.class})
public @interface EnableFastFish {
}
