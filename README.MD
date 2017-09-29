SpringBoot官方文档:  
https://docs.spring.io/spring-boot/docs/1.5.6.RELEASE/reference/htmlsingle/

博客:  
http://blog.csdn.net/xiaoyu411502/article/details/47864969  
http://www.cnblogs.com/larryzeal/p/5799195.html  

##fatjar安装成Windows 服务的方法
https://github.com/snicoll-scratches/spring-boot-daemon  
https://github.com/kohsuke/winsw
https://github.com/kohsuke/winsw/blob/master/doc/installation.md#step-4-service-registration
https://github.com/kohsuke/winsw/blob/master/doc/xmlConfigFile.md


1. 下载winsw.exe以及配置文件sample-minimal.xml,放到打包后的根目录  
https://github.com/kohsuke/winsw/releases  
2. 修改winsw.exe成自己想要的名称,并且修改配置xml成相同名称  
3. 修改配置xml  
```xml
<configuration>
  <id>myapp</id>
  <name>MyApp Service (powered by WinSW)</name>
  <description>This service is a service cratead from a minimal configuration</description>
  <executable>java</executable>
  <arguments>-jar SpringBootDemo-1.0-SNAPSHOT.jar --server.port=8080</arguments>
  <logmode>rotate</logmode>
</configuration>
```
cmd安装服务  
```
myapp.exe install
```
启动服务
```
net start myapp
```
停止服务
```
net stop myapp
```
卸载服务
```
myapp.exe uninstall
```