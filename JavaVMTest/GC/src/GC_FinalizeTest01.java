/**
 * 对象在GC回收时自我拯救演示
 *      finalize确实比较鸡肋，在我这儿jdk12中显示已经被废弃，但是还是可以试着玩玩
 */
public class GC_FinalizeTest01 {

    public static GC_FinalizeTest01 SAVE_HOOK=null;

    public void isAlive(){
        System.out.println("Yes,I am still alive :)");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        GC_FinalizeTest01.SAVE_HOOK=this;
    }

    public static void main(String[] args) throws Throwable{
        SAVE_HOOK=new GC_FinalizeTest01();
        //对象第一次拯救自己
        SAVE_HOOK=null;
        System.gc();
        //finalizer方法优先级低，暂停等待
        Thread.sleep(1000);
        /*if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("No,I am dead :(");
        }*/

        //如果成功，尝试第二次拯救自己
        SAVE_HOOK=null;
        System.gc();

        Thread.sleep(1000);
        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("No,I am dead :(");
        }
    }
}
