package chapter3.section6;

import static common.CommonConst._1MB;

/**
 * @author weiyifei
 * @description 对象优先在Eden上进行分配，当然Eden区没有足够空间的时候，虚拟机将发动一次MinorGC
 * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8  -XX:+UseSerialGC
 * @date 2021/2/1
 */
public class Lesson1 {

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;

        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB]; //出现一次MinorGC

    }
}
