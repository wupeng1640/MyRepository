/**
 * Created by Administrator on 2016/1/26.
 */

import org.testng.annotations.*;

public class test01 {
    @BerforeClass
    public void setUp() {
        System.out.println("��ʼִ�к�����");
    }

    @test(groups = {"first"})
    public void firstTest() {
        System.out.println("ִ�е�һ��������");
    }
    @test(groups = {"second"})
    public void firstTest() {
        System.out.println("ִ�еڶ���������");
    }
}
