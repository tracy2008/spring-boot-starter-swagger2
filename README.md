#spring-boot-starter-swagger2

使用说明：

1、在pom.xml文件添加依赖
		<dependency>
			<groupId>com.tracy</groupId>
			<artifactId>spring-boot-starter-swagger2</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>

2、配置属性

	#swagger2 访问地址：localhost:port/swagger-ui.html
	swagger2.title=api
	swagger2.description=swagger2
	swagger2.scanPackage=com.tracy.client
	swagger2.version=1.1.0
