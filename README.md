# gmall-dubbo
Dubbo-spring/springboot的demo，maven依据应用（服务）划分模块，工程使用idea创建。

# 搭建工程
1. 创建一个maven工程gmall-dubbo，以此工程为父模块，在此工程下新建模块。可以在父模块中统一管理子模块的版本。
2. 使用spring initializr创建springboot子模块，使用maven工程创建spring子模块
3. 对于springboot模块导入springboot-dubbo的starter，对于spring模块导入对应的dubbo依赖即可
