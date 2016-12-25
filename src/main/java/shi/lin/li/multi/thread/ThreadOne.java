package shi.lin.li.multi.thread;

/**
 * Created by lenovo on 2016/12/21.
 */
class DoIt{
    public void justDo(){
        for(int i=0;i<10;i++){
            System.out.println("do it! "+i);
        }
    }
}

class Sync implements Runnable{
    private DoIt doIt;
    public Sync(DoIt doIt){
        this.doIt=doIt;
    }
    public void run() {
        System.out.println("start:");
        doIt.justDo();
    }
}
public class ThreadOne {

    public static void mainDo(){
        DoIt doIt1=new DoIt();
        DoIt doIt2=new DoIt();
        Sync test1=new Sync(doIt1);
        Sync test2=new Sync(doIt2);
        new Thread(test1).start();
        new Thread(test2).start();
    }

    public static void main(String[] args){
        mainDo();
        for(int i=0;i<10;i++){
            System.out.println("main+"+i);
        }
        System.out.println("end");
    }

}
