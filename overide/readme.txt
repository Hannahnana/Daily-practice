重写hashCode（）与equals（）
hashCode（）与equals（）的相关规定
1.如果两个对象相等，则hashcode一定也是相同的
2.两个对象相等,对两个对象分别调用equals方法都返回true
3.两个对象有相同的hashcode值，它们也不一定是相等的
4.因此，equals 方法被覆盖过，则 hashCode 方法也必须被覆盖
5.hashCode() 的默认行为是对堆上的对象产生独特值。如果没有重写 hashCode()，则该 class 的两个对象无论如何都不会相等（即使这两个对象指向相同的数据）