#Spring-Boot-RabbitMQ
This is a project to show how to use Spring Boot and RabbitMQ.

> The following instruction were written by Andrew Backes on [installing-rabbitmq-on-ubuntu-14-04](http://monkeyhacks.com/post/installing-rabbitmq-on-ubuntu-14-04)

#Installing RabbitMQ on Ubuntu 14

>By default, RabbitMQ packages are included in Ubuntu and Debian Linux distributions. The problem is, they are horribly outdated. You are far better off downloading the package online and installing it yourself.

```sudo echo "deb http://www.rabbitmq.com/debian testing main" >> /etc/apt/sources.list```

After the repository is added, we will add the RabbitMQ public key to our trusted key list to avoid any warnings about unsigned packages.

```wget https://www.rabbitmq.com/rabbitmq-signing-key-public.asc```

```sudo apt-key add rabbitmq-signing-key-public.asc```

Now we just need to run an update, and install the rabbitmq-server from our newly added package.

```sudo apt-get update```

```sudo apt-get install rabbitmq-server```

#RabbitMQ Management

To manage your RabbitMQ server, you can use the [rabbitmq-management plugin](https://www.rabbitmq.com/management.html). This plugin allows you to manage and monitor your RabbitMQ server in a variety of ways, such as listing and deleting exchanges, queues, bindings and users. You can send and receive messages, and monitor activity on specific queues.

To install the plugin, use the following command:

```sudo rabbitmq-plugins enable rabbitmq_management```

Once the plugin is installed, you are able to access it via the following url:

http://[your-server]:15672/

> The default username and password are [guest] and [guest]. Login, and you will be greeted with the RabbitMQ dashboard.


#Android-RabbitMQ Client

URL project: https://github.com/andersonkxiass/Android-RabbitMQ
