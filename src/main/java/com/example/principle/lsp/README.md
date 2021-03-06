### 里式替换原则

#### 一、 定义

   1. 定义1

        如果对每一个类型为S的对象o1，都有类型为T的对象o2，是的以T定义的所有程序P在所有的对象o1都替换成o2时，程序P的行为没有发生变化，那么类型S是类型T的子类型
    
   2. 定义2
        
        所有引用基类的地方必须能透明地使用其子类的对象。
        
   第二个定义最清晰明确，通俗讲，只要父类能出现的地方子类就可以出现，而且替换为子类也不会产生错误或者异常，使用者可能根本不需要知道是子类还是父类。单是反过来就不行。有子类出现的地方，父类未必适应。
   
#### 二、继承的优点和缺点

优点：

   - 代码共享，减少创建类的工作量，每个子类都拥有父类的方法和属性。
  
   - 提高代码的重用性。
   
   - 子类可以形似父类，但是异于父类。
   
   - 提高代码可扩展性。
   
   - 提高产品或者项目的开放性。
        
缺点：

   - 继承是侵入性的。只要继承，就必须拥有父类的所有属性和方法。
   
   - 降低代码的灵活性。子类必须拥有父类的属性和方法，让子类自由的世界中多了一些约束。
   
   - 增强了耦合性。当父类的常量、变量和方法被修饰时，需要考虑子类的修改，而且在缺乏规范的环境下，这种修改可能带来非常糟糕的结果--大段的代码需要重构。
   
#### 三、例子

里式替换原则良好的继承定义了一个规范，一句简单的定义包含了4层含义。

1. 子类必须完全实现父类的方法。

2. 子类可以有自己的个性

3. 覆盖或实现父类的方法时输入参数可以被放大

4. 覆写或实现父类的方法时输出结果可以被缩小