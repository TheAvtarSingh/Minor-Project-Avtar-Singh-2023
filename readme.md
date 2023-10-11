# Awesome Spring Boot Data JPA Backend

Welcome to the documentation for your minor project backend built using Spring Boot Data JPA. This backend application provides a set of APIs to manage vehicles, users, and bookings. Follow this guide to understand the workflow and execute the requests in the specified order.

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
- [Author](#author)

## Project Overview
This Spring Boot Data JPA backend is designed to support your minor project. It manages vehicles, users, and vehicle bookings. Each request is organized to help you execute them in the proper workflow.

## Prerequisites
Before you begin, ensure you have the following prerequisites:

- Java Development Kit (JDK)
- Spring Boot Framework
- A Database (e.g., MySQL, PostgreSQL)
- Your preferred Integrated Development Environment (IDE)

## API Workflow
Follow this workflow to execute the requests in order.

### 1. Add Multiple Vehicles
- **Description:** Use this endpoint to fill up the database with vehicle data.
- **Endpoint:** `/add-multiple-vehicles`
- **Method:** POST

### 2. Add Vehicle (TODO 6.2)
- **Description:** Add data for a single vehicle. This request does not map entities/tables.
- **Endpoint:** `/add-vehicle`
- **Method:** POST

### 3. (Optional) Add Vehicle
- **Description:** Optionally, use this endpoint to add data for a single vehicle, mainly for data filling.
- **Endpoint:** `/add-vehicle`
- **Method:** POST

### 4. Get Vehicles (TODO 6.1)
- **Description:** Retrieve data for all vehicles.
- **Endpoint:** `/get-vehicles`
- **Method:** GET

### 5. Update Availability Status (TODO 6.3)
- **Description:** Update the availability status of vehicles by an admin.
- **Endpoint:** `/update-availability-status`
- **Method:** PUT

### 6. Add Multiple Users
- **Description:** Use this endpoint to fill up the user table for booking vehicles.
- **Endpoint:** `/add-multiple-users`
- **Method:** POST

### 7. Booking Vehicle (TODO 6.4)
- **Description:** Book a vehicle using this endpoint.
- **Endpoint:** `/book-vehicle`
- **Method:** POST

### 8. (Optional) Book Vehicle Data
- **Description:** Add booking entity data with mapped entities if required.
- **Endpoint:** `/book-vehicle-data`
- **Method:** POST

### 9. Get Available Vehicles (Extra)
- **Description:** Retrieve available vehicles based on location, pickup, and drop-off dates.
- **Endpoint:** `/get-available-vehicles`
- **Method:** GET

### 10. (Optional) Add User
- **Description:** Use this endpoint for testing the signup functionality.
- **Endpoint:** `/add-user`
- **Method:** POST

## Author
This project is made with ♥ by Avtar Singh. If you have any questions or need assistance, please feel free to contact the author.

Thank you for using this Spring Boot Data JPA Backend for your project! Enjoy coding and have a great experience!
