## 这是一个java基础项目
### 其中有多个模块，api、inheritance等
#### api主要是java中各个工具类的使用及注意事项
- AnonymousTest说了一点匿名内部的使用，在inheritance模块下有更详细的介绍。
- ArrayListTest对ArrayList使用的一些说明，还有java的自动拆箱与装箱机制
- ArraysTest则是对Arrays工具包做一些说明
- CalendarTest是对Calendar做了一些说明，注意Calendar是一个抽象类
- DateTest是说明了Date、SimpleDateFormat的使用
- MathTest则是对Math类中的绝对值，向上下取整做了一些使用。
- RandomTest对Random类进行了使用，并说明如何取一个范围内的随机数
- StaticTest测试了静态方法，说明了静态方法为什么不能访问非静态方法
- StringBuilderTest说明它与String的区别
- StringTest说明了String的使用以及String的一些底层原理

#### inheritance主要是说明了继承与多态的一些相关基础
- Animal、Dog是父子类，abstractTest则是测试抽象父子类方法
- AnonymousInnerclassTest则是测试匿名内部类
- FinalTest、Person则是巩固对final关键词的理解
- InnerClassTest测试内部类的使用
- InterfaceTest接口和InterfaceTestImpl实现类则是说明java7、java8、java9中对接口的不断完善
- PartialInnerclassTest测试了局部内部类，说明局部内部类也是内部类中的一种，并且重点强调了局部内部类中变量使用的注意事项
- PolymorphismTest是对java中的多态的测试

#### multithreadAndException主要是说明java中的多线程以及异常
- waitnotifytest这个包是整个测试java中的线程唤醒机制，通过包子、包子铺、吃货三者的关系说明
- ExceptionTest说明了异常的一些使用，这里也可以自定义异常类，我并没有去详细说明了，因为javaweb中的异常类自己需要定义的
- LockTest则是使用了Java1.5之后出现的lock锁，lock锁也是比synchronized有着一定的优点的
- RunnableTest则是使用Runnable创建接口，代码中的注释也说明了Runnable创建比继承Thread创建线程的优越地方
- ThreadPoolTest则是使用了jdk1.5之后出现的线程池，做了一些简单使用。
- WaitNotifyTest是对线程唤醒机制的一些补充

#### networkprogramming主要说明java中的网络编程
- TCPClient是客户端
- TCPServer是服务端
- 这里我只简单的通过java的net包下的类创建了一个客户端与服务端的交互，其实也可以自己写一个文件上传到服务器来巩固下对java中socket编程的理解。
