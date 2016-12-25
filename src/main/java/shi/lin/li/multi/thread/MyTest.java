package shi.lin.li.multi.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lenovo on 2016/12/21.
 */
public class MyTest {

    private static final Logger logger = LoggerFactory.getLogger(MyTest.class);

    private MyTest(){
    }
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            logger.info("第{}次循环",i);
        }
    }



}
