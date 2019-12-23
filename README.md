# UploadMaven
       速流租房系统
速流租房系统是为房东和租房者提供交互，主要包含房源信息、租赁及合同信息、看房申请列表、报障模块、租金信息、日程、账户操作等七个模块;
使租房者可以更好的反应租房情况,房东可以很快解决房屋出现的问题及收租和收租情况

# 主要技术栈
	核心框架：springboot+ mybatis
	数据库：mysql
	项目构建工具：maven
# 运行介绍
	运行HousController.java 
	Java Aplication运行
	本地运行地址：http://127.0.0.1:8082/login
# 安装说明
	1、配置java运行环境，mysql环境。
	2、将目录MySql下的hous.sql导入到数据库
	3、修改resources/application.properties下的数据库配置文件。
	4、启动端口号在resources/application.properties下修改。
	房东账号 admin 默认密码 admin
	租客账号  刘三 密码  123
# 部署说明
本项目JDK要求JDK1.8
###一、springboot （pom.xml）
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.1.3.RELEASE</version>
	</parent>
	<!-- 使用springmvc和spring的jar包 -->
	<dependencies>
	<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
###二、mysql（pom.xml）
	<!--集成mysql数据库-->
	<dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
       </dependency>
       
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jdbc</artifactId>
        </dependency>
###三、mybatis（pom.xml）
	<dependency>
		    <groupId>org.mybatis.spring.boot</groupId>
		    <artifactId>mybatis-spring-boot-starter</artifactId>
		    <version>1.3.2</version>
		</dependency>
		
		application.properties添加：
		mybatis.mapper-locations=classpath:mapper/*.xml
###四、JSP（pom.xml）
	        <!-- springboot支持JSP的相关依赖 -->
		<!--servlet依赖 -->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<scope>provided</scope>
		</dependency>
 
		<!-- jsp的jstl支持 -->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
		</dependency>
		<!-- spring boot tomcat jsp 支持开启 -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
			<scope>provided</scope>
		</dependency>
		<!-- jasper是将jsp转化为jvm 能识别的class.java 文件 -->
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
			<scope>provided</scope>
		</dependency>
###四、分页（pom.xml）
	<dependency>
		    <groupId>com.github.pagehelper</groupId>
		    <artifactId>pagehelper-spring-boot-starter</artifactId>
		    <version>1.2.3</version>
		</dependency>
###五、Tomcat（application.properties）
	server.port=8082
