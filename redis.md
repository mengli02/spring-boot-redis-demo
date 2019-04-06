##docker上安装redis
访问：https://hub.docker.com/
	
	搜索
    docker search redis
	下载
    docker pull redis （速度较慢）
	配置持久化启动
	docker run -p 6379:6379 -d redis redis-server --appendonly yes

centos端口开启：

	查看端口：
    firewall-cmd --list-ports 
	firewall-cmd --zone=public --add-port=6397/tcp --permanent
	重启firewall  
	firewall-cmd --reload
	

##redis可视化工具
访问：https://fastoredis.com/

下载


