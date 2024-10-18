package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    // Этот бин Я дописывал в рамках выполнения решения данного задания
    @Bean static Egg6 getEgg6(Needle7 needle7) {
        return new Egg6(needle7);
    }

    // Либо прописываем этот н (ниже), либо ставим аннотацию '@Component' над 'Needle7'
    /*
    @Bean static Needle7 getNeedle7() {
        return new Needle7();
    }
    */
}
