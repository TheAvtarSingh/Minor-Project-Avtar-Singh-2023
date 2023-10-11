# Minor Project - Spring Data JPA - Avtar Singh - 20csu241 🥹

Welcome to the documentation for minor project backend built using Spring Boot Data JPA. This backend application provides a set of APIs to manage vehicles, users, and bookings. Follow this guide to understand the workflow and execute the requests in the specified order.

😊

# Problem Statement
Please find the Proper Documentation of Project [Here](https://drive.google.com/drive/folders/1toPDmiMAkr35fd8znPVVUFFAAzGTU3OA?usp=sharing)

# CheckMarks 

- [x] **TODO 1.1:** Spring Boot Project Creation
- [x] **TODO 5.1:** [Creation of 'UserService: createUser'](src/main/java/org/ncu/hireWheels/services/UserServiceImpl.java)
- [x] **TODO 5.2:** [Creation of 'UserService: getUser'](src/main/java/org/ncu/hireWheels/services/UserServiceImpl.java)
- [x] **TODO 5.3:** [Creation of 'AdminService: registerVehicle'](src/main/java/org/ncu/hireWheels/services/AdminServiceImpl.java)
- [x] **TODO 5.4:** [Creation of 'AdminService: changeAvailability'](src/main/java/org/ncu/hireWheels/services/AdminServiceImpl.java)
- [x] **TODO 5.5:** [Creation of 'BookingService: addBooking'](src/main/java/org/ncu/hireWheels/services/BookingServiceImpl.java)
- [x] **TODO 5.6:** [Creation of 'VehicleService: getAllVehicles'](src/main/java/org/ncu/hireWheels/services/VehicleServiceImpl.java)
- [x] **TODO 5.7:** [Creation of 'VehicleService: getAvailableVehicles'](src/main/java/org/ncu/hireWheels/services/VehicleServiceImpl.java)
- [x] **TODO 6.1:** [(TODO 6.1)](#4-get-vehicles-todo-61)
- [x] **TODO 6.2:** [(TODO 6.2)](#2-add-vehicle-todo-62)
- [x] **TODO 6.3:** [(TODO 6.3)](#5-update-availability-status-todo-63)
- [x] **TODO 6.4:** [(TODO 6.4)](#7-booking-vehicle-todo-64)


## Table of Contents
- [Project Overview](#project-overview)
- [Prerequisites](#prerequisites)
- [API Workflow](#api-workflow)
  - [1. Add Multiple Vehicles](#1-add-multiple-vehicles)
  - [2. Add Vehicle (TODO 6.2)](#2-add-vehicle-todo-62)
  - [3. (Optional) Add Vehicle](#3-optional-add-vehicle)
  - [4. Get Vehicles (TODO 6.1)](#4-get-vehicles-todo-61)
  - [5. Update Availability Status (TODO 6.3)](#5-update-availability-status-todo-63)
  - [6. Add Multiple Users](#6-add-multiple-users)
  - [7. Booking Vehicle (TODO 6.4)](#7-booking-vehicle-todo-64)
  - [8. (Optional) Book Vehicle Data](#8-optional-book-vehicle-data)
  - [9. Get Available Vehicles (Extra)](#9-get-available-vehicles)
  - [10. (Optional) Add User](#10-optional-add-user)
- [Run the Project Locally](#run-the-project-locally)
- [Author](#author)

😋

## Project Overview
This Spring Boot Data JPA backend is designed to support your minor project. It manages vehicles, users, and vehicle bookings. Each request is organized to help you execute them in the proper workflow.

😎

## Prerequisites
Before you begin, ensure you have the following prerequisites:

- Java Development Kit (JDK)
- Spring Boot Framework
- A Database (e.g., MySQL, PostgreSQL)
- Your preferred Integrated Development Environment (IDE)

🤓

## API Workflow
Follow this workflow to execute the requests in order.

### 1. Add Multiple Vehicles
- **Description:** Use this endpoint to fill up the database with vehicle data.
- **Endpoint:** `/add-multiple-vehicles`
- **Method:** POST



https://github.com/TheAvtarSingh/Minor-Project-Avtar-Singh-2023/assets/88712571/894674c1-3e10-47b7-9044-082eacd5d879



### 2. Add Vehicle (TODO 6.2)
- **Description:** Add data for a single vehicle. This request does not map entities/tables.
- **Endpoint:** `/add-vehicle`
- **Method:** POST



https://github.com/TheAvtarSingh/Minor-Project-Avtar-Singh-2023/assets/88712571/f4b92c36-b742-4963-86ab-0341f980cf9e



### 3. (Optional) Add Vehicle
- **Description:** Optionally, use this endpoint to add data for a single vehicle, mainly for data filling.
- **Endpoint:** `/add-vehicle`
- **Method:** POST

<img width="1440" alt="Screenshot 2023-10-11 at 11 47 41 AM" src="https://github.com/TheAvtarSingh/Minor-Project-Avtar-Singh-2023/assets/88712571/c41665b6-7157-45e6-a56c-b20fe5b125d7">


### 4. Get Vehicles (TODO 6.1)
- **Description:** Retrieve data for all vehicles.
- **Endpoint:** `/get-vehicles`
- **Method:** GET


https://github.com/TheAvtarSingh/Minor-Project-Avtar-Singh-2023/assets/88712571/6aa115b1-849b-4391-98f5-71183a2a7d52


  

### 5. Update Availability Status (TODO 6.3)
- **Description:** Update the availability status of vehicles by an admin.
- **Endpoint:** `/update-availability-status`
- **Method:** PUT

  

https://github.com/TheAvtarSingh/Minor-Project-Avtar-Singh-2023/assets/88712571/d06b198c-7cde-4838-a3fc-baa45e1fbd5d



### 6. Add Multiple Users
- **Description:** Use this endpoint to fill up the user table for booking vehicles.
- **Endpoint:** `/add-multiple-users`
- **Method:** POST

  

https://github.com/TheAvtarSingh/Minor-Project-Avtar-Singh-2023/assets/88712571/22b29a9c-a949-4b19-b548-f9bdabb04679



### 7. Booking Vehicle (TODO 6.4)
- **Description:** Book a vehicle using this endpoint.
- **Endpoint:** `/book-vehicle`
- **Method:** POST

  

https://github.com/TheAvtarSingh/Minor-Project-Avtar-Singh-2023/assets/88712571/7b9caa68-0ca2-4533-a4f7-a29ad167dc6d



### 8. (Optional) Book Vehicle Data
- **Description:** Add booking entity data with mapped entities if required.
- **Endpoint:** `/book-vehicle-data`
- **Method:** POST

  <img width="1440" alt="Screenshot 2023-10-11 at 11 50 00 AM" src="https://github.com/TheAvtarSingh/Minor-Project-Avtar-Singh-2023/assets/88712571/87efb78c-1217-495d-8bf8-58fdda816cfb">


### 9. Get Available Vehicles (Extra)
- **Description:** Retrieve available vehicles based on location, pickup, and drop-off dates.
- **Endpoint:** `/get-available-vehicles`
- **Method:** GET

  

https://github.com/TheAvtarSingh/Minor-Project-Avtar-Singh-2023/assets/88712571/0b1bf4cd-1795-4878-9a23-1ea326347bf9



### 10. (Optional) Add User
- **Description:** Use this endpoint for testing the signup functionality.
- **Endpoint:** `/add-user`
- **Method:** POST

<img width="1440" alt="Screenshot 2023-10-11 at 11 50 46 AM" src="https://github.com/TheAvtarSingh/Minor-Project-Avtar-Singh-2023/assets/88712571/1a0689eb-f105-449e-8f7f-db0f8cf38109">

😃

## Run the Project Locally

### Prerequisites
Before you begin, ensure you have the following prerequisites:

- Java Development Kit (JDK)
- Spring Boot Framework
- A Database (e.g., MySQL, PostgreSQL)
- Your preferred Integrated Development Environment (IDE)
- Git installed on your system

### 1. Clone the Repository
Open your terminal or command prompt and run the following command to clone the repository to your local machine:

- In git-bash / Terminal
```git clone [<repository-url>](https://github.com/TheAvtarSingh/Minor-Project-Avtar-Singh-2023)```

### 2. Open the Project
Navigate to the project directory using your IDE. If you're using a popular IDE like STS, IntelliJ IDEA or Eclipse, you can simply open the project by selecting the root directory.

Update Project in  STS/eclipse using Maven (Recommended)

### 3. [Important] Setup up Lombok (for IDE)

[Lombok](https://projectlombok.org/setup/maven)

### 4. Configure the Database

Configure the database connection properties in your project. Typically, you'll find the database configuration in the application.properties or application.yml file.

<code>
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
</code>
 
 ### 5. Import Collection in PostMan (.../hireWheels/HireWheels - Spring - Eclipse.postman_collection)

 
<img width="1014" alt="Screenshot 2023-10-11 at 12 03 31 PM" src="https://github.com/TheAvtarSingh/Minor-Project-Avtar-Singh-2023/assets/88712571/caa4d0c1-7600-48bb-9544-ef81fdbfa273">


 Please Follow the execution order mentioned in description
 
  <img width="1140" alt="Screenshot 2023-10-11 at 12 05 40 PM" src="https://github.com/TheAvtarSingh/Minor-Project-Avtar-Singh-2023/assets/88712571/89ac6436-9341-4035-8caf-5972cb5cffd6">

 ### 5. Run Using Spring Boot or Tomcat Server

 Done 👍

😍

## Author
This project is made with ♥ by Avtar Singh (singha2k2@gmail.com) . If you have any questions or need assistance, please feel free to Me.

Thank you for using this Spring Boot Data JPA Backend for your project! Enjoy coding and have a great experience!
