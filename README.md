# finance-backend
# Finance Data Processing Backend

## Overview

This project is a simple backend system built using Spring Boot to manage financial records and provide summary analytics.

## Features

* Create and view financial records
* Role-based access control (ADMIN, ANALYST, VIEWER)
* Summary of income, expense, and balance
* Sample data preloaded for testing

## Technologies Used

* Java
* Spring Boot
* REST API

## APIs

### GET /records

Returns all financial records

### POST /records?role=ADMIN

Adds a new record (only ADMIN allowed)

### GET /summary?role=ADMIN

Returns income, expense, and balance

### GET /users

View users

### POST /users

Add users

## Assumptions

* Data is stored in memory (no database)
* Role-based access is implemented using request parameters

## How to Run

1. Open project in Eclipse
2. Run FinanceBackendApplication.java
3. Open browser at http://localhost:8080
