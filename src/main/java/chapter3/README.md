# 内存分配于回收策略

在本节中我们将要去讨论jvm中几条最普遍的内存分配规则，本节中默认使用Serial/Serial Old
收集器的组合，当然我们也可以去实验其他收集器组合是如何进行内存分配的

## 名词解释
> 新生代GC(MinorGC)：指发生在新生代的垃圾收集动作，因为Java对象大多都具备朝生夕死的特性，所以MinorGC非常频繁，一般回收速度也比较快。
> 老年代GC(MajorGC/Full GC)：指发生在老年代的GC，出现了MajorGC,经常会伴随至少一次的MinorGC（但非绝对的，在Parallel Scavenge收集器的收集策略里就有直接进行
>MajorGC的策略选择过程）。MajorGC的速度一般会比MinorGC慢上10倍
---