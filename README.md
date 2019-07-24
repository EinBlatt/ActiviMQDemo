# ActiviMQDemo
Springboot整合消息中间件

#需要先安装activemq
下载 
官方网站 http://activemq.apache.org/

Windows版本 
https://archive.apache.org/dist/activemq/5.12.0/apache-activemq-5.12.0-bin.zip

Unix / Linux / Cygwin版 
https://archive.apache.org/dist/activemq/5.12.0/apache-activemq-5.12.0-bin.tar.gz


windows下使用
下进入bin目录下选择对应电脑位数32或64  执行activemq.bat   (active默认用户名密码为admin)
测试:http://localhost:8161/admin  出现管理界面即可 


linux下使用

1.解压
tar zxvf apache-activemq-5.12.0-bin.tar.gz

2.赋予activemq文件权限
chmod 777 apache-activemq-5.12.0

3.进入文件bin目录赋予权限
chmod 755 activemq

4.启动
./activemq start


