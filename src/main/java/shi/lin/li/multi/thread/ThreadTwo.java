package shi.lin.li.multi.thread;

import org.junit.Test;

/**
 * Created by lenovo on 2016/12/21.
 */

public class ThreadTwo{

    class DoIt{
        public void justDo(){
            for(int i=0;i<10;i++){
                System.out.println("do it! "+i);
            }
        }
    }

    class Sync implements Runnable{
        private shi.lin.li.multi.thread.DoIt doIt;
        public Sync(shi.lin.li.multi.thread.DoIt doIt){
            this.doIt=doIt;
        }
        public void run() {
            System.out.println("start:");
            doIt.justDo();
        }
    }

    public  void mainDo(){
        shi.lin.li.multi.thread.DoIt doIt1=new shi.lin.li.multi.thread.DoIt();
        shi.lin.li.multi.thread.DoIt doIt2=new shi.lin.li.multi.thread.DoIt();
        shi.lin.li.multi.thread.Sync test1=new shi.lin.li.multi.thread.Sync(doIt1);
        shi.lin.li.multi.thread.Sync test2=new shi.lin.li.multi.thread.Sync(doIt2);
        new Thread(test1).start();
        new Thread(test2).start();
    }

    @Test
    public  void MyTest(){
        mainDo();
        for(int i=0;i<10;i++){
            System.out.println("main+"+i);
        }
        System.out.println("end");
    }
}
