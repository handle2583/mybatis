Mybatis XML 方式开发要点：

1.实体类

2.Mapper.xml文件
  select
  update
  delete
3.Mapper文件 
  接口方法 必须与Mapper.xml文件的select id一致

4.application.properties 中指定
#config文件位置
mybatis.config-location=classpath:mybatis/mybatis-config.xml
#mapper文件的路径和类型
mybatis.mapper-locations=classpath:mybatis/mapper/*.xml
mybatis.type-aliases-package=com.example.mybatis.entity

5.test类上要加
@Resource 自动加载Mapper文件资源

6.Application上增加@MapperScan mapper的浏览路径
  不然就得每个mapper接口增加@Mapper标签  
