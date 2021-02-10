package chapter3.section6;

import static common.CommonConst._1MB;

/**
*@description 大对象直接进入老年代
 * 所谓的大对象是指，需要大量连续内存空间的Java对象，最典型的就是那种很长的字符串以及数组。
 * 我们在编写代码得时候一定要避免出现“朝生夕死”的需要连续内存空间的大对象，这样会导致提前GC给这种大对象腾空间
 * 我们可以通过设置 -XX:PretenureSizeThreshold这个参数来令大于这个数值的对象直接进入老年代，避免在Eden和Survior区之间发生大量得内存复制
 * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728  -XX:+UseSerialGC
*@author weiyifei
*@date 2021/2/10
*/
public class Lesson2 {
    public static void main(String[] args) {
        byte[] allocation;
        allocation = new byte[4*_1MB]; //直接分配在老年代中
    }
}
