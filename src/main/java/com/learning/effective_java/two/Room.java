package com.learning.effective_java.two;


/**
 * System.runFinalization();  System.gc();损耗性能，并且不能控制执行的时间。因此这两个方法是充当了安全网的作用，当你遗漏
 * 正确关闭资源的方法是，实现AutoCloseable，在close方法中关闭资源
 * @author kian
 * @data 2019/6/10
 */
public class Room implements AutoCloseable {
    @Override
    public void close() throws Exception {

    }
}
