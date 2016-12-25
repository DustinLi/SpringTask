package lishilin.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by 李世林 on 2016/12/18.
 */
@Service
public class TaskJob {

    private static final Logger logger = LoggerFactory.getLogger(TaskJob.class);

    public void job1() {
        logger.info("任务进行中。。。");
    }

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath*:/taskBean.xml");
        logger.info("end");
    }
}
