
# PizzaCreed Project

## Overview

PizzaCreed is a backend system for a pizza bakery located in Galle Fort. This project is developed using Spring MVC and JPA with Hibernate for database interaction. The system includes a web console for admin functions and a RESTful API for managing the shopping basket.

## Technologies Used

- Java JDK 17 
- Spring MVC
- Hibernate (JPA)
- MySQL


## Database Configuration

The project uses MySQL as the database. Update the `database.properties` file with your database details.

```properties
driver=com.mysql.cj.jdbc.Driver
url=jdbc:mysql://localhost:3306/pizzacreed
user=root
password=
hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
hibernate.show_sql=true
hibernate.hbm2ddl.auto=update
```

## REST API Endpoints

### List Available Products

```
GET /pizzaCreed/api/products
```

### Create a Shopping Basket

```
POST /pizzaCreed/api/shopping-basket
```

### Add Products to the Shopping Basket

```
POST /pizzaCreed/api/shopping-basket/{basketId}/items
```

### Remove Products from the Shopping Basket

```
DELETE /pizzaCreed/api/shopping-basket/{basketId}/items/{itemId}
```

### View the Shopping Basket

```
GET /pizzaCreed/api/shopping-basket/{basketId}
```

### Checkout

```
POST /pizzaCreed/api/shopping-basket/{basketId}/checkout
```

## Admin Web Console

The admin web console allows administrators to manage products and view orders. Access the console through the following URL:

```
http://localhost:8080/pizzaCreed/admin
```

## Running the Project

1. Clone the repository.
2. Update the `datbase.properties` file with your database credentials.
3. Build the project using Maven:
   ```
   mvn clean install
   ```
4. Deploy the project on a suitable application server (e.g., Apache Tomcat).
5. Access the application at `http://localhost:8080/pizzaCreed`.

