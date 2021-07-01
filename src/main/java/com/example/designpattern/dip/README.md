### 依赖倒置原则

####  一、定义

- 高层模块不应该依赖低层模块，两者都依赖其抽象
- 抽象不应该依赖细节
- 细节应该依赖抽象

#### java中体现

- 模块间的依赖通过抽象发生，实现类之间不发生直接的依赖关系，其依赖关系是通过接口或抽象类产生。
- 接口或抽象类不依赖实现类。
- 实现类依赖接口或者抽象类

简单来说就是"面向接口编程"---OOD
 
#### 二、最佳实践

- 每个类尽量都有接口或抽象类，或者抽象类和接口两者都具备。
- 变量的表面类型尽量是接口或者抽象类
- 任何类都不应该从具体类派生
- 尽量不要覆写基类的方法
- 结合里式替换原则使用