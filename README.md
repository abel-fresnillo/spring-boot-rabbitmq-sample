# Spring Boot RabbitMQ Sample Application

Basic Spring Boot Application to send and receive messages using RabbitMQ. 

The application consists of a simple producer and consumer, the consumer stores the messages received in MongoDB.  

## Getting Started

### Prerequisites

The application was tested using the following software versions:

```
Rabbit MQ 3.7.12
MongoDB v4.0.2
```

### Running the Application

If you haven't started your RabbitMQ Server, execute the following command to start it:

```
rabbitmq-server
```

If you haven't started your MongoDB Deamon, execute the following command to start it:

```
mongod
```

Once you checked out the project run Maven Install:

```
mvn clean install
```

To run the project execute the following command:

```
mvn spring-boot:run
```

The application will run and insert a new document in MongoDB.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Abel Fresnillo** - [iscabel](https://github.com/iscabel)