
import learn.Customer1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lwx
 * @date 2021/7/9 - 10:05
 */
public class TemplatesTest {
    /**
     *客户的id
     */
     private int id = 1;

     /**
      *客户的姓名
      */
      private String name;


    //模板六：prsf：可生成private static final

    private static final Customer1 CUST=new Customer1();

    //变形：psf
    public static final int NUM = 1;
    public static final int NUM2 = 2;

    //变形：psfi
    public static final int NUM1 = 2;
    //变形：psfs
    public static final String NATION = "china";





    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("hello!");
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int num1=10;
        System.out.println("num1 = " + num1);
        int num2=12;
        System.out.println("num2 = " + num2);
        
        //模板三：fori
        String[] strings = {"tom", "jerry", "lilei", "hanmeimei"};

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        //变形：iter
        for (String string : strings) {
            System.out.println(string);
        }

        //变形：itar
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            System.out.println(string);

        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(567);

        for (Object o : list) {

        }

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }




    }
    public void testUpdate(){
        //修改测试
    }
    public void method(){
        System.out.println("TemplatesTest.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(567);

        //模板五：ifn
        if (list == null) {

        }

        //变形：inn
        if (list != null) {

        }

        //变形：xxx.nn/xxx.null
        if (list != null) {

        }

        if (list == null) {


        }
    }
}
