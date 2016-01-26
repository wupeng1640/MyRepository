/**
 * Created by Administrator on 2016/1/26.
 */

import org.testng.annotations.*;

public class test01 {
    @BerforeClass
    public void setUp() {
        System.out.println("起始执行函数！");
    }

    @test(groups = {"first"})
    public void firstTest() {
        System.out.println("执行第一个用例！");
    }
    @test(groups = {"second"})
    public void firstTest() {
        System.out.println("执行第二个用例！");
    }
}
